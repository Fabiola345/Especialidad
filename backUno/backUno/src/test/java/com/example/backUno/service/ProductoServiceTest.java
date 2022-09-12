package com.example.backUno.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.backUno.model.Producto;
import com.example.backUno.service.ProductoService;

import org.junit.jupiter.api.Test;

class ProductoServiceTest {
	@Autowired
	ProductoService productoServiceTest;
	
	@Test
	void testGuardar() {
		Producto producto= new Producto();
		producto.setIdPcto(4);
		producto.setNombrePcto("Taza");
		producto.setCaracteristicasPcto("Verde");
		
		Producto producto1=productoServiceTest.guardar(producto);
		assertThat(producto.getIdPcto()).isGreaterThan(0);
	}

	@Test
	void testObtenerPctos() {
		List<Producto> lst=new ArrayList<>();
		List<Producto> result=productoServiceTest.obtenerPctos();
		if(result!=null) {
			Assertions.assertTrue(true);
		}else {
			Assertions.fail();
		}
	}

	@Test
	void testObtenerPcto() {
		fail("Not yet implemented");
	}

	@Test
	void testActualizar() {
		Producto producto =productoServiceTest.obtenerPcto(2).get();
		
		producto.setNombrePcto("Taza");
		producto.setCaracteristicasPcto("Verde");
		
		Producto productoUp=productoServiceTest.actualizar(producto);
		
		assertThat(productoUp.getNombrePcto()).isEqualTo("Taza");
	}

	@Test
	void testEliminar() {
		Producto producto = productoServiceTest.obtenerPcto(2).get();
		productoServiceTest.eliminar(producto.getIdPcto());
		
		Producto producto1=null;
		Optional<Producto> optionalProducto= productoServiceTest.obtenerPcto(2);
		if(optionalProducto.isPresent()) {
			producto1 =optionalProducto.get();
		}
		assertThat(producto1).isNull();
	}

}
