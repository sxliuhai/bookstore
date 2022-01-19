package lh.com.controller;

import lh.com.pojo.Book;
import lh.com.pojo.Page;
import lh.com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;
    @RequestMapping("/booklist/{pageNum}")
    public ModelAndView booklist(@PathVariable("pageNum")int pageNum){
        ModelAndView modelAndView = new ModelAndView();
        Page page= bookService.booklist(pageNum);
        modelAndView.setViewName("manager/book_manager");
        modelAndView.addObject("page",page);
        return modelAndView;
    }
    @RequestMapping("/bookadd")
    public String bookadd(Book book){
        bookService.bookadd(book);
        return "redirect:/book/booklist/1";
    }
    @RequestMapping("/bookget/{id}")
    public ModelAndView bookget(@PathVariable("id")int id){
        ModelAndView modelAndView = new ModelAndView();
        Book book = bookService.bookget(id);
        modelAndView.addObject("book",book);
        modelAndView.setViewName("manager/book_update");
        return modelAndView;
    }
    @RequestMapping("/bookupdate/{id}")
    public String bookupdate(Book book,@PathVariable("id")int id){
        book.setId(id);
        bookService.bookupdate(book);
        return "redirect:/book/booklist/1";
    }
    @RequestMapping("/bookdelete/{id}")
    public String bookdelete(@PathVariable("id")int id){
        bookService.bookdelete(id);
        return "redirect:/book/booklist/1";
    }

}
