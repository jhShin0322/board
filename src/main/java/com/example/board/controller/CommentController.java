package com.example.board.controller;

import com.example.board.domain.Comment;
import com.example.board.domain.User;
import com.example.board.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CommentController {
    private final CommentService commentService;

    @Autowired
    public CommentController (CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/addComment")
    @ResponseBody
    public String addComment(@RequestBody Comment comment, Model model) {
        commentService.addComment(comment);
        return "success";
    }

    @GetMapping("/getComments")
    @ResponseBody
    public List<Comment> getComments() {
        return commentService.getComments();
    }
}
