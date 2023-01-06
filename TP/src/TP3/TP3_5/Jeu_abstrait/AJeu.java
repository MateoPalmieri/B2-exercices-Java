package TP3.TP3_5.Jeu_abstrait;

/**
 Modifier les classes et coder la classe abstraite AJeu et vérifier que les méthodes fonctionnent
 */

import TP3.TP3_4.Interface_IRegle_IJeu.IRegle;

/**
 * @author Matéo PALMIERI
 * @version 1.0
 */
public abstract class AJeu {

    public abstract IRegle getRegle() ;

    public abstract void addJoueur() ;

    public abstract int setRegle(IRegle rules) ;
}
