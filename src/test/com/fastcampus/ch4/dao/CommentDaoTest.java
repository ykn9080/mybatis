package com.fastcampus.ch4.dao;

import com.fastcampus.ch4.domain.CommentDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class CommentDaoTest {
    @Autowired CommentDao dao;
    @Test
    public void count() throws Exception {
        int cnt=dao.count(1);
        assertTrue(cnt==1);
    }

    @Test
    public void delete() throws Exception{
        int rtn=dao.delete(9,"asdf");
        assertTrue(rtn==1);
    }
    @Test
    public void insert() throws Exception{
        //Integer bno, Integer pcno, String comment, String commenter
        CommentDto dto= new CommentDto(1,null,"testing", "yknam" );
        int rtn=dao.insert(dto);
        assertTrue(rtn==1);
    }
    @Test
    public void selectAll() throws Exception{

        List<CommentDto> list=dao.selectAll(1);
        assertTrue(list.size()==2);
    }
    @Test
    public void select(){
        CommentDto dto=dao.select(10);
        assertTrue(dto.getBno()==1);
    }

    @Test
    public void update(){
        CommentDto dto=new CommentDto();
        dto.setCno(10);
        dto.setComment("hellohello123");
        dto.setCommenter("yknam");
        int rtn=dao.update(dto);
        assertTrue(rtn==1);
    }
}
