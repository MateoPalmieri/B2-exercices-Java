package TP3.TP3_2.PJoueur;

/**
 Coder les classes Joueur et Resultat et vérifier que les méthodes fonctionnent

 Class PJoueur
 Joueur
 - a_nom : String          + a_resultat       Resultat
 - a_prenom : String                          + afficher() : void
 - a_pseudo : String                          + getScore() : int

 + afficher() : void
 + setNom(String) : void
 + setPrenom(String) : void
 + setPseudo(String) : void

 Remarque :
 Le diagramme donné n'est pas exhaustif et peut être complété et amélioré
 */

/**
 * @author Matéo PALMIERI
 * @version 1.0
 */
public class Joueur {
    String a_nom;
    String a_prenom;
    String a_pseudo;
    Resultat a_resultat;

    public static void main(String[] args) {
        Joueur myJoueur = new Joueur("PAL", "Mat", "SSR");
        myJoueur.afficher();
    }

    // Afficher
    public void afficher() {
        System.out.println(a_nom + " " + a_prenom + " " + a_pseudo);
    }

    // Constructeur
    public Joueur(String nom, String prenom, String pseudo) {
        a_nom = nom;
        a_prenom = prenom;
        a_pseudo = pseudo;
    }
}