/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficas;

import conexion.CONEXION;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Pantalla2 extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla2
     */
    public Pantalla2() {
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

        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        PrecioA = new javax.swing.JTextField();
        nuevop = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nuevac = new javax.swing.JTextField();
        productov = new javax.swing.JTextField();
        button1 = new java.awt.Button();
        Asignar = new java.awt.Button();
        RegresarP2 = new java.awt.Button();
        precioac = new java.awt.Button();
        stock = new javax.swing.JToggleButton();
        registrarv = new java.awt.Button();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 51));

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));
        jPanel3.setForeground(new java.awt.Color(0, 0, 51));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CREAR SOLICITUD");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingresar Solicitud");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Precio Actual");

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nuevo Precio");

        PrecioA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioAActionPerformed(evt);
            }
        });

        nuevop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevopActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Producto:");

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cantidad:");

        nuevac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevacActionPerformed(evt);
            }
        });

        productov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productovActionPerformed(evt);
            }
        });

        button1.setLabel("Registrar");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        Asignar.setLabel("Asignar NuevoP.");
        Asignar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AsignarMouseClicked(evt);
            }
        });
        Asignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignarActionPerformed(evt);
            }
        });

        RegresarP2.setLabel("Regresar");
        RegresarP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarP2ActionPerformed(evt);
            }
        });

        precioac.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        precioac.setLabel("Precio Recuperado");
        precioac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                precioacMouseClicked(evt);
            }
        });
        precioac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioacActionPerformed(evt);
            }
        });

        stock.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        stock.setText("STOCK DEL GRIFO");
        stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockActionPerformed(evt);
            }
        });

        registrarv.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        registrarv.setLabel("RegistrarVenta");
        registrarv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(stock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Asignar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PrecioA, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nuevop, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(precioac, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrarv, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(productov, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nuevac, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(RegresarP2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel5)
                .addGap(81, 81, 81)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(precioac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)))
                    .addComponent(registrarv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PrecioA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productov, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(stock)
                        .addGap(10, 10, 10)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nuevop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevac, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asignar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RegresarP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignarActionPerformed
        
        String nuevoPrecio=nuevop.getText();
            
        
    String auxiliar="C2121";
try {
            Connection conn = CONEXION.getConnection();
            String sql = "UPDATE INFORMACION SET ASIGNAR_PRECIO= ? WHERE COD_AREA=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setFloat(1,Float.valueOf(nuevoPrecio));
            pst.setString(2,auxiliar);
            
            JOptionPane.showMessageDialog(rootPane, "Se actualizó correctamente");
            String sql1 = "COMMIT WORK";
            PreparedStatement pst1 = conn.prepareStatement(sql1);
            pst1.execute();      
            pst.executeUpdate();
            pst.close();
            conn.close();        // TODO add your handling code here:
        } catch (SQLException ex) {
            
           JOptionPane.showMessageDialog(rootPane,"error");
        }

    


// TODO add your handling code here:
    }//GEN-LAST:event_AsignarActionPerformed

    private void nuevopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevopActionPerformed

    private void RegresarP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarP2ActionPerformed
    Pantalla1 newframe= new Pantalla1();
     
     newframe.setVisible(true);
     this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_RegresarP2ActionPerformed

    private void AsignarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AsignarMouseClicked
        // TODO add your handling code here:
        
            // TODO add your handling code here:
       
    

                
               
                
      
         
    }//GEN-LAST:event_AsignarMouseClicked

    private void PrecioAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioAActionPerformed
   
        
    }//GEN-LAST:event_PrecioAActionPerformed

    private void precioacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_precioacMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_precioacMouseClicked

    private void precioacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioacActionPerformed

        String auxiliar="C2121";
try {
            Connection conn = CONEXION.getConnection();
            String sql = "SELECT ASIGNAR_PRECIO FROM INFORMACION WHERE COD_AREA=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,auxiliar);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                
                
                PrecioA.setText(String.valueOf(rs.getFloat("ASIGNAR_PRECIO")));
                
            }
            rs.close();
            pst.close();
            conn.close();        // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Pantalla2.class.getName()).log(Level.SEVERE, null, ex);
        }





// TODO add your handling code here:
    }//GEN-LAST:event_precioacActionPerformed

    private void stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockActionPerformed

       
        
        
        
        
        
      Pantalla3 newframe= new Pantalla3();
     
     newframe.setVisible(true);
     this.dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_stockActionPerformed

    private void productovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productovActionPerformed

        
// TODO add your handling code here:
        
        
    }//GEN-LAST:event_productovActionPerformed

    private void registrarvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarvActionPerformed
            String aux="GAS2525";
try {
            Connection conn = CONEXION.getConnection();
            String sql = "SELECT NOMBRE FROM PRODUCTO  WHERE CODIGO_PRODUCTO=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,aux);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                
                productov.setText( String.valueOf(rs.getString("nombre")));
                
            }
            rs.close();
            pst.close();
            conn.close();        // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Pantalla2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
// TODO add your handling code here:
    }//GEN-LAST:event_registrarvActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
       String nueva=nuevac.getText();
            
        
    String auxiliar="GAS2525";
try {
            Connection conn = CONEXION.getConnection();
            String sql = "UPDATE PRODUCTO SET CANTIDAD_BARRILES= ? WHERE CODIGO_PRODUCTO=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setFloat(1,Float.valueOf(nueva));
            pst.setString(2,auxiliar);
            
            JOptionPane.showMessageDialog(rootPane, "Se actualizó correctamente");
            String sql1 = "COMMIT WORK";
            PreparedStatement pst1 = conn.prepareStatement(sql1);
            pst1.execute();      
            pst.executeUpdate();
            pst.close();
            conn.close();        // TODO add your handling code here:
        } catch (SQLException ex) {
            
           JOptionPane.showMessageDialog(rootPane,"error");
        }
        


// TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    private void nuevacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevacActionPerformed

        



// TODO add your handling code here:
    }//GEN-LAST:event_nuevacActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Asignar;
    private javax.swing.JTextField PrecioA;
    private java.awt.Button RegresarP2;
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nuevac;
    private javax.swing.JTextField nuevop;
    private java.awt.Button precioac;
    private javax.swing.JTextField productov;
    private java.awt.Button registrarv;
    private javax.swing.JToggleButton stock;
    // End of variables declaration//GEN-END:variables
}
