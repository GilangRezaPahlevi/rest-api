package com.demo5.demo5.produk.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.demo5.demo5.produk.dto.input.produkInput;
import com.demo5.demo5.produk.dto.output.produkoutput;
import com.demo5.demo5.produk.service.produkservice;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class produkcontroller {

    private final produkservice service;

    public produkcontroller(produkservice servic) {
        this.service = servic;
    }

    @GetMapping("/{id}")
    public ResponseEntity<produkoutput> getOne(@PathVariable long id) {
        produkoutput Produkoutpu = service.getOne(id);
        return ResponseEntity.ok(Produkoutpu);
    }

    @PostMapping
    public ResponseEntity<produkoutput> insertOne(@RequestBody produkInput produkInput) {
        produkoutput produkoutput = service.addOne(produkInput);
        return ResponseEntity.ok(produkoutput);
    }
}
