package com.example.board.service;

import com.example.board.domain.BoardDto;
import com.example.board.domain.SearchCondition;

import java.util.List;
import java.util.Map;

public interface BoardService {
    int getCount();

    int remove(Integer bno);

    int write(BoardDto boardDto);

    List<BoardDto> getList();

    BoardDto read(Integer bno);

    BoardDto readV2(Integer bno);

    List<BoardDto> getPage(Map map);

    int modify(BoardDto boardDto);

    List<BoardDto> getSearchResultPage(SearchCondition sc);

    int getSearchResultCnt(SearchCondition sc);
}
