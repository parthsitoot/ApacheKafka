package net.apachekafka.spring_kafka_integration.Controller;

import net.apachekafka.spring_kafka_integration.Kafka.JsonKafkaProducer;
import net.apachekafka.spring_kafka_integration.Kafka.KafkaProducer;
import net.apachekafka.spring_kafka_integration.PayLoad.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {
    private JsonKafkaProducer kafkaProducer;

    public JsonMessageController(JsonKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping
    public ResponseEntity<String> publish (@RequestBody User user) {
        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Message sent to the topic");
    }
}