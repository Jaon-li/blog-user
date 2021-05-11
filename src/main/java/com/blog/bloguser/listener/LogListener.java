package com.blog.bloguser.listener;

import com.alibaba.fastjson.JSON;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "log-queue")
public class LogListener {

    @RabbitHandler
    public void Listener(String message) {
        System.out.println("消费信息" + JSON.toJSONString(message));
    }
}
