package com.gt.service;

import com.gt.entity.Greeting;
import com.gt.entity.HelloMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.util.HtmlUtils;

/**
 * Created by Administrator on 2018/5/17.
 */
@Service
public class WebSocketServiceImpl implements IWebSocketService{
    @Autowired
    private SimpMessagingTemplate template;


    @Override
    public void sendMessage(HelloMessage message) {
        template.convertAndSend("/topic/greetings"+"/aa", new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!"));


    }
}