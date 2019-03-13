package com.bootdo.testDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RestController;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDemo {
    @Autowired
    RedisTemplate redisTemplate;

    @Test
    public void test() {
        System.out.println("me");
        redisTemplate.opsForValue().set("a", "b");
        System.out.println(redisTemplate.opsForValue().get("a"));
    }

    ;
}
