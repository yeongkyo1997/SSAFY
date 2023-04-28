package com.ssafy.member.model.service;

import com.ssafy.member.model.MemberDto;
import com.ssafy.member.model.dao.MemberDao;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberDao memberDao;

    public MemberServiceImpl(MemberDao memberDao) {
        super();
        this.memberDao = memberDao;
    }

    @Override
    public int idCheck(String userId) throws Exception {
        return memberDao.idCheck(userId);
    }

    @Override
    public void joinMember(MemberDto memberDto) throws Exception {
        memberDao.joinMember(memberDto);
    }

    @Override
    public MemberDto loginMember(Map<String, String> map) throws Exception {
        return memberDao.loginMember(map);
    }

}
