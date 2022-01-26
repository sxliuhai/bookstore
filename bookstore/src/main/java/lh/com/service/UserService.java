package lh.com.service;

import lh.com.pojo.User;



public interface UserService {
    User check(User user);

    void saveUser(User user);
    User haveUser(User user);
}
