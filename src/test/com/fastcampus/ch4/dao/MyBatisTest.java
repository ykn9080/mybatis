package com.fastcampus.ch4.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MyBatisTest {
    @Autowired
    private SqlSessionFactory sqlFactory;
    @Test
    public void testFactory() {
           System.out.println("MyBatis 연결 성공"+ sqlFactory);
           assertTrue(sqlFactory!=null);
    }
    @Test
    public void testSession(){
           try (SqlSession session = sqlFactory.openSession()) {
                  System.out.println("MyBatis 연결 성공"+ session);
                  assertTrue(session!=null);
           } catch (Exception e) {
                  e.printStackTrace();
           }
    }
}
