package br.com.rabbitmq_in_practice.service;

import br.com.rabbitmq_in_practice.config.RabbitMqConfig;
import br.com.rabbitmq_in_practice.dto.ProductDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Log4j2
@Service
public class ProductService {
    private final RabbitTemplate rabbitTemplate;

    public void createProduct(ProductDTO dto) {
        log.info("Sending a message to exchange: " + dto.toString());
        rabbitTemplate.convertAndSend(RabbitMqConfig.EXG_NAME_MARKETPLACE,
                RabbitMqConfig.RK_PRODUCT_LOG,
                dto);
    }
}
