package TP4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TP4_2_JButton implements ActionListener {

    //Créer un nouveau frame pour stocker le bouton
    static JFrame frame = new JFrame("Test des boutons");
    JDialogExemple obj = new JDialogExemple();


    public static void main(String[] args) {

        //Créer les boutons
        JButton btnSimple = new JButton("Bouton simple");
        JButton btnFant = new JButton("Bouton fantaisie");

        // test
        ActionListener MyJButtonActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.add(btnFant);
            }
        };
        btnSimple.addActionListener(MyJButtonActionListener);



        //Définir la position des boutons
        btnSimple.setBounds(50, 100, 110, 25);
        btnFant.setBounds(170, 90, 180, 40);

        //Ajouter les boutons au frame
        frame.add(btnSimple);
        frame.add(btnFant);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("Bouton simple")) {
            // Créer une boîte de dialogue
            JDialog d = new JDialog(frame, "Boite de dialogue");
            // Créer une étiquette
            JLabel l = new JLabel("Ceci est une boite de dialogue.");
            // Ajouter l'étiquette à la boîte de dialogue
            d.add(l);
            // Définir la taille de la boîte de dialogue
            d.setSize(200, 100);
            // Définir la visibilité de la boîte de dialogue
            d.setVisible(true);
        }
    }
}
