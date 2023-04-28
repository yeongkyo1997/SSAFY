package com.ssafy.member.model.service;

import com.ssafy.member.model.MemberDto;

import java.util.Map;

public interface MemberService {

    int idCheck(String userId) throws Exception;

    void joinMember(MemberDto memberDto) throws Exception;

    MemberDto loginMember(Map<String, String> map) throws Exception;

}
