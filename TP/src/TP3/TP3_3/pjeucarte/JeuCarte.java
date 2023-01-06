package TP3.TP3_3.pjeucarte;

import TP3.TP3_2.PJoueur.Joueur;
import TP3.TP3_3.pjeucarte.RegleDuJeuCarte;
import java.util.Scanner;

public class JeuCarte {

    RegleDuJeuCarte a_regle;
    MoteurDeJeuCarte a_moteurJeu;

    public void main(String[] args) {
        afficher();
    }

    public void afficher() {
        getRegle();
    }

    // void | RegleDuJeuCarte ?
    public void getRegle() {
        a_regle.afficher();
    }

    public void addJoueur(Joueur player) {
        player = new Joueur("NOM", "PRENOM", "PSEUDO");
    }

    public void jouer() {
        a_moteurJeu.jouer();
    }

    public void getJoueur(int i) {
        for (int x=0; x < i; x=x+1) {
            System.out.println("Joueur récupéré (théorie)");
        }
    }

    public void setJoueur() {
        Scanner saisieUtilisateur = new Scanner(System.in);

        System.out.println("Veuillez rentrer un nom :");
        String nom = saisieUtilisateur.next();

        System.out.println("Veuillez rentrer un prenom :");
        String prenom = saisieUtilisateur.next();

        System.out.println("Veuillez rentrer un pseudo :");
        String pseudo = saisieUtilisateur.next();
    }
}
