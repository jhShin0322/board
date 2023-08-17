package com.example.board.repository;

import com.example.board.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    void save(User user);
    User findByLoginId(String loginId);
    User login(@Param("loginId") String loginId, @Param("password") String password);
}
