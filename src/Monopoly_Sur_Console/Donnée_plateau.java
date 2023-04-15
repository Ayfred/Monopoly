/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Monopoly_Sur_Console;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

/**
 *
 * @author maxime.mines-ales
 */
interface Donnée_plateau {
    
    /*Données plateau*/
    int x_taille_pion = 30;//taille des pions
    int y_taille_pion = 30;
        
    int x_casedépart = 600;//coordonnées case départ
    int y_casedépart = 600;
        
    int x_position_dé = 165;//coordonnées des dés
    int y_position_dé = 370;
        
    int x_pos_logo = 135;//coords logo
    int y_pos_logo = 150;
    
    /*définition des cases*/
    int[] Liste_coords_x = {600, 535, 480, 425, 370, 315, 260, 205, 150, 95, 30,
        30, 30, 30, 30, 30, 30, 30, 30, 30, 30,
        95, 150, 205, 260, 315, 370, 425, 480, 535, 600,
        600, 600, 600, 600, 600, 600, 600, 600, 600, 600};
    int[] Liste_coords_y = {600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 
        535, 480, 425, 370, 315, 260, 205, 150, 95, 30,
        30, 30, 30, 30, 30, 30, 30, 30, 30, 30,
        95, 150, 205, 260, 315, 370, 425, 480, 535, 600};
        
    /*importation des images*/
    
    ImageIcon plateau = new ImageIcon("plateau.png");
    JLabel image_plateau = new JLabel(plateau);
        
        
    ImageIcon de1 = new ImageIcon("de1.jpg");
    JLabel image_de1 = new JLabel(de1);
        
        
    ImageIcon de2 = new ImageIcon("de2.jpg");
    JLabel image_de2 = new JLabel(de2);
        
        
    ImageIcon de3 = new ImageIcon("de3.jpg");
    JLabel image_de3 = new JLabel(de3);
        
        
    ImageIcon de4 = new ImageIcon("de4.jpg");
    JLabel image_de4 = new JLabel(de4);
        
        
    ImageIcon de5 = new ImageIcon("de5.jpg");
    JLabel image_de5 = new JLabel(de5);
        
        
    ImageIcon de6 = new ImageIcon("de6.jpg");
    JLabel image_de6 = new JLabel(de6);
        
        
    ImageIcon logo = new ImageIcon("ml3.png");
    JLabel image_logo = new JLabel(logo);
    
    ImageIcon pion1s = new ImageIcon("pion1.jpg");
    Image pion1bis = pion1s.getImage();
    Image pion1bisr = pion1bis.getScaledInstance(x_taille_pion, y_taille_pion, Image.SCALE_SMOOTH);
    ImageIcon pion1 = new ImageIcon(pion1bisr);
    JLabel image_pion1 = new JLabel(pion1);
    
    ImageIcon pion2s = new ImageIcon("pion2.jpg");
    Image pion2bis = pion2s.getImage();
    Image pion2bisr = pion2bis.getScaledInstance(x_taille_pion, y_taille_pion, Image.SCALE_SMOOTH);
    ImageIcon pion2 = new ImageIcon(pion2bisr);
    JLabel image_pion2 = new JLabel(pion2);
    
    ImageIcon pion3s = new ImageIcon("pion3.jpg");
    Image pion3bis = pion3s.getImage();
    Image pion3bisr = pion3bis.getScaledInstance(x_taille_pion, y_taille_pion, Image.SCALE_SMOOTH);
    ImageIcon pion3 = new ImageIcon(pion3bisr);
    JLabel image_pion3 = new JLabel(pion3);
    
    ImageIcon pion4s = new ImageIcon("pion4.jpg");
    Image pion4bis = pion4s.getImage();
    Image pion4bisr = pion4bis.getScaledInstance(x_taille_pion, y_taille_pion, Image.SCALE_SMOOTH);
    ImageIcon pion4 = new ImageIcon(pion4bisr);
    JLabel image_pion4 = new JLabel(pion4);
    
    ImageIcon pion5s = new ImageIcon("pion5.jpg");
    Image pion5bis = pion5s.getImage();
    Image pion5bisr = pion5bis.getScaledInstance(x_taille_pion, y_taille_pion, Image.SCALE_SMOOTH);
    ImageIcon pion5= new ImageIcon(pion5bisr);
    JLabel image_pion5 = new JLabel(pion5);
    
    ImageIcon pion6s = new ImageIcon("pion6.jpg");
    Image pion6bis = pion6s.getImage();
    Image pion6bisr = pion6bis.getScaledInstance(x_taille_pion, y_taille_pion, Image.SCALE_SMOOTH);
    ImageIcon pion6 = new ImageIcon(pion6bisr);
    JLabel image_pion6 = new JLabel(pion6);
    
    ImageIcon pion7s = new ImageIcon("pion7.jpg");
    Image pion7bis = pion7s.getImage();
    Image pion7bisr = pion7bis.getScaledInstance(x_taille_pion, y_taille_pion, Image.SCALE_SMOOTH);
    ImageIcon pion7 = new ImageIcon(pion7bisr);
    JLabel image_pion7 = new JLabel(pion7);
    
    ImageIcon pion8s = new ImageIcon("pion8.jpg");
    Image pion8bis = pion8s.getImage();
    Image pion8bisr = pion8bis.getScaledInstance(x_taille_pion, y_taille_pion, Image.SCALE_SMOOTH);
    ImageIcon pion8 = new ImageIcon(pion8bisr);
    JLabel image_pion8 = new JLabel(pion8);
    
    ImageIcon pion9s = new ImageIcon("pion9.jpg");
    Image pion9bis = pion9s.getImage();
    Image pion9bisr = pion9bis.getScaledInstance(x_taille_pion, y_taille_pion, Image.SCALE_SMOOTH);
    ImageIcon pion9 = new ImageIcon(pion9bisr);
    JLabel image_pion9 = new JLabel(pion9);
    
    ImageIcon pion10s = new ImageIcon("pion10.jpg");
    Image pion10bis = pion10s.getImage();
    Image pion10bisr = pion10bis.getScaledInstance(x_taille_pion, y_taille_pion, Image.SCALE_SMOOTH);
    ImageIcon pion10 = new ImageIcon(pion10bisr);
    JLabel image_pion10 = new JLabel(pion10);
    
    
    
    
    /*1) Configuration du dé*/
    String s = "Cliquez sur le dé pour lancer";
    JLabel chiffre_dé = new JLabel(s);
    
    int num= 0;
        
    String s1 = "<html>Numéro obtenu: <font color = blue><B>" + Integer.toString(num) +"</B></font></html>";
    JLabel num_obt = new JLabel(s1);
    JLabel num_obt2 = new JLabel("<html>Somme obtenue: <font color = blue><B>" + Integer.toString(num) +"</B></font></html>");
    
    
    /*Coords*/
    int coords_x = 0;
    int coords_y = 0;
        
    String s2 = "Coords: ";
    JLabel Coords = new JLabel("<html><B>" +s2+ coords_x + ", " +coords_y+"</B></html>");
    
    /*Debug Mode*/
    int num_case1 = 0;
    //String s4 = "Debug Mode";
    JLabel Debug = new JLabel("<html> Case actuelle du joueur 1: <font color = orange><B>" + Integer.toString(num_case1) +"</B></font></html>");
    JLabel Debug2 = new JLabel("<html> Case actuelle du joueur 2: <font color = orange><B>" + Integer.toString(num_case1) +"</B></font></html>");
    
    /*Bouton*/
    JButton Passer_votre_tour = new JButton("Passer votre tour");
    JButton DebugMode = new JButton("Debug Mode");
    //JButton Button_de = new JButton();
    ImageIcon carte_chance = new ImageIcon("chance.jpg");
    JButton button_carte_chance = new JButton(carte_chance);
    JLabel image_carte_chance = new JLabel(carte_chance);
    
    ImageIcon caisse_communauté = new ImageIcon("communaute.jpg");
    JButton button_caisse_communauté = new JButton(caisse_communauté);
    JLabel image_caisse_communauté = new JLabel(caisse_communauté);
    
    
    
    JLayeredPane layeredpane = new JLayeredPane();
    
}
