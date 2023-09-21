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

    @PostMapping("/comments")
    public String addComment(Integer bno, String commenter, String comment, Model model) {
        Comment commentDto = new Comment(bno, commenter, comment);
        commentService.addComment(commentDto);
        List<Comment> comments = commentService.getComments(bno);
        model.addAttribute("comments", comments);
        return "redirect:/board/read?bno=" + bno;
    }

    @PostMapping("/deleteComments")
    public String deleteComment(Integer cno, Integer bno) {
        commentService.deleteComment(cno, bno);
        return "redirect:/board/read?bno=" + bno;
    }
}
