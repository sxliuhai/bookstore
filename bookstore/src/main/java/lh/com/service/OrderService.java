package lh.com.service;

import lh.com.pojo.CartItem;
import lh.com.pojo.Order;

import java.util.List;

public interface OrderService {
    List<Order> listOrder(int id);

    List<CartItem> listCart(String order_id);
}
