package com.example.board.domain;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class Comment {
    private Integer cno;
    private Integer bno;
    private String content;
    private String commenter;
    private Date regDate;
    private Date upDate;
}
