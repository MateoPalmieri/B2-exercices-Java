package TP1;

import java.util.Scanner;

/**
 Écrire un programme qui calcule la surface d'un trapèze
 Exemple d'execution demandé :

    Rentrez A (en m) : 2
    Rentrez B (en m) : 5
    Rentrer C (en m) : 10
    La surface du trapèze est de 35m
*/

/**
 * @author Mateo PALMIERI
 * @version 1.0
 */
public class TP1_2_calcul_de_surface {
    public static void main(String[] args) {
        surface();
    }

    public static void surface() {

        Scanner saisieUtilisateur = new Scanner(System.in);

        // Demande des mesures
        System.out.println("Rentrez A (en m)");
        Double A = saisieUtilisateur.nextDouble();

        System.out.println("Rentrez B (en m)");
        Double B = saisieUtilisateur.nextDouble();

        System.out.println("Rentrez C (en m)");
        double C = saisieUtilisateur.nextDouble();

        // Calcul
        double res = (A+B)*C*0.5;

        // Résultat
        System.out.println("La surface du trapèze est de " + res + "m");
    }

    // Fonction pour le menu
    public static void description() {
        System.out.println(" Écrire un programme qui calcule la surface d'un trapèze\n" +
                " Exemple d'exécution demandé :\n" +
                "\n" +
                "    Rentrez A (en m) : 2\n" +
                "    Rentrez B (en m) : 5\n" +
                "    Rentrer C (en m) : 10\n" +
                "    La surface du trapèze est de 35m\n");
        main(null);
    }
}