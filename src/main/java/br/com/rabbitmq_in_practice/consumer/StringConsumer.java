package br.com.rabbitmq_in_practice.consumer;

import br.com.rabbitmq_in_practice.config.RabbitMqConfig;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StringConsumer {

    @RabbitListener(queues = {RabbitMqConfig.RK_PRODUCT_LOG})
    public void consumer(String message) {
        log.info("Consumer received a message: " + message);
    }
}
