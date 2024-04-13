package com.example.magicthegatheringshellapplication.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Prices {
    private String usd;
    private String usd_foil;
    private String usd_etched;
    private String eur;
    private String eur_foil;
    private String tix;

    public void setUsd(String usd) {
        this.usd = usd;
    }

    public void setUsd_foil(String usd_foil) {
        this.usd_foil = usd_foil;
    }

    public void setUsd_etched(String usd_etched) {
        this.usd_etched = usd_etched;
    }

    public void setEur(String eur) {
        this.eur = eur;
    }

    public void setEur_foil(String eur_foil) {
        this.eur_foil = eur_foil;
    }

    public void setTix(String tix) {
        this.tix = tix;
    }

    public String getUsd() {
        return usd;
    }

    public String getUsd_foil() {
        return usd_foil;
    }

    public String getUsd_etched() {
        return usd_etched;
    }

    public String getEur() {
        return eur;
    }

    public String getEur_foil() {
        return eur_foil;
    }

    public String getTix() {
        return tix;
    }
}
