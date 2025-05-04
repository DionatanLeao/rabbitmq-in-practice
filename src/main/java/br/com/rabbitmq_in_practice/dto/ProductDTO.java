package br.com.rabbitmq_in_practice.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
public class ProductDTO implements Serializable {
    private Integer id;
    private String name;
    private Double price;


}
