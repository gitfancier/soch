package cn.soch.test;

import cn.soch.pojo.Lib;
import cn.soch.service.LibService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {
    @Test
    public  void run1(){
        ///加载spring配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        LibService libService = (LibService) applicationContext.getBean("libService");
        //调用方法
        List<Lib> list = libService.listLibAll();
        for (Lib lib : list) {
            System.out.println(lib);
        }
        libService.listLibAll();
        System.out.println("listALL():");
        List<Lib> list2 = libService.listLib("q");
        for (Lib lib : list2) {
            System.out.println(lib);
        }
        libService.listLibAll();
    }

    @Test
    public  void run2(){
         //加载spring配置文件
        ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        LibService libService = (LibService) applicationContext2.getBean("libService");
        //调用方法
        Lib lib = new Lib();
        lib.setQuestion("b1");
        lib.setAnswer("b1");
        lib.setuId(1);
        libService.insertLib(lib);
    }
}
