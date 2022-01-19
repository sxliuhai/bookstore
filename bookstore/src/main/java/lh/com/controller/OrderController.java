package lh.com.controller;

import lh.com.pojo.CartItem;
import lh.com.pojo.Order;
import lh.com.pojo.User;
import lh.com.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @RequestMapping("/listOrder")
    public ModelAndView listOrder(HttpSession httpSession){
        User user = (User) httpSession.getAttribute("user");
        int id = user.getId();
        ModelAndView modelAndView = new ModelAndView();
        List<Order> orders=orderService.listOrder(id);
        modelAndView.setViewName("/order/order");
        modelAndView.addObject("orders",orders);
        return modelAndView;
    }
    @RequestMapping("/listCart/{order_id}")
    public ModelAndView listCart(@PathVariable("order_id")String order_id ){
        ModelAndView modelAndView=new ModelAndView();
        List<CartItem>items=orderService.listCart(order_id);
        modelAndView.setViewName("/cart/cart");
        modelAndView.addObject("items",items);
        return modelAndView;
    }
}
