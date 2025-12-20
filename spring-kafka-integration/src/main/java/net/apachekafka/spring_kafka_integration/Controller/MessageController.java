package net.apachekafka.spring_kafka_integration.Controller;

import net.apachekafka.spring_kafka_integration.Kafka.kafkaProducer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka/message")
public class MessageController {
    private kafkaProducer kafkaProducer;

    public MessageController(kafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }
    // http:localhost:8080/api/kafka/message/publish?message=helloworld
    @GetMapping("/publish")
    public ResponseEntity<String> publish (@RequestParam String message) {
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to the topic");
    }


}