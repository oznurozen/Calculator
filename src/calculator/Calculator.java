/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Lenovo
 */
public class Calculator extends javax.swing.JFrame {
    
        int s1,s2,sonuc;
        int islemler;

    /**
     * Creates new form Calculator
     */
    public Calculator() {
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

        girilenler = new javax.swing.JTextField();
        yedi = new javax.swing.JButton();
        dokuz = new javax.swing.JButton();
        arti = new javax.swing.JButton();
        sil = new javax.swing.JButton();
        sekiz = new javax.swing.JButton();
        bes = new javax.swing.JButton();
        alti = new javax.swing.JButton();
        bir = new javax.swing.JButton();
        uc = new javax.swing.JButton();
        dort = new javax.swing.JButton();
        iki = new javax.swing.JButton();
        nokta = new javax.swing.JButton();
        sifir = new javax.swing.JButton();
        eksi = new javax.swing.JButton();
        carpi = new javax.swing.JButton();
        esittir = new javax.swing.JButton();
        bolu = new javax.swing.JButton();
        cikti = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        girilenler.setBackground(new java.awt.Color(0, 255, 204));
        girilenler.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        girilenler.setForeground(new java.awt.Color(0, 0, 255));
        girilenler.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        girilenler.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 5, true));

        yedi.setBackground(new java.awt.Color(102, 255, 204));
        yedi.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        yedi.setForeground(new java.awt.Color(153, 0, 0));
        yedi.setText("7");
        yedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yediActionPerformed(evt);
            }
        });

        dokuz.setBackground(new java.awt.Color(102, 255, 204));
        dokuz.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        dokuz.setForeground(new java.awt.Color(153, 0, 0));
        dokuz.setText("9");
        dokuz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dokuzActionPerformed(evt);
            }
        });

        arti.setBackground(new java.awt.Color(0, 102, 102));
        arti.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        arti.setForeground(new java.awt.Color(153, 0, 0));
        arti.setText("+");
        arti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artiActionPerformed(evt);
            }
        });

        sil.setBackground(new java.awt.Color(102, 255, 204));
        sil.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        sil.setForeground(new java.awt.Color(153, 0, 0));
        sil.setText("C");
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });

        sekiz.setBackground(new java.awt.Color(102, 255, 204));
        sekiz.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        sekiz.setForeground(new java.awt.Color(153, 0, 0));
        sekiz.setText("8");
        sekiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sekizActionPerformed(evt);
            }
        });

        bes.setBackground(new java.awt.Color(102, 255, 204));
        bes.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        bes.setForeground(new java.awt.Color(153, 0, 0));
        bes.setText("5");
        bes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                besActionPerformed(evt);
            }
        });

        alti.setBackground(new java.awt.Color(102, 255, 204));
        alti.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        alti.setForeground(new java.awt.Color(153, 0, 0));
        alti.setText("6");
        alti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altiActionPerformed(evt);
            }
        });

        bir.setBackground(new java.awt.Color(102, 255, 204));
        bir.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        bir.setForeground(new java.awt.Color(153, 0, 0));
        bir.setText("1");
        bir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birActionPerformed(evt);
            }
        });

        uc.setBackground(new java.awt.Color(102, 255, 204));
        uc.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        uc.setForeground(new java.awt.Color(153, 0, 0));
        uc.setText("3");
        uc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ucActionPerformed(evt);
            }
        });

        dort.setBackground(new java.awt.Color(102, 255, 204));
        dort.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        dort.setForeground(new java.awt.Color(153, 0, 0));
        dort.setText("4");
        dort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dortActionPerformed(evt);
            }
        });

        iki.setBackground(new java.awt.Color(102, 255, 204));
        iki.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        iki.setForeground(new java.awt.Color(153, 0, 0));
        iki.setText("2");
        iki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ikiActionPerformed(evt);
            }
        });

        nokta.setBackground(new java.awt.Color(0, 102, 102));
        nokta.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        nokta.setForeground(new java.awt.Color(153, 0, 0));
        nokta.setText(".");
        nokta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noktaActionPerformed(evt);
            }
        });

        sifir.setBackground(new java.awt.Color(102, 255, 204));
        sifir.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        sifir.setForeground(new java.awt.Color(153, 0, 0));
        sifir.setText("0");
        sifir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifirActionPerformed(evt);
            }
        });

        eksi.setBackground(new java.awt.Color(0, 102, 102));
        eksi.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        eksi.setForeground(new java.awt.Color(153, 0, 0));
        eksi.setText("-");
        eksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eksiActionPerformed(evt);
            }
        });

        carpi.setBackground(new java.awt.Color(0, 102, 102));
        carpi.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        carpi.setForeground(new java.awt.Color(153, 0, 0));
        carpi.setText("x");
        carpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carpiActionPerformed(evt);
            }
        });

        esittir.setBackground(new java.awt.Color(0, 102, 102));
        esittir.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        esittir.setForeground(new java.awt.Color(153, 0, 0));
        esittir.setText("=");
        esittir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esittirActionPerformed(evt);
            }
        });

        bolu.setBackground(new java.awt.Color(0, 102, 102));
        bolu.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        bolu.setForeground(new java.awt.Color(153, 0, 0));
        bolu.setText(" ??");
        bolu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boluActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yedi, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sekiz, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dokuz, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(arti, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(sil, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sifir, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nokta, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carpi, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(girilenler)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(iki, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(uc, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bolu, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dort, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bes, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(alti, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(eksi, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addComponent(esittir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cikti, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cikti, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(girilenler, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yedi, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sekiz, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dokuz, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arti, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sil, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dort, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bes, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alti, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eksi, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iki, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uc, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bolu, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sifir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nokta, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carpi, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(esittir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sifirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifirActionPerformed
           girilenler.setText(girilenler.getText()+"0");
    }//GEN-LAST:event_sifirActionPerformed

    private void noktaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noktaActionPerformed
         girilenler.setText(girilenler.getText()+".");
    }//GEN-LAST:event_noktaActionPerformed

    private void carpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carpiActionPerformed
         s1=Integer.parseInt(girilenler.getText());
        islemler=4;
        girilenler.setText("");
    }//GEN-LAST:event_carpiActionPerformed

    private void esittirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esittirActionPerformed
          s2=Integer.parseInt(girilenler.getText());
        
        if(islemler==1){
            
            sonuc = s1 + s2;
           //girilenler.setText(s1+"+"+s2+"="+sonuc);
            girilenler.setText(Integer.toString(sonuc));
            cikti.setText(String.valueOf(sonuc));
        }        
        else if(islemler==2){
            sonuc = s1 - s2;
           // 
            girilenler.setText(s1+"-"+s2+"="+sonuc);
            girilenler.setText(Integer.toString(sonuc));
            cikti.setText(String.valueOf(sonuc));
        }
         else if(islemler==3){
             
            sonuc = s1 / s2;
           // girilenler.setText(s1+"/"+s2+"="+sonuc);
            girilenler.setText(Integer.toString(sonuc));
            cikti.setText(String.valueOf(sonuc));
           // 
        }
         else if(islemler==4){
            sonuc = s1 * s2;
           // girilenler.setText(s1+"*"+s2+"="+sonuc);
            girilenler.setText(Integer.toString(sonuc));
            cikti.setText(String.valueOf(sonuc));
        }
    }//GEN-LAST:event_esittirActionPerformed

    private void birActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birActionPerformed
         girilenler.setText(girilenler.getText()+"1");

    }//GEN-LAST:event_birActionPerformed

    private void ikiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ikiActionPerformed
         girilenler.setText(girilenler.getText()+"2");
    }//GEN-LAST:event_ikiActionPerformed

    private void ucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ucActionPerformed
         girilenler.setText(girilenler.getText()+"3");
    }//GEN-LAST:event_ucActionPerformed

    private void dortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dortActionPerformed
         girilenler.setText(girilenler.getText()+"4");
    }//GEN-LAST:event_dortActionPerformed

    private void besActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_besActionPerformed
         girilenler.setText(girilenler.getText()+"5");
    }//GEN-LAST:event_besActionPerformed

    private void altiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altiActionPerformed
         girilenler.setText(girilenler.getText()+"6");
    }//GEN-LAST:event_altiActionPerformed

    private void yediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yediActionPerformed
         girilenler.setText(girilenler.getText()+"7");
    }//GEN-LAST:event_yediActionPerformed

    private void sekizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sekizActionPerformed
         girilenler.setText(girilenler.getText()+"8");
    }//GEN-LAST:event_sekizActionPerformed

    private void dokuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dokuzActionPerformed
         girilenler.setText(girilenler.getText()+"9");
    }//GEN-LAST:event_dokuzActionPerformed

    private void artiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artiActionPerformed
         s1=Integer.parseInt(girilenler.getText());
        islemler=1;
        girilenler.setText("");
        
    }//GEN-LAST:event_artiActionPerformed

    private void eksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eksiActionPerformed
         s1=Integer.parseInt(girilenler.getText());
        islemler=2;
        girilenler.setText("");
    }//GEN-LAST:event_eksiActionPerformed

    private void boluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boluActionPerformed
         s1=Integer.parseInt(girilenler.getText());
        islemler=3;
        girilenler.setText("");
        
    }//GEN-LAST:event_boluActionPerformed

    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed
        girilenler.setText("");
    }//GEN-LAST:event_silActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alti;
    private javax.swing.JButton arti;
    private javax.swing.JButton bes;
    private javax.swing.JButton bir;
    private javax.swing.JButton bolu;
    private javax.swing.JButton carpi;
    private javax.swing.JLabel cikti;
    private javax.swing.JButton dokuz;
    private javax.swing.JButton dort;
    private javax.swing.JButton eksi;
    private javax.swing.JButton esittir;
    private javax.swing.JTextField girilenler;
    private javax.swing.JButton iki;
    private javax.swing.JButton nokta;
    private javax.swing.JButton sekiz;
    private javax.swing.JButton sifir;
    private javax.swing.JButton sil;
    private javax.swing.JButton uc;
    private javax.swing.JButton yedi;
    // End of variables declaration//GEN-END:variables
}
