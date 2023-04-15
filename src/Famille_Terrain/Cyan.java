package Famille_Terrain;

import Cases.Terrain;
import Monopoly_Sur_Console.Joueur;
import Monopoly_Sur_Console.Plateau;

public class Cyan extends Terrain{
    
    private static int[] famille = new int[3];
    private static int[] idFamille = new int[]{37, 39};

    public Cyan(int id, int prixMaison, String couleur, String nom, 
                                        int valeur, int[] loyers) {
        super(id, prixMaison, couleur, nom, valeur, loyers, new int[3]);
    }
    
    @Override
    public void achetee(Plateau p,int idJoueur) {
        if(getId() == 6){
            famille[0] = idJoueur;
            p.setPropPlateau(idJoueur, 7);
        }
        else{
            if(getId() == 8){
                famille[1] = idJoueur;
                p.setPropPlateau(idJoueur, 8);
            }
            else{
                famille[2] = idJoueur;
                p.setPropPlateau(idJoueur, 9);
            }
        }
    }
    
    

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
                    boolean constructible = famille[0] == famille[1] &&
                                            famille[0] == famille[2];
                    if(getMaison()== 0){
                        int transaction = joueur.payer(getLoyers()[0]);
                        if(constructible){
                            transaction += joueur.payer(getLoyers()[0]);
                        }
                        Joueur j = plateau.getListeJoueur().get(etat);
                        j.setPorteMonnaie(j.getPorteMonnaie() + transaction);
                    }
                    else{
                        int transaction = joueur.payer(getLoyers()[getMaison()]);
                        Joueur j = plateau.getListeJoueur().get(etat);
                        j.setPorteMonnaie(j.getPorteMonnaie() + transaction);
                    }
                }
            }
        }
    }
    
    @Override
    public boolean estConstructible() {
         return famille[0] == famille[1] && famille[0] == famille[2];
    }
    
    public void addMaison(Joueur j, Plateau p){
        if(getId() == 6){
            if(getMaisonFamille()[0] > getMaisonFamille()[1]){
                p.getCasePlateau()[8].construire(j,p);
            }
            if(getMaisonFamille()[0] > getMaisonFamille()[2]){
                p.getCasePlateau()[9].construire(j,p);
            }
            addMaison();
            j.payer(getPrixMaison());
        }
        else{
            if(getId() == 8){
                if(getMaisonFamille()[1] > getMaisonFamille()[2]){
                    p.getCasePlateau()[9].construire(j,p);
                }
                if(getMaisonFamille()[1] > getMaisonFamille()[0]){
                    p.getCasePlateau()[6].construire(j,p);
                }
                addMaison();
                j.payer(getPrixMaison());
            }
            else{
                if(getMaisonFamille()[2] > getMaisonFamille()[1]){
                    p.getCasePlateau()[8].construire(j,p);
                }
                if(getMaisonFamille()[2] > getMaisonFamille()[0]){
                    p.getCasePlateau()[6].construire(j,p);
                }
                addMaison();
                j.payer(getPrixMaison());
            }
        }
    }
    
    @Override
    public void construire(Joueur j, Plateau p) {
        if(getMaison() < 4){
            j.question("Souhaitez vous ajouter une maison sur " + this.toString());
            if(j.isReponseQuestion()){
                addMaison(j,p);
            }
        }
        if(getMaison() == 4){
            j.question("Souhaitez vous ajouter un hotel sur " + this.toString());
            if(j.isReponseQuestion()){
                addMaison(j,p);
            }
        }
    }
    
    @Override
    public void setTab(int m) {
       famille[getIdFamille().indexOf(this.getId())] = m;
    }
}
