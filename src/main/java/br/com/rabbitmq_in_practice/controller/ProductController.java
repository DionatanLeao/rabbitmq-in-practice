package br.com.rabbitmq_in_practice.controller;

import br.com.rabbitmq_in_practice.dto.ProductDTO;
import br.com.rabbitmq_in_practice.service.ProductService;
import br.com.rabbitmq_in_practice.service.StringService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductDTO> produces(@RequestBody ProductDTO dto) {
        productService.createProduct(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
