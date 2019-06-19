package cn.soch.test;

import cn.soch.dao.LibMaper;
import cn.soch.pojo.Lib;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.io.Resources;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.List;

/**
 * 测试查询
 */

public class TestMybatis {
    @Test
    public void listLibAll() throws Exception {
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //穿件SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建SQLSession对象
        SqlSession session = factory.openSession();
        //获取到代理对象
        LibMaper dao = session.getMapper(LibMaper.class);
        System.out.println("listLibAll():");
        List<Lib> list = dao.listLibAll();
        for (Lib lib : list) {
            System.out.println(lib);
        }
        //释放资源
        session.close();
        inputStream.close();
    }
    @Test
    public void listLib() throws Exception {
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //穿件SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建SQLSession对象
        SqlSession session = factory.openSession();
        LibMaper dao = session.getMapper(LibMaper.class);
        System.out.println("listLib():");
        List<Lib> list2 = dao.listLib("q");
        for (Lib lib : list2) {
            System.out.println(lib);
        }
        //释放资源
        session.close();
        inputStream.close();
    }
    @Test
    public void insertLib() throws Exception {
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //穿件SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建SQLSession对象
        SqlSession session = factory.openSession();
        LibMaper dao = session.getMapper(LibMaper.class);
        System.out.println("insertLib():");
        Lib li = new Lib();
        li.setQuestion("q");
        li.setAnswer("q");
        li.setuId(1);
        dao.insertLib(li);
        //释放资源
        session.close();
        inputStream.close();
    }
    @Test
    public void delete() throws Exception{
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //穿件SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建SQLSession对象
        SqlSession session = factory.openSession();
        LibMaper dao = session.getMapper(LibMaper.class);
        System.out.println("deleteById():");
        dao.deleteLibById(1);
        //释放资源
        session.close();
        inputStream.close();
    }


/*@Test
    public void run2() throws Exception{
        Account account = new Account();
        account.setName("熊大");
        account.setMoney(500d);
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //穿件SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建SQLSession对象
        SqlSession session = factory.openSession();
        //获取到代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        //保存事务
        dao.saveAccount(account);
        //提交事务
        session.commit();
        //释放资源
        session.close();
        inputStream.close();
    }*/
}
