package cn.soch.controller;

import cn.soch.pojo.User;
import cn.soch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController{
    @Autowired
    private UserService userService;
    @RequestMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("表现层：查询所有用户...");
        List<User> list = userService.listUserAll();
        System.out.println(list);
        model.addAttribute("list", list);
        return "list";
    }

    @RequestMapping("/reg")
    public String reg(){
            return "register";
    }

    @RequestMapping("/regDo")
    public void regDo(User user, HttpServletRequest request, HttpServletResponse response) throws IOException {
        userService.insertUser(user);
        return;
    }

    @RequestMapping(value="/delete",method = RequestMethod.GET)
    public void delete(int id, HttpServletRequest request, HttpServletResponse response) throws IOException {
        userService.deleteUserById(id);
        //response.sendRedirect(request.getContextPath()+"/user/findAll");
        return;
    }

    @RequestMapping("/update")
    public void findAll(User user, HttpServletRequest request, HttpServletResponse response) throws IOException {
        userService.updateUser(user);
        //response.sendRedirect(request.getContextPath()+"/user/findAll");
        return;
    }
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/loginDo")
    public String loginDo(){

        return "user/index";
    }

}
