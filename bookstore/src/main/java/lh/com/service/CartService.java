package lh.com.service;


import lh.com.pojo.CartItem;

import java.util.List;

public interface CartService {
    void addItem(int id,String order_id);

    List<CartItem> itemList(String order_id);

    void itemDelete(int id);

    void allDelete(String order_id);

    void addOrder(int user_id,String order_id);

    void updateOrder(String order_id);
}
