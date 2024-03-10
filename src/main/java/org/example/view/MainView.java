package org.example.view;

import javax.swing.*;
import java.awt.*;

public class MainView {
    public void drawMainScreen(){
        JFrame frame = new JFrame("Finance director");
        JLabel label = new JLabel("Say me about your cash");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
