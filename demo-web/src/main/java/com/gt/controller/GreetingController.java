package com.gt.controller;

import com.gt.entity.Greeting;
import com.gt.entity.HelloMessage;
import com.gt.service.IWebSocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

    @Autowired
    private IWebSocketService webSocketService;

    /*
     方式一
    @MessageMapping("/hello")
   @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }
        */
   //方式二
    @MessageMapping("/hello")
    public void greeting(HelloMessage message) throws Exception {
        webSocketService.sendMessage(message);
    }



}
