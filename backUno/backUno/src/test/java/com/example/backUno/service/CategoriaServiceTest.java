package com.example.backUno.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.backUno.model.Categoria;
import com.example.backUno.service.CategoriaService;

class CategoriaServiceTest {
	@Autowired
	CategoriaService categoriaServiceTest;
	
	 
	@Test
	void testGuardar() {
		Categoria categoria= new Categoria();
		categoria.setIdCate(4);
		categoria.setNombreCate("Popote");
		categoria.setCaracteristicasCate("Papel");
		
		Categoria categoria1=categoriaServiceTest.guardar(categoria);
		assertThat(categoria.getIdCate()).isGreaterThan(0);
	}

	@Test
	void testObtenerCates() {
		List<Categoria> lst=new ArrayList<>();
		List<Categoria> result=categoriaServiceTest.obtenerCates();
		if(result!=null) {
			Assertions.assertTrue(true);
		}else {
			Assertions.fail();
		}
	}

	@Test
	void testObtenerCate() {
		fail("Not yet implemented");
	}

	@Test
	void testActualizar() {
		Categoria categoria =categoriaServiceTest.obtenerCate(2).get();
		
		categoria.setNombreCate("Popote");
		categoria.setCaracteristicasCate("Papel");
		
		Categoria categoriaUp=categoriaServiceTest.actualizar(categoria );
		
		assertThat(categoriaUp.getNombreCate()).isEqualTo("Popote");
	}

	@Test
	void testEliminar() {
		Categoria categoria = categoriaServiceTest.obtenerCate(2).get();
		categoriaServiceTest.eliminar(categoria.getIdCate());
		
		Categoria categoria1=null;
		Optional<Categoria> optionalCategoria= categoriaServiceTest.obtenerCate(2);
		if(optionalCategoria.isPresent()) {
			categoria1 =optionalCategoria.get();
		}
		assertThat(categoria1).isNull();
	}

}
