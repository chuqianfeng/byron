package com.gt.dao;

import com.gt.dao.mapper.MemberMapper;
import com.gt.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by luyh on 16/4/27.
 */

@Component
public class DaoMember implements IDaoMember {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public Member findMemberByUid(Long uid) throws Exception {
        return memberMapper.findMemberByUid(uid);
    }

    @Override
    public Member findMemberByMemberId(Integer memberId) throws Exception {
        return memberMapper.findMemberByMemberId(memberId);
    }
}
