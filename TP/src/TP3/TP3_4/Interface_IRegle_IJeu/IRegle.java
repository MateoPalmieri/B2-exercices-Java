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

/**
 * @author Matéo PALMIERI
 * @version 1.0
 */
public interface IRegle {
    public int afficher();
}
