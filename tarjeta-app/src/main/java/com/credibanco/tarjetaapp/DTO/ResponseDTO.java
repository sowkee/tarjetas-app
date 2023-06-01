package com.credibanco.tarjetaapp.DTO;

import java.util.Date;

public class ResponseDTO {
	private String card;
	private Date fechaCreacion;

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@Override
	public String toString() {
		return "ResponseDTO{" +
				"card='" + card + '\'' +
				", fechaCreacion=" + fechaCreacion +
				'}';
	}
}
