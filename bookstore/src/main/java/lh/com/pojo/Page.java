package lh.com.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Page {
    private int pageNum=1;
    private int nextPage;
    private int prePage;
    private int pageSize=4;
    private int pages;
    private Long Total;
    private List<Book> books;

}
