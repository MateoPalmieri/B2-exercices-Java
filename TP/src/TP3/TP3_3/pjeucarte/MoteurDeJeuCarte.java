package TP3.TP3_3.pjeucarte;

public class MoteurDeJeuCarte {

    JeuCarte a_jeu;
    int nbrJoueurMax = 10;

    void jouer() {
        a_jeu.setJoueur();
        a_jeu.getJoueur(1);
    }

    // Constructeur
    public MoteurDeJeuCarte(JeuCarte game) {
            this.a_jeu = game;
    }
}
