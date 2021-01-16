package mapa;

import java.util.ArrayList;

public class Interface extends javax.swing.JFrame {

    public Interface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CaixaComum = new javax.swing.JButton();
        CaixaRapido = new javax.swing.JButton();
        CaixaPrioritario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        GeraSenha = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Caixa4 = new javax.swing.JButton();
        Caixa3 = new javax.swing.JButton();
        Caixa1 = new javax.swing.JButton();
        Caixa2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        SenhaChamada = new javax.swing.JLabel();
        CaixaChamada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setAlignmentY(0.0F);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Para Clientes:");

        CaixaComum.setText("Comum");
        CaixaComum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixaComumActionPerformed(evt);
            }
        });

        CaixaRapido.setText("Rápido");
        CaixaRapido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixaRapidoActionPerformed(evt);
            }
        });

        CaixaPrioritario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CaixaPrioritario.setText("Prioritário");
        CaixaPrioritario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixaPrioritarioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Sua Senha é:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Escolha seu tipo de atendimento:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GeraSenha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 5, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(CaixaComum, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CaixaRapido, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CaixaPrioritario, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CaixaPrioritario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CaixaRapido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CaixaComum, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GeraSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Caixa4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Caixa4.setText("Caixa 4");
        Caixa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caixa4ActionPerformed(evt);
            }
        });

        Caixa3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Caixa3.setText("Caixa 3");
        Caixa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caixa3ActionPerformed(evt);
            }
        });

        Caixa1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Caixa1.setText("Caixa 1");
        Caixa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caixa1ActionPerformed(evt);
            }
        });

        Caixa2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Caixa2.setText("Caixa 2");
        Caixa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caixa2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Para Caixas:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(Caixa3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(Caixa4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(Caixa1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(223, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(195, Short.MAX_VALUE)
                    .addComponent(Caixa2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(73, 73, 73)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Caixa3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Caixa4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(Caixa1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(137, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(Caixa2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(136, Short.MAX_VALUE)))
        );

        SenhaChamada.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        SenhaChamada.setText("SENHA");

        CaixaChamada.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CaixaChamada.setText("CAIXA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(CaixaChamada, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143)
                .addComponent(SenhaChamada, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CaixaChamada, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SenhaChamada, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 807, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ArrayList<Senha> fila = new ArrayList<Senha>();
    int senhaFila = 1;


    private void CaixaComumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaComumActionPerformed
        Senha senhaComum = new Senha(senhaFila, 'C');
        senhaFila += 1;
        String senhaComumGerada = (senhaComum.getTipo() + "-" + senhaComum.getNumero());
        GeraSenha.setText(senhaComumGerada);
        fila.add(senhaComum);

    }//GEN-LAST:event_CaixaComumActionPerformed

    private void CaixaRapidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaRapidoActionPerformed
        Senha senhaRapida = new Senha(senhaFila, 'R');
        senhaFila += 1;
        String senhaRapidaGerada = (senhaRapida.getTipo() + "-" + senhaRapida.getNumero());
        GeraSenha.setText(senhaRapidaGerada);
        fila.add(senhaRapida);
    }//GEN-LAST:event_CaixaRapidoActionPerformed

    private void CaixaPrioritarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaPrioritarioActionPerformed
        Senha senhaPrioritario = new Senha(senhaFila, 'P');
        senhaFila += 1;
        String senhaPrioritarioGerada = (senhaPrioritario.getTipo() + "-" + senhaPrioritario.getNumero());
        GeraSenha.setText(senhaPrioritarioGerada);
        fila.add(senhaPrioritario);
    }//GEN-LAST:event_CaixaPrioritarioActionPerformed

    private void Caixa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caixa4ActionPerformed
        ProximoFilaComum();
        CaixaChamada.setText("Caixa 4");
    }//GEN-LAST:event_Caixa4ActionPerformed

    private void Caixa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caixa3ActionPerformed
        ProximoFilaRapida();
        CaixaChamada.setText("Caixa 3");
    }//GEN-LAST:event_Caixa3ActionPerformed

    private void Caixa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caixa1ActionPerformed
        proximonaFilaPreferencial();
        CaixaChamada.setText("Caixa 1");
    }//GEN-LAST:event_Caixa1ActionPerformed

    private void Caixa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caixa2ActionPerformed
        ProximoFilaRapida();
        CaixaChamada.setText("Caixa 2");
    }//GEN-LAST:event_Caixa2ActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    private void proximonaFilaPreferencial() {
        for (int i = 0; i < fila.size(); i++) {
            Senha senhaChamada = fila.get(i);
            if (senhaChamada.isPreferencial()) {
                SenhaChamada.setText(senhaChamada.toString());
                fila.remove(i);
                return;
            }
        }
        if (fila.size() > 0) {
            Senha primeironaFila = fila.get(0);
            SenhaChamada.setText(primeironaFila.toString());
            fila.remove(0);
        }

    }

    private void ProximoFilaRapida() {
        for (int i = 0; i < fila.size(); i++) {
            Senha senhaChamada = fila.get(i);
            if (senhaChamada.isRapido()) {
                SenhaChamada.setText(senhaChamada.toString());
                fila.remove(i);
                return;
            }
        }
        if (fila.size() > 0) {
            Senha primeironaFila = fila.get(0);
            SenhaChamada.setText(primeironaFila.toString());
            fila.remove(0);
        }

    }

    private void ProximoFilaComum() {
        for (int i = 0; i < fila.size(); i++) {
            Senha senhaChamada = fila.get(i);
            if (senhaChamada.isComum()) {
                SenhaChamada.setText(senhaChamada.toString());
                fila.remove(i);
                return;
            }
        }
        if (fila.size() > 0) {
            Senha primeironaFila = fila.get(0);
            SenhaChamada.setText(primeironaFila.toString());
            fila.remove(0);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Caixa1;
    private javax.swing.JButton Caixa2;
    private javax.swing.JButton Caixa3;
    private javax.swing.JButton Caixa4;
    private javax.swing.JLabel CaixaChamada;
    private javax.swing.JButton CaixaComum;
    private javax.swing.JButton CaixaPrioritario;
    private javax.swing.JButton CaixaRapido;
    private javax.swing.JTextField GeraSenha;
    private javax.swing.JLabel SenhaChamada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
