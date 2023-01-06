package TP1;

import java.util.Scanner;

/**
 Écrire un programme permettant de :
    - Transformer un nombre binaire vers son équivalent décimal
    - Transformer un nombre décimal en binaire
 Exemple d'exécution demandé :
    Voulez-vous convertir :
       1-un nombre décimal en binaire
       2-un nombre binaire en décimal
    Rentrez votre choix : 2

    Rentrez un nombre binaire : 11
    Résultat : 11 vaut 3 en décimal

    Voulez-vous recommencer [o/n] ? N
    Merci à bientôt
*/

/**
 * @author Mateo PALMIERI
 * @version 1.0
 */
public class TP1_3_nombre_binaire {
    public static void main(String[] args) {
        choixConversion();
    }

    public static void choixConversion() {

        // Demande de conversion
        Scanner saisieUtilisateur = new Scanner(System.in);
        System.out.println("Voulez-vous convertir :\n   1-un nombre décimal en binaire\n   2-un nombre binaire en décimal\nRentrez votre choix");
        int choix = saisieUtilisateur.nextInt();

        if (choix == 1) {
            decimalToBinaire();
        } else if (choix == 2) {
            binaireToDecimal();
        } else {
            System.out.println("Erreur, réinitialisation");
            choixConversion();
        }

        // Recommencer
        System.out.println("Voulez-vous recommencer [o/n] ?");
        String yesno = saisieUtilisateur.next();
        if (yesno.equals("o")) {
            choixConversion();
        } else if (yesno.equals("n")) {
            System.out.println("Merci, à bientôt");
        }
    }

    public static void decimalToBinaire() {
        Scanner saisieUtilisateur = new Scanner(System.in);
        System.out.println("Rentrez un nombre décimal");
        int dec = saisieUtilisateur.nextInt();
        String decbin = Integer.toBinaryString(dec);
        System.out.println("Résultat : " + dec + " vaut " + decbin + " en binaire");
    }

    public static void binaireToDecimal() {
        Scanner saisieUtilisateur = new Scanner(System.in);
        System.out.println("Rentrez un nombre binaire");
        String bin = saisieUtilisateur.next();
        System.out.println("Résultat : " + bin + " vaut " + Integer.parseInt(bin,2) + " en décimal");
    }

    // Fonction pour le menu
    public static void description() {
        System.out.println(" Écrire un programme permettant de :\n" +
                "    - Transformer un nombre binaire vers son équivalent décimal\n" +
                "    - Transformer un nombre décimal en binaire\n" +
                " Exemple d'exécution demandé :\n" +
                "    Voulez-vous convertir :\n" +
                "       1-un nombre décimal en binaire\n" +
                "       2-un nombre binaire en décimal\n" +
                "    Rentrez votre choix : 2\n" +
                "\n" +
                "    Rentrez un nombre binaire : 11\n" +
                "    Résultat : 11 vaut 3 en décimal\n" +
                "\n" +
                "    Voulez-vous recommencer [o/n] ? N\n" +
                "    Merci à bientôt\n");
        main(null);
    }
}
