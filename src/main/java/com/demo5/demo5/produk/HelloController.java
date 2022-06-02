package com.demo5.demo5.produk;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produk")
public class HelloController {
    @GetMapping
    public ResponseEntity<Hello> getHelloWorld() {
        return ResponseEntity.ok(new Hello());
    }

    @DeleteMapping
    public ResponseEntity<Hello> deleteHelloWorld() {
        return ResponseEntity.ok(new Hello());
    }
}
