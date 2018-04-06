package sky.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import sky.mapper.DeptExMapper;
import sky.mapper.EmpMapper;
import sky.pojo.DeptEx;
import sky.pojo.Emp;

/**
 * Created by Stelawliet on 18/3/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:mybatis/spring-mybatis.xml")
public class testMyBatis {
    @Autowired
    private EmpMapper empMapper;
    @Autowired
    private DeptExMapper deptExMapper;

    @Test
    public void fun1(){
        Emp e = empMapper.selectByPrimaryKey(1001);
        System.out.println(e);
    }
    @Test
    public void testDeptEx(){
        List<DeptEx> deptEx = deptExMapper.selectDeptEx();
        System.out.println("--------------------");
        System.out.println(deptEx);
        System.out.println("--------------------");
    }
    @Test
    public void testDeptExBy(){
        List<DeptEx> deptEx = deptExMapper.selectDeptExByNo(10);
        System.out.println("--------------------");
        System.out.println(deptEx);
        System.out.println("--------------------");
    }
}
