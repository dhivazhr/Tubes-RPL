/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author dhivazhr
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form HomeAplikasi
     */
    public Home() {
        initComponents();
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
        btnAdmin = new javax.swing.JButton();
        btnDekan = new javax.swing.JButton();
        btnKK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PERAK");

        btnAdmin.setText("Administrasi Keuangan");

        btnDekan.setText("Dekan");

        btnKK.setText("Ketua KK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(169, 169, 169)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(148, 148, 148)
                            .addComponent(btnAdmin)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnKK)
                            .addComponent(btnDekan))
                        .addGap(25, 25, 25)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addComponent(btnAdmin)
                .addGap(18, 18, 18)
                .addComponent(btnDekan)
                .addGap(26, 26, 26)
                .addComponent(btnKK)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public JButton getBtnAdmin() {
        return btnAdmin;
    }

    public JButton getBtnDekan() {
        return btnDekan;
    }

    public JButton getBtnKK() {
        return btnKK;
    }

    public void addListener(ActionListener ae) {
        btnAdmin.addActionListener(ae);
        btnDekan.addActionListener(ae);
        btnKK.addActionListener(ae);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnDekan;
    private javax.swing.JButton btnKK;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}