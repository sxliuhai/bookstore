package lh.com.service.impl;

import lh.com.mapper.CartMapper;
import lh.com.pojo.Book;
import lh.com.pojo.CartItem;
import lh.com.pojo.Order;
import lh.com.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartMapper cartMapper;
    @Override
    public void addItem(int id,String order_id) {
        Book book = cartMapper.getbook(id);
        HashMap<String, Object> map = new HashMap<>();
        map.put("id",id);
        map.put("order_id",order_id);
        CartItem item = cartMapper.haveItem(map);
        if((item!=null)&&(item.getOrder_id().equals(order_id))){
            item.setCount(item.getCount()+1);
            item.setTotal_price(item.getCount()*item.getPrice());
             cartMapper.updateItem(item);
        }
        else{
            CartItem newItem = new CartItem();
            newItem.setOrder_id(order_id);
            newItem.setId(id);
            newItem.setPrice(book.getPrice());
            newItem.setName(book.getName());
            newItem.setCount(newItem.getCount()+1);
            newItem.setTotal_price(newItem.getCount()*newItem.getPrice());
             cartMapper.addItem(newItem);
        }
    }

    @Override
    public List<CartItem> itemList(String order_id) {
        return cartMapper.itemList(order_id);
    }

    @Override
    public void itemDelete(int id) {
        cartMapper.itemDelete(id);
    }

    @Override
    public void allDelete(String order_id) {
        cartMapper.allDelete(order_id);
    }

    @Override
    public void addOrder(int user_id,String order_id) {
        Order order = new Order();
        order.setId(order_id);
        order.setUser_id(user_id);
        order.setDate(new Date());
        order.setStatus("未支付");
        cartMapper.addOrder(order);

    }

    @Override
    public void updateOrder(String order_id) {
        cartMapper.updateOrder(order_id);
    }
}

