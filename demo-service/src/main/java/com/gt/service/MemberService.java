package com.gt.service;

import com.gt.dao.IDaoMember;
import com.gt.dao.mapper.MemberMapper;
import com.gt.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by luyh on 16/4/27.
 */

@Service
public class MemberService implements IMemberService{

  /*  @Autowired
    private IDaoMember daoMember;*/

    @Autowired
    private MemberMapper memberMapper;

  /*  @Override
    public Member findMemberByUid(Long uid) throws Exception {
        return daoMember.findMemberByUid(uid);
    }*/

    @Override
    public Member findMemberByMemberId(Integer memberId) throws Exception {
        System.out.println(1111111);
        return memberMapper.findMemberByMemberId(memberId);
     //   return daoMember.findMemberByMemberId(memberId);
    }
}
