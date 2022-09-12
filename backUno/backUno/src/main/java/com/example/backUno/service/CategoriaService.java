package com.example.backUno.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backUno.model.Categoria;
import com.example.backUno.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public void guardar (Categoria categoria) {
		categoriaRepository.save(categoria);
	}
	
	public List<Categoria> obtenerCates(){
		return categoriaRepository.findAll();
	}
	
	public Optional<Categoria> obtenerCate(Integer id){
		return categoriaRepository.findById(id);
	}
	
	public void actualizar (Categoria categoria) {
		categoriaRepository.save(categoria);
	}
	
	public void eliminar(Integer id){
		categoriaRepository.deleteById(id);
	}
}
