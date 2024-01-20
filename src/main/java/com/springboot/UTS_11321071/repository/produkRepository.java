package com.springboot.UTS_11321071.repository;

import com.springboot.UTS_11321071.model.produk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface produkRepository extends JpaRepository<produk, Long> {
    // Tambahkan metode tambahan jika diperlukan
}
