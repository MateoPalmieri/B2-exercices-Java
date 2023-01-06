package TP1;

import java.util.Scanner;

/**
 1 - Écrire un programme Java qui demande à l'utilisateur
    1.1 - de saisir son nom et de l'afficher avec un message de bienvenue
    1.2 - de saisir successivement 2 nombres réels et afficher le maximum des 2
    1.3 - de saisir un nombre entier et d'afficher s'il est pair ou impair
*/

/**
 * @author Mateo PALMIERI
 * @version 1.0
 */
public class TP1_1_saisie_et_boucle {
    public static void main(String[] args) {
        prenom();
    }

    public static void prenom() {

        // Scanner permet de récupérer les données entrées par l'utilisateur
        Scanner saisieUtilisateur = new Scanner(System.in);

        // Demander le prénom de l'utilisateur et l'afficher
        System.out.println("Rentrez votre prénom");
        String str = saisieUtilisateur.next();
        System.out.println("Bonjour " + str);

        minMax();
    }

    public static void minMax() {

        Scanner saisieUtilisateur = new Scanner(System.in);

        // Demander 2 nombres réels
        System.out.println("Rentrez un nombre réel A");
        Double A = saisieUtilisateur.nextDouble();
        System.out.println("Rentrez un nombre réel B");
        Double B = saisieUtilisateur.nextDouble();

        // Comparaison entre A et B
        if (A < B) {
            System.out.println("Le maximum entre A et B est B (" + B + ")");
        } else if (B < A) {
            System.out.println("Le maximum entre A et B est A (" + A +")");
        } else if (A.equals(B)){
            System.out.println("A (" + A + ") et B (" + B + ") sont égaux");
        } else {
            return;
        }

        pairImpair();
    }

    public static void pairImpair() {

        Scanner saisieUtilisateur = new Scanner(System.in);

        // Vérifier un entier pair / impair
        System.out.println("Rentrez un entier");
        Integer X = saisieUtilisateur.nextInt();
        // Vérifie si X est pair ou impair
        if (X % 2 == 0) {
            System.out.println(X + " est un nombre pair");
        } else {
            System.out.println(X + " est un nombre impair");
        }
        System.out.println("A bientôt");
    }

    // Fonction pour le menu
    public static void description() {
        System.out.println(" 1 - Écrire un programme Java qui demande à l'utilisateur\n" +
                "    1.1 - de saisir son nom et de l'afficher avec un message de bienvenue\n" +
                "    1.2 - de saisir successivement 2 nombres réels et afficher le maximum des 2\n" +
                "    1.3 - de saisir un nombre entier et d'afficher s'il est pair ou impair\n");
        main(null);
    }
}
