/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kriptografi;

/**
 *
 * @author maulv
 */
public class Polyalphabetik1key extends javax.swing.JFrame {

    /**
     * Creates new form Polyalphabetik1key
     */
    public Polyalphabetik1key() {
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

        jFrame1 = new javax.swing.JFrame();
        lblEnkripsi = new javax.swing.JLabel();
        eLblPlainText = new javax.swing.JLabel();
        eLblKunci = new javax.swing.JLabel();
        eLblChiperText = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        eInputPlainText = new javax.swing.JTextField();
        eInputKunci = new javax.swing.JTextField();
        eBtnEnkripsiCaesar = new javax.swing.JButton();
        eInputChiperText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        dLblChiperText = new javax.swing.JLabel();
        dLblKunci = new javax.swing.JLabel();
        dLblPlainText = new javax.swing.JLabel();
        dInputChiperText = new javax.swing.JTextField();
        dInputKunci = new javax.swing.JTextField();
        dBtnDekripsiCaesar = new javax.swing.JButton();
        dInputPlainText = new javax.swing.JTextField();
        lblPoly1Enkripsi = new javax.swing.JLabel();
        javax.swing.JTextField eInputPolyPlain1 = new javax.swing.JTextField();
        eLblPoly1Plain = new javax.swing.JLabel();
        eLblPoly1Kunci = new javax.swing.JLabel();
        eInputPolyKunci1 = new javax.swing.JTextField();
        eBtnPoly1Enkirpsi = new javax.swing.JButton();
        eLblPoly1Chiper = new javax.swing.JLabel();
        eInputPolyChiper1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblPoly1Dekripsi = new javax.swing.JLabel();
        dInputPolyPlain1 = new javax.swing.JTextField();
        dLblPoly1Plain = new javax.swing.JLabel();
        dLblPoly1Kunci = new javax.swing.JLabel();
        dInputPolyKunci1 = new javax.swing.JTextField();
        dBtnPoly1Dekripsi = new javax.swing.JButton();
        dInputPolyChiper1 = new javax.swing.JTextField();
        dLblPoly1Chiper = new javax.swing.JLabel();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEnkripsi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblEnkripsi.setText("Enkripsi Teknik Subtitusi");

        eLblPlainText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        eLblPlainText.setText("Plain Teks");

        eLblKunci.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        eLblKunci.setText("Pergeseran Kunci");

        eLblChiperText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        eLblChiperText.setText("Chiper Teks");

        eInputPlainText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eInputPlainTextActionPerformed(evt);
            }
        });

        eBtnEnkripsiCaesar.setText("Proses");
        eBtnEnkripsiCaesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eBtnEnkripsiCaesarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Dekripsi Teknik Subtitusi");

        dLblChiperText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dLblChiperText.setText("Chiper Teks");

        dLblKunci.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dLblKunci.setText("Pergeseran Kunci");

        dLblPlainText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dLblPlainText.setText("Plain Teks");

        dBtnDekripsiCaesar.setText("Proses");
        dBtnDekripsiCaesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dBtnDekripsiCaesarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEnkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eLblChiperText)
                    .addComponent(eLblPlainText)
                    .addComponent(eLblKunci))
                .addGap(22, 22, 22)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(eInputKunci, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eBtnEnkripsiCaesar)
                    .addComponent(eInputChiperText, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                    .addComponent(eInputPlainText))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(dLblChiperText)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel1))
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(dInputChiperText, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dLblKunci)
                            .addComponent(dLblPlainText))
                        .addGap(18, 18, 18)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dBtnDekripsiCaesar)
                            .addComponent(dInputKunci, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dInputPlainText))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEnkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eInputPlainText, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(eLblPlainText))
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eInputKunci, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(eLblKunci))
                .addGap(30, 30, 30)
                .addComponent(eBtnEnkripsiCaesar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eLblChiperText)
                    .addComponent(eInputChiperText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dInputChiperText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dLblChiperText))
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dLblKunci)
                    .addComponent(dInputKunci, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(dBtnDekripsiCaesar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dLblPlainText)
                    .addComponent(dInputPlainText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPoly1Enkripsi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPoly1Enkripsi.setText("Enkripsi Teknik Polyalphabetical");

        eInputPolyPlain1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eInputPolyPlain1ActionPerformed(evt);
            }
        });

        eLblPoly1Plain.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        eLblPoly1Plain.setText("Plain Teks");

        eLblPoly1Kunci.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        eLblPoly1Kunci.setText("Kunci1");

        eBtnPoly1Enkirpsi.setText("Proses");
        eBtnPoly1Enkirpsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eBtnPoly1EnkirpsiActionPerformed(evt);
            }
        });

        eLblPoly1Chiper.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        eLblPoly1Chiper.setText("Chiper Teks");

        lblPoly1Dekripsi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPoly1Dekripsi.setText("Dekripsi Teknik Polyalphabetical");

        dLblPoly1Plain.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dLblPoly1Plain.setText("Chiper Teks");

        dLblPoly1Kunci.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dLblPoly1Kunci.setText("Kunci1");

        dBtnPoly1Dekripsi.setText("Proses");
        dBtnPoly1Dekripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dBtnPoly1DekripsiActionPerformed(evt);
            }
        });

        dLblPoly1Chiper.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dLblPoly1Chiper.setText("Plain Teks");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eLblPoly1Chiper)
                            .addComponent(eLblPoly1Plain)
                            .addComponent(eLblPoly1Kunci))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eInputPolyKunci1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eBtnPoly1Enkirpsi)
                            .addComponent(eInputPolyChiper1)
                            .addComponent(eInputPolyPlain1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(lblPoly1Enkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dLblPoly1Kunci)
                                            .addComponent(dLblPoly1Chiper))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dBtnPoly1Dekripsi)
                                            .addComponent(dInputPolyKunci1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dInputPolyChiper1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dLblPoly1Plain)
                                        .addGap(18, 18, 18)
                                        .addComponent(dInputPolyPlain1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblPoly1Dekripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPoly1Enkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eInputPolyPlain1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(eLblPoly1Plain))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eInputPolyKunci1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(eLblPoly1Kunci))
                .addGap(30, 30, 30)
                .addComponent(eBtnPoly1Enkirpsi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eLblPoly1Chiper)
                    .addComponent(eInputPolyChiper1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPoly1Dekripsi)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dInputPolyPlain1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dLblPoly1Plain))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dLblPoly1Kunci)
                    .addComponent(dInputPolyKunci1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(dBtnPoly1Dekripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dLblPoly1Chiper)
                    .addComponent(dInputPolyChiper1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eInputPlainTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eInputPlainTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eInputPlainTextActionPerformed

    private void eBtnEnkripsiCaesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eBtnEnkripsiCaesarActionPerformed
        // TODO add your handling code here:
        CaesarSubtitution caesarSubtitution = CaesarSubtitution.getInstance();

        String enStrPlainText = eInputPlainText.getText();
        String enKunci = eInputKunci.getText();

        caesarSubtitution.setKey(Integer.parseInt(enKunci));
        eInputChiperText.setText(caesarSubtitution.encode(enStrPlainText));
    }//GEN-LAST:event_eBtnEnkripsiCaesarActionPerformed

    private void dBtnDekripsiCaesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dBtnDekripsiCaesarActionPerformed
        // TODO add your handling code here:
        CaesarSubtitution caesarSubtitution = CaesarSubtitution.getInstance();

        String deStrPlainText = dInputChiperText.getText();
        String deKunci = dInputKunci.getText();

        caesarSubtitution.setKey(Integer.parseInt(deKunci));
        dInputPlainText.setText(caesarSubtitution.decode(deStrPlainText));
    }//GEN-LAST:event_dBtnDekripsiCaesarActionPerformed

    private void eInputPolyPlain1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eInputPolyPlain1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eInputPolyPlain1ActionPerformed

    private void eBtnPoly1EnkirpsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eBtnPoly1EnkirpsiActionPerformed
        // TODO add your handling code here:
        CaesarSubtitution caesarSubtitution = CaesarSubtitution.getInstance();

        String enStrPlainText = eInputPlainText.getText();
        String enKunci = eInputKunci.getText();

        caesarSubtitution.setKey(Integer.parseInt(enKunci));
        eInputChiperText.setText(caesarSubtitution.encode(enStrPlainText));
    }//GEN-LAST:event_eBtnPoly1EnkirpsiActionPerformed

    private void dBtnPoly1DekripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dBtnPoly1DekripsiActionPerformed
        // TODO add your handling code here:
        CaesarSubtitution caesarSubtitution = CaesarSubtitution.getInstance();

        String deStrPlainText = dInputChiperText.getText();
        String deKunci = dInputKunci.getText();

        caesarSubtitution.setKey(Integer.parseInt(deKunci));
        dInputPlainText.setText(caesarSubtitution.decode(deStrPlainText));
    }//GEN-LAST:event_dBtnPoly1DekripsiActionPerformed

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
            java.util.logging.Logger.getLogger(Polyalphabetik1key.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Polyalphabetik1key.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Polyalphabetik1key.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Polyalphabetik1key.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Polyalphabetik1key().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dBtnDekripsiCaesar;
    private javax.swing.JButton dBtnPoly1Dekripsi;
    private javax.swing.JTextField dInputChiperText;
    private javax.swing.JTextField dInputKunci;
    private javax.swing.JTextField dInputPlainText;
    private javax.swing.JTextField dInputPolyChiper1;
    private javax.swing.JTextField dInputPolyKunci1;
    private javax.swing.JTextField dInputPolyPlain1;
    private javax.swing.JLabel dLblChiperText;
    private javax.swing.JLabel dLblKunci;
    private javax.swing.JLabel dLblPlainText;
    private javax.swing.JLabel dLblPoly1Chiper;
    private javax.swing.JLabel dLblPoly1Kunci;
    private javax.swing.JLabel dLblPoly1Plain;
    private javax.swing.JButton eBtnEnkripsiCaesar;
    private javax.swing.JButton eBtnPoly1Enkirpsi;
    private javax.swing.JTextField eInputChiperText;
    private javax.swing.JTextField eInputKunci;
    private javax.swing.JTextField eInputPlainText;
    private javax.swing.JTextField eInputPolyChiper1;
    private javax.swing.JTextField eInputPolyKunci1;
    private javax.swing.JLabel eLblChiperText;
    private javax.swing.JLabel eLblKunci;
    private javax.swing.JLabel eLblPlainText;
    private javax.swing.JLabel eLblPoly1Chiper;
    private javax.swing.JLabel eLblPoly1Kunci;
    private javax.swing.JLabel eLblPoly1Plain;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblEnkripsi;
    private javax.swing.JLabel lblPoly1Dekripsi;
    private javax.swing.JLabel lblPoly1Enkripsi;
    // End of variables declaration//GEN-END:variables
}