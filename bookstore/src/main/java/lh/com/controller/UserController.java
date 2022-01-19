package lh.com.controller;

import lh.com.pojo.User;
import lh.com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/login")
    public String login(User user, HttpSession httpSession,HttpServletRequest httpServletRequest){
        ModelAndView modelAndView = new ModelAndView();
        User check = userService.check(user);
        if(check!=null)
       {   httpSession.setAttribute("user",check);
           return"redirect:/";
       }
       else{
           httpServletRequest.setAttribute("msg","您的用户名或密码错误");
           return "user/login";
        }
    }
    @RequestMapping("/logout")
    public String logout(HttpSession httpSession){
       httpSession.removeAttribute("user");
            return "user/login";
    }
    @RequestMapping("/regist")
    public String regist(User user){
        userService.saveUser(user);
        return"user/login";
    }
}
