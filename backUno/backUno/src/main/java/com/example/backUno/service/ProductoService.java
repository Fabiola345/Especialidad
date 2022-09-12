package com.example.backUno.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backUno.model.Producto;
import com.example.backUno.repository.ProductoRepository;

@Service
public class ProductoService {
	
	@Autowired
	private ProductoRepository productoRepository;
	
	public void guardar (Producto producto) {
		productoRepository.save(producto);
	}
	
	public List<Producto> obtenerPctos(){
		return productoRepository.findAll();
	}
	
	public Optional<Producto> obtenerPcto(Integer id){
		return productoRepository.findById(id);
	}
	
	public void actualizar (Producto producto) {
		productoRepository.save(producto);
	}
	
	public void eliminar(Integer id){
		productoRepository.deleteById(id);
	}
}
