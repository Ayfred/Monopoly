/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_Principale;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Random;
import javax.swing.Timer;
import Interface_Case.CC;
import Monopoly_Sur_Console.*;
import Options_Falcutatives.DebugMode;
import static Interface_Principale.Donnée_plateau.*;
import Interface_Case.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author maxime.mines-ales
 */


public class Interface_Plateau extends JFrame implements Donnée_plateau, ActionListener{
    //Données plateau là où toutes les importations d'images ont eu lieu
    
    Plateau p;
    int num_jactuel;
    Joueur joueur_actuel;
    JLabel image_actuelle;
    
    /**
     *
     * @param p
     */
    public Interface_Plateau(Plateau p){
        
        this.p = p;

        this.setTitle("Monopoly v1.0");
        /*importation et configuration des images*/
        image_plateau.setOpaque(true);
        image_plateau.setSize(image_plateau.getMaximumSize());
        
        image_de1.setOpaque(true);
        image_de1.setSize(image_de1.getPreferredSize());
        image_de1.setLocation(x_position_dé, y_position_dé);//localisation des dés
        image_de1.setVisible(true);
        
        image_de2.setOpaque(true);
        image_de2.setSize(image_de2.getPreferredSize());
        image_de2.setLocation(x_position_dé, y_position_dé);//localisation des dés
        image_de2.setVisible(false);
        
        image_de3.setOpaque(true);
        image_de3.setSize(image_de3.getPreferredSize());
        image_de3.setLocation(x_position_dé, y_position_dé);//localisation des dés
        image_de3.setVisible(false);
        
        image_de4.setOpaque(true);
        image_de4.setSize(image_de4.getPreferredSize());
        image_de4.setLocation(x_position_dé, y_position_dé);//localisation des dés
        image_de4.setVisible(false);
        
        image_de5.setOpaque(true);
        image_de5.setSize(image_de5.getPreferredSize());
        image_de5.setLocation(x_position_dé, y_position_dé);//localisation des dés
        image_de5.setVisible(false);
        
        image_de6.setOpaque(true);
        image_de6.setSize(image_de6.getPreferredSize());
        image_de6.setLocation(x_position_dé, y_position_dé);//localisation des dés
        image_de6.setVisible(false);
        
        image_logo.setOpaque(false);
        image_logo.setSize(image_logo.getPreferredSize());
        image_logo.setLocation(x_pos_logo,y_pos_logo);
        
        image_logo.setOpaque(false);
        image_logo.setSize(image_logo.getPreferredSize());
        image_logo.setLocation(x_pos_logo,y_pos_logo);
       
        image_pion1.setOpaque(true);
        image_pion1.setSize(image_pion1.getPreferredSize());
        image_pion1.setLocation(x_casedépart,y_casedépart);//coords du pion1

        /*II.textes sur jframe*/
        /*1) Configuration du dé*/
        chiffre_dé.setOpaque(false);
        chiffre_dé.setSize(175, 25);
        chiffre_dé.setLocation(x_position_dé - 45, y_position_dé+75);
        
        num_obt.setOpaque(false);
        num_obt.setSize(175, 25);
        num_obt.setLocation(x_position_dé - 45, y_position_dé+95);
        
        num_obt2.setOpaque(false);
        num_obt2.setSize(175, 25);
        num_obt2.setLocation(x_position_dé - 45, y_position_dé+115);

        
        /*Affichage des coordonnées en temps réel de la souris*/
        Coords.setOpaque(false);
        Coords.setSize(95, 25);
        Coords.setLocation(475, 85);
        
        //Crédits
        String s3 ="<html><font><font style = 'Arial'>Created by Ayfred, CodeComposerUser, Smilaid & ruSSianHackrR</font></html>";
        JLabel Crédits = new JLabel(s3);
        Crédits.setOpaque(false);
        Crédits.setSize(375, 25);
        Crédits.setLocation(135, 550);
        
        
        /*Debug Mode*/
        Debug.setOpaque(false);
        Debug.setSize(175, 55);
        Debug.setLocation(86, 80);
        
        Debug2.setOpaque(false);
        Debug2.setSize(175, 55);
        Debug2.setLocation(86, 115);
        
        /*Configuration des boutons*/
        Passer_votre_tour.setSize(135, 25);
        Passer_votre_tour.setLocation(420, 547);
        
        DebugMode.setSize(100,25);
        DebugMode.setLocation(465, 547);
        DebugMode.addActionListener(this);
        DebugMode.setOpaque(false);
        DebugMode.setContentAreaFilled(false);
        DebugMode.setBorderPainted(false);
        
        button_carte_chance.setSize(image_carte_chance.getPreferredSize());
        button_carte_chance.setLocation(450, 355);
        button_carte_chance.setOpaque(true);
        button_carte_chance.setVisible(true);
        button_carte_chance.addActionListener(this);
        button_carte_chance.setEnabled(false);
        
        button_caisse_communauté.setSize(image_caisse_communauté.getPreferredSize());
        button_caisse_communauté.setLocation(305, 355);
        button_caisse_communauté.setOpaque(true);
        button_caisse_communauté.setVisible(true);
        button_caisse_communauté.addActionListener(this);
        button_caisse_communauté.setEnabled(false);
        
        
        //Stockages des données dans des ArrayList (coordonnées)
        ArrayList Liste_image = p.getListe_image();
        ArrayList Liste_joueurs = p.getListeJoueur();
        ArrayList Liste_X = p.getListe_X();
        ArrayList Liste_Y = p.getListe_Y();

        //adaptation du nombre de joueurs et le nombre d'image de pions
        int n_Liste_joueurs = Liste_joueurs.size();
        for(int re =0; re<=10-n_Liste_joueurs-1;re++){
            Liste_image.remove(10-re-1);
        }
        
        //Intégration des coordonnées de la case départ ici (600,600) pour tous les joueurs
        for(int k =0; k<=Liste_image.size()-1; k++){
            JLabel im = (JLabel) Liste_image.get(k);
            im.setOpaque(true);
            im.setSize(im.getPreferredSize());
            im.setLocation(x_casedépart,y_casedépart);
            int x_pos = im.getX();
            int y_pos = im.getY();
            Liste_X.add(x_pos);
            Liste_Y.add(y_pos);
        }
        
        /* Fonctionnement du dé*/
        addMouseListener(new MouseAdapter() {
            
            Random r = new Random();
            boolean etat_pion = true;
            int num = 0;
            int comptage_tour = 0;
            int vitesse_de_deplacement = 1;
            

            public void timers(int pos_pion, JLabel image_pion, int numero, int i, Joueur j){
                switch (numero) {
                    case 1:
                        /*Animation déplacement des pions*/
                        Timer timer1 = new Timer(vitesse_de_deplacement, new ActionListener(){
                            int x_pos = image_pion.getX();
                            int y_pos = image_pion.getY();
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                etat_pion = false;//permettant de désactiver l'option pour relancer les dés lorsque le pion se déplace
                                x_pos -= 5;// vitesse de -5 suivant les coordonnées abscisses
                                image_pion.setLocation(x_pos, image_pion.getY());//mouvement du pion
                                if(image_pion.getX() == Liste_coords_x[pos_pion]){
                                    etat_pion = true;//on réactive les dés quand le pion a fini son déplacement
                                    Liste_X.set(i,Liste_coords_x[pos_pion]);//sauvegarde des nouvelles coordonnées
                                    Liste_Y.set(i,Liste_coords_y[pos_pion]);
                                    chercher(pos_pion, j, image_pion, i);//cherche la case où est atterri le joueur
                                    ((Timer)e.getSource()).stop();//on désactive le timer quand le pion a fini de se déplacer
                                }
                            }
                        });         timer1.start();//System.out.println("Timer 1 enclenché");
                        break;
                    case 2://même principe que le premier timer
                        Timer timer2 = new Timer(vitesse_de_deplacement, new ActionListener(){
                            int x_pos = image_pion.getX();
                            int y_pos = image_pion.getY();
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                etat_pion = false;
                                if(image_pion.getX() != Liste_coords_x[pos_pion]){
                                    x_pos -= 5;
                                    image_pion.setLocation(x_pos, image_pion.getY());
                                }
                                if(image_pion.getX() == Liste_coords_x[pos_pion]){
                                    y_pos -= 5;
                                    image_pion.setLocation(image_pion.getX(), y_pos);
                                    if(image_pion.getY() == Liste_coords_y[pos_pion]){
                                        etat_pion = true;
                                        Liste_X.set(i,Liste_coords_x[pos_pion]);
                                        Liste_Y.set(i,Liste_coords_y[pos_pion]);
                                        chercher(pos_pion, j, image_pion, i);
                                        ((Timer)e.getSource()).stop();
                                    }
                                }
                            }
                        });         timer2.start();//System.out.println("Timer 2 enclenché");
                        break;
                    case 3:
                        Timer timer3 = new Timer(vitesse_de_deplacement, new ActionListener(){
                            int x_pos = image_pion.getX();
                            int y_pos = image_pion.getY();
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                etat_pion = false;
                                y_pos -= 5;
                                image_pion.setLocation(image_pion.getX(), y_pos);
                                if(image_pion.getY() == Liste_coords_y[pos_pion]){
                                    etat_pion = true;
                                    Liste_X.set(i,Liste_coords_x[pos_pion]);
                                    Liste_Y.set(i,Liste_coords_y[pos_pion]);
                                    chercher(pos_pion, j, image_pion, i);
                                    ((Timer)e.getSource()).stop();
                                }
                            }
                        });         timer3.start();//System.out.println("Timer 3 enclenché");
                        break;
                    case 4:
                        Timer timer4 = new Timer(vitesse_de_deplacement, new ActionListener(){
                            int x_pos = image_pion.getX();
                            int y_pos = image_pion.getY();
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                etat_pion = false;
                                if(image_pion.getY() != Liste_coords_y[pos_pion]){
                                    y_pos -= 5;
                                    image_pion.setLocation(image_pion.getX(), y_pos);
                                }
                                if(image_pion.getY() == Liste_coords_y[pos_pion]){
                                    x_pos += 5;
                                    image_pion.setLocation(x_pos, image_pion.getY());
                                    if(image_pion.getX() == Liste_coords_x[pos_pion]){
                                        etat_pion = true;
                                        Liste_X.set(i,Liste_coords_x[pos_pion]);
                                        Liste_Y.set(i,Liste_coords_y[pos_pion]);
                                        chercher(pos_pion, j, image_pion, i);
                                        ((Timer)e.getSource()).stop();
                                    }
                                }
                            }
                        });         timer4.start();//System.out.println("Timer 4 enclenché");
                        break;
                    case 5:
                        Timer timer5 = new Timer(vitesse_de_deplacement, new ActionListener(){
                            int x_pos = image_pion.getX();
                            int y_pos = image_pion.getY();
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                etat_pion = false;
                                x_pos += 5;
                                image_pion.setLocation(x_pos, image_pion.getY());
                                if(image_pion.getX() == Liste_coords_x[pos_pion]){
                                    etat_pion = true;
                                    Liste_X.set(i,Liste_coords_x[pos_pion]);
                                    Liste_Y.set(i,Liste_coords_y[pos_pion]);
                                    chercher(pos_pion, j, image_pion, i);
                                    ((Timer)e.getSource()).stop();
                                }
                            }
                        });         timer5.start();//System.out.println("Timer 5 enclenché");
                        break;
                    case 6:
                        Timer timer6 = new Timer(vitesse_de_deplacement, new ActionListener(){
                            int x_pos = image_pion.getX();
                            int y_pos = image_pion.getY();
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                etat_pion = false;
                                if(image_pion.getX() != Liste_coords_x[pos_pion]){
                                    x_pos += 5;
                                    image_pion.setLocation(x_pos, image_pion.getY());
                                }
                                if(image_pion.getX() == Liste_coords_x[pos_pion]){
                                    y_pos += 5;
                                    image_pion.setLocation(image_pion.getX(), y_pos);
                                    if(image_pion.getY() == Liste_coords_y[pos_pion]){
                                        etat_pion = true;
                                        Liste_X.set(i,Liste_coords_x[pos_pion]);
                                        Liste_Y.set(i,Liste_coords_y[pos_pion]);
                                        chercher(pos_pion, j, image_pion, i);
                                        ((Timer)e.getSource()).stop();}

                                }
                            }
                        });         timer6.start();//System.out.println("Timer 6 enclenché");
                        break;
                    case 7:
                        Timer timer7 = new Timer(vitesse_de_deplacement, new ActionListener(){
                            int x_pos = image_pion.getX();
                            int y_pos = image_pion.getY();
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                etat_pion = false;
                                y_pos += 5;
                                image_pion.setLocation(image_pion.getX(), y_pos);
                                if(image_pion.getY() == Liste_coords_y[pos_pion]){
                                    etat_pion = true;
                                    Liste_X.set(i,Liste_coords_x[pos_pion]);
                                    Liste_Y.set(i,Liste_coords_y[pos_pion]);
                                    chercher(pos_pion, j, image_pion, i);
                                    ((Timer)e.getSource()).stop();
                                }
                            }
                        });         timer7.start();//System.out.println("Timer 7 enclenché");
                        break;
                    case 8:
                        Timer timer8 = new Timer(vitesse_de_deplacement, new ActionListener(){
                            int x_pos = image_pion.getX();
                            int y_pos = image_pion.getY();
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                etat_pion = false;
                                y_pos +=5 ;
                                image_pion.setLocation(image_pion.getX(), y_pos);
                                if(image_pion.getY() == Liste_coords_y[pos_pion]){
                                    etat_pion = true;
                                    Liste_X.set(i,Liste_coords_x[pos_pion]);
                                    Liste_Y.set(i,Liste_coords_y[pos_pion]);
                                    chercher(pos_pion, j, image_pion, i);
                                    ((Timer)e.getSource()).stop();
                                }
                            }
                        });         timer8.start();//System.out.println("Timer 8 enclenché");
                        break;
                    case 9:
                        Timer timer9 = new Timer(vitesse_de_deplacement, new ActionListener(){
                            int x_pos = image_pion.getX();
                            int y_pos = image_pion.getY();
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                etat_pion = false;
                                if(image_pion.getY() != Liste_coords_y[pos_pion]){
                                    y_pos += 5;
                                    image_pion.setLocation(image_pion.getX(), y_pos);
                                }
                                if(image_pion.getY() == Liste_coords_y[pos_pion]){
                                    x_pos -= 5;
                                    image_pion.setLocation(x_pos, image_pion.getY());
                                    if(image_pion.getX() == Liste_coords_x[pos_pion]){
                                        etat_pion = true;
                                        Liste_X.set(i,Liste_coords_x[pos_pion]);
                                        Liste_Y.set(i,Liste_coords_y[pos_pion]);
                                        comptage_tour +=1;
                                        Case_Depart CaseDep = new Case_Depart();
                                        chercher(pos_pion, j, image_pion, i);
                                        ((Timer)e.getSource()).stop();
                                    }
                                }
                            }
                        });         timer9.start();//System.out.println("Timer 9 enclenché");
                        break;
                    default:
                        break;
                }
            }
        
        
        int deux_des_lances;
        int num_temp = 0;
        
        //fonctionnement des dés lorsqu'on appuie sur la zone où se trouve l'image des dés
        public void mousePressed(MouseEvent e) {
            //on recueille les données du joueur actuel
            int i = p.getJoueur_actuel();
            Joueur j_en_cours = (Joueur) Liste_joueurs.get(i);
            JLabel image_pion_en_cours = (JLabel) Liste_image.get(i);
            int pos_pion1_case_en_cours = j_en_cours.getPosition();
            
                //si le joueur peut lancer les dés (ne peut pas les lancer quand le pion est en mouvement)
                if(etat_pion){    
                    //recalibrage des coordonnées avec les coordonnées en temps réel
                    int x_addition =x_position_dé+8;
                    int y_addition =y_position_dé+30;
                    
                    //détection de la zone d'appuie 
                    if(e.getX()>= x_addition && e.getX()<= x_addition+68 && e.getY()>= y_addition && e.getY()<= y_addition+68){//localisation du dé carré coté 68
                        /*Numéro dé obtenu*/
                        num = r.nextInt(6)+1;
                        
                        //num temp pour afficher la somme des dés obtenus
                        num_temp += num;
                        //affichage de textes
                        num_obt.setText("<html>Numéro obtenu: <font color= blue><font size='+1'><B>" + Integer.toString(num)+"</B></font></html>");
                        num_obt2.setText("<html>Somme obtenue: <font color = blue><font size='+1'><B>" + Integer.toString(num_temp) +"</B></font></html>");
                        /*Affichage des images de numéro des dés*/
                        if(num ==1){
                            image_de1.setVisible(true);//image_de1 correspond à l'image du numéro 1 du dé
                            image_de2.setVisible(false);//on rend non visible les autres
                            image_de3.setVisible(false);
                            image_de4.setVisible(false);
                            image_de5.setVisible(false);
                            image_de6.setVisible(false);
                        
                        }
                        if(num ==2){
                            image_de2.setVisible(true);
                            image_de1.setVisible(false);
                            image_de3.setVisible(false);
                            image_de4.setVisible(false);
                            image_de5.setVisible(false);
                            image_de6.setVisible(false);
                        }
                        if(num ==3){
                            image_de3.setVisible(true);
                            image_de2.setVisible(false);
                            image_de1.setVisible(false);
                            image_de4.setVisible(false);
                            image_de5.setVisible(false);
                            image_de6.setVisible(false);
                        }
                        if(num ==4){
                            image_de4.setVisible(true);
                            image_de2.setVisible(false);
                            image_de3.setVisible(false);
                            image_de1.setVisible(false);
                            image_de5.setVisible(false);
                            image_de6.setVisible(false);
                        }
                        if(num ==5){
                            image_de5.setVisible(true);
                            image_de2.setVisible(false);
                            image_de3.setVisible(false);
                            image_de4.setVisible(false);
                            image_de1.setVisible(false);
                            image_de6.setVisible(false);
                        }
                        if(num ==6){
                            image_de6.setVisible(true);
                            image_de2.setVisible(false);
                            image_de3.setVisible(false);
                            image_de4.setVisible(false);
                            image_de5.setVisible(false);
                            image_de1.setVisible(false);
                        }
                    
                        //on ajoute à sa position les numéros du dé lancé obtenus
                        pos_pion1_case_en_cours += num;
                        //mise à jour de la position du joueur sur le plateau p
                        j_en_cours.setPosition(pos_pion1_case_en_cours);
                        deux_des_lances +=1;
                    
                    if(deux_des_lances == 2){//cas où le joueur a lancé les deux dés
                        num_temp = 0;// on réinitialise num_temp
                        
                        if(pos_pion1_case_en_cours >= Liste_coords_x.length-1){
                            //on est dans le cas si la position du joueur a dépassé 40 (40 cases au max sur le plateau)
                            pos_pion1_case_en_cours -= 40;// on réinitialise sa position (passage par la case départ)
                            if(pos_pion1_case_en_cours == 0){
                                //animation du déplacement horizontal
                                timers(pos_pion1_case_en_cours, image_pion_en_cours, 8, i, j_en_cours);
                            }
                            else{
                                //animation du déplacement bas puis gauche
                                timers(pos_pion1_case_en_cours, image_pion_en_cours, 9, i, j_en_cours);
                            }
                        }
                        
                        //quand le joueur a une position inférieure à 40
                        else{
                            //récupération des données
                            int pos_coords_case_x =Liste_coords_x[pos_pion1_case_en_cours];
                            int pos_coords_case_y =Liste_coords_y[pos_pion1_case_en_cours];
                            int pos_coords_player_actuelle_x = (int) Liste_X.get(i);
                            int pos_coords_player_actuelle_y = (int) Liste_Y.get(i);
                            
                            //animations des autres déplacements sur le plateau
                            if(pos_coords_player_actuelle_x > pos_coords_case_x && pos_coords_player_actuelle_y == pos_coords_case_y){
                                timers(pos_pion1_case_en_cours, image_pion_en_cours, 1, i, j_en_cours);
                            }
                            else if(pos_coords_player_actuelle_x > pos_coords_case_x && pos_coords_player_actuelle_y > pos_coords_case_y){
                                timers(pos_pion1_case_en_cours, image_pion_en_cours, 2, i, j_en_cours);
                            
                            }
                            else if(pos_coords_player_actuelle_x == pos_coords_case_x && pos_coords_player_actuelle_y > pos_coords_case_y){
                                timers(pos_pion1_case_en_cours, image_pion_en_cours, 3, i, j_en_cours);
                            }
                            else if(pos_coords_player_actuelle_x < pos_coords_case_x && pos_coords_player_actuelle_y > pos_coords_case_y){
                                timers(pos_pion1_case_en_cours, image_pion_en_cours, 4, i, j_en_cours);
                            }
                            else if(pos_coords_player_actuelle_x < pos_coords_case_x && pos_coords_player_actuelle_y == pos_coords_case_y){
                                timers(pos_pion1_case_en_cours, image_pion_en_cours, 5, i, j_en_cours);
                            }
                            else if(pos_coords_player_actuelle_x < pos_coords_case_x && pos_coords_player_actuelle_y < pos_coords_case_y){
                                timers(pos_pion1_case_en_cours, image_pion_en_cours, 6, i, j_en_cours);
                            }
                            else if(pos_coords_player_actuelle_x == pos_coords_case_x && pos_coords_player_actuelle_y < pos_coords_case_y){
                                timers(pos_pion1_case_en_cours, image_pion_en_cours, 7, i, j_en_cours);
                            }
                           
                        }
                        //Partie purement affichage des positions actuelles des joueurs
                        deux_des_lances =0;
                        j_en_cours.setPosition(pos_pion1_case_en_cours);
                        Debug.setText("<html> Case actuelle du joueur 1: <font color = orange><font size='+1'><B>" + pos_pion1_case_en_cours +"</B></font></html>");
                        
                        
                        //Changement de joueur
                        int tour_actuel = p.getJoueur_actuel();
                        if(tour_actuel +1 == Liste_joueurs.size()){
                            p.setJoueur_actuel(0);
                            }
                        else{
                            p.setJoueur_actuel(tour_actuel +1);
                        }
                    }
                }
            }
        }
        });
        
        
        /*Superposition des images les unes sur les autres dans le plateau*/
        layeredpane.setBounds(0, 0, image_plateau.getMaximumSize().height, image_plateau.getMaximumSize().width);
        layeredpane.add(image_plateau, Integer.valueOf(0));
        layeredpane.add(image_de1, Integer.valueOf(1));
        layeredpane.add(image_de2, Integer.valueOf(1));
        layeredpane.add(image_de3, Integer.valueOf(1));
        layeredpane.add(image_de4, Integer.valueOf(1));
        layeredpane.add(image_de5, Integer.valueOf(1));
        layeredpane.add(image_de6, Integer.valueOf(1));
        layeredpane.add(image_logo, Integer.valueOf(1));
        for(int superpos = 0; superpos <= Liste_image.size()-1; superpos ++){
            layeredpane.add((JLabel)Liste_image.get(superpos), Integer.valueOf(1));
        }
        layeredpane.add(chiffre_dé, Integer.valueOf(1));
        layeredpane.add(num_obt, Integer.valueOf(1));
        layeredpane.add(Coords, Integer.valueOf(1));
        layeredpane.add(Crédits, Integer.valueOf(1));
        layeredpane.add(Debug, Integer.valueOf(1));
        layeredpane.add(Debug2, Integer.valueOf(1));
        layeredpane.add(DebugMode, Integer.valueOf(2));
        layeredpane.add(button_carte_chance, Integer.valueOf(1));
        layeredpane.add(button_caisse_communauté, Integer.valueOf(1));
        layeredpane.add(num_obt2, Integer.valueOf(1));
        
        
        /*Integration des layer & textes dans le jframe*/
        add(layeredpane, BorderLayout.CENTER);
        
        /*Configuration de la fenêtre (ici le plateau Monopoly) par défaut*/
        setLayout(new BorderLayout());
        setSize(669, 692);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        
        /*coordonnées x, y de la fenêtre en temps réel de la souris*/
        addMouseMotionListener(new MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent e) {//partie non utilisée
            }

            @Override
            public void mouseMoved(MouseEvent e) {//détection du mouvement de la souris
                Coords.setText("<html><B>"+s2+ Integer.toString(e.getX()-7) + ", " +Integer.toString(e.getY()-30)+"</B></html>");//recalibrage
            }
        });
        

        /*message de confirmation de fermeture du jeu*/
        addWindowListener( 
            new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent we){
                    String ObjButtons[] = {"Yes", "No"};
                    int PromptResult = JOptionPane.showOptionDialog(null, "Êtes-vous sûr de quitter le JEU?", "Attention", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons, ObjButtons[1]);
                    if (PromptResult == JOptionPane.YES_OPTION) {
                        dispose();
                        } else {
                            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                        }
                    }
                }
            );
    }

    //méthode qui cherche où se trouve le pion et affiche le contenu de la case sur laquelle il se trouve

    /**
     *
     * @param pos_pion
     * @param j
     * @param image
     * @param num_joueur_en_cours
     */
    public void chercher(int pos_pion, Joueur j, JLabel image, int num_joueur_en_cours){
        /*Affichage contenu des cases*/
        switch (pos_pion) {
            case 1://case départ
                {
                if(p.verif_appartenance_case_vide(j)){//vérification de l'appartenance de la case (si elle appartient à un joueur ou non)
                    Acheter_Terrain Ach_terrain = new Acheter_Terrain(p, j);//affichage de l'interface graphique "Acheter_Terrain"
                    break;}
                else{//si elle appartient à quelqu'un alors on lui fait payer le montant du loyer
                    p.getCase(1).actionCase(j, p);//paiement du loyer
                    Payer_Loyer payer_loyer = new Payer_Loyer(j, p);//interface d'affichage
                    break;
                }
                }
            case 2:{//carte caisse de communauté
                //mise à jour des données
                joueur_actuel = j;
                image_actuelle = image;
                num_jactuel = num_joueur_en_cours;
                button_caisse_communauté.setEnabled(true);//on active la possibilité d'appuyer sur la caisse de communauté
                break;}
            case 3://terrain
                {
                if(p.verif_appartenance_case_vide(j)){
                    Acheter_Terrain Ach_terrain = new Acheter_Terrain(p, j);
                    break;}
                else{
                    p.getCase(3).actionCase(j, p);
                    Payer_Loyer payer_loyer = new Payer_Loyer(j, p);
                    break;
                }
                }
            case 4:{//case impôts
                Impot impot = new Impot(j);
                break;
            }
            case 5://case gare
                {
                Acheter_Gare Ach_gare = new Acheter_Gare(p.getCase(5), j);
                break;
                }
            case 6:
                {
                if(p.verif_appartenance_case_vide(j)){
                    Acheter_Terrain Ach_terrain = new Acheter_Terrain(p, j);
                    break;}
                else{
                    p.getCase(6).actionCase(j, p);
                    Payer_Loyer payer_loyer = new Payer_Loyer(j, p);
                    break;
                }
                }
            case 7:{
                joueur_actuel = j;
                image_actuelle = image;
                num_jactuel = num_joueur_en_cours;
                button_carte_chance.setEnabled(true);
                break;}
            case 8:
                {
                if(p.verif_appartenance_case_vide(j)){
                    Acheter_Terrain Ach_terrain = new Acheter_Terrain(p, j);
                    break;}
                else{
                    p.getCase(8).actionCase(j, p);
                    Payer_Loyer payer_loyer = new Payer_Loyer(j, p);
                    break;
                }
                }
            case 9:
                {
                if(p.verif_appartenance_case_vide(j)){
                    Acheter_Terrain Ach_terrain = new Acheter_Terrain(p, j);
                    break;}
                else{
                    p.getCase(9).actionCase(j, p);
                    Payer_Loyer payer_loyer = new Payer_Loyer(j, p);
                    break;
                }
                }
            case 10:
                break;
            case 11:
                {
                if(p.verif_appartenance_case_vide(j)){
                    Acheter_Terrain Ach_terrain = new Acheter_Terrain(p, j);
                    break;}
                else{
                    p.getCase(11).actionCase(j, p);
                    Payer_Loyer payer_loyer = new Payer_Loyer(j, p);
                    break;
                }
                }
            case 12:
                {
                if(p.verif_appartenance_case_vide(j)){
                    Acheter_Terrain Ach_terrain = new Acheter_Terrain(p, j);
                    break;}
                else{
                    p.getCase(12).actionCase(j, p);
                    Payer_Loyer payer_loyer = new Payer_Loyer(j, p);
                    break;
                }
                }
            case 13:
                {
                if(p.verif_appartenance_case_vide(j)){
                    Acheter_Terrain Ach_terrain = new Acheter_Terrain(p, j);
                    break;
                }
                else{
                    p.getCase(13).actionCase(j, p);
                    Payer_Loyer payer_loyer = new Payer_Loyer(j, p);
                    break;
                }
                }
            case 14:
                {
                if(p.verif_appartenance_case_vide(j)){
                    Acheter_Terrain Ach_terrain = new Acheter_Terrain(p, j);
                    break;
                }
                else{
                    p.getCase(14).actionCase(j, p);
                    Payer_Loyer payer_loyer = new Payer_Loyer(j, p);
                    break;
                }
                }
            case 15:
                {
                Acheter_Gare Ach_gare = new Acheter_Gare(p.getCase(15), j);
                break;
            }
            case 16:
                {
                if(p.verif_appartenance_case_vide(j)){
                    Acheter_Terrain Ach_terrain = new Acheter_Terrain(p, j);
                    break;
                }
                else{
                    p.getCase(16).actionCase(j, p);
                    Payer_Loyer payer_loyer = new Payer_Loyer(j, p);
                    break;
                }
                }
            case 17:{
                joueur_actuel = j;
                image_actuelle = image;
                num_jactuel = num_joueur_en_cours;
                button_caisse_communauté.setEnabled(true);
                break;}
            case 18:
                {
                if(p.verif_appartenance_case_vide(j)){
                    Acheter_Terrain Ach_terrain = new Acheter_Terrain(p, j);
                    break;
                }
                else{
                    p.getCase(18).actionCase(j, p);
                    Payer_Loyer payer_loyer = new Payer_Loyer(j, p);
                    break;
                }
                }
            case 19:
                {
                if(p.verif_appartenance_case_vide(j)){
                    Acheter_Terrain Ach_terrain = new Acheter_Terrain(p, j);
                    break;
                }
                else{
                    p.getCase(19).actionCase(j, p);
                    Payer_Loyer payer_loyer = new Payer_Loyer(j, p);
                    break;
                }
                }
            case 20:{
                Parc parc = new Parc();
                break;
            }
            case 21:
                {
                if(p.verif_appartenance_case_vide(j)){
                    Acheter_Terrain Ach_terrain = new Acheter_Terrain(p, j);
                    break;
                }
                else{
                    p.getCase(21).actionCase(j, p);
                    Payer_Loyer payer_loyer = new Payer_Loyer(j, p);
                    break;
                }
                }
            case 22:{
                joueur_actuel = j;
                image_actuelle = image;
                num_jactuel = num_joueur_en_cours;
                button_carte_chance.setEnabled(true);
                break;}
            case 23:
                {
                if(p.verif_appartenance_case_vide(j)){
                    Acheter_Terrain Ach_terrain = new Acheter_Terrain(p, j);
                    break;
                }
                else{
                    p.getCase(23).actionCase(j, p);
                    Payer_Loyer payer_loyer = new Payer_Loyer(j, p);
                    break;
                }
                }
            case 24:
                {
                if(p.verif_appartenance_case_vide(j)){
                    Acheter_Terrain Ach_terrain = new Acheter_Terrain(p, j);
                    break;
                }
                else{
                    p.getCase(24).actionCase(j, p);
                    Payer_Loyer payer_loyer = new Payer_Loyer(j, p);
                    break;
                }
                }
            case 25:
                {
                Acheter_Gare Ach_gare = new Acheter_Gare(p.getCase(25), j);
                break;
                }
            case 26:
                {
                if(p.verif_appartenance_case_vide(j)){
                    Acheter_Terrain Ach_terrain = new Acheter_Terrain(p, j);
                    break;
                }
                else{
                    p.getCase(26).actionCase(j, p);
                    Payer_Loyer payer_loyer = new Payer_Loyer(j, p);
                    break;
                }
                }
            case 27:
                {
                if(p.verif_appartenance_case_vide(j)){
                    Acheter_Terrain Ach_terrain = new Acheter_Terrain(p, j);
                    break;
                }
                else{
                    p.getCase(27).actionCase(j, p);
                    Payer_Loyer payer_loyer = new Payer_Loyer(j, p);
                    break;
                }
                }
            case 28:
                {
                Compagnie compagnie = new Compagnie(p.getCase(28), j);
                break;
            }
            case 29:
                {
                if(p.verif_appartenance_case_vide(j)){
                    Acheter_Terrain Ach_terrain = new Acheter_Terrain(p, j);
                    break;
                }
                else{
                    p.getCase(29).actionCase(j, p);
                    Payer_Loyer payer_loyer = new Payer_Loyer(j, p);
                    break;
                }
                }
            case 30:{
                Prison prison = new Prison();
                j.setPosition(10);
                image.setLocation(Liste_coords_x[10], Liste_coords_y[10]);
                p.getListe_X().set(num_joueur_en_cours, Liste_coords_x[10]);
                p.getListe_Y().set(num_joueur_en_cours, Liste_coords_y[10]);
                break;}
            case 31:
                {
                if(p.verif_appartenance_case_vide(j)){
                    Acheter_Terrain Ach_terrain = new Acheter_Terrain(p, j);
                    break;
                }
                else{
                    p.getCase(31).actionCase(j, p);
                    Payer_Loyer payer_loyer = new Payer_Loyer(j, p);
                    break;
                }
                }
            case 32:
                {
                if(p.verif_appartenance_case_vide(j)){
                    Acheter_Terrain Ach_terrain = new Acheter_Terrain(p, j);
                    break;
                }
                else{
                    p.getCase(32).actionCase(j, p);
                    Payer_Loyer payer_loyer = new Payer_Loyer(j, p);
                    break;
                }
                }
            case 33:{
                joueur_actuel = j;
                image_actuelle = image;
                num_jactuel = num_joueur_en_cours;
                button_caisse_communauté.setEnabled(true);
                break;}
            case 34:
                {
                if(p.verif_appartenance_case_vide(j)){
                    Acheter_Terrain Ach_terrain = new Acheter_Terrain(p, j);
                    break;
                }
                else{
                    p.getCase(34).actionCase(j, p);
                    Payer_Loyer payer_loyer = new Payer_Loyer(j, p);
                    break;
                }
                }
            case 35:
                {
                Acheter_Gare Ach_gare = new Acheter_Gare(p.getCase(35), j);
                break;
            }
            case 36:{
                joueur_actuel = j;
                image_actuelle = image;
                button_carte_chance.setEnabled(true);
                break;}
            case 37:
                {
                if(p.verif_appartenance_case_vide(j)){
                    Acheter_Terrain Ach_terrain = new Acheter_Terrain(p, j);
                    break;
                }
                else{
                    p.getCase(37).actionCase(j, p);
                    Payer_Loyer payer_loyer = new Payer_Loyer(j, p);
                    break;
                }
                }
            case 38:
                {
                Taxe taxe = new Taxe(p.getCase(38), j);
                break;}
            case 39:
                {
                if(p.verif_appartenance_case_vide(j)){
                    Acheter_Terrain Ach_terrain = new Acheter_Terrain(p, j);
                    break;
                }
                else{
                    p.getCase(39).actionCase(j, p);
                    Payer_Loyer payer_loyer = new Payer_Loyer(j, p);
                    break;
                }
                }
            case 40:
                Case_Depart CaseDep = new Case_Depart();
                break;
            default:
                break;
            }
        }
    
    
    
    
    
    Carte_Com com;
    Carte_Chance c;
    
    /*Configuration de tous les boutons*/

    /**
     *
     * @param e
     */

    @Override
    public void actionPerformed(ActionEvent e) {

        //bouton du mode debug (accès uniquement aux développeurs)
        if(e.getSource() == DebugMode){
            DebugMode b = new DebugMode(p);
            DebugMode.setEnabled(false);
        }

        //bouton carte chance (image)
        else if(e.getSource() == button_carte_chance){
            ArrayList paquet = Carte_Chance.creation();//création des cartes chances
            Carte_Chance carte_chance_top = (Carte_Chance) paquet.get(0);//on retire la première carte
            paquet.remove(0);//on l'enlève de la pioche
            Chance ch = new Chance(carte_chance_top);//on en met à la place une nouvelle
            button_carte_chance.setEnabled(false);// on désactive le bouton
            paquet.add(carte_chance_top);
            
            //types de cartes chances 
            if (carte_chance_top.getType()==1){
                if (carte_chance_top.getChiffre() >=0 ){
                    joueur_actuel.recevoir(carte_chance_top.getChiffre());//reçoit de l'argent
                    }
                else{
                    joueur_actuel.payer(-carte_chance_top.getChiffre());//payer le montant
                    }
                }
            if (carte_chance_top.getType()==2){
                if (joueur_actuel.getPosition() >= carte_chance_top.getChiffre()){
                    int dollar = joueur_actuel.getPorteMonnaie(); //reçoit de l'argent
                    joueur_actuel.setPorteMonnaie(dollar + 200);
                    int nouvelle_position = carte_chance_top.getChiffre();//déplacement du pion 
                    joueur_actuel.setPosition(nouvelle_position);
                    p.getListe_X().set(num_jactuel, Liste_coords_x[nouvelle_position]);//mise à jour des coordonnées
                    p.getListe_Y().set(num_jactuel, Liste_coords_y[nouvelle_position]);
                    int pos_pion1_case = nouvelle_position;
                    image_actuelle.setLocation(Liste_coords_x[nouvelle_position], Liste_coords_y[nouvelle_position]);
                    //affichage de textes
                    Debug.setText("<html> Case actuelle du joueur 1: <font color = orange><font size='+1'><B>" + nouvelle_position +"</B></font></html>");
                }
                else{
                    int nouvelle_position = carte_chance_top.getChiffre();
                    joueur_actuel.setPosition(nouvelle_position);//déplacement pion
                    p.getListe_X().set(num_jactuel, Liste_coords_x[nouvelle_position]);
                    p.getListe_Y().set(num_jactuel, Liste_coords_y[nouvelle_position]);
                    image_actuelle.setLocation(Liste_coords_x[nouvelle_position], Liste_coords_y[nouvelle_position]);
                    int pos_pion1_case = nouvelle_position;
                    //affichage de textes
                    Debug.setText("<html> Case actuelle du joueur 1: <font color = orange><font size='+1'><B>" + nouvelle_position +"</B></font></html>");
                }
                }
            if (carte_chance_top.getType()==3){
                int nouvelle_position = joueur_actuel.getPosition()-3;//le pion recule de 3 cases
                joueur_actuel.setPosition(nouvelle_position);
                p.getListe_X().set(num_jactuel, Liste_coords_x[nouvelle_position]);
                p.getListe_Y().set(num_jactuel, Liste_coords_y[nouvelle_position]);
                int pos_pion1_case = nouvelle_position;
                image_actuelle.setLocation(Liste_coords_x[nouvelle_position], Liste_coords_y[nouvelle_position]);
                Debug.setText("<html> Case actuelle du joueur 1: <font color = orange><font size='+1'><B>" + nouvelle_position +"</B></font></html>");
            }
        }
        
        //bouton caisse de communauté
        else if(e.getSource() == button_caisse_communauté){
            //même principe que les cartes chances
            ArrayList paquetcom = Carte_Com.creationcom();
            Carte_Com carte_com_top = (Carte_Com) paquetcom.get(0);
            paquetcom.remove(0);
            CC caisse_commu = new CC(carte_com_top);
            button_caisse_communauté.setEnabled(false);
            paquetcom.add(carte_com_top);
            
            //types de cartes caisses communauté
            if (carte_com_top.getType()==1){
                if (carte_com_top.getChiffre() >=0 ){
                    joueur_actuel.recevoir(carte_com_top.getChiffre());//reçoit de l'argent
                }
                else{
                    joueur_actuel.payer(-carte_com_top.getChiffre());//perd de l'argent
                }
            }
            if (carte_com_top.getType()==2){
                int n = p.nbJoueur();
                joueur_actuel.recevoir(n*10);
                ArrayList<Joueur> l = p.getListeJoueur();
                for (int i=0; i<n; i++){//autres joueurs doivent telles sommes à un joueur
                    l.get(i).payer(10);
                }
            }
            if (carte_com_top.getType()==3){//déplacement du pion
                joueur_actuel.setPosition(10);
                image_actuelle.setLocation(Liste_coords_x[10], Liste_coords_y[10]);
                p.getListe_X().set(num_jactuel, Liste_coords_x[10]);
                p.getListe_Y().set(num_jactuel, Liste_coords_y[10]);
                Debug.setText("<html> Case actuelle du joueur 1: <font color = orange><font size='+1'><B>" + 10 +"</B></font></html>");
            }
        }
    }
}

