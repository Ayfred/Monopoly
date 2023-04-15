package Monopoly_Sur_Console;

import Cases.Case;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author maxime.mines-ales
 */
public class Plateau implements Donnée_plateau{
    private Case[] casePlateau = new Case[40];
    private ArrayList<Joueur> listeJoueur = new ArrayList();
    private int[] propPlateau = new int[40];

    /**
     *
     */
    public int joueur_actuel;

    /**
     *
     */
    public ArrayList<Integer> Liste_X = new ArrayList();

    /**
     *
     */
    public ArrayList<Integer> Liste_Y = new ArrayList();
    
    /**
     *
     */
    public Plateau() {
    }
    
    /**
     *
     * @return
     */
    public ArrayList<Integer> getListe_X() {
        return Liste_X;
    }

    /**
     *
     * @return
     */
    public ArrayList<Integer> getListe_Y() {
        return Liste_Y;
    }
    
    /**
     *
     * @return
     */
    public ArrayList<JLabel> getListe_image(){
        ArrayList<JLabel> Liste_image = new ArrayList();
        Liste_image.add(image_pion1);
        Liste_image.add(image_pion2);
        Liste_image.add(image_pion3);
        Liste_image.add(image_pion4);
        Liste_image.add(image_pion5);
        Liste_image.add(image_pion6);
        Liste_image.add(image_pion7);
        Liste_image.add(image_pion8);
        Liste_image.add(image_pion9);
        Liste_image.add(image_pion10);
        return Liste_image;
    }

    /**
     *
     * @return
     */
    public int getJoueur_actuel() {
        return joueur_actuel;
    }

    /**
     *
     * @param joueur_actuel
     */
    public void setJoueur_actuel(int joueur_actuel) {
        this.joueur_actuel = joueur_actuel;
    }
           
    /**
     *
     * @return
     */
    public int nbJoueur(){
        return listeJoueur.size();
    }
    
    /**
     *
     * @param idjoueur
     * @param idterrain
     */
    public void changementProprietaire(int idjoueur, int idterrain){
        propPlateau[idterrain] = idjoueur;
    }
    
    /**
     *
     * @param j
     */
    public void addPlayer(Joueur j){
        listeJoueur.add(j);
    }

    /**
     *
     * @return
     */
    public Case[] getCasePlateau() {
        return casePlateau;
    }

    /**
     *
     * @return
     */
    public int[] getPropPlateau() {
        return propPlateau;
    }
    
    /**
     *
     * @param i
     * @param c
     */
    public void addCase(int i, Case c){
        casePlateau[i] = c;
    }

    /**
     *
     * @return
     */
    public ArrayList<Joueur> getListeJoueur() {
        return listeJoueur;
    }

    /**
     *
     * @param listeJoueur
     */
    public void setListeJoueur(ArrayList<Joueur> listeJoueur) {
        this.listeJoueur = listeJoueur;
    }
    
    /**
     *
     * @param idJoueur
     * @param idTerrain
     */
    public void setPropPlateau(int idJoueur, int idTerrain){
        propPlateau[idTerrain] = idJoueur;
    }
    
    /*A ajouter*/

    /**
     *
     */

    public void clearJoueur(){
        listeJoueur.clear();
    }
    
    /**
     *
     * @param i
     * @return
     */
    public Case getCase(int i){
        return casePlateau[i];
    }
    
    /**
     *
     * @param j
     * @return
     */
    public boolean verif_appartenance_case_vide(Joueur j){
        return propPlateau[j.getPosition()] == 0;
    }
}
