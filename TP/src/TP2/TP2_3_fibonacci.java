package TP2;

import java.util.Scanner;

/**
 Écrire une fonction calculant le nombre de Fibonacci d'un nombre
 Le nombre de Fibonacci F(n) est défini comme suit :
    F(0) = 0
    F(1) = 1
    F(n) = F(n-1) + F(n-2)

 Exemple d'exécution :
    Entrez n : 6
    Fibonacci de 6 est 8 : F(6) = 8

 https://fr.wikipedia.org/wiki/Suite_de_Fibonacci
 */

/**
 * @author Matéo PALMIERI
 * @version 1.0
 */
public class TP2_3_fibonacci {
    public static void main(String[] args) {
        saisie();
    }

    public static void saisie() {
        Scanner saisieUtilisateur = new Scanner(System.in);
        System.out.println("Entrez n :");
        int n = saisieUtilisateur.nextInt();
        fibonacci(n);
    }

    // Calcul de la suite de Fibonacci
    public static void fibonacci(int n) {

        // F0 et F1
        int F0 = 0;
        int F1 = 1;

        int Fx = F1 + F0;

        System.out.println("F0 = " + F0);
        System.out.println("F1 = " + F1);
        System.out.println("F2 = " + Fx);

        for (int i = 0; i < n-2; i=i+1) {
            F0 = F1;
            F1 = Fx;
            Fx = F1 + F0;
            if (i < n-3) {
                System.out.println(Fx);
            } else if (i == n-3) {
                System.out.println("Fibonacci de " + n + " : " + Fx);
            }
        }
        relance();
    }

    // Permet de saisir un nouveau N
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
        System.out.println(" Écrire une fonction calculant le nombre de Fibonacci d'un nombre\n" +
                " Le nombre de Fibonacci F(n) est défini comme suit :\n" +
                "    F(0) = 0\n" +
                "    F(1) = 1\n" +
                "    F(n) = F(n-1) + F(n-2)\n" +
                "\n" +
                " Exemple d'exécution :\n" +
                "    Entrez n : 6\n" +
                "    Fibonacci de 6 est 8 : F(6) = 8\n" +
                "\n" +
                " https://fr.wikipedia.org/wiki/Suite_de_Fibonacci\n");
        main(null);
    }
}
