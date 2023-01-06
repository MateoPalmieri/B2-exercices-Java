package TP4;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TP4_4 {

    public static void main(String[] args) {
        new TP4_4();
    }

    TP4_4() {
        // Créer la frame
        JFrame frame = new JFrame("BoxLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Créer le panel
        JPanel panel = new JPanel();

        // Modifier la taille du panel
        panel.setBorder(new EmptyBorder(new Insets(150, 200, 150, 200)));

        // Créer les TextArea
        JTextArea NameText = new JTextArea(1,10);
        JTextArea PswdText = new JTextArea(1,10);

        // Créer les boutons
        JButton jb1 = new JButton("OK");
        JButton jb2 = new JButton("Cancel");

        // Ajouter les boutons et la TextArea
        panel.add(jb1);
        panel.add(jb2);
        panel.add(NameText);
        panel.add(PswdText);

        // Créer les JDialog
        JDialog dialog1 = new JDialog();
        JDialog dialog2 = new JDialog();

        // Créer les JLabel
        JLabel label1 = new JLabel("Vous avez appuyé sur : OK");

        JLabel label2 = new JLabel("Vous avez appuyé sur : Cancel");

        // Modifier les JDialog
        dialog1.setTitle("Message");
        dialog1.setSize(200, 150);
        dialog1.add(label1);

        dialog2.setTitle("Message");
        dialog2.setSize(200, 150);
        dialog2.add(label2);

        // Event
        jb1.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog1.setVisible(true);
            }
        });

        jb2.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog2.setVisible(true);
            }
        });

        // Créer la fenêtre
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}