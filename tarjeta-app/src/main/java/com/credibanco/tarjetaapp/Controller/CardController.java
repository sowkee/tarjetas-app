package com.credibanco.tarjetaapp.Controller;

import java.util.HashMap;
import java.util.Map;

import com.credibanco.tarjetaapp.DTO.ResultDto;
import com.credibanco.tarjetaapp.Utils.ExceptionObject;
import com.credibanco.tarjetaapp.Utils.ExceptionsMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.credibanco.tarjetaapp.DTO.RequestDTO;
import com.credibanco.tarjetaapp.Service.CardService;

@RestController
@RequestMapping("cards")
public class CardController {
	
	@Autowired
    CardService cardService;
	
    Map<String, String> mapCards = new HashMap<>();
    
   @GetMapping("read/{id}")
    public ResponseEntity<Object> readUser (@PathVariable String id) {
        if(mapCards.containsKey(id)) {
            return ResponseEntity.status(HttpStatus.OK).body(mapCards.get(id));
        }
        
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No exite.");
    }

    /*@GetMapping("/read/{id}")
    public ResponseEntity<Object>readUser(@PathVariable Long id) {
        try {
            throw new ExceptionObject(ExceptionsMessages.ERROR_NEQUI_02);
        } catch (ExceptionObject E) {
            ResultDto responseDTO = new ResultDto(E);
            return new ResponseEntity<>(responseDTO, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }*/

    @PostMapping("create")
    @ResponseBody
    public ResponseEntity<Object> createCard (@RequestBody RequestDTO requestDTO) {

        mapCards.put("1", cardService.numerosRandom(requestDTO));

        return ResponseEntity.status(HttpStatus.OK).body(mapCards);
    }

}
