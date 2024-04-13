package com.example.magicthegatheringshellapplication.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PurchaseUris {
    private String tcgplayer;
    private String cardmarket;
    private String cardhoarder;

    public void setTcgplayer(String tcgplayer) {
        this.tcgplayer = tcgplayer;
    }

    public void setCardmarket(String cardmarket) {
        this.cardmarket = cardmarket;
    }

    public void setCardhoarder(String cardhoarder) {
        this.cardhoarder = cardhoarder;
    }

    public String getTcgplayer() {
        return tcgplayer;
    }

    public String getCardmarket() {
        return cardmarket;
    }

    public String getCardhoarder() {
        return cardhoarder;
    }
}
