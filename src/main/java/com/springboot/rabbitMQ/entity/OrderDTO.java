package com.springboot.rabbitMQ.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**response*/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDTO {
  private Order order;
  private String orderStatus;
  private String message;
}
