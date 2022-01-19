package lh.com.pojo;

import lombok.Data;

@Data
public class Book {
    private Integer id;
    private String name;
    private double price;
    private String author;
    private Integer sales;
    private Integer stock;
    private String img_path="/resources/static/img/default.jpg";

}
