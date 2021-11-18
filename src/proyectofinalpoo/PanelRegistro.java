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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel Medina
 */
public class PanelRegistro extends javax.swing.JPanel implements MostrarPanel {

    /**
     * Creates new form PanelRegistro
     */
    public PanelRegistro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentRegistro = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jtfIDRegistro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfPrograma = new javax.swing.JTextField();
        btnRegistro = new javax.swing.JButton();
        btnYaRegistrado = new javax.swing.JButton();
        jtfCampus = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        contentRegistro.setBackground(new java.awt.Color(45, 164, 242));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 27)); // NOI18N
        jLabel5.setText("ID:");

        jtfIDRegistro.setColumns(5);
        jtfIDRegistro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfIDRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIDRegistroActionPerformed(evt);
            }
        });
        jtfIDRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfIDRegistroKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 27)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 27)); // NOI18N
        jLabel4.setText("Programa:");

        jtfNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jtfPrograma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfPrograma.setName(""); // NOI18N
        jtfPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfProgramaActionPerformed(evt);
            }
        });

        btnRegistro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnRegistro.setText("Registrar");
        btnRegistro.setActionCommand("");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        btnYaRegistrado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnYaRegistrado.setText("Iniciar Sesión");
        btnYaRegistrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYaRegistradoActionPerformed(evt);
            }
        });

        jtfCampus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfCampus.setName(""); // NOI18N
        jtfCampus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCampusActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 27)); // NOI18N
        jLabel6.setText("Campus:");

        javax.swing.GroupLayout contentRegistroLayout = new javax.swing.GroupLayout(contentRegistro);
        contentRegistro.setLayout(contentRegistroLayout);
        contentRegistroLayout.setHorizontalGroup(
            contentRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentRegistroLayout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(contentRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentRegistroLayout.createSequentialGroup()
                        .addGroup(contentRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(contentRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfIDRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCampus, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(190, 190, 190))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentRegistroLayout.createSequentialGroup()
                        .addComponent(btnRegistro)
                        .addGap(252, 252, 252))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentRegistroLayout.createSequentialGroup()
                        .addComponent(btnYaRegistrado)
                        .addGap(18, 18, 18))))
        );
        contentRegistroLayout.setVerticalGroup(
            contentRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentRegistroLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(contentRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contentRegistroLayout.createSequentialGroup()
                        .addGroup(contentRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(contentRegistroLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentRegistroLayout.createSequentialGroup()
                                .addComponent(jtfIDRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contentRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfCampus, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnYaRegistrado, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void ShowPanel(JPanel p){
        
        p.setSize(781, 414);
        p.setLocation(0,0);
        
        contentRegistro.removeAll();
        contentRegistro.add(p, BorderLayout.CENTER);
        contentRegistro.revalidate();
        contentRegistro.repaint();
        
    }
    
    private void jtfProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfProgramaActionPerformed
  
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfProgramaActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        // TODO add your handling code here:
        
        PanelInicio panelInicio = new PanelInicio();
        
        
        DefaultTableModel modelo = new DefaultTableModel();
        PreparedStatement ps = null;
        //jtUsuarios.setModel(modelo);
        try{
            Conexion objCon = new Conexion();
            Connection conn = objCon.getConexion();
            if (!jtfIDRegistro.getText().equals("") && !jtfNombre.getText().equals("")
                && !jtfPrograma.getText().equals("") && !jtfCampus.getText().equals(""))
            {
                ps = conn.prepareStatement("INSERT INTO usuario(id_usuario,nombre_u,programa_u,campus_u) "
                        + "VALUES (?,?,?,?)");

                ps.setString(1,jtfIDRegistro.getText());
                ps.setString(2,jtfNombre.getText());
                ps.setString(3,jtfPrograma.getText());
                ps.setString(4,jtfCampus.getText());

                ps.execute();
                JOptionPane.showMessageDialog(null, "Usuario registrado con exito");
                ShowPanel(panelInicio);
            }else{
                JOptionPane.showMessageDialog(null, "Error llene todos los campos.");
                LimpiarTodo();
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "ID ya se encuentra registrado.");
            System.out.println(ex);
            LimpiarTodo();
        }
        
        
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnYaRegistradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYaRegistradoActionPerformed
        
        PanelInicio panelInicio = new PanelInicio();
        ShowPanel(panelInicio);
        
    }//GEN-LAST:event_btnYaRegistradoActionPerformed

    private void jtfIDRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIDRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIDRegistroActionPerformed

    private void jtfCampusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCampusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCampusActionPerformed

    private void jtfIDRegistroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfIDRegistroKeyTyped
        
        if(jtfIDRegistro.getText().length() >= 5)
    {
        evt.consume();
    }
        
    }//GEN-LAST:event_jtfIDRegistroKeyTyped


    private void LimpiarTodo(){
        jtfCampus.setText("");
        jtfIDRegistro.setText("");
        jtfNombre.setText("");
        jtfPrograma.setText("");  
        jtfIDRegistro.requestFocus();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnYaRegistrado;
    private javax.swing.JPanel contentRegistro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jtfCampus;
    private javax.swing.JTextField jtfIDRegistro;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPrograma;
    // End of variables declaration//GEN-END:variables
}
