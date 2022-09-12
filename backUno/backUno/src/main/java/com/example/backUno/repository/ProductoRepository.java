package com.example.backUno.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backUno.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
	Optional<Producto> findById(int id);
}
