package com.ssafy.member.model.dao;

import com.ssafy.member.model.MemberDto;

import java.sql.SQLException;

public interface MemberDao {

	int idCheck(String userId) throws SQLException;
	int joinMember(MemberDto memberDto) throws SQLException;
	MemberDto loginMember(String userId, String userPwd) throws SQLException;
	
}
