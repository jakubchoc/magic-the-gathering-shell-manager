package com.example.magicthegatheringshellapplication;

import com.example.magicthegatheringshellapplication.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.shell.standard.AbstractShellComponent;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import org.springframework.stereotype.Service;

import static com.example.magicthegatheringshellapplication.util.Text.autocomplete_value;
import static com.example.magicthegatheringshellapplication.util.Text.name_value;
import static com.example.magicthegatheringshellapplication.util.Text.random_value;
import static com.example.magicthegatheringshellapplication.util.Text.set_value;
import static com.example.magicthegatheringshellapplication.util.Text.sets_value;


@Service
@ShellComponent
@RequiredArgsConstructor
public class ShellManager extends AbstractShellComponent {

    private final CardService cardService;


    @ShellMethod(key = "random", value = random_value)
    public void random() {
        cardService.getRandomCard();
    }

    @ShellMethod(key = "name", value = name_value)
    public void name(@ShellOption String name) {
        cardService.getCardByName(name.replace(",", " "));
    }

    @ShellMethod(key = "autocomplete", value = autocomplete_value)
    public void autocomplete(@ShellOption String name) {
        cardService.getCardNameByAutocomplete(name);
    }

    @ShellMethod(key = "all sets", value = sets_value)
    public void allSets(
            @ShellOption(defaultValue = "name") String sortBy,
            @ShellOption(defaultValue = "false") String reserveSort
    ) {
        cardService.getAllSets(sortBy, reserveSort);
    }

    @ShellMethod(key = "sets", value = set_value)
    public void sets(@ShellOption String setName) {
        cardService.getSet(setName);
    }
}
