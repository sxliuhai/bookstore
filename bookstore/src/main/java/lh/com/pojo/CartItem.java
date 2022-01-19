package lh.com.pojo;

import lombok.Data;

@Data
public class CartItem {
    private int id;
    private int count=0;
    private String name;
    private double price;
    private double total_price;
    private String order_id;
}
