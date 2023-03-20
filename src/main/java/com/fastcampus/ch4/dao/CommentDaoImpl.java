package com.fastcampus.ch4.dao;

import org.apache.ibatis.session.SqlSession;
import com.fastcampus.ch4.domain.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CommentDaoImpl implements CommentDao {
   @Autowired
   public SqlSession session;
   String namespace="com.fastcampus.ch4.dao.CommentMapper.";

   @Override
   public int count(Integer bno) throws Exception{
      return session.selectOne(namespace+"count",bno);
   }
   @Override
   public int delete(Integer cno, String commenter)throws Exception{
      Map map=new HashMap();
      map.put("cno",cno);
      map.put("commenter",commenter);
      return session.delete(namespace+"delete", map);
   }
   @Override
   public int deleteAll(Integer bno) throws Exception{
      return session.delete(namespace+"deleteAll",bno);
   }
   @Override
   public int insert(CommentDto dto) throws Exception{
      return session.insert(namespace+"insert",dto);
   }
   @Override
   public List<CommentDto> selectAll(Integer bno) throws Exception{
      return session.selectList(namespace+"selectAll", bno);
   }
   @Override
   public CommentDto select(Integer cno) {
      return session.selectOne(namespace+"select", cno);
   }
   @Override
   public int update(CommentDto dto){
      return session.update(namespace+"update", dto);
   }
}
