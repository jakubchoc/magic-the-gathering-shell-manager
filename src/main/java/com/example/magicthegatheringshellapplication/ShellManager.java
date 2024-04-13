package com.example.magicthegatheringshellapplication;

import com.example.magicthegatheringshellapplication.api.ScryfallApi;
import com.example.magicthegatheringshellapplication.dto.Autocomplete;
import com.example.magicthegatheringshellapplication.dto.Card;
import com.example.magicthegatheringshellapplication.dto.Set;
import com.example.magicthegatheringshellapplication.dto.SetObject;
import com.example.magicthegatheringshellapplication.util.DialogReader;
import com.example.magicthegatheringshellapplication.util.ImageViewer;
import com.example.magicthegatheringshellapplication.util.SetViewer;
import com.example.magicthegatheringshellapplication.util.TableBuilder;
import org.springframework.shell.standard.AbstractShellComponent;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import org.springframework.stereotype.Service;

import static com.example.magicthegatheringshellapplication.util.Text.*;

@ShellComponent
@Service
public class ShellManager extends AbstractShellComponent {

    private final TableBuilder tableBuilder;
    private final ScryfallApi api;
    private final ImageViewer imageViewer;
    private final SetViewer setViewer;
    private final DialogReader dialog;

    public ShellManager(TableBuilder tableBuilder, ScryfallApi api, ImageViewer imageViewer, SetViewer setViewer, DialogReader dialog) {
        this.tableBuilder = tableBuilder;
        this.api = api;
        this.imageViewer = imageViewer;
        this.setViewer = setViewer;
        this.dialog = dialog;
    }

    @ShellMethod(key = "random", value = random_value)
    public void random() {
        Card card = api.getRandomCard();

        tableBuilder.addRow("Name", card.getName())
                .addRow("ID", card.getId())
                .addRow("Artist", card.getArtist())
                .addRow("Type line", card.getType_line())
                .addRow("Flavor text", card.getFlavor_text())
                .print();
        imageViewer.show(card.getImage_uris().getNormal());
    }

    @ShellMethod(key = "name", value = name_value)
    public void name(@ShellOption String name) {
        getCardByName(name.replace(",", " "));
    }

    @ShellMethod(key = "autocomplete", value = autocomplete_value)
    public void autocomplete(@ShellOption String name) {
        Autocomplete autocomplete = api.getAutocomplete(name);

        tableBuilder.createTableFromMap(autocomplete.getDataMap()).print();

        String dialogResult = dialog.autocompleteDialog(autocomplete.getDataMap());
        if (dialogResult != null) {
            getCardByName(dialogResult);
        }
    }

    @ShellMethod(key = "all_sets", value = sets_value)
    public void sets(
            @ShellOption(defaultValue = "name") String sortBy,
            @ShellOption(defaultValue = "false") String reserveSort
    ) {
        Set set = api.getSets();
        tableBuilder.buildTableForSets(set.getData(), sortBy, reserveSort).print();
    }

    @ShellMethod(key = "sets", value = set_value)
    public void set(@ShellOption String setName) {
        SetObject setObject = api.getSet(setName);
        tableBuilder.addRow("Code", setObject.getCode())
                .addRow("Name", setObject.getName())
                .addRow("Released at", setObject.getReleased_at())
                .addRow("Digital", setObject.getDigital().toString())
                .print();
        var cards = api.getCardsImagesWithNames(setObject.getSearch_uri());
        setViewer.showSet(cards, setObject.getName());
    }

    public void getCardByName(String name) {
        Card card = api.getCardByExactName(name);
        if (card.getObject().equals("error")) {
            System.out.println("Searched card name '" + name + "' not found");
        } else {
            tableBuilder.addRow("Name", card.getName())
                    .addRow("ID", card.getId())
                    .addRow("Artist", card.getArtist())
                    .addRow("Type line", card.getType_line())
                    .addRow("Flavor text", card.getFlavor_text())
                    .print();
            imageViewer.show(card.getImage_uris().getNormal());
        }
    }
}
