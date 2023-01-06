package TP4;

import javax.swing.*;
import java.awt.*;

/*
 Fenêtre :
    About Dialog Test
    Core Java
    bla bla bla
       OK
*/

/**
 * @author Matéo PALMIERI
 * @version 1.0
 */

class JDialogExemple extends JFrame {

    static JFrame frame;

    public static void main(String[] args)
    {
        // créer un frame
        frame = new JFrame("About Dialog Test");
        // créer un objet
        JDialogExemple obj = new JDialogExemple();
        // créer un panneau
        JPanel panel = new JPanel();
        frame.add(panel);
        frame.setSize(300, 300);
        // Créer un message
        JLabel label = new JLabel("Core Java");
        panel.add(label);
        JLabel label2 = new JLabel("bla bla bla");
        panel.add(label2);

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

        frame.show();
    }
}

