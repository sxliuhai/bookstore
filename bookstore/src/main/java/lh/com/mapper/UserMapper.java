package lh.com.mapper;


import lh.com.pojo.User;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface UserMapper {
    void saveUser(User user);
    User check(User user);
    User haveUser(User user);
}
