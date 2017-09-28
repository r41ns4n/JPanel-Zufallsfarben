package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Zufallsfarben extends JFrame {

    public Zufallsfarben() {
        this.setTitle("Zufallsfarben");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.initEvents();
        this.setSize(300, 200);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    } // END Zufallsfarben()

    private void getZufallsfarbe() {
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        this.getContentPane().setBackground(new Color(r, g, b));
        System.out.println("Rot: " + r + ", Grün: " + g + ", Blau: " + b);
    } // END getZufallsfarbe()


    public void initEvents() {
        MeinMouseListener mml = new MeinMouseListener();
        this.addMouseListener(mml);
    } // END initEvents()


    // Innere Klasse
    public class MeinMouseListener extends MouseAdapter {
        @Override
        public void mouseEntered(MouseEvent e) {
            getZufallsfarbe();
        } // END void mouseExited(MouseEvent e)

        @Override
        public void mouseExited(MouseEvent e) {
            getZufallsfarbe();
        } // END void mouseExited(MouseEvent e)

    } // END class MeinMouseListener extends MouseAdapter

} // END class Zufallsfarben extends JFrame
