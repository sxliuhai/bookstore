package lh.com.mapper;

import lh.com.pojo.Book;
import lh.com.pojo.CartItem;
import lh.com.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface CartMapper {

    Book getbook(int id);

    CartItem haveItem(HashMap<String,Object> map);

    void updateItem(CartItem item);

    void addItem(CartItem item);

    List<CartItem> itemList(String order_id);

    void itemDelete(int id);

    void allDelete(String order_id);

    void addOrder(Order order);

    void updateOrder(String order_id);
}
