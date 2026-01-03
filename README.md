# Mail Service

Сервис для обработки кодов подтверждения.  
**Назначение:** слушает Kafka топик `code-events` и имитирует отправку email, печатая код в консоль.

---

## 📌 Возможности
- Подписка на Kafka топик `code-events`.
- Получение сообщений с email и кодом подтверждения.
- Логирование (печать в консоль) полученного кода — имитация отправки письма пользователю.

---

## ⚙️ Требования
- Java 17+
- Maven или Gradle
- Kafka (локально или удалённо)

---

## 🔧 Конфигурация

Пример `application.properties`:

```properties
spring.kafka.bootstrap-servers=localhost:9092
spring.kafka.consumer.group-id=mail-service
spring.kafka.consumer.auto-offset-reset=earliest
spring.kafka.consumer.key-deserializer=org.apache.kafka.common.serialization.StringDeserializer
spring.kafka.consumer.value-deserializer=org.apache.kafka.common.serialization.StringDeserializer
