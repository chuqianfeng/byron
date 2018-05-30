package com.gt.controller.rabbitmq.simple;

import com.gt.rabbitmq.ConnectionUtils;
import com.rabbitmq.client.*;

import java.io.IOException;

/**
 * Created by Administrator on 2018/5/28.
 */
public class Recv {
    private static final String QUEUE_NAME = "test_simple_queue";

    public static void main(String[] args) throws Exception{
        Connection connection = ConnectionUtils.getConnection();
        //从连接中获取一个通道
        Channel channel =  connection.createChannel();
        //队列声明
        channel.queueDeclare(QUEUE_NAME,false,false,false,null);


        DefaultConsumer consumer = new DefaultConsumer(channel){
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                super.handleDelivery(consumerTag, envelope, properties, body);

                String msg = new String(body, "utf-8");
                System.out.println("msg:"+msg);
            }
        };
        //监听队列
        channel.basicConsume(QUEUE_NAME,true,consumer);





    }


}