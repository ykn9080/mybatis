package com.fastcampus.ch4.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CommentDao {
   @Autowired
   public SqlSession session;
   String namespace="com.fastcampus.ch4.dao.CommentMapper.";

   public int count(Integer bno) throws Exception{
      return session.selectOne(namespace+"count",bno);
   }
}
