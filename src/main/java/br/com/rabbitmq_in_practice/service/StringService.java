package br.com.rabbitmq_in_practice.service;

import br.com.rabbitmq_in_practice.config.RabbitMqConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class StringService {
    private final RabbitTemplate rabbitTemplate;

    public void produce(String message) {
        log.info("Received message " + message);
        rabbitTemplate.convertAndSend(RabbitMqConfig.EXG_NAME_MARKETPLACE,
                RabbitMqConfig.RK_PRODUCT_LOG,
                message);
    }

}
