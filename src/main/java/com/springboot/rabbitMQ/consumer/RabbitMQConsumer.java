package com.springboot.rabbitMQ.consumer;

import com.springboot.rabbitMQ.config.RabbitMQConfig;
import com.springboot.rabbitMQ.entity.OrderDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {

  @RabbitListener(queues = RabbitMQConfig.QUEUE)
  public void concume(OrderDTO orderDTO){
    System.out.println("concumer is able to consume message from queues " + orderDTO);

  }
}
