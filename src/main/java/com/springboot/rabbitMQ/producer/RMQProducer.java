package com.springboot.rabbitMQ.producer;

import com.springboot.rabbitMQ.config.RabbitMQConfig;
import com.springboot.rabbitMQ.entity.Order;
import com.springboot.rabbitMQ.entity.OrderDTO;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RMQProducer {

  @Autowired
  private RabbitTemplate rabbitTemplate;

  /**
   * Producer to Exchange
   */
  @PostMapping("/order")
  public OrderDTO placeOrder(@RequestBody Order order) {
    OrderDTO orderDTO = new OrderDTO(order, "Order Placed", "Hi Producer Your Order is Places");
    rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE, RabbitMQConfig.ROUTING_KEY, orderDTO);
    return orderDTO;
  }
}
