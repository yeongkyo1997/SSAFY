package com.ssafy.mybatis.model.dao;

import com.ssafy.mybatis.model.Member;

import java.util.List;


public interface TestDao {
    List<Member> selectMember();

    void insertMember(Member member);

    void updateMember(Member member);

    void deleteMember(String id);
}