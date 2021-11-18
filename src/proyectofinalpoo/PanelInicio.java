/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyectofinalpoo;

import Interface.MostrarPanel;
import conexion.Conexion;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.*;
import java.sql.*;


/**
 *
 * @author Daniel Medina
 */
public class PanelInicio extends javax.swing.JPanel implements MostrarPanel {

    public PanelInicio() {
        initComponents();
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content1 = new javax.swing.JPanel();
        btnContinuar = new javax.swing.JButton();
        jtfIDReserva = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rbtnLibros = new javax.swing.JRadioButton();
        rbtnVideo = new javax.swing.JRadioButton();
        rbtnEspacios = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        content1.setBackground(new java.awt.Color(45, 164, 242));

        btnContinuar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        jtfIDReserva.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel5.setText("ID:");

        rbtnLibros.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        rbtnLibros.setText("Libros");

        rbtnVideo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        rbtnVideo.setText("Video");

        rbtnEspacios.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        rbtnEspacios.setText("Espacios");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("¿Que deseas reservar?");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalpoo/pensar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout content1Layout = new javax.swing.GroupLayout(content1);
        content1.setLayout(content1Layout);
        content1Layout.setHorizontalGroup(
            content1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(content1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, content1Layout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addComponent(rbtnLibros)
                        .addGap(52, 52, 52)
                        .addComponent(rbtnVideo)
                        .addGap(50, 50, 50)
                        .addComponent(rbtnEspacios)
                        .addGap(202, 202, 202))
                    .addGroup(content1Layout.createSequentialGroup()
                        .addGroup(content1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(content1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(content1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtfIDReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, content1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(278, 278, 278))
        );
        content1Layout.setVerticalGroup(
            content1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content1Layout.createSequentialGroup()
                .addGroup(content1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(content1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(content1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfIDReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(content1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnEspacios)
                            .addComponent(rbtnVideo)
                            .addComponent(rbtnLibros))
                        .addGap(30, 30, 30)
                        .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(content1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed

        PanelInicio panelInicio = new PanelInicio();
        
        PanelLibros panelLibros = new PanelLibros();
        PanelEspacios panelEspacios = new PanelEspacios();
        PanelVideo panelVideo = new PanelVideo();
        String valor = jtfIDReserva.getText();
        
        
        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(rbtnEspacios);
        grupo1.add(rbtnLibros);
        grupo1.add(rbtnVideo);
        
        try {
            Statement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();

            String sql = "SELECT id_usuario FROM usuario";
            String existe = null;
            //System.out.println(sql);
            ps = con.createStatement();
            rs = ps.executeQuery(sql);
            
            //Pasando resultado de la consulta
            while (rs.next()){
                String id = rs.getString("id_usuario");
                if (valor.equals(id)){
                    existe = id;
                }
            }
            
            if (!existe.equals(null)) {
                if (rbtnEspacios.isSelected() == true) {

                    ShowPanel(panelEspacios);
                    String info = jtfIDReserva.getText();
                    PanelEspacios.labelRecibe.setText(info); 
                    
                } else if (rbtnLibros.isSelected() == true) {
                    
                    ShowPanel(panelLibros);
                    String info = jtfIDReserva.getText();
                    PanelLibros.labelRecibe.setText(info); 

                } else if (rbtnVideo.isSelected() == true) {
                    ShowPanel(panelVideo);
                    String info = jtfIDReserva.getText();
                    PanelVideo.labelRecibe.setText(info); 
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "Acceso denegado.");
                LimpiarTodo(grupo1);
            }
            
        } catch (Exception ex) {
            System.err.println(ex.toString());
            JOptionPane.showMessageDialog(null, "Acceso denegado. \nEl ID no se encuentra");
            LimpiarTodo(grupo1);
        }
    }//GEN-LAST:event_btnContinuarActionPerformed
    
    @Override
    public void ShowPanel(JPanel p){
        
        p.setSize(781, 414);
        p.setLocation(0,0);
        
        content1.removeAll();
        content1.add(p, BorderLayout.CENTER);
        content1.revalidate();
        content1.repaint();
        
    }
    
    public void LimpiarTodo(ButtonGroup grupo1) {
        
        grupo1.clearSelection();
        jtfIDReserva.requestFocus();     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JPanel content1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtfIDReserva;
    private javax.swing.JRadioButton rbtnEspacios;
    private javax.swing.JRadioButton rbtnLibros;
    private javax.swing.JRadioButton rbtnVideo;
    // End of variables declaration//GEN-END:variables
}
