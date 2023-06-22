package com.example.hairnada.mapper.user;

import com.example.hairnada.dto.user.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

@Mapper
public interface UserMapper {

//    회원가입
    public void join(UserDto userDto);

//    로그인
    public Long selectUserNumber(@Param("userId") String userId, @Param("userPassword") String userPassword);

//    계정찾기 smtp-> api 사용하기
//    등급신청 할 때 맴버십 넘버 보내주기
    public UserDto findUserIdPassword(@Param("userName") String userName, @Param("userEmail") String userEmail);

//    아이디 중복확인
    public int checkId(String userId);
}
