package com.blog.bloguser.utils;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqUtils {

    @Autowired
    private AmqpTemplate amqpTemplate;

    /**
     * @Title 发送消息
     * @Description 发送消息
     **/
    public void sendMessage() {
        String message = "简单队列-Hello World";
        System.out.println("发送消息 : " + message);
        amqpTemplate.convertAndSend("second-queue", message);
    }
}
