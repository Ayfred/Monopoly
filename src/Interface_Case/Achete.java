/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface_Case;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author belkh
 */
public class Achete extends javax.swing.JFrame {
    
    String s;
    ImageIcon image_bravo = new ImageIcon("bravo.jpg");  
    JLabel image_imagebravo= new JLabel(image_bravo);
    
    /**
     * Creates new form Achete
     * @param s
     */
    public Achete(String s) {
        initComponents();
        setVisible(true);
        bravo.setText("BRAVO ! VOUS VENEZ D'ACHETER "+s+" !");
        bravo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setIcon(image_bravo);
        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setText("");
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        image_imagebravo.setSize(image_imagebravo.getPreferredSize());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bravo = new javax.swing.JLabel();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bravo.setText("BRAVO ! VOUS VENEZ D'ACHETER CE MAGNIFIQUE TERRAIN !");

        image.setText("image");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bravo, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
            .addComponent(image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(bravo)
                .addGap(18, 18, 18)
                .addComponent(image)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bravo;
    private javax.swing.JLabel image;
    // End of variables declaration//GEN-END:variables
}
