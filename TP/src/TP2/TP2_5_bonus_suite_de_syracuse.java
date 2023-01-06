package TP2;

import java.util.Scanner;

/**
 Faire un programme qui calcule une suite de Syracuse telle que :

    La suite de Syracuse d'un nombre entier N > 0 est définie par récurrence, de la manière suivante :
       U0 = N
       et pour tout entier naturel n : Un+1 = Un/2    si Un est pair
                                            = 3Un + 1 si Un est impair

 Énoncé de la conjecture :

    La conjecture affirme que pour tout N, il existe un indice n tel que Un = 1

    Suite de Syracuse pour N = 15
       U0 = 15 ; U1 = 46 ; U2 = 23 ; U3 = 70 ; U4 = 35 ; U5 = 106 ; U6 = 53 ; U7 = 160 ; U8 = 80 ; U9 = 40 ; U10 = 20
       U11 = 10 ; U12 = 5 ; U13 = 16 ; U14 = 8 ; U15 = 4 ; U16 = 2 ; U17 = 1 ; U18 = 4 ; U19 = 2 ; U20 = 1 ...

 https://fr.wikipedia.org/wiki/Conjecture_de_Syracuse
*/

/**
 * @author Matéo PALMIERI
 * @version 1.0
 */

// ! PAS FINI !
public class TP2_5_bonus_suite_de_syracuse {
    public static void main(String[] args) {
        saisie();
    }

    public static void saisie() {
        Scanner saisieUtilisateur = new Scanner(System.in);
        System.out.println("Rentrez n :");
        Integer n = saisieUtilisateur.nextInt();
        syracuse(n);
    }

    public static void syracuse(Integer n) {

        Integer uX = n;

        // Suite
        for (int i = 0; i < 20; i=i+1) {
            if (uX % 2 == 0) {
                uX = uX/2;
            } else {
                uX = 3*uX +1;
            }
            System.out.println("U" + (i+1) + " " + uX);
        }
        relance();
    }

    public static void relance() {
        Scanner saisieUtilisateur = new Scanner(System.in);
        System.out.println("Voulez-vous recommencer [o/n] ?");
        String choix = saisieUtilisateur.next();
        if (choix.equals("o")) {
            saisie();
        } else if (choix.equals("n")) {
            System.out.println("Merci, à bientôt");
        } else {
            System.out.println("Erreur, réinitialisation");
            saisie();
        }
    }

    // Fonction pour le menu
    public static void description() {
        System.out.println(" Faire un programme qui calcule une suite de Syracuse telle que :\n" +
                "\n" +
                "    La suite de Syracuse d'un nombre entier N > 0 est définie par récurrence, de la manière suivante :\n" +
                "       U0 = N\n" +
                "       et pour tout entier naturel n : Un+1 = Un/2    si Un est pair\n" +
                "                                            = 3Un + 1 si Un est impair\n" +
                "\n" +
                " Énoncé de la conjecture :\n" +
                "\n" +
                "    La conjecture affirme que pour tout N, il existe un indice n tel que Un = 1\n" +
                "\n" +
                "    Suite de Syracuse pour N = 15\n" +
                "       U0 = 15 ; U1 = 46 ; U2 = 23 ; U3 = 70 ; U4 = 35 ; U5 = 106 ; U6 = 53 ; U7 = 160 ; U8 = 80 ; U9 = 40 ; U10 = 20\n" +
                "       U11 = 10 ; U12 = 5 ; U13 = 16 ; U14 = 8 ; U15 = 4 ; U16 = 2 ; U17 = 1 ; U18 = 4 ; U19 = 2 ; U20 = 1 ...\n" +
                "\n" +
                " https://fr.wikipedia.org/wiki/Conjecture_de_Syracuse\n");
        main(null);
    }
}
