package lh.com.controller;

import lh.com.pojo.Page;
import lh.com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class IndexController {
    @Autowired
    BookService bookService;
    @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        Page page= bookService.booklist(1);
        modelAndView.setViewName("main/index");
        modelAndView.addObject("page",page);
        return modelAndView;
    }
    @RequestMapping("/{pageNum}")
    public ModelAndView index(@PathVariable("pageNum")int pageNum){
        ModelAndView modelAndView = new ModelAndView();
        Page page= bookService.booklist(pageNum);
        modelAndView.setViewName("main/index");
        modelAndView.addObject("page",page);
        return modelAndView;
    }
}
