package com.example.backUno.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backUno.model.Categoria;
import com.example.backUno.model.Producto;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
	Optional<Categoria> findById(int id);
}
