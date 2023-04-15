package Cases;

import Monopoly_Sur_Console.Joueur;
import Monopoly_Sur_Console.Plateau;

/**
 *
 * @author maxime.mines-ales
 */
public abstract class Achetable extends Case{
    
    private int proprietaire = 0;
    
    /**
     *
     * @param nom
     * @param id
     * @param valeur
     * @param loyers
     */
    public Achetable(String nom,int id, int valeur,int[] loyers) {
        super(nom,id,valeur);
        setLoyers(loyers);
    }

    /**
     *
     * @return
     */
    public Object getProprietaire(){
        return proprietaire;
    }
    
    /**
     *
     * @param j
     */
    public void setProprietaire(int j){
        this.proprietaire = j;
    }
    
    /**
     *
     * @param j
     * @param p
     */
    public void acheter(Joueur j, Plateau p){
        j.payer(getPrix());
        this.proprietaire = j.getId()+1;
        j.addListeTerrain(super.getId());
        p.changementProprietaire(j.getId()+1, super.getId());
        //achetee(p, j.getId()+1);
    }
    
    /**
     *
     * @param p
     * @param idjoueur
     */
    public abstract void achetee(Plateau p, int idjoueur);
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
	return "Case [nom=" + getNom() + ", id=" + getId() + ", valeur=" 
                + getPrix() + ", loyer : " + getLoyers()[0] + "]";
    }
}