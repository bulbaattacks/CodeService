package io.github.bulbaattacks.CodeService.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CodeConsumer {

    @KafkaListener(topics = "code-events", groupId = "code-service-group")
    public void consume(String message) {
        try {
            System.out.println("Ваш код: " + message);
        } catch (Exception e) {
            System.err.println("Ошибка обработки сообщения: " + e.getMessage());
        }
    }
}
