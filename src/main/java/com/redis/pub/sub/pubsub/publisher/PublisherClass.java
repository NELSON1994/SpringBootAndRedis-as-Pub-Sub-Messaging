package com.redis.pub.sub.pubsub.publisher;

import com.redis.pub.sub.pubsub.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublisherClass {
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private ChannelTopic topic;

    @PostMapping("/publish/student")
    public String publish(@RequestBody Student student){
        redisTemplate.convertAndSend(topic.getTopic(), student.toString());
        return "student object published successfully";
    }
}
