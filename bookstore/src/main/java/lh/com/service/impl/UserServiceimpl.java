package lh.com.service.impl;

import lh.com.mapper.UserMapper;
import lh.com.pojo.User;
import lh.com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService {
@Autowired
UserMapper userMapper;
    @Override
    public User check(User user) {
        return userMapper.check(user);
    }
    @Override
    public void saveUser(User user) {
        userMapper.saveUser(user);
    }
}
