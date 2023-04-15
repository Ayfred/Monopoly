package Cases;

import Monopoly_Sur_Console.Joueur;
import Monopoly_Sur_Console.Plateau;
import java.util.ArrayList;

/**
 *
 * @author maxime.mines-ales
 */
public class Chance extends Cartes{
    
    private static ArrayList<Object> pioche = new ArrayList();

    /**
     *
     * @param id
     */
    public Chance(int id) {
        super("Case Chance", id);
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     * @return
     */
    @Override
    public int getMaison() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     * @param j
     * @param p
     */
    @Override
    public void construire(Joueur j, Plateau p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     * @param i
     */
    @Override
    public void setMaison(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
