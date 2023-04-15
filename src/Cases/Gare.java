package Cases;

import Monopoly_Sur_Console.Joueur;
import Monopoly_Sur_Console.Plateau;
import java.util.ArrayList;

/**
 *
 * @author maxime.mines-ales
 */
public class Gare extends Achetable{
    
    static ArrayList<Integer> nbgare = new ArrayList();

    /**
     *
     * @param nom
     * @param id
     */
    public Gare(String nom, int id) {
        super(nom, id, 200, new int[]{25, 0, 0, 0, 0, 0});
    }
    
    /**
     *
     * @param joueur
     * @param plateau
     */
    @Override
    public void actionCase(Joueur joueur, Plateau plateau) {
        int etat = plateau.getPropPlateau()[joueur.getPosition()];
        switch (etat) {
            case 0 ->{
                System.out.println("Cette gare n'appartient à personne,");
                System.out.println(toString());
                if(joueur.getPorteMonnaie() >= getPrix()){
                    question("Souhaitez vous l'acquérir ?");
                    if(getReponseQuestion()){
                        acheter(joueur, plateau);
                        System.out.println("vous possédez désormais" 
                                + toString());
                    }
                }  
            }
            default ->{
                if( etat != joueur.getId()){
                    int transaction = joueur.payer(getLoyers()[0]);
                    Joueur j = plateau.getListeJoueur().get(etat);
                    transaction = transaction * (j.getListeTerrain()[5]
                                                    + j.getListeTerrain()[15]
                                                    + j.getListeTerrain()[25]
                                                    + j.getListeTerrain()[35]);
                    j.setPorteMonnaie(j.getPorteMonnaie() + transaction);
                }
            }
        }
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
     * @param p
     * @param idjoueur
     */
    @Override
    public void achetee(Plateau p, int idjoueur) {
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
    
    
}
