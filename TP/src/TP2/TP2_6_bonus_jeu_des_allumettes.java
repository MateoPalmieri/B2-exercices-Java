package TP2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 La règle :
 - Il y a plusieurs allumettes (autant que voulu)
 - On en retire 1,2 ou 3
 - Celui qui prend la dernière à perdu
 On joue contre l'ordinateur
 Le joueur de départ est choisi aléatoirement

 Exemple :

    Entrez votre prénom : David
    Choisir le nombre d'allumette de départ : 6
    L'ordinateur commence
       |||||| Ordinateur enlève : 1
        ||||| David enlève : 2
          ||| Ordinateur enlève : 2
            | David enlève : 1
    David a perdu :-(
    Ordinateur a gagné :-)
*/

/**
 * @author Matéo PALMIERI
 * @version 1.1
 */
public class TP2_6_bonus_jeu_des_allumettes {
    public static void main(String[] args) {
        saisie();
    }

    public static void saisie() {
        Scanner saisieUtilisateur = new Scanner(System.in);
        System.out.println("Entrez votre prénom :");
        String prenom = saisieUtilisateur.next();
        game(prenom);
    }

    public static void game(String prenom) {
        Scanner saisieUtilisateur = new Scanner(System.in);
        System.out.println("Choisir le nombre d'allumettes de départ :");
        int allu = saisieUtilisateur.nextInt();
        List<String> tab = new ArrayList<>();

        // Ajout du nombre d'allumettes
        for (int i = 0; i < allu; i=i+1) {
            tab.add("|");

            /* Permet de vérifier la taille du tableau :
            System.out.println(tab);
            System.out.println(tab.toArray().length);
            */
        }
        System.out.println(tab + " = " + tab.toArray().length + " allumettes" + "\nL'ordinateur commence");
        tour(tab, prenom);
    }

    public static void tour(List tab, String prenom) {
        Scanner saisieUtilisateur = new Scanner(System.in);

        // fonction de tirage aléatoire
        tirage(tab, prenom);
        System.out.println(tab);

        // Tour Joueur
        System.out.println(prenom + " retire :");
        int x = saisieUtilisateur.nextInt();

        // Sécurité
        if (x > 3) {
            x = 3;
            System.out.println("Tirage max limité à 3\n" + prenom + " retire 3");
        }

        for (int i = 0; i < x ; i=i+1) {
            tab.remove("|");
        }
        System.out.println(tab);
        end2(tab, prenom);
        tour(tab, prenom);
    }

    // Tirage aléatoire de l'ordinateur
    public static void tirage(List tab, String prenom) {

        int nombreAleatoire = 1 + (int)(Math.random() * ((3 - 1) + 1));

        for (int i=1; i <= nombreAleatoire; i=i+1) {
            tab.remove("|");
            if (i == nombreAleatoire) {
                System.out.println("L'ordinateur retire " + i);
            }
        }
        end1(tab, prenom);
    }

    /* ---------------------------------------------------------------------------------------------- */

    // Vérifie que le jeu à déterminer un gagnant
    public static void end1(List tab, String prenom) {
        if (tab.isEmpty()) {
            System.out.println(prenom + " a gagné !");
            relance();
        }
    }

    public static void end2(List tab, String prenom) {
        if (tab.isEmpty()) {
            System.out.println("ordinateur a gagné !");
            relance();
        }
    }

    public static void relance() {
        Scanner saisieUtilisateur = new Scanner(System.in);
        System.out.println("Voulez-vous recommencer [o/n] ?");
        String choix = saisieUtilisateur.next();
        if (choix.equals("o")) {
            saisie();
        } else if (choix.equals("n")) {
            System.out.println("Merci, à bientôt");
            System.exit(1);
        } else {
            System.out.println("Erreur, réinitialisation");
            saisie();
        }
    }

    // Fonction pour le menu
    public static void description() {
        System.out.println(" La règle :\n" +
                " - Il y a plusieurs allumettes (autant que voulu)\n" +
                " - On en retire 1,2 ou 3\n" +
                " - Celui qui prend la dernière à perdu\n" +
                " On joue contre l'ordinateur\n" +
                " Le joueur de départ est choisi aléatoirement\n" +
                "\n" +
                " Exemple :\n" +
                "\n" +
                "    Entrez votre prénom : David\n" +
                "    Choisir le nombre d'allumette de départ : 6\n" +
                "    L'ordinateur commence\n" +
                "       |||||| Ordinateur enlève : 1\n" +
                "        ||||| David enlève : 2\n" +
                "          ||| Ordinateur enlève : 2\n" +
                "            | David enlève : 1\n" +
                "    David a perdu :-(\n" +
                "    Ordinateur a gagné :-)\n");
        main(null);
    }
}
