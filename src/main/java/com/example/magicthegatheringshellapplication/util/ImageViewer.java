package com.example.magicthegatheringshellapplication.util;

import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

@Service
public class ImageViewer {

    public void show(String url) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(new Dimension(488, 680));
        frame.setAlwaysOnTop(true);

        JLabel image;
        try {
            image = loadImage(url);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        frame.getContentPane().add(image);
        frame.setVisible(true);
    }

    private JLabel loadImage(String source) throws IOException {
        URL url = new URL(source);
        BufferedImage image = ImageIO.read(url);
        return new JLabel(new ImageIcon(image));
    }
}
