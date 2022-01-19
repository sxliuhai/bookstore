package lh.com.mapper;

import lh.com.pojo.CartItem;
import lh.com.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    List<Order> listOrder(int id);

    List<CartItem> listCart(String order_id);
}
