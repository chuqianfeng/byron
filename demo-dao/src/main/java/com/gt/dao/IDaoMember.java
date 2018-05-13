package com.gt.dao;


import com.gt.entity.Member;

/**
 * Created by luyh on 16/4/27.
 */
public interface IDaoMember {

    Member findMemberByUid(Long uid) throws Exception;

    Member findMemberByMemberId(Integer memberId) throws Exception;

}
