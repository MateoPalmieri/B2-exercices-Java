import TP1.*;
import TP2.*;
import java.util.Scanner;


/*
* Jamais de boucle sur le main() (allocation mémoire)
* Fractionner en plusieurs fonctions
*/

/**
 * @author Matéo PALMIERI
 * @version 1.1
 */
public class menu {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("Bienvenue dans le menu Java\nQuel TP voulez-vous voir ?\n -TP1 (1)\n -TP2 (2)\n -TP3 (3, voir les exos directement via les fichiers)\n -TP4 (4, voir les exos directement via les fichiers) \n -quitter (q)");
        Scanner saisieUtilisateur = new Scanner(System.in);
        String choix = saisieUtilisateur.next();
        if (choix.equals("1")) {
            menuTP1();
        } else if (choix.equals("2")) {
            menuTP2();
        } else if (choix.equals("3")) {
            menuTP3();
        } else if (choix.equals("4")) {
            menuTP4();
        } else if (choix.equals("quitter") | choix.equals("q")) {
            System.out.println("Très bien, à bientôt.");
        } else {
            erreur();
        }
    }

    public static void menuTP1() {
        Scanner saisieUtilisateur = new Scanner(System.in);
        System.out.println("Quel exercice voulez-vous voir [1, 2, 3, 4, retour] ?");
        String choixTP1 = saisieUtilisateur.next();
        if (choixTP1.equals("1")) {
            TP1_1_saisie_et_boucle.description();
            menuTP1();
        } else if (choixTP1.equals("2")) {
            TP1_2_calcul_de_surface.description();
            menuTP1();
        } else if (choixTP1.equals("3")) {
            TP1_3_nombre_binaire.description();
            menuTP1();
        } else if (choixTP1.equals("4")) {
            TP1_4_nombre_mystere.description();
            menuTP1();
        } else if (choixTP1.equals("retour") | choixTP1.equals("r")) {
            menu();
        } else {
            erreur();
        }
    }

    public static void menuTP2() {
        Scanner saisieUtilisateur = new Scanner(System.in);
        System.out.println("Quel exercice voulez-vous voir [1, 2, 3, 4, 5, 6, retour] ?");
        String choixTP2 = saisieUtilisateur.next();
        if (choixTP2.equals("1")) {
            TP2_1_equation_second_degre.description();
            menuTP2();
        } else if (choixTP2.equals("2")) {
            TP2_2_programmer_une_suite.description();
            menuTP2();
        } else if (choixTP2.equals("3")) {
            TP2_3_fibonacci.description();
            menuTP2();
        } else if (choixTP2.equals("4")) {
            TP2_4_nombre_d_or_et_fibonacci.description();
            menuTP2();
        } else if (choixTP2.equals("5")) {
            TP2_5_bonus_suite_de_syracuse.description();
            menuTP2();
        } else if (choixTP2.equals("6")) {
            TP2_6_bonus_jeu_des_allumettes.description();
            menuTP2();
        } else if (choixTP2.equals("retour") | choixTP2.equals("r")) {
            menu();
        } else {
            erreur();
        }
    }

    public static void menuTP3() {
        Scanner saisieUtilisateur = new Scanner(System.in);
        System.out.println("Quel exercice voulez-vous voir [1, 2, 3, 4, 5, retour] ?");
        String choixTP3 = saisieUtilisateur.next();
        if (choixTP3.equals("1")) {
            menuTP3();
        } else if (choixTP3.equals("2")) {
            menuTP3();
        } else if (choixTP3.equals("3")) {
            menuTP3();
        } else if (choixTP3.equals("4")) {
            menuTP3();
        } else if (choixTP3.equals("5")) {
            menuTP3();
        } else if (choixTP3.equals("retour") | choixTP3.equals("r")) {
            menu();
        } else {
            erreur();
        }
    }

    public static void menuTP4() {
        Scanner saisieUtilisateur = new Scanner(System.in);
        System.out.println("Quel exercice voulez-vous voir [1, retour] ?");
        String choixTP4 = saisieUtilisateur.next();
        if (choixTP4.equals("1")) {
            menuTP4();
        } else if (choixTP4.equals("retour") | choixTP4.equals("r")) {
            menu();
        } else {
            erreur();
        }
    }

    private static void erreur() {
        System.out.println("Erreur, retour au menu");
        menu();
    }
}
