package TP4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TP4_3_test
{
    public static void main(String[] args) {
        new TP4_3_test();
    }

    TP4_3_test()
    {
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout());

        JLabel label = new JLabel("Voyez les changements de style", SwingConstants.CENTER);
        //label.setFont(new Font("Serif", Font.BOLD, 20));
        label.setOpaque(true);

        // test
        // Créer les boutons radio
        JRadioButton rBtn1 = new JRadioButton("Normal");
        JRadioButton rBtn2 = new JRadioButton("Gras");
        JRadioButton rBtn3 = new JRadioButton("Italique");
        JRadioButton rBtn4 = new JRadioButton("Gras/Italique");

        // Définir la position des boutons radio
        rBtn1.setBounds(40,40,50,50);
        rBtn2.setBounds(40,40,50,50);
        rBtn3.setBounds(40,40,50,50);
        rBtn4.setBounds(40,40,50,50);

        // Ajouter les boutons radio au groupe
        ButtonGroup bg = new ButtonGroup();
        bg.add(rBtn1);
        bg.add(rBtn2);
        bg.add(rBtn3);
        bg.add(rBtn4);

        // test

        // Créer la frame
        frame.add(label);

        // Ajouter les boutons au frame
        frame.add(label);
        frame.add(rBtn1);
        frame.add(rBtn2);
        frame.add(rBtn3);
        frame.add(rBtn4);

        frame.setSize(700,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        rBtn1.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Voyez les changements de style");
            }
        });

        rBtn2.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("<html><body><b/>Voyez les changements de style</body></html>");
                label.setFont(label.getFont().deriveFont(Font.BOLD));
            }
        });

        rBtn3.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("<html><body><i/>Voyez les changements de style</body></html>");
            }
        });

        rBtn4.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("<html><body><b/><i/>Voyez les changements de style</body></html>");
                label.setFont(label.getFont().deriveFont(Font.BOLD));
            }
        });
    }
}