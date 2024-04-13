package com.example.magicthegatheringshellapplication.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RelatedUris {
    private String gatherer;
    private String tcgplayer_infinite_articles;
    private String tcgplayer_infinite_decks;
    private String edhrec;

    public void setGatherer(String gatherer) {
        this.gatherer = gatherer;
    }

    public void setTcgplayer_infinite_articles(String tcgplayer_infinite_articles) {
        this.tcgplayer_infinite_articles = tcgplayer_infinite_articles;
    }

    public void setTcgplayer_infinite_decks(String tcgplayer_infinite_decks) {
        this.tcgplayer_infinite_decks = tcgplayer_infinite_decks;
    }

    public void setEdhrec(String edhrec) {
        this.edhrec = edhrec;
    }

    public String getGatherer() {
        return gatherer;
    }

    public String getTcgplayer_infinite_articles() {
        return tcgplayer_infinite_articles;
    }

    public String getTcgplayer_infinite_decks() {
        return tcgplayer_infinite_decks;
    }

    public String getEdhrec() {
        return edhrec;
    }
}
