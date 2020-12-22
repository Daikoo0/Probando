/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eco;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author yoyit
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public int margen;
    public int anchoTablero;
    public int altoTablero;
    public int iconSize;
    public Eco tablero;
    public JLabel[][] etiquetas;
    
    private int ancho;
    private int largo;
    private int Orca;
    private int Tiburon;
    private int LoboMarino;
    private int Pulpo;
    private int Salmon;
    private int Krill;
    private int Actualizacion;
    
    public Ventana() {
        
        initComponents();
        //margen = 50;
        //anchoTablero = 6;
        //altoTablero = 6;
        //iconSize = 64;
        
        
        /*this.setSize(2*margen + anchoTablero*iconSize , 2*margen + altoTablero*iconSize);
        
        tablero = new Eco(anchoTablero, altoTablero);
        etiquetas = new JLabel[anchoTablero][altoTablero];
        
        for (int i = 0; i < anchoTablero; i++) {
            for (int j = 0; j < altoTablero; j++) {
                etiquetas[i][j] = new JLabel(Integer.toString(tablero.GetValue(i, j)));
                etiquetas[i][j].setSize(iconSize, iconSize);
                etiquetas[i][j].setLocation(margen + i*iconSize, margen + j*iconSize);
                if (etiquetas[i][j].getText().equals("1")) {
                    etiquetas[i][j].setIcon(jLabel1.getIcon());
                } else if (etiquetas[i][j].getText().equals("2")) {
                    etiquetas[i][j].setIcon(jLabel2.getIcon());
                } else if (etiquetas[i][j].getText().equals("3")) {
                    etiquetas[i][j].setIcon(jLabel3.getIcon());
                } else if (etiquetas[i][j].getText().equals("4")) {
                    etiquetas[i][j].setIcon(jLabel4.getIcon());
                } else if (etiquetas[i][j].getText().equals("5")) {
                    etiquetas[i][j].setIcon(jLabel5.getIcon());
                } else if (etiquetas[i][j].getText().equals("6")) {
                    etiquetas[i][j].setIcon(jLabel6.getIcon());
                }
                
                //etiquetas[i][j].setText("");
               
                this.add(etiquetas[i][j]);
                etiquetas[i][j].setVisible(true);
            }
        }*/
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Orquita = new javax.swing.JTextField();
        Tiburoncito = new javax.swing.JTextField();
        LoboMarinito = new javax.swing.JTextField();
        dimension1 = new javax.swing.JTextField();
        Salmoncito = new javax.swing.JTextField();
        Krillcito = new javax.swing.JTextField();
        xd = new javax.swing.JTextField();
        Pulpito = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dimension2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Empezar SImulación");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Orquita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrquitaActionPerformed(evt);
            }
        });
        Orquita.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                OrquitaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                OrquitaKeyTyped(evt);
            }
        });

        Tiburoncito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiburoncitoActionPerformed(evt);
            }
        });
        Tiburoncito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TiburoncitoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TiburoncitoKeyTyped(evt);
            }
        });

        LoboMarinito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoboMarinitoActionPerformed(evt);
            }
        });
        LoboMarinito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LoboMarinitoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LoboMarinitoKeyTyped(evt);
            }
        });

        dimension1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dimension1ActionPerformed(evt);
            }
        });
        dimension1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dimension1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dimension1KeyTyped(evt);
            }
        });

        Salmoncito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalmoncitoActionPerformed(evt);
            }
        });
        Salmoncito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SalmoncitoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SalmoncitoKeyTyped(evt);
            }
        });

        Krillcito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KrillcitoActionPerformed(evt);
            }
        });
        Krillcito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                KrillcitoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KrillcitoKeyTyped(evt);
            }
        });

        xd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xdActionPerformed(evt);
            }
        });
        xd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                xdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                xdKeyTyped(evt);
            }
        });

        Pulpito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PulpitoActionPerformed(evt);
            }
        });
        Pulpito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PulpitoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PulpitoKeyTyped(evt);
            }
        });

        jLabel1.setText("Dimensiones");

        jLabel2.setText("Tiburon");

        jLabel3.setText("Lobo Marino");

        jLabel4.setText("Pulpo");

        jLabel5.setText("Orca");

        jLabel6.setText("Salmón");

        jLabel8.setText("Krill");

        jLabel10.setText("x");

        dimension2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dimension2ActionPerformed(evt);
            }
        });
        dimension2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dimension2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dimension2KeyTyped(evt);
            }
        });

        jLabel11.setText("actualizaciones del ecosistema");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(561, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pulpito, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Krillcito, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tiburoncito, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(dimension1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dimension2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(xd)
                            .addComponent(Salmoncito)
                            .addComponent(LoboMarinito)
                            .addComponent(Orquita)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(159, 159, 159))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Orquita)
                        .addComponent(dimension1)
                        .addComponent(dimension2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tiburoncito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoboMarinito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salmoncito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pulpito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Krillcito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OrquitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrquitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrquitaActionPerformed

    private void TiburoncitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiburoncitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TiburoncitoActionPerformed

    private void LoboMarinitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoboMarinitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoboMarinitoActionPerformed

    private void dimension1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dimension1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dimension1ActionPerformed

    private void SalmoncitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalmoncitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalmoncitoActionPerformed

    private void KrillcitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KrillcitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KrillcitoActionPerformed

    private void xdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xdActionPerformed

    private void PulpitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PulpitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PulpitoActionPerformed

    private void dimension2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dimension2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dimension2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        anchoTablero = Integer.parseInt(dimension1.getText());
        altoTablero = Integer.parseInt(dimension2.getText());
        Orca = Integer.parseInt(Orquita.getText());
        Tiburon = Integer.parseInt(Tiburoncito.getText());
        LoboMarino = Integer.parseInt(LoboMarinito.getText());
        Pulpo = Integer.parseInt(Pulpito.getText());
        Salmon = Integer.parseInt(Salmoncito.getText());
        Krill = Integer.parseInt(Krillcito.getText());
        Actualizacion = Integer.parseInt(xd.getText());
        matriz();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Validación de Datos //
    
    private void dimension1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dimension1KeyTyped
        
        char validar = evt.getKeyChar();
    
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar Solo Numeros");
        }
        
    }//GEN-LAST:event_dimension1KeyTyped

    private void dimension2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dimension2KeyTyped
         
        char validar = evt.getKeyChar();
    
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar Solo Numeros");
        }  
        
    }//GEN-LAST:event_dimension2KeyTyped

    private void OrquitaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OrquitaKeyTyped
        
        char validar = evt.getKeyChar();
    
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar Solo Numeros");
        }  
        
    }//GEN-LAST:event_OrquitaKeyTyped

    private void TiburoncitoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TiburoncitoKeyTyped
        
        char validar = evt.getKeyChar();
    
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar Solo Numeros");
        }  
        
    }//GEN-LAST:event_TiburoncitoKeyTyped

    private void LoboMarinitoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoboMarinitoKeyTyped
        
        char validar = evt.getKeyChar();
    
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar Solo Numeros");
        }  
        
    }//GEN-LAST:event_LoboMarinitoKeyTyped

    private void PulpitoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PulpitoKeyTyped
        
        char validar = evt.getKeyChar();
    
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar Solo Numeros");
        }  
        
    }//GEN-LAST:event_PulpitoKeyTyped

    private void SalmoncitoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SalmoncitoKeyTyped
        
        char validar = evt.getKeyChar();
    
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar Solo Numeros");
        }  
        
    }//GEN-LAST:event_SalmoncitoKeyTyped

    private void KrillcitoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KrillcitoKeyTyped
        
        char validar = evt.getKeyChar();
    
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar Solo Numeros");
        }  
        
    }//GEN-LAST:event_KrillcitoKeyTyped

    private void xdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xdKeyTyped
        
        char validar = evt.getKeyChar();
    
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar Solo Numeros");
        }  
        
    }//GEN-LAST:event_xdKeyTyped

    private void dimension1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dimension1KeyReleased
        Validar();
    }//GEN-LAST:event_dimension1KeyReleased

    private void dimension2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dimension2KeyReleased
        Validar();
    }//GEN-LAST:event_dimension2KeyReleased

    private void OrquitaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OrquitaKeyReleased
        Validar();
    }//GEN-LAST:event_OrquitaKeyReleased

    private void TiburoncitoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TiburoncitoKeyReleased
        Validar();
    }//GEN-LAST:event_TiburoncitoKeyReleased

    private void LoboMarinitoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoboMarinitoKeyReleased
        Validar();
    }//GEN-LAST:event_LoboMarinitoKeyReleased

    private void PulpitoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PulpitoKeyReleased
        Validar();
    }//GEN-LAST:event_PulpitoKeyReleased

    private void SalmoncitoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SalmoncitoKeyReleased
        Validar();
    }//GEN-LAST:event_SalmoncitoKeyReleased

    private void KrillcitoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KrillcitoKeyReleased
        Validar();
    }//GEN-LAST:event_KrillcitoKeyReleased

    private void xdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xdKeyReleased
        Validar();
    }//GEN-LAST:event_xdKeyReleased

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    
    public void matriz(){
        
        margen = 50;
        iconSize = 64;
        
        tablero = new Eco(anchoTablero, altoTablero);
        etiquetas = new JLabel[anchoTablero][altoTablero];
        
        for (int i = 0; i < anchoTablero; i++) {
            for (int j = 0; j < altoTablero; j++) {
                etiquetas[i][j] = new JLabel(Integer.toString(tablero.GetValue(i, j)));
                etiquetas[i][j].setSize(iconSize, iconSize);
                etiquetas[i][j].setLocation(margen + i*iconSize, margen + j*iconSize);
                /*if (etiquetas[i][j].getText().equals("1")) {
                    etiquetas[i][j].setIcon(jLabel1.getIcon());
                } else if (etiquetas[i][j].getText().equals("2")) {
                    etiquetas[i][j].setIcon(jLabel2.getIcon());
                } else if (etiquetas[i][j].getText().equals("3")) {
                    etiquetas[i][j].setIcon(jLabel3.getIcon());
                } else if (etiquetas[i][j].getText().equals("4")) {
                    etiquetas[i][j].setIcon(jLabel4.getIcon());
                } else if (etiquetas[i][j].getText().equals("5")) {
                    etiquetas[i][j].setIcon(jLabel5.getIcon());
                } else if (etiquetas[i][j].getText().equals("6")) {
                    etiquetas[i][j].setIcon(jLabel6.getIcon());
                }*/
                
                //etiquetas[i][j].setText("");
               
                this.add(etiquetas[i][j]);
                etiquetas[i][j].setVisible(true);
            }
        }
        
        this.repaint();
        
    }
    
    public void Validar(){
        
        if(dimension1.getText().isEmpty()  || dimension2.getText().isEmpty() || Tiburoncito.getText().isEmpty() || Salmoncito.getText().isEmpty() || 
                Pulpito.getText().isEmpty() || Orquita.getText().isEmpty() || LoboMarinito.getText().isEmpty() || Krillcito.getText().isEmpty() || xd.getText().isEmpty()){
            
            jButton1.setEnabled(false);
            
        }else{
            
            jButton1.setEnabled(true);
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Krillcito;
    private javax.swing.JTextField LoboMarinito;
    private javax.swing.JTextField Orquita;
    private javax.swing.JTextField Pulpito;
    private javax.swing.JTextField Salmoncito;
    private javax.swing.JTextField Tiburoncito;
    private javax.swing.JTextField dimension1;
    private javax.swing.JTextField dimension2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField xd;
    // End of variables declaration//GEN-END:variables
}
