package TP2;

import java.util.Scanner;

/**
 Faire un programme qui calcule la suite (Rn) défini par les conditions suivantes :
          R1 = √2 et Rn+1 = (√2+Rn) (racine de 2+Rn)

 Exemple d'exécution :

   Entrez n : 51
      R1 = 1.4142135623730951
      R10 = ??
      R20 = ??
      R30 = ??
      R40 = ??
      R50 = ??
   Le résultat de R[51] est ??
   Cette suite tant vers le résultat positif de la résolution de l'équation x² - x - 2*x qui est ??
*/

/**
 * @author Matéo PALMIERI
 * @version 1.0
 */
public class TP2_2_programmer_une_suite {
    public static void main(String[] args) {
        saisie();
    }

    public static void saisie() {
        Scanner saisieUtilisateur = new Scanner(System.in);
        System.out.println("Entrez n :");
        int n = saisieUtilisateur.nextInt();
        suite(n);
    }

    public static void suite(int n) {
        double R1 = Math.sqrt(2);
        System.out.println(R1);
        double Rx = Math.sqrt(2+R1);
        for (int i = 0; i <= n; i=i+1) {
            Rx = Math.sqrt(2+Rx);
            System.out.println(Rx);
            if (i == n) {
                System.out.println("Le résultat de R(" + n + ") est " + Rx);
            }
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
        System.out.println(" Faire un programme qui calcule la suite (Rn) défini par les conditions suivantes :\n" +
                "          R1 = √2 et Rn+1 = (√2+Rn) (racine de 2+Rn)\n" +
                "\n" +
                " Exemple d'exécution :\n" +
                "\n" +
                "   Entrez n : 51\n" +
                "      R1 = 1.4142135623730951\n" +
                "      R10 = ??\n" +
                "      R20 = ??\n" +
                "      R30 = ??\n" +
                "      R40 = ??\n" +
                "      R50 = ??\n" +
                "   Le résultat de R[51] est ??\n" +
                "   Cette suite tant vers le résultat positif de la résolution de l'équation x² - x - 2*x qui est ??\n");
        main(null);
    }
}
