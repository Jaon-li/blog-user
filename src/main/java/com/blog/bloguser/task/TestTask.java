package com.blog.bloguser.task;

import com.blog.bloguser.domain.User;
import com.blog.bloguser.mapper.UserMapper;
import com.netflix.discovery.converters.Auto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TestTask {


    @Autowired
    private UserMapper userMapper;


    @Scheduled(fixedDelay = 2 * 1000)
    public void test() {
        try {
            log.info("开始执行");
            User user = new User(1, "11", "22", "33", "44");
            int insert = userMapper.insert(user);
            Thread.sleep(50 * 1000);
        } catch (Exception e) {
            log.error("插入异常，", e);
        } finally {
            try {
                log.info("开始删除");
                userMapper.deleteById(1);
            } catch (Exception e) {
                log.error("删除异常，", e);
            }
        }


    }


}
