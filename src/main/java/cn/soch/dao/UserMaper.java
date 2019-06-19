package cn.soch.dao;

import java.util.List;
import cn.soch.pojo.User;

public interface UserMaper {
    public void insertUser(User user);
    public void deleteUserById(int id);
    public void updateUser(User user);
    public User getUserById(int id);
    /*@Select("select * from user")*/
    public List<User> listUserAll();
}
