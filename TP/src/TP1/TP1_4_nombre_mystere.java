package TP1;

import java.util.Scanner;

/**
 Écrire un jeu dont le but est de trouver un nombre choisi par la machine compris entre -100 et 100

 Exemple d'exécution demandé :

    Le nombre à trouver est compris entre -100 et 100

    Entrer un nombre (compris entre -100 et 100) :
    0
    Trop petit
    5
    Trop grand
    1
    Bravo le chiffre était bien 1, vous avez gagné en 3 coups.
    Voulez-vous refaire une partie [o/n] ? N
    Merci, à bientôt
*/

/**
 * @author Mateo PALMIERI
 * @version 1.0
 */
public class TP1_4_nombre_mystere {
    public static void main(String[] args) {
        launchGame();
    }

    public static void launchGame() {

        // Initialisation nombre de coups
        int coups = 1;

        // Définition chiffre mystère
        // Utilisation de la méthode Math.random qui génère un chiffre aléatoire entre le minimum et le maximum
        // Le chiffre généré doit être converti en entier
        double chiffremystere = (-100) + (int)(Math.random() * ((100 - (-100)) + 1));

        // Choix utilisateur
        System.out.println("Le nombre à trouver est compris entre -100 et 100\nEntrez un nombre (compris entre -100 et 100) :");
        relance(chiffremystere, coups);
    }

    public static void relance(double chiffremystere, int coups) {
        Scanner saisieUtilisateur = new Scanner(System.in);
        int choix = saisieUtilisateur.nextInt();

        // Choix (mauvais / bon)
        if (choix < chiffremystere) {
            System.out.println("Trop petit");
            coups++;
            relance(chiffremystere, coups);
        } else if (choix > chiffremystere) {
            System.out.println("Trop grand");
            coups++;
            relance(chiffremystere, coups);
        } else if (choix == chiffremystere) {
            System.out.println("Bravo ! Le chiffre était bien " + chiffremystere + ", vous avez gagné en " + coups + " coups !");
            System.out.println("Voulez-vous refaire une partie [o/n] ?");
            String newgame = saisieUtilisateur.next();
            if (newgame.equals("o")) {
                launchGame();
            } else if (newgame.equals("n")) {
                System.out.println("Merci, à bientôt");
            }
        }
    }

    // Fonction pour le menu
    public static void description() {
        System.out.println(" Écrire un jeu dont le but est de trouver un nombre choisi par la machine compris entre -100 et 100\n" +
                "\n" +
                " Exemple d'exécution demandé :\n" +
                "\n" +
                "    Le nombre à trouver est compris entre -100 et 100\n" +
                "\n" +
                "    Entrer un nombre (compris entre -100 et 100) :\n" +
                "    0\n" +
                "    Trop petit\n" +
                "    5\n" +
                "    Trop grand\n" +
                "    1\n" +
                "    Bravo le chiffre était bien 1, vous avez gagné en 3 coups.\n" +
                "    Voulez-vous refaire une partie [o/n] ? N\n" +
                "    Merci, à bientôt\n");
        main(null);
    }
}
