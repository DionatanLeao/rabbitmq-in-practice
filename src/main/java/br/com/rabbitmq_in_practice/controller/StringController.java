package br.com.rabbitmq_in_practice.controller;

import br.com.rabbitmq_in_practice.service.StringService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/produces")
public class StringController {
    private final StringService stringService;

    @GetMapping
    public ResponseEntity<String> produces(@RequestParam("message") String message) {
        stringService.produce(message);
        return ResponseEntity.ok().body("Sending message ...");
    }
}
