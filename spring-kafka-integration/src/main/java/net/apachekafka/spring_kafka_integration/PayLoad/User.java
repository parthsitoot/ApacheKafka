package net.apachekafka.spring_kafka_integration.PayLoad;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class User {
    private int id;
    private String firstName;
    private String lastName;

}
