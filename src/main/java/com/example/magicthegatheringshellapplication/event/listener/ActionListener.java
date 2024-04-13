package com.example.magicthegatheringshellapplication.event.listener;

import com.example.magicthegatheringshellapplication.event.PictureFromSetEvent;
import com.example.magicthegatheringshellapplication.service.CardService;
import lombok.AllArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ActionListener {

    private CardService cardService;
    @EventListener
    public void clickOnCardInSet(PictureFromSetEvent event) {
        cardService.getCardByName(event.cardName());
    }
}
