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

import com.example.backUno.model.Producto;
import com.example.backUno.service.ProductoService;

@RestController
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@PostMapping("/api/producto")
	public Producto guardarProducto(@RequestBody Producto producto){
		productoService.guardar(producto);
		return producto;
	}
	
	@GetMapping("/api/productos")
	public List<Producto> obtenerPcto(){
		return productoService.obtenerPctos();
	}
	
	@GetMapping("/api/producto/{id}")
	public Optional<Producto> obtenerPcto(@PathVariable("id")Integer id){
		return productoService.obtenerPcto(id);
	}
	
	@PutMapping("/api/producto/{id}")
	public void actualizarPcto(@RequestBody Producto producto) {
		productoService.actualizar(producto);
	}
	
	@DeleteMapping("/api/producto/{id}")
	public void eliminarPcto(@PathVariable("id")Integer id) {
		productoService.eliminar(id);
	}
	
}
