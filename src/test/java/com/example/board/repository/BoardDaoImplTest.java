package com.example.board.repository;

import com.example.board.domain.BoardDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BoardDaoImplTest {

    @Autowired
    BoardDao boardDao;

    @Test
    public void insert() {
        for (int i=1; i<=2500; i++) {
            Set set = new HashSet();
            for (int j=0; set.size()<6; j++) {
                int num = (int)(Math.random()*45)+1;
                set.add(num);
            }
            BoardDto boardDto = new BoardDto(i + "회 당첨번호","당첨 번호는 " + set + "입니다.", "관리자");
            boardDao.insert(boardDto);
        }
    }

    @Test
    public void deleteAll() {
        boardDao.deleteAll();
    }
}