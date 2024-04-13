package com.example.magicthegatheringshellapplication.util;

import com.example.magicthegatheringshellapplication.event.PictureFromSetEvent;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.Map;

@Service
@AllArgsConstructor
public class SetViewer extends JFrame {

    private ApplicationEventPublisher applicationEventPublisher;

    public void showSet(Map<String, String> pictures, String setName) {
        setTitle("Set: " + setName);
        setSize(1050, 700);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        JPanel setPanel = new JPanel(new GridLayout(0, 4));

        pictures.forEach((key, value) -> {
            try {
                JLabel cardPicture = loadImage(value);
                cardPicture.setName(key);
                cardPicture.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
                cardPicture.setCursor(new Cursor(Cursor.HAND_CURSOR));
                cardPicture.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        JLabel clickedLabel = (JLabel) e.getSource();
                        String cardName = clickedLabel.getName();
                        setVisible(false);
                        applicationEventPublisher.publishEvent(new PictureFromSetEvent(cardName));
                    }
                });

                setPanel.add(cardPicture);
            } catch (IOException e) {
                System.out.println("Could not load picture: " + value);
            }
        });

        JScrollPane scrollPanel = new JScrollPane(setPanel);
        getContentPane().add(scrollPanel);
        setVisible(true);
    }

    private JLabel loadImage(String source) throws IOException {
        URL url = new URL(source);
        BufferedImage image = ImageIO.read(url);
        Image scaledImage = image.getScaledInstance(245, 341, Image.SCALE_SMOOTH);
        return new JLabel(new ImageIcon(scaledImage));
    }
}
