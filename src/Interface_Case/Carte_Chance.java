/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface_Case;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author belkh
 */
public class Carte_Chance {
    int type;
    String titre;
    String commentaire;
    int chiffre;

    /**
     *
     * @param t
     * @param titre
     * @param com
     * @param c
     */
    public Carte_Chance(int t, String titre, String com, int c){
    this.type = t;
    this.titre = titre;
    this.commentaire = com;
    this.chiffre = c;
    }

    /**
     *
     * @return
     */
    public static ArrayList creation() {
    
        ArrayList<Carte_Chance> paquet = new ArrayList<>();
    
        Carte_Chance c1 = new Carte_Chance(1,"Amende", "Amende pour excès de vitesse : 15€.", -15);
        paquet.add(c1);
        Carte_Chance c2 = new Carte_Chance(1,"Président du conseil d'administration", "Vous avez été élu président du conseil d'administration. \nVersez 50€ à chaque joueur.", -50);
        paquet.add(c2);
        Carte_Chance c3 = new Carte_Chance(1,"Lanuel", "Vous avez manqué de respect à M. Lanuel. \nVersez 50€ de dédommagement.", -50);
        paquet.add(c3);
        Carte_Chance c4 = new Carte_Chance(1,"Versement", "La banque vous verse un dividende de 50€.", 50);
        paquet.add(c4);
        Carte_Chance c5 = new Carte_Chance(1,"Gain", "Vos terrains vous rapportent. Touchez 150€.", 150);
        paquet.add(c5);
        Carte_Chance c6 = new Carte_Chance(1,"Mots croisés", "Vous avez gagné le prix de mots-croisés ! \nRecevez 100€.", 100);
        paquet.add(c6);
        Carte_Chance c7 = new Carte_Chance(2,"Case Départ", "Avancez jusqu'à la case départ. \n(Recevez 200€)", 0);
        paquet.add(c7);
        Carte_Chance c8 = new Carte_Chance(2,"Rue de la Paix", "Rendez-vous Rue de la Paix.", 39);
        paquet.add(c8);
        Carte_Chance c9 = new Carte_Chance(2,"Henri-Martin", "Rendez-vous à l'Avenue Henri-Martin. \nSi vous passez par la case départ, recevez 200€.", 24);
        paquet.add(c9);
        Carte_Chance c10 = new Carte_Chance(2,"Boulevard de la Villette", "Avancez au Boulevard de la Vilette. \nSi vous passez par la case départ, recevez 200€.", 11);
        paquet.add(c10);
        Carte_Chance c11 = new Carte_Chance(2,"Gare de Lyon", "Avancez à la gare de Lyon. \nSi vous passez par la case départ, recevez 200€.", 15);
        paquet.add(c11);
        Carte_Chance c12 = new Carte_Chance(3,"Reculez", "Reculez de 3 cases.", 3);
        paquet.add(c12);
        Carte_Chance c13 = new Carte_Chance(2,"Nouveau Depart", "Le joueur déménage et prend un \nnouveau départ au Technopole.", 0);
        paquet.add(c13);
        Collections.shuffle(paquet);
        return paquet;
    
}

    /**
     *
     * @return
     */
    public int getType() {
        return type;
    }

    /**
     *
     * @return
     */
    public String getTitre() {
        return titre;
    }

    /**
     *
     * @return
     */
    public String getCommentaire() {
        return commentaire;
    }

    /**
     *
     * @return
     */
    public int getChiffre() {
        return chiffre;
    }
}