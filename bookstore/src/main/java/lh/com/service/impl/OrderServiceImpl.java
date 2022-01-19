package lh.com.service.impl;

import lh.com.mapper.OrderMapper;
import lh.com.pojo.CartItem;
import lh.com.pojo.Order;
import lh.com.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public List<Order> listOrder(int id) {
        return orderMapper.listOrder(id);
    }

    @Override
    public List<CartItem> listCart(String order_id) {
        return orderMapper.listCart(order_id);
    }
}
