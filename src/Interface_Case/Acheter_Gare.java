/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface_Case;

import javax.swing.ImageIcon;
import Cases.*;
import Monopoly_Sur_Console.Joueur;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author belkh
 */
public class Acheter_Gare extends javax.swing.JFrame {


    Joueur j;
    ImageIcon image_gare = new ImageIcon("gare.jpg");   
    Case c;
    JLabel image_imagegare= new JLabel(image_gare);
    
    /**
     * Creates new form Acheter_Gare
     * @param c
     * @param j
     */
    public Acheter_Gare(Case c, Joueur j) {
        initComponents();
        this.c = c;
        this.j = j;
        
        
        setVisible(true);
        setLayout(new BorderLayout());
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        nom_gare.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titre.setText("<html><font color = red><font size = '+2'><B>"+c.getNom());
        photo.setIcon(image_gare);
        photo.setText("");
        prix.setText("<html>Prix de la gare : "+"<font color = red ><font size = '+1'><B>"+c.getPrix()+"€</B></font><html>");
        bourse.setText("<html>Argent restant au joueur : "+"<font color = red ><font size = '+1'><B>"+j.getPorteMonnaie()+"€</B></font><html>");
        Clicklistener click = new Clicklistener();
        oui.addActionListener(click);
        non.addActionListener(click);
    
        image_imagegare.setSize(image_imagegare.getPreferredSize());
    
    }

    /**
     *
     */
    public class Clicklistener implements ActionListener
  {

        /**
         *
         * @param e
         */
        @Override
    public void actionPerformed(ActionEvent e)
    {
      if (e.getSource() == oui)
      {
        Achete ach = new Achete("cette gare");
        int paye = c.getPrix();
        j.payer(paye);
        dispose();
      }

      if (e.getSource() == non)
      {
        dispose();
      }
    }

  }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titre = new javax.swing.JLabel();
        photo = new javax.swing.JLabel();
        nom_gare = new javax.swing.JLabel();
        oui = new javax.swing.JToggleButton();
        non = new javax.swing.JToggleButton();
        prix = new javax.swing.JLabel();
        bourse = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titre.setText("Nom de la Gare");

        photo.setText("            Voulez-vous aquérir cette gare ?");

        nom_gare.setText("GARE");

        oui.setText("OUI");
        oui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ouiActionPerformed(evt);
            }
        });

        non.setText("NON");

        prix.setText("Prix de la gare : ...€");

        bourse.setText("Argent restant au joueur : ...€");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(nom_gare, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prix, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bourse, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(oui)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(non))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(photo, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nom_gare)
                .addGap(4, 4, 4)
                .addComponent(titre, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(prix, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bourse, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oui)
                            .addComponent(non))
                        .addGap(68, 68, 68))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ouiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ouiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ouiActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bourse;
    private javax.swing.JLabel nom_gare;
    private javax.swing.JToggleButton non;
    private javax.swing.JToggleButton oui;
    private javax.swing.JLabel photo;
    private javax.swing.JLabel prix;
    private javax.swing.JLabel titre;
    // End of variables declaration//GEN-END:variables
}
