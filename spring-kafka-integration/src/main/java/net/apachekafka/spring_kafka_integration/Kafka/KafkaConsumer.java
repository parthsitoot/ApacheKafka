package net.apachekafka.spring_kafka_integration.Kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {
    @KafkaListener (topics = "javaGuide", groupId = "myGroup")
    public void consume (String message) {
        log.info(String.format("Message receiver: %s", message));

    }
}
