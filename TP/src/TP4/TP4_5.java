package TP4;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class TP4_5 {

    public static void main(String[] args) {
        new TP4_5();
    }

    TP4_5() {
        // Créer la frame
        JFrame frame = new JFrame("SpinnerDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Créer le panel
        JPanel panel = new JPanel();

        // Modifier la taille du panel
        panel.setBorder(new EmptyBorder(new Insets(150, 200, 150, 200)));

        // Créer les TextArea
        JTextArea MonthArea = new JTextArea(1,10);
        JTextArea YearArea = new JTextArea(1,10);
        JTextArea DateArea = new JTextArea(1,10);

        // Créer la fenêtre
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}