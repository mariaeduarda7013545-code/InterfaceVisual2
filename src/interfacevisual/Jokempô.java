/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfacevisual;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author 929688
 */
public class Jokempô extends javax.swing.JFrame {

    
    public Jokempô() {
        initComponents();
    }

    int opcao = 0;
    String nome = "";
    int computador = -10;
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        rbPedra = new javax.swing.JRadioButton();
        rbPapel = new javax.swing.JRadioButton();
        rbTesoura = new javax.swing.JRadioButton();
        btnJogar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jokempô");
        setBackground(new java.awt.Color(0, 255, 255));

        buttonGroup1.add(rbPedra);
        rbPedra.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        rbPedra.setForeground(new java.awt.Color(0, 0, 0));
        rbPedra.setText("Pedra");

        buttonGroup1.add(rbPapel);
        rbPapel.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        rbPapel.setForeground(new java.awt.Color(0, 0, 0));
        rbPapel.setText("Papel");

        buttonGroup1.add(rbTesoura);
        rbTesoura.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        rbTesoura.setForeground(new java.awt.Color(0, 0, 0));
        rbTesoura.setText("Tesoura");

        btnJogar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnJogar.setForeground(new java.awt.Color(0, 0, 0));
        btnJogar.setText("Jogar");
        btnJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Jokempô Game");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rbPedra)
                                .addComponent(rbPapel)
                                .addComponent(rbTesoura))
                            .addComponent(btnJogar))))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(rbPedra)
                .addGap(18, 18, 18)
                .addComponent(rbPapel)
                .addGap(18, 18, 18)
                .addComponent(rbTesoura)
                .addGap(36, 36, 36)
                .addComponent(btnJogar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogarActionPerformed
     
        if(rbPedra.isSelected()){
          opcao = 0;
          nome  = "Pedra";
        }else if(rbPapel.isSelected()){
            opcao = 1;
            nome = "Papel";
        }else if(rbTesoura.isSelected()){
            opcao = 2;
            nome = "Tesoura";
        }      
        
        Random r = new Random();
        computador = r.nextInt(3);
    //    computador = 1;
        
        if(opcao == computador){
            JOptionPane.showMessageDialog(null, "Empate!");
        }else if(opcao == 0 && computador == 1){
            JOptionPane.showMessageDialog(null, "Computador é o vencedor!");
        }else if(opcao == 1 && computador == 0){
            JOptionPane.showMessageDialog(null, "Jogador é o vencedor!");
        }else if(opcao == 0 && computador == 2){
            JOptionPane.showMessageDialog(null, "Jogador é o vencedor!");
        }else{
            JOptionPane.showMessageDialog(null, "Computador é o vencedor!");
        }
        
    }//GEN-LAST:event_btnJogarActionPerformed
    
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jokempô.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jokempô.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jokempô.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jokempô.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jokempô().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJogar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton rbPapel;
    private javax.swing.JRadioButton rbPedra;
    private javax.swing.JRadioButton rbTesoura;
    // End of variables declaration//GEN-END:variables
}
