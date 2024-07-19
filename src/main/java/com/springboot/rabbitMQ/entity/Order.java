package com.springboot.rabbitMQ.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**request*/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {
private Integer id;
private String name;
private double price;
private Integer quantity;

}
