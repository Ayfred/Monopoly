package Cases;

import Monopoly_Sur_Console.Joueur;
import Monopoly_Sur_Console.Plateau;

/**
 *
 * @author maxime.mines-ales
 */
public final class ServicePublic extends Achetable{
    
    int valeurDes = 1;
    
    /**
     *
     * @param nom
     * @param id
     * @param valeur
     */
    public ServicePublic(String nom, int id, int valeur) {
        super(nom, id, valeur, new int[]{4, 0, 0, 0, 0, 0});
    }

    /**
     *
     * @param valeur
     */
    public void setValeurDes(int valeur) {
        this.valeurDes = valeur;
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
                System.out.println("Cette propriété n'appartient à personne,");
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
                    int montantTransaction = getLoyers()[0] * valeurDes;
                    if(plateau.getPropPlateau()[12] == 
                            plateau.getPropPlateau()[28]){
                        montantTransaction += valeurDes * 600;
                    }
                    int transaction = joueur.payer(montantTransaction);
                    Joueur j = plateau.getListeJoueur().get(etat);
                    j.setPorteMonnaie(j.getPorteMonnaie() + transaction);
                }
            }
        }
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
