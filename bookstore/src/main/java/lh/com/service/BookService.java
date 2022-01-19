package lh.com.service;

import lh.com.pojo.Book;
import lh.com.pojo.Page;


public interface BookService {
    Page booklist(int pageNum);

    void bookadd(Book book);

    Book bookget(int id);

    void bookupdate(Book book);

    void bookdelete(int id);
}
