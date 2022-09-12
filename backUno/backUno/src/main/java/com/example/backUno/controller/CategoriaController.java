package com.example.backUno.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.backUno.model.Categoria;
import com.example.backUno.service.CategoriaService;

@RestController
public class CategoriaController {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@PostMapping("/api/categoria")
	public Categoria guardarCategoria(@RequestBody Categoria categoria){
		categoriaService.guardar(categoria);
		return categoria;
	}
	
	@GetMapping("/api/categorias")
	public List<Categoria> obtenerCate(){
		return categoriaService.obtenerCates();
	}
	
	@GetMapping("/api/categoria/{id}")
	public Optional<Categoria> obtenerCate(@PathVariable("id")Integer id){
		return categoriaService.obtenerCate(id);
	}
	
	@PutMapping("/api/categoria/{id}")
	public void actualizarCate(@RequestBody Categoria categoria) {
		categoriaService.actualizar(categoria);
	}
	
	@DeleteMapping("/api/categoria/{id}")
	public void eliminarCate(@PathVariable("id")Integer id) {
		categoriaService.eliminar(id);
	}
	
}