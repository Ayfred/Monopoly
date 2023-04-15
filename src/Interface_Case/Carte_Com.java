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
public class Carte_Com {
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
    public Carte_Com(int t, String titre, String com, int c){
    this.type = t;
    this.titre = titre;
    this.commentaire = com;
    this.chiffre = c;
    }

    /**
     *
     * @return
     */
    public static ArrayList creationcom() {

        ArrayList<Carte_Com> paquetcom = new ArrayList<>();

        paquetcom.add(new Carte_Com(1, "Frais de scolarité", "Payez 150€ de frais de scolarité.", -150));
        paquetcom.add(new Carte_Com(1, "Frais d'hospitalisation", "Payez 100€ de frais d'hospitalisation.", -100));
        paquetcom.add(new Carte_Com(1, "Médecin", "Visite chez le médecin : payez 50€.", -50));
        paquetcom.add(new Carte_Com(1, "Remboursement", "Les impôts vous remboursent 20€.", -20));
        paquetcom.add(new Carte_Com(1, "Assurance vie", "Votre assurance vie vous rapporte 100€.", -100));
        paquetcom.add(new Carte_Com(3, "Anniversaire", "C'est votre anniversaire ! \nChaque joueur doit vous donner 10€.", 10));
        paquetcom.add(new Carte_Com(1, "Commission d'expert", "Commission d'expert immobilier. \nRecevez 25€.", 25));
        paquetcom.add(new Carte_Com(1, "Prix de beauté", "Vous avez gagné le deuxième prix de beauté. \nRecevez 10€.", 10));
        paquetcom.add(new Carte_Com(1, "Stock", "La vente de votre stock vous rapporte 50€.", 50));
        paquetcom.add(new Carte_Com(1, "Héritage", "Vous héritez de 100€.", 100));
        paquetcom.add(new Carte_Com(1, "Placement", "Votre placement vous rapporte. \nRecevez 100€.", 100));
        paquetcom.add(new Carte_Com(1, "Erreur de la Banque", "Erreur de la Banque en votre faveur. \nRecevez 200€.", 200));
        paquetcom.add(new Carte_Com(2, "Prison", "Allez en prison. \nAvancez tout droit en prison. \nNe passez pas par la case départ, ne recevez pas 200€.", 10));
        paquetcom.add(new Carte_Com(2, "Sortie", "Vous êtes libéré de prison. \n(Cette carte doit être conservée)", 10));
        Collections.shuffle(paquetcom); //Mélange des carte
        return paquetcom;
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