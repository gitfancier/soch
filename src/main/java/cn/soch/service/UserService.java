package cn.soch.service;

import cn.soch.pojo.User;
import java.util.List;

public interface UserService {
    public void insertUser(User user);
    public void deleteUserById(int id);
    public void updateUser(User user);
    public User getUserById(int id);
    /*@Select("select * from user")*/
    public List<User> listUserAll();
}
