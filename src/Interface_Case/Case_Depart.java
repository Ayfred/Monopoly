/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface_Case;

import Monopoly_Sur_Console.Joueur;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author belkh
 */
public class Case_Depart extends javax.swing.JFrame {

    ImageIcon depart = new ImageIcon("case-depart.jpg");
    Joueur j;
    JLabel image_imagedepart= new JLabel(depart);
    /**
     * Creates new form Case_Depart
     */
    public Case_Depart() {
        initComponents();
        this.setLocationRelativeTo(null);
        case_depart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        case_depart.setIcon(depart);
        image_imagedepart.setSize(image_imagedepart.getPreferredSize());
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
        case_depart = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titre.setText("CASE DEPART");

        case_depart.setText("Vous passez par la case départ, vous touchez 200€");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titre, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(case_depart, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titre, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(case_depart, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel case_depart;
    private javax.swing.JLabel titre;
    // End of variables declaration//GEN-END:variables
}
