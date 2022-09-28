package com.zwz.springbootweb;

import com.zwz.springbootweb.dao.ReglisterDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class SpringbootWebApplicationTests {
    @Autowired
     private  ReglisterDao reglisterDao;

    @Test
    @Transactional
    public void insertReglister() {
        int i = reglisterDao.insertReglister("牛牛", "12345");
        System.out.println(i+"rows changed");

    }


    @Test
    public void test01(){
        String a="abc";
        String b="abc";
        System.out.println(a==b);
    }
}
