package com.gt.controller;

import com.gt.config.RedisService;
import com.gt.entity.Member;
import com.gt.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luyh on 16/4/27.
 */

@RestController
@RequestMapping("/login")
public class MemberController {

    @Autowired
    private IMemberService memberService;

    @Autowired
    private RedisService redisService ;



    @RequestMapping("/member/{memberId}")
    Member findMemberByMemberId(@PathVariable("memberId") Integer memberId) throws Exception{

        redisService.set("11","wwa");
        Integer a = 10/0;
        System.out.println("redis:======>"+redisService.get("11"));

       return memberService.findMemberByMemberId(memberId);
    }



}
