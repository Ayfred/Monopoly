/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface_Case;
import Monopoly_Sur_Console.Joueur;
import java.awt.FontMetrics;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author belkh
 */
public class Chance extends javax.swing.JFrame {
    
    ImageIcon image_chance = new ImageIcon("chance.jpg");   
    Carte_Chance c;
    Joueur joueur;
    JLabel image_imagechance= new JLabel(image_chance);
    /**
     * Creates new form Chance
     * @param c
     */
    public Chance(Carte_Chance c) {
        initComponents();
        setVisible(true);
        setLayout(new BorderLayout());
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        FontMetrics metrics = chance.getFontMetrics(chance.getFont());
        //On récupère la largeur du message du JLabel
        chance.setText(c.getCommentaire());
        st.setText(c.getTitre());
        st.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chance.setIcon(image_chance);
        int messageWidth = metrics.stringWidth(chance.getText());
        chance.setSize(600,120); // Hauteur arbitraire de 50
        int messageWidth2 = metrics.stringWidth(st.getText());
        st.setSize(messageWidth2,50); // Hauteur arbitraire de 50
        this.c = c;
        image_imagechance.setSize(image_imagechance.getPreferredSize());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        chance = new javax.swing.JLabel();
        st = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CARTE CHANCE");

        chance.setText("Modifier le Texte");

        st.setText("Sous-titre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(chance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(st, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(st, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chance, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel st;
    // End of variables declaration//GEN-END:variables
}
