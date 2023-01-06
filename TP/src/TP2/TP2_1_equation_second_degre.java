package TP2;

import java.util.Scanner;

/**
 Le but est de résoudre une équation du second degré tel que :
           A * x² + B * x + C = 0
           https://calculis.net/resoudre-equation-second-degre

 Exemple d'exécution demandé :

    Résoudre l'équation du second degré : Ax^2 + Bx + C = 0
    Entrez A : 2
    Entrez B : -2
    Entrez C : -2
    L'équation admet 2 solutions qui sont :
       - ??
       - ??
*/

/**
 * @author Matéo PALMIERI
 * @version 1.0
 */
public class TP2_1_equation_second_degre {
    public static void main(String[] args) {
       saisie();
    }

    public static void saisie() {

        Scanner saisieUtilisateur = new Scanner(System.in);
        System.out.println("Résoudre l'équation du second degré : Ax^2 + Bx + C = 0\nEntrez A :");
        int A = saisieUtilisateur.nextInt();
        System.out.println("Entrez B :");
        int B = saisieUtilisateur.nextInt();
        System.out.println("Entrez C :");
        int C = saisieUtilisateur.nextInt();
        equation(A, B, C);
    }

    /**
     *
     * @param A Premier entier rentré via la fonction main()
     * @param B Deuxième entier rentré via la fonction main()
     * @param C Troisième entier rentré via la fonction main()
     * @return Si delta < 0, alors retourne les 2 solutions de l'équation
     */
    public static void equation(int A, int B, int C) {

        // Delta
        int delta = (B*B) - (4*A*C);

        if (delta < 0) {
            System.out.println("Il n'y a pas de solutions");
            relance();
        } else {
            double X1 = (((-B) - Math.sqrt(delta)) / (2*A));
            double X2 = (((-B) + Math.sqrt(delta)) / (2*A));
            System.out.println("L'équation admet 2 solutions :\nX1 = " + X1 + "\nX2 = " + X2);
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
        } else {
            System.out.println("Erreur, réinitialisation");
            saisie();
        }
    }

    // Fonction pour le menu
    public static void description() {
        System.out.println(" Le but est de résoudre une équation du second degré tel que :\n" +
                "           A * x² + B * x + C = 0\n" +
                "           https://calculis.net/resoudre-equation-second-degre\n" +
                "\n" +
                " Exemple d'exécution demandé :\n" +
                "\n" +
                "    Résoudre l'équation du second degré : Ax^2 + Bx + C = 0\n" +
                "    Entrez A : 2\n" +
                "    Entrez B : -2\n" +
                "    Entrez C : -2\n" +
                "    L'équation admet 2 solutions qui sont :\n" +
                "       - ??\n" +
                "       - ??\n");
        main(null);
    }
}
