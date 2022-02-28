package com.redis.pub.sub.pubsub.subscriber;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

@Slf4j
public class SubscriberClass implements MessageListener {
    @Override
    public void onMessage(Message message, byte[] pattern) {
        log.info("Consumed message : "+);

    }
}
