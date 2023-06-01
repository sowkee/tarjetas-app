package com.credibanco.tarjetaapp.Entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CARD")
public class Card {

	@Id
    @Column(name = "ID")
    private int Id;

    @CreationTimestamp
    @Column(name = "CREATE_DATE", nullable = true, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    @Column(name = "CARD_NUMBER", nullable = false)
    private String cardNumber;

    @Column(name = "HOLDER_NAME")
    private String holderName;

    @Column(name = "HOLDER_IDENTIFICATION", nullable = false)
    private String holderIdentification;

    @Column(name = "BIN", nullable = false)
    private String bin;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getHolderIdentification() {
        return holderIdentification;
    }

    public void setHolderIdentification(String holderIdentification) {
        this.holderIdentification = holderIdentification;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }
}
