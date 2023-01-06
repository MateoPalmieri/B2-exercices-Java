package TP3.TP3_1.PCarte;

/**
 Coder la classe Carte et l'énumération Couleur et vérifier que les méthodes fonctionnent

 Class PCarte
 Carte
 - a_couleur : Couleur
 - a_valeur : String                  "enumeration"

 + afficher() : void                     Couleur
 + affecte(Carte) : void                 PIQUE
 + equal(Carte) : boolean                COEUR
 + setType(Couleur) : void               CARREAU
 + setValeur(String) : void              TREFLE
 "constructor"
 + Carte(Couleur, String)
 + Carte(Carte)

 Remarque :
 Le diagramme donné n'est pas exhaustif et peut être complété et amélioré
 */

/**
 * @author Matéo PALMIERI
 * @version 1.0
 */
public class Carte {
    String a_valeur;
    Couleur a_couleur;

    public static void main(String[] args) {
        Carte myCarte = new Carte("10", Couleur.PIQUE);
        myCarte.afficher();
        System.out.println("Fonction affecter() :");
        myCarte.affecter(myCarte);
        System.out.println("Fonctions setType() et setValeur() :");
        myCarte.setType(Couleur.TREFLE);
        myCarte.setValeur("5");
        System.out.println("Retour à la carte de départ avec les mêmes fonctions :");
        myCarte.setType(Couleur.PIQUE);
        myCarte.setValeur("10");
    }

    // Énumérateur
    enum Couleur {PIQUE, COEUR, CARREAU, TREFLE}

    // Constructeur
    public Carte(String value, Couleur color) {
        a_valeur = value;
        a_couleur = color;
    }

    public Carte(Carte card) {
        card.a_couleur = Couleur.CARREAU;
        card.a_valeur = "10";
    }


    // Fonctions public
    public void afficher() {
        System.out.println(a_valeur + " " + a_couleur);
    }

    // Affecte une Carte à une autre Carte
    public void affecter(Carte card) {
        Carte card2 = card;
        System.out.println("new : " + card2);
    }

    // Comparaison
    public boolean equal(Carte otherCard) {
       if (a_valeur.equals(otherCard.a_valeur) && a_couleur == otherCard.a_couleur) {
           return true;
       } else {
           return false;
       }
    }

    public void setType(Couleur color) {
        this.a_couleur = color;
        afficher();
    }

    public void setValeur(String value) {
        this.a_valeur = value;
        afficher();
    }
}
