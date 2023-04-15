package Cases;

import Monopoly_Sur_Console.Joueur;
import Monopoly_Sur_Console.Plateau;
import java.util.ArrayList;

/**
 *
 * @author maxime.mines-ales
 */
public abstract class Cartes extends Case{
    
    private static ArrayList<Cartes> pioche = new ArrayList();

    /**
     *
     * @param nom
     * @param id
     */
    public Cartes(String nom, int id) {
        super(nom, id, 0);
    }

    /**
     *
     * @param joueur
     * @param plateau
     */
    @Override
    public void actionCase(Joueur joueur, Plateau plateau) {   
    }
    
    /**
     *
     * @param valeur
     */
    @Override
    public void setValeurDes(int valeur) {
    }
    
    
    
}
