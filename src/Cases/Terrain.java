package Cases;

import Monopoly_Sur_Console.Joueur;
import Monopoly_Sur_Console.Plateau;

/**
 *
 * @author maxime.mines-ales
 */
public abstract class Terrain extends Achetable{
    
    private int maison = 0;
    private int prixMaison;
    private String couleur;
    private int[] maisonFamille;
    
    /**
     *
     * @param id
     * @param prixMaison
     * @param couleur
     * @param nom
     * @param valeur
     * @param loyers
     * @param mf
     */
    public Terrain(int id, int prixMaison, String couleur, String nom, 
                        int valeur, int[] loyers, int[] mf) {
        super(nom, id, valeur, loyers);
        this.prixMaison = prixMaison;
        this.couleur = couleur;
        this.maisonFamille = mf;
    }

    /**
     *
     * @return
     */
    public int getPrixMaison() {
        return prixMaison;
    }

    /**
     *
     * @return
     */
    public int getMaison() {
        return maison;
    }
    
    /**
     *
     */
    public void addMaison(){
        this.maison++;
    }

    /**
     *
     * @param maison
     */
    public void setMaison(int maison) {
        this.maison = maison;
        setTab(maison);
    }
    
    /**
     *
     * @param m
     */
    public abstract void setTab(int m);

    /**
     *
     * @return
     */
    public String getCouleur() {
        return couleur;
    }

    /**
     *
     * @return
     */
    public int[] getMaisonFamille() {
        return maisonFamille;
    }

    /**
     *
     * @param i
     * @param n
     */
    public void addMaisonFamille(int i, int n) {
        this.maisonFamille[i] += n;
    }
   
    /**
     *
     * @param valeur
     */
    @Override
    public void setValeurDes(int valeur) {
    }
    
    
}
