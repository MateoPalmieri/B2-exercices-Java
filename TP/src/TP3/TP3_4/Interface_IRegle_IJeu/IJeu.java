package TP3.TP3_4.Interface_IRegle_IJeu;

/**
 Coder les interfaces IRegle et IJeu

 class PJeu
 "interface"
 IJeu
 + afficher() : void
 + getRegle() : IRegle
 + addJoueur(Joueur) : void
 + jouer() : void
 + setRegle(IRegle) : int

 class PJeu
 "interface"
 IRegle
 + afficher() : int

 Remarque :
 Le diagramme donné n'est pas exhaustif et peut être complété et amélioré
 */

import TP3.TP3_2.PJoueur.Joueur;

/**
 * @author Matéo PALMIERI
 * @version 1.0
 */
public interface IJeu {
    public void afficher();
    public IRegle getRegle();
    public void addJoueur(Joueur player);
    public void jouer();
    public int setRegle(IRegle regle);
}
