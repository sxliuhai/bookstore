package lh.com.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lh.com.mapper.BookMapper;
import lh.com.pojo.Book;
import lh.com.pojo.Page;
import lh.com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookMapper bookMapper;
    @Override
    public Page booklist(int pageNum) {
        Page page = new Page();
        page.setPageNum(pageNum);
        page.setBooks(PageHelper.startPage(page.getPageNum(),page.getPageSize()));
        List<Book> booklist = bookMapper.booklist();
        PageInfo<Book> bookPageInfo = new PageInfo<Book>(booklist);
        page.setPages(bookPageInfo.getPages());//总页数
        page.setNextPage(bookPageInfo.getNextPage());//下一页
        page.setPrePage(bookPageInfo.getPrePage());//上一页
        page.setTotal(bookPageInfo.getTotal());
        return page;
    }

    @Override
    public void bookadd(Book book) { bookMapper.bookadd(book);
    }

    @Override
    public Book bookget(int id) {
        return bookMapper.bookget(id);
    }

    @Override
    public void bookupdate(Book book) {
        bookMapper.bookupdate(book);
    }

    @Override
    public void bookdelete(int id) {
        bookMapper.bookdelete(id);
    }
}
