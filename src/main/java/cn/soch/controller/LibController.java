package cn.soch.controller;

import cn.soch.pojo.Lib;
import cn.soch.pojo.User;
import cn.soch.service.LibService;
import cn.soch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/lib")
public class LibController {
    @Autowired
    private LibService libService;
    @RequestMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("表现层：查询所有用户...");
        List<Lib> list = libService.listLibAll();
        System.out.println(list);
        model.addAttribute("list", list);
        return "list";
    }
    @RequestMapping("/find")
    public String find(Model model,@ModelAttribute String keyword) {
        System.out.println("表现层：关键字查询...");
        List<Lib> list = libService.listLib(keyword);
        System.out.println(list);
        model.addAttribute("list", list);
        return "lib/find";
    }
    @RequestMapping("/insert")
    public String insert() {
        return "list";
    }
    @RequestMapping("/delete")
    public String delete() {
        return "list";
    }
    @RequestMapping("/update")
    public String update() {
        return "list";
    }
}
