package TP4;

import javax.swing.*;

public class TP4_1 {

    static JFrame frame;

    public static void main(String[] args) {
        // Créer une boîte de dialogue
        JDialog d = new JDialog(frame, "About Dialog Test");
        // Créer une étiquette
        JLabel l = new JLabel("Core Java");
        // Ajouter l'étiquette à la boîte de dialogue
        d.add(l);
        // Définir la taille de la boîte de dialogue
        d.setSize(200, 100);
        // Définir la visibilité de la boîte de dialogue
        d.setVisible(true);
    }
}
