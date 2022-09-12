package com.example.backUno.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categorias")
public class Categoria {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idCate;
	private String nombreCate;
	private String caracteristicasCate;
	
	public Categoria() {}

	public Integer getIdCate() {
		return idCate;
	}

	public void setIdCate(Integer idCate) {
		this.idCate = idCate;
	}

	public String getNombreCate() {
		return nombreCate;
	}

	public void setNombreCate(String nombreCate) {
		this.nombreCate = nombreCate;
	}

	public String getCaracteristicasCate() {
		return caracteristicasCate;
	}

	public void setCaracteristicasCate(String caracteristicasCate) {
		this.caracteristicasCate = caracteristicasCate;
	}

	@Override
	public String toString() {
		return "Categoria [idCate=" + idCate + ", nombreCate=" + nombreCate + ", caracteristicasCate="
				+ caracteristicasCate + "]";
	}
	
	
	
}
