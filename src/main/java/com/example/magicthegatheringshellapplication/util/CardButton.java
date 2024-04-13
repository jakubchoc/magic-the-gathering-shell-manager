package com.example.magicthegatheringshellapplication.util;

import org.springframework.stereotype.Service;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Service
public class CardButton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("e.getSource()");
    }
}
