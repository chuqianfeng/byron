package com.gt.service;

import com.gt.entity.HelloMessage;

/**
 * Created by Administrator on 2018/5/17.
 */
public interface IWebSocketService {

    public void sendMessage(HelloMessage message);
}
