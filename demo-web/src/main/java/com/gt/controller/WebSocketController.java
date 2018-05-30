package com.gt.controller;

import com.gt.entity.InMessage;
import com.gt.entity.OutMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/5/13.
 * 暂时不用
 *
 */
@RestController
@RequestMapping("/webSocket")
public class WebSocketController {
    @MessageMapping("v1/chat")
    @SendTo("/topic/game_chat")
    public OutMessage gameInfor(InMessage message){
        return new OutMessage(message.getContent());

    }
}