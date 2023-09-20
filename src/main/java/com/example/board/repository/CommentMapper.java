package com.example.board.repository;

import com.example.board.domain.Comment;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface CommentMapper {
    void insertComment(Comment comment);
    List<Comment> getComments(Integer bno);
}
