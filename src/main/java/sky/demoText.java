package sky;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import javax.annotation.Resource;

import sky.mapper.UserMapper;
import sky.pojo.User;

/**
 * Created by Stelawliet on 18/3/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:mybatis/spring-mybatis.xml")
public class demoText {


    @Autowired
    private UserMapper userMapper;

    @Test
    public void Fun1() throws Exception {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:mybatis/spring-mybatis.xml");
//        UserMapper userMapper = (UserMapper) ac.getBean("userMapper");
//        System.out.println(userMapper+"   sasdasdasd");
//        User user0 = userMapper.idFindUser(1);
//        System.out.println(user0);
        List<User> userList = userMapper.FindUserLike("息");
        System.out.println(userList);
    }

    @Test
    public void fun2() throws Exception {

    }
    @Test
    public void fun3() throws Exception {

    }
}
