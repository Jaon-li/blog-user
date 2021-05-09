package com.blog.bloguser.listener;

import com.alibaba.fastjson.JSON;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class LogListener {

  @RabbitListener(queues = "TestDirectExchange")
  public void Listener(String message){
    System.out.println(JSON.toJSONString(message));
  }
}
