package lh.com.mapper;

import lh.com.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    List<Book> booklist();

    void bookadd(Book book);

    Book bookget(int id);

    void bookupdate(Book book);

    void bookdelete(int id);
}
