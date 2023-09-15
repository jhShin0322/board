package com.example.board.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class Comment {
    private Integer cno;
    private Integer bno;
    private String content;
    private String commenter;
    private Date regDate;
    private Date upDate;
}
