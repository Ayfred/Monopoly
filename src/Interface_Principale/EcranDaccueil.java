/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates   
 * and open the template in the editor.
 */
package Interface_Principale;

import Construction_Plateau.PlateauMonopoly;
import Monopoly_Sur_Console.Joueur;
import Monopoly_Sur_Console.Plateau;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.DefaultFormatter;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
/**
 *
 * @author maxime.mines-ales
 */
public class EcranDaccueil extends javax.swing.JFrame {
    
    
    ImageIcon imagem = new ImageIcon("Qrcode.jpg");
    JLabel image_imagem= new JLabel(imagem);
    
    ImageIcon imagelog = new ImageIcon("ml3.jpg");
    JLabel image_imagelog= new JLabel(imagelog);
    Joueur j;
    //PlateauMonopoly PM = new PlateauMonopoly();
    Plateau plateau = new Plateau();
    int value_nb_joueur;
    PlateauMonopoly pm = new PlateauMonopoly(plateau);
    int nbJoueur = plateau.nbJoueur();
    ArrayList<Joueur> temporaire = plateau.getListeJoueur();
    
    /**
     *
     */
    public EcranDaccueil() {
        
        initComponents();
        
        setTitle("Monopoly v1.0");
        /*Configuration fenêtre par défaut*/
        setLayout(new BorderLayout());
        setResizable(false);
        setVisible(true);
        getContentPane().setBackground(Color.pink);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        Image Qrcode1 = imagem.getImage();
        Image Qrcode2 = Qrcode1.getScaledInstance(150, 185, Image.SCALE_SMOOTH);
        ImageIcon image_qrcode = new ImageIcon(Qrcode2);
        Qrcode.setIcon(image_qrcode);
        
        
        logo.setIcon(imagelog);
        //texte d'introduction
        changelog_detail.setText("<html> <font color='red'><font size='+2'><B>Bienvenue à toutes et à tous sur la toute nouvelle version de Monopoly </B></font></html>");
        
        //intégration d'un joueur car 1 joueur au minimum pour faire fonctionner le jeu
        plateau.addPlayer(new Joueur("<html><B>player "+ Integer.toString(1), 0, plateau));
        
        
        //configuration par défaut du spinner
        JComponent comp = nb_de_joueurs_spinner.getEditor();
        JFormattedTextField field = (JFormattedTextField) comp.getComponent(0);
        DefaultFormatter formatter = (DefaultFormatter) field.getFormatter();
        formatter.setCommitsOnValidEdit(true);
        
        //au moment où le nombre change sur le spinner la méthode stateChanged se lance
        nb_de_joueurs_spinner.addChangeListener(new ChangeListener() {
            
            @Override
            public void stateChanged(ChangeEvent e) {
                value_nb_joueur = (int) nb_de_joueurs_spinner.getValue();
                plateau.clearJoueur();
                for(int i =0; i<value_nb_joueur; i++){
                    plateau.addPlayer(new Joueur("player "+ Integer.toString(i+1), i, plateau));
                }
            }
        });
        
        //Construction du plateau avec les 40 cases
        pm.construire();
        
        //Décoration
        Startgame.setBackground(Color.blue);
        Option.setBackground(Color.orange);
        Startgame.setText("<html><B><font color ='Purple'><font size= '+0.5'><font style=\"font-family:Arial\">START GAME</font></B></html>");
        Option.setText("<html><B><font color ='black'><font size= '+0.5'><font style=\"font-family:Arial\">Option</font></B></html>");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        Startgame = new javax.swing.JButton();
        version = new javax.swing.JLabel();
        changelog_detail = new javax.swing.JLabel();
        nb_de_joueurs_spinner = new javax.swing.JSpinner();
        nb_de_joueurs = new javax.swing.JLabel();
        Option = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Qrcode = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Startgame.setText("Start game");
        Startgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartgameActionPerformed(evt);
            }
        });

        version.setText("v1.0");

        changelog_detail.setText("jLabel1");

        nb_de_joueurs_spinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        nb_de_joueurs.setText("Nb de joueurs");

        Option.setText("Settings");
        Option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionActionPerformed(evt);
            }
        });

        jLabel1.setText("Created by Mayavale Group");

        Qrcode.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(changelog_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Option, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(nb_de_joueurs, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nb_de_joueurs_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(Startgame, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(32, 32, 32)
                                        .addComponent(Qrcode, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(16, 16, 16)))
                        .addComponent(version, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changelog_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nb_de_joueurs_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Startgame, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nb_de_joueurs, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Option, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 83, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Qrcode, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(version)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Bouton pour lancer le jeu
    private void StartgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartgameActionPerformed
        
        Interface_Plateau f = new Interface_Plateau(plateau);
        dispose();
        
    }//GEN-LAST:event_StartgameActionPerformed
    
    
    //Menu "settings" non fonctionnel
    private void OptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionActionPerformed
        Option.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLayeredPane layeredpane = new JLayeredPane();
    
                
                JComponent Goback = new JButton("Back");
                JComponent Affichage = new JLabel("Option menu");
                
                
                Goback.setSize(135, 25);
                Goback.setLocation(420, 547);
                Affichage.setSize(800, 800);
                Affichage.setLocation(420, 507);
                
                layeredpane.setBounds(0, 0, 800, 800);
                layeredpane.add(Affichage, Integer.valueOf(0));
                layeredpane.add(Goback, Integer.valueOf(1));
                getContentPane().add(layeredpane, BorderLayout.CENTER);
                
                revalidate();
                
            }
        });
    }//GEN-LAST:event_OptionActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EcranDaccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EcranDaccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EcranDaccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EcranDaccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //Faux écran de chargement avec Loading() pour rendre le jeu plus réaliste
        Loading L = new Loading();
        L.setVisible(true);
        try{
            for(int i =0; i<=100; i++){
                Thread.sleep(1);
                L.jLabel2.setText("<html><B>"+Integer.toString(i)+"%</B></html>");
                L.jProgressBar1.setValue(i);
                if(i == 100){
                    L.dispose();
                }
            }
        }
        catch(Exception e){
            }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EcranDaccueil().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Option;
    private javax.swing.JLabel Qrcode;
    private javax.swing.JButton Startgame;
    private javax.swing.JLabel changelog_detail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nb_de_joueurs;
    private javax.swing.JSpinner nb_de_joueurs_spinner;
    private javax.swing.JLabel version;
    // End of variables declaration//GEN-END:variables
}
