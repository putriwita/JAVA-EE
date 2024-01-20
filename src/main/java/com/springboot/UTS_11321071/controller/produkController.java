package com.springboot.UTS_11321071.controller;

import com.springboot.UTS_11321071.model.produk;
import com.springboot.UTS_11321071.service.produkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/produk")
public class produkController {
    @Autowired
    private produkService produkService;

    @GetMapping("")
    public List<produk> list() {
        return produkService.getAllProduk();
    }

    @GetMapping("/{id}")
    public ResponseEntity<produk> get(@PathVariable Long id) {
        try {
            produk produk = produkService.getProdukById(id);
            return new ResponseEntity<>(produk, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public ResponseEntity<produk> add(@RequestBody produk produk) {
        produk createdProduk = produkService.createProduk(produk);
        return new ResponseEntity<>(createdProduk, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody produk produk, @PathVariable Long id) {
        try {
            produk updatedProduk = produkService.updateProduk(id, produk);
            return new ResponseEntity<>(updatedProduk, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        produkService.deleteProduk(id);
    }
    
    // Tambahkan metode tambahan jika diperlukan
}
