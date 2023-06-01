package com.credibanco.tarjetaapp.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


@JsonIgnoreProperties
@JsonSerialize
public class RequestDTO {
	@JsonProperty("nombre")
	private String nombre;
	
	@JsonProperty("documento")
	private String documento;
	
	@JsonProperty("bin")
	private String bin;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getBin() {
		return bin;
	}

	public void setBin(String bin) {
		this.bin = bin;
	}

	@Override
	public String toString() {
		return "RequestDTO [nombre=" + nombre + ", documento=" + documento + ", bin=" + bin + "]";
	}
	
	
}
