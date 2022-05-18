
package caixa;

import java.util.ArrayList;


public class TelaSaque extends javax.swing.JFrame {

    /**
     * Creates new form TelaPagamentos
     */
    public TelaSaque() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        valorFatura = new javax.swing.JTextField();
        caixaSelecaoBoleto = new javax.swing.JCheckBox();
        caixaSelecaoCartao = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        caixaSelecaoCheque = new javax.swing.JCheckBox();
        caixaSelecaoDinheiro = new javax.swing.JCheckBox();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Emitir Pagamento");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Valor da Fatura:");

        valorFatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorFaturaActionPerformed(evt);
            }
        });

        caixaSelecaoBoleto.setText("Boleto");
        caixaSelecaoBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaSelecaoBoletoActionPerformed(evt);
            }
        });

        caixaSelecaoCartao.setText("Cartão");

        jLabel2.setText("Forma de Pagamento:");

        caixaSelecaoCheque.setText("Cheque");
        caixaSelecaoCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaSelecaoChequeActionPerformed(evt);
            }
        });

        caixaSelecaoDinheiro.setText("Dinheiro");
        caixaSelecaoDinheiro.setToolTipText("");
        caixaSelecaoDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaSelecaoDinheiroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorFatura, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(caixaSelecaoCheque)
                            .addComponent(caixaSelecaoBoleto))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(caixaSelecaoCartao)
                            .addComponent(caixaSelecaoDinheiro)))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(valorFatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(caixaSelecaoBoleto)
                    .addComponent(caixaSelecaoCartao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixaSelecaoCheque)
                    .addComponent(caixaSelecaoDinheiro))
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valorFaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorFaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorFaturaActionPerformed

    private void caixaSelecaoBoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaSelecaoBoletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaSelecaoBoletoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                
       SaqueHandler n100 = new Nota100Handler();               

       ArrayList lista = new ArrayList();       
       lista.add(Nota100Handler.N100);

       n100.processHander(lista, Integer.parseInt(valorFatura.getText()));                       
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void caixaSelecaoChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaSelecaoChequeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaSelecaoChequeActionPerformed

    private void caixaSelecaoDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaSelecaoDinheiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaSelecaoDinheiroActionPerformed

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
            java.util.logging.Logger.getLogger(TelaSaque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSaque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSaque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSaque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSaque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox caixaSelecaoBoleto;
    private javax.swing.JCheckBox caixaSelecaoCartao;
    private javax.swing.JCheckBox caixaSelecaoCheque;
    private javax.swing.JCheckBox caixaSelecaoDinheiro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField valorFatura;
    // End of variables declaration//GEN-END:variables
}
