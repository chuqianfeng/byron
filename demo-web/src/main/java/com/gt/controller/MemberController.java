package com.gt.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gt.config.RedisService;
import com.gt.entity.Member;
import com.gt.service.IMemberService;
import com.gt.utils.CommonUtil;
import com.gt.utils.ServerResponse;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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



    @RequestMapping("/member")
    Member findMemberByMemberId(HttpServletRequest request, HttpServletResponse response,@Param("memberId") Integer memberId) throws Exception{

        redisService.set("11","wwa");
        Integer a = 10/0;
        System.out.println("redis:======>"+redisService.get("11"));



       return memberService.findMemberByMemberId(memberId);
    }
    @RequestMapping("/demo/index")
    public void login(HttpServletRequest request, HttpServletResponse response, Integer memberId) throws Exception{
        ServerResponse sp = ServerResponse.createByFail();
        if(memberId == null){
            sp = ServerResponse.createByFail("缺少参数!");
        }else{
//            JSONObject.parseObject("",Member.class);
//            ArrayList<Member> list = new ArrayList<>();
//            JSONObject.parseArray("",list.getClass());
            Map<String,Object> map = new HashMap<>();
            Map<String,Object> msg = new HashMap<>();
            Member member = new Member();
            member.setEmplyee_id(1);
            member.setGender(2);
            member.setUid(5);
            sp = ServerResponse.createBySuccss(member);

        }
        CommonUtil.write(response,sp);

    }



}
