package TP2;

/**
 Soit la suite
    O(1) = 1
    O(n) = F(n+1)/F(n) avec F(n) qui représente la valeur de Fibonacci à l'ordre n
 Programmer la suite O et comparer le résultat au nombre d'or :
    ? = (1+√5)/2

 Exemple d'exécution :
    Entrez N : 11
       O(1) = ??
       O(5) = ??
       O(10) = ??
    Le résultat de O(11) est ??
    Le nombre d'or est égal à ??

 https://www.maths-et-tiques.fr/index.php/histoire-des-maths/nombres/le-nombre-d-or
*/

import java.util.Scanner;

/**
 * @author Matéo PALMIERI
 * @version 1.0
 */

public class TP2_4_nombre_d_or_et_fibonacci {
    public static void main(String[] args) {
        saisie();
    }

    public static void saisie() {
        Scanner saisieUtilisateur = new Scanner(System.in);
        System.out.println("Entrez n :");
        int n = saisieUtilisateur.nextInt();
        calculNbrOr(n);
    }

    public static void calculNbrOr(int n) {

        // F0 et F1
        double F0 = 0;
        double F1 = 1;

        double Fx = F1 + F0;

        System.out.println("F0 = " + F0);
        System.out.println("F1 = " + F1);
        System.out.println("F2 = " + Fx);

        for (int i = 0; i < n-2; i=i+1) {
            F0 = F1;
            F1 = Fx;
            Fx = F1 + F0;
            if (i < n-3) {
                System.out.println(Fx/F1);
            } else if (i == n-3) {
                System.out.println("Ce qui se rapproche le plus du nombre d'or est " + Fx/F1);
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
        System.out.println(" Soit la suite\n" +
                "    O(1) = 1\n" +
                "    O(n) = F(n+1)/F(n) avec F(n) qui représente la valeur de Fibonacci à l'ordre n\n" +
                " Programmer la suite O et comparer le résultat au nombre d'or :\n" +
                "    ? = (1+√5)/2\n" +
                "\n" +
                " Exemple d'exécution :\n" +
                "    Entrez N : 11\n" +
                "       O(1) = ??\n" +
                "       O(5) = ??\n" +
                "       O(10) = ??\n" +
                "    Le résultat de O(11) est ??\n" +
                "    Le nombre d'or est égal à ??\n" +
                "\n" +
                " https://www.maths-et-tiques.fr/index.php/histoire-des-maths/nombres/le-nombre-d-or\n");
        main(null);
    }
}
