package com.credibanco.tarjetaapp.Service.Impl;


import java.util.ArrayList;
import java.util.List;

import com.credibanco.tarjetaapp.Entity.Card;
import com.credibanco.tarjetaapp.Repository.ICardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credibanco.tarjetaapp.DTO.RequestDTO;
import com.credibanco.tarjetaapp.DTO.ResponseDTO;
import com.credibanco.tarjetaapp.Service.CardService;


@Service
public class CardServiceImpl implements CardService {

	@Autowired
	ICardRepository iCardRepository;
	ResponseDTO responseDTO = new ResponseDTO();

	@Override
	public ResponseDTO crearTarjeta(RequestDTO requestDTO) {

		Card card = new Card();
		card.setHolderName(requestDTO.getNombre());

		if(requestDTO.getBin().length() < 6) {
			responseDTO.setCard("0");
			return responseDTO;
		}
		
		String response = numerosRandom(requestDTO);
		return responseDTO;
	}

	@Override
	public String numerosRandom(RequestDTO requestDTO) {
		
		int numeroRandom;
		List<Integer> numeros = new ArrayList<>();
		
		int value = 0;
		if(requestDTO.getBin().length() == 6) {
			value = 9;
		} else if(requestDTO.getBin().length() == 7) {
			value = 8;
		} else if(requestDTO.getBin().length() == 8) {
			value = 7;
		}else {
			return "Error";
		}
		
		for (int i = 0; i <= value; i++) {
			numeroRandom = (int)(Math.random()*10);
			numeros.add(numeroRandom);
		}
		
		return requestDTO.getBin() + concatenarNumeros(numeros) ;
		
	}

	@Override
	public String concatenarNumeros(List<Integer> numeros) {
		StringBuilder resultado = new StringBuilder();
		
		for(Integer numero : numeros) {
			resultado.append(numero);
		}
		
		return resultado.toString();
	}

	
	

}
