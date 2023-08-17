package com.example.board.repository;

import com.example.board.domain.CommentDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface CommentDao {
    int count(Integer bno);
    int deleteAll(Integer bno);
    int delete(@Param("cno") Integer cno, @Param("commenter") String commenter);
    int insert(CommentDto dto);
    List<CommentDto> selectAll(Integer bno);
    CommentDto select(Integer cno);
    int update(CommentDto dto);
}
