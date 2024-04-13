package com.example.magicthegatheringshellapplication.api;

import com.example.magicthegatheringshellapplication.dto.*;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ScryfallApi extends Api {

    public Card getCardByExactName(String name) {
        String replaced = name.replace(" ", "+").toLowerCase();
        return get("/cards/named?exact=" + replaced, Card.class);
    }

    public Card getRandomCard() {
        return get("/cards/random", Card.class);
    }

    public Autocomplete getAutocomplete(String findWord) {
        return get("/cards/autocomplete?q=" + findWord, Autocomplete.class);
    }

    public Set getSets() {
        return get("/sets", Set.class);
    }

    public SetObject getSet(String code) {
        return get("/sets/" + code, SetObject.class);
    }

    public CardList getCardsBySet(String searchUrl) {
        return getByFullPath(searchUrl, CardList.class);
    }

    public Map<String, String> getCardsImagesWithNames(String searchUrl) {
        Map<String, String> cards = new HashMap<>();
        CardList cardList = getCardsBySet(searchUrl);
        for (Card card : cardList.getData()) {
            if (card.getImage_uris() != null) {
                cards.put(card.getName(), card.getImage_uris().getNormal());
            }
        }

        return cards;
    }
}
