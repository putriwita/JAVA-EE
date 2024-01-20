package com.springboot.UTS_11321071.service;

import com.springboot.UTS_11321071.model.produk;
import com.springboot.UTS_11321071.repository.produkRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class produkService {
    private final produkRepository produkRepository;

    @Autowired
    public produkService(produkRepository ProdukRepository) {
        this.produkRepository = ProdukRepository;
    }

    public List<produk> getAllProduk() {
        return produkRepository.findAll();
    }

    public produk getProdukById(Long id) {
        return produkRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public produk createProduk(produk Produk) {
        return produkRepository.save(Produk);
    }

    public produk updateProduk(Long id, produk updatedProduk) {
        produk existingProduk = getProdukById(id);
        updatedProduk.setId(existingProduk.getId());
        return produkRepository.save(updatedProduk);
    }

    public void deleteProduk(Long id) {
        produkRepository.deleteById(id);
    }
    
    // Tambahkan metode tambahan jika diperlukan
}
