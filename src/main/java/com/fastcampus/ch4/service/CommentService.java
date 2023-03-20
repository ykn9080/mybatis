package com.fastcampus.ch4.service;

import com.fastcampus.ch4.dao.CommentDao;
import com.fastcampus.ch4.domain.CommentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired CommentDao commentDao;

    public int getCount(Integer bno) throws Exception{
        return commentDao.count(bno);
    }
    public List<CommentDto> getList(Integer bno) throws Exception{
        return commentDao.selectAll(bno);
    }
    public CommentDto read(Integer cno)throws Exception{
        return commentDao.select(cno);
    }
    public int modify(CommentDto dto) throws Exception{
        return commentDao.update(dto);
    }

}
