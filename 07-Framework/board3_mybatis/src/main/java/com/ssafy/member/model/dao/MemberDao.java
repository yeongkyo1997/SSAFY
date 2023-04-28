package com.ssafy.member.model.dao;

import com.ssafy.member.model.MemberDto;

import java.sql.SQLException;
import java.util.Map;

public interface MemberDao {

    int idCheck(String userId) throws SQLException;

    void joinMember(MemberDto memberDto) throws SQLException;

    MemberDto loginMember(Map<String, String> map) throws SQLException;

}
