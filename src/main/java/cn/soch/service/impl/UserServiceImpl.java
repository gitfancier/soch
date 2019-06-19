package cn.soch.service.impl;

import cn.soch.dao.UserMaper;
import cn.soch.pojo.User;
import cn.soch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMaper userDao;
    public void insertUser(User user){
        userDao.insertUser(user);
    }
    public void deleteUserById(int id){
        userDao.deleteUserById(id);
    }
    public void updateUser(User user){
        userDao.updateUser(user);
    }
    public User getUserById(int id){
        return userDao.getUserById(id);
    }
    /*@Select("select * from user")*/
    public List<User> listUserAll(){
        return userDao.listUserAll();
    }
}
