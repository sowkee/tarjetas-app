package com.credibanco.tarjetaapp.Repository;

import com.credibanco.tarjetaapp.Entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICardRepository extends JpaRepository<Card, Long> {

    Card getCardByHolderIdentification(String holderIdentification);
}
