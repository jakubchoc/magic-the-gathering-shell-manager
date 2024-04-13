package com.example.magicthegatheringshellapplication.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class CardList {
    private String object;
    private int total_cards;
    private boolean has_more;
    private List<Card> data;

    public void setObject(String object) {
        this.object = object;
    }

    public void setTotal_cards(int total_cards) {
        this.total_cards = total_cards;
    }

    public void setHas_more(boolean has_more) {
        this.has_more = has_more;
    }

    public void setData(List<Card> data) {
        this.data = data;
    }

    public String getObject() {
        return object;
    }

    public int getTotal_cards() {
        return total_cards;
    }

    public boolean isHas_more() {
        return has_more;
    }

    public List<Card> getData() {
        return data;
    }
}
