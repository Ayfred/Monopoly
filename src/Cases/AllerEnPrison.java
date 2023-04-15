package Cases;

import Monopoly_Sur_Console.Joueur;
import Monopoly_Sur_Console.Plateau;

/**
 *
 * @author maxime.mines-ales
 */
public class AllerEnPrison extends Case {

    /**
     *
     */
    public AllerEnPrison() {
        super("Allez en prison ", 30, 0);
    }

    /**
     *
     * @param joueur
     * @param plateau
     */
    @Override
    public void actionCase(Joueur joueur, Plateau plateau) {
        joueur.setPosition(10);
        joueur.setEstEnPrison(1);
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
    public void acheter(Joueur j, Plateau p){
    }
}
