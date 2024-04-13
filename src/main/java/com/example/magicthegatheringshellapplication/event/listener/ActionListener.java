package com.example.magicthegatheringshellapplication.event.listener;

import com.example.magicthegatheringshellapplication.ShellManager;
import com.example.magicthegatheringshellapplication.event.PictureFromSetEvent;
import lombok.AllArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ActionListener {

    private ShellManager manager;
    @EventListener
    public void clickOnCardInSet(PictureFromSetEvent event) {
        manager.name(event.cardName());
    }
}
