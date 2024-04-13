package com.example.magicthegatheringshellapplication.service;

import com.example.magicthegatheringshellapplication.api.ScryfallApi;
import com.example.magicthegatheringshellapplication.dto.Autocomplete;
import com.example.magicthegatheringshellapplication.dto.Card;
import com.example.magicthegatheringshellapplication.dto.Set;
import com.example.magicthegatheringshellapplication.dto.SetObject;
import com.example.magicthegatheringshellapplication.util.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CardService {

    private final TableBuilder tableBuilder;
    private final ScryfallApi api;
    private final ImageViewer imageViewer;
    private final SetViewer setViewer;
    private final DialogReader dialog;

    public void getRandomCard() {
        Card card = api.getRandomCard();

        tableBuilder.addRow("Name", card.getName())
                .addRow("ID", card.getId())
                .addRow("Artist", card.getArtist())
                .addRow("Type line", card.getType_line())
                .addRow("Flavor text", card.getFlavor_text())
                .print();
        imageViewer.show(card.getImage_uris().getNormal());
    }

    public void getCardByName(String name) {
        Card card = api.getCardByExactName(name);
        if (card.getObject().equals("error")) {
            System.out.println("Searched card name '" + name + "' not found. Try again.");
        } else if (card.getImage_uris() == null) {
            System.out.println("Image URL is null");
        } else {
            tableBuilder.addRow("Name", card.getName())
                    .addRow("ID", card.getId())
                    .addRow("Artist", card.getArtist())
                    .addRow("Type line", card.getType_line())
                    .addRow("Flavor text", card.getFlavor_text())
                    .print();
            imageViewer.show(card.getImage_uris().getNormal());
    }}

    public void getCardNameByAutocomplete(String name) {
        Autocomplete autocomplete = api.getAutocomplete(name);
        if (autocomplete.getTotal_values() == 0) {
            System.out.println("No cards found for the given name. Try again.");
        } else {
            tableBuilder.createTableFromMap(autocomplete.getDataMap()).print();

            String dialogResult = dialog.autocompleteDialog(autocomplete.getDataMap());
            if (dialogResult != null) {
                getCardByName(dialogResult);
            }
        }
    }

    public void getAllSets(String sortBy, String reserveSort) {
        Set set = api.getSets();
        tableBuilder.buildTableForSets(set.getData(), sortBy, reserveSort).print();
        List<String> codes = new ArrayList<>();
        set.getData().forEach(code -> codes.add(code.getCode()));

        String setCode = dialog.allSetsDialog(codes);
        if (setCode != null) {
            getSet(setCode);
        }
    }

    public void getSet(String setName) {
        SetObject setObject = api.getSet(setName);
        if (setObject.getCode().equals("not_found")) {
            System.out.println("Searched set name '" + setName + "' not found. Try again.");
        } else {
            tableBuilder.addRow("Code", setObject.getCode())
                    .addRow("Name", setObject.getName())
                    .addRow("Released at", setObject.getReleased_at())
                    .addRow("Digital", setObject.getDigital().toString())
                    .print();
            var cards = api.getCardsImagesWithNames(setObject.getSearch_uri());
            Printer.printYellowColor("Loading...");
            setViewer.showSet(cards, setObject.getName());
        }
    }
}
