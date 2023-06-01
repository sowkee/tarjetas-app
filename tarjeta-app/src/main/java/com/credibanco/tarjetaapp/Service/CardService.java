package com.credibanco.tarjetaapp.Service;

import java.util.List;

import com.credibanco.tarjetaapp.Repository.ICardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credibanco.tarjetaapp.DTO.RequestDTO;
import com.credibanco.tarjetaapp.DTO.ResponseDTO;


@Service
public interface CardService {
	
	 ResponseDTO crearTarjeta(RequestDTO requestDTO);
	 String numerosRandom(RequestDTO requestDTO);
	 String concatenarNumeros(List<Integer> numeros);
}
