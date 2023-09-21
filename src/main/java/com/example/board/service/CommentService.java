package com.example.board.service;

import com.example.board.domain.Comment;
import com.example.board.repository.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    private final CommentMapper commentMapper;
    @Autowired
    public CommentService(CommentMapper commentMapper) {
        this.commentMapper = commentMapper;
    }
    public void addComment(Comment comment) {
        commentMapper.insertComment(comment);
        commentMapper.downViewCnt(comment.getBno());
    }
    public List<Comment> getComments(Integer bno) {
        return commentMapper.getComments(bno);
    }
}
