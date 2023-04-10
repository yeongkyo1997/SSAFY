package com.ssafy.mybatis.test;

import com.ssafy.mybatis.model.Member;
import com.ssafy.mybatis.model.dao.TestDao;
import com.ssafy.mybatis.model.dao.TestDaoImpl1;

import java.util.List;

public class Test1 {
    private TestDao dao = new TestDaoImpl1();

    public static void main(String[] args) {
        Test1 test = new Test1();
//        test.selectList();
//        test.join();
        test.delete();
    }

    private void join() {
        // id, name, area, tel
        /*
         * id : member7
         * name : 재곤현곤
         * area : 서대
         * tel : 010-1234-5678
         */
        Member member = new Member();
        member.setId("member7");
        member.setName("재곤현곤");
        member.setArea("서대");
        member.setTel("010-1234-5678");
        dao.insertMember(member);
        selectList();
    }

    private void selectList() {
        List<Member> members = dao.selectMember();
        for (Member member : members) {
            System.out.println(member.getId() + "," + member.getName() + "," + member.getArea());
        }
    }

    private void delete() {
        dao.deleteMember("member7");
        selectList();
    }
}
