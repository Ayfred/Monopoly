package Cases;

import Monopoly_Sur_Console.Joueur;
import Monopoly_Sur_Console.Plateau;

/**
 *
 * @author maxime.mines-ales
 */
public class Impot extends Case{

    /**
     *
     * @param nom
     * @param id
     * @param prix
     */
    public Impot(String nom, int id, int prix) {
        super(nom, id, prix);
    }

    /**
     *
     * @param joueur
     * @param plateau
     */
    @Override
    public void actionCase(Joueur joueur, Plateau plateau) {
        System.out.println("Vous êtes tombé sur la case " + toString()
                                + ". Vous devez payer " + getPrix() + " €.");
        joueur.payer(getPrix());
    }
    
    /**
     *
     * @param valeur
     */
    @Override
    public void setValeurDes(int valeur) {
    }

    /**
     *
     * @param j
     * @param p
     */
    @Override
    public void construire(Joueur j, Plateau p) {
    }

    /**
     *
     * @return
     */
    @Override
    public boolean estConstructible() {
        return false;
    }
    
    /**
     *
     * @return
     */
    @Override
    public int getPrixMaison() {
        return 0;
    }

    /**
     *
     * @return
     */
    @Override
    public int getMaison() {
        return 0;
    }

    /**
     *
     * @param i
     */
    @Override
    public void setMaison(int i) {
    }

    /**
     *
     * @param j
     * @param p
     */
    @Override
    public void acheter(Joueur j, Plateau p) {
    }
    
}
