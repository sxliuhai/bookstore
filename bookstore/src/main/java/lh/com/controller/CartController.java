package lh.com.controller;

import lh.com.pojo.CartItem;
import lh.com.pojo.User;
import lh.com.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/cart")
public class CartController {
    @Autowired
    CartService cartService;
    @RequestMapping("/add/{id}")
    public String add(@PathVariable("id")int id,HttpSession httpSession){
        String order_id =(String)httpSession.getAttribute("order_id");
        User user=(User)httpSession.getAttribute("user");
        int user_id=user.getId();
        if(order_id==null){
            order_id=Long.toString(System.currentTimeMillis());
            httpSession.setAttribute("order_id",order_id);
            cartService.addOrder(user_id,order_id);}
        cartService.addItem(id,order_id);
        return "redirect:/";
    }
    @RequestMapping("/list")
    public ModelAndView itemList(HttpSession httpSession){
        ModelAndView modelAndView = new ModelAndView();
        String order_id = (String) httpSession.getAttribute("order_id");
        List<CartItem> items = cartService.itemList(order_id);
        modelAndView.setViewName("cart/cart");
        modelAndView.addObject("items",items);
        return modelAndView;
    }
    @RequestMapping("/itemDelete/{id}")
    public String itemDelete(@PathVariable("id")int id){
        cartService.itemDelete(id);
        return "redirect:/cart/list";
    }
    @RequestMapping("allDelete")
    public String allDelete(HttpSession httpSession){
        String order_id = (String) httpSession.getAttribute("order_id");
        cartService.allDelete(order_id);
        return "redirect:/cart/list";
    }
    @RequestMapping("/pay")
    public ModelAndView pay(HttpSession httpSession){
        ModelAndView modelAndView = new ModelAndView();
        String order_id = (String) httpSession.getAttribute("order_id");
        cartService.updateOrder(order_id);
        modelAndView.setViewName("cart/checkout");
        modelAndView.addObject("order_id",order_id);
        httpSession.removeAttribute("order_id");
        return modelAndView;
    }

}
