package br.com.rabbitmq_in_practice.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO implements Serializable {
    private Integer id;
    private String name;
    private Double price;


}
