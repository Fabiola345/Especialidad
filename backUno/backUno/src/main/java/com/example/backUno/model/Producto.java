package com.example.backUno.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idPcto;
	private String nombrePcto;
	private String caracteristicasPcto;
	
	public Producto() {}

	public Integer getIdPcto() {
		return idPcto;
	}

	public void setIdPcto(Integer idPcto) {
		this.idPcto = idPcto;
	}

	public String getNombrePcto() {
		return nombrePcto;
	}

	public void setNombrePcto(String nombrePcto) {
		this.nombrePcto = nombrePcto;
	}

	public String getCaracteristicasPcto() {
		return caracteristicasPcto;
	}

	public void setCaracteristicasPcto(String caracteristicasPcto) {
		this.caracteristicasPcto = caracteristicasPcto;
	}

	@Override
	public String toString() {
		return "Producto [idPcto=" + idPcto + ", nombrePcto=" + nombrePcto + ", caracteristicasPcto="
				+ caracteristicasPcto + "]";
	}
	
	

}
