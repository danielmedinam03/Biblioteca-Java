/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyectofinalpoo;

import Interface.AccionesVarias;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel Medina
 */
public class PanelVideo extends javax.swing.JPanel implements AccionesVarias{

    /**
     * Creates new form PanelVideo
     */
    public PanelVideo() {
        initComponents();
        CargarData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PopMenuElimEdi = new javax.swing.JPopupMenu();
        menuEliminarVideo = new javax.swing.JMenuItem();
        menuEditarVideo = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVideo = new javax.swing.JTable();
        btnAgregarVideo = new javax.swing.JButton();
        btnCargarIdV = new javax.swing.JButton();
        btnCargarBDvideo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtfCargarIdV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfIdVideo = new javax.swing.JTextField();
        jtfEquipoV = new javax.swing.JTextField();
        jtfMarcaV = new javax.swing.JTextField();
        jtfColorV = new javax.swing.JTextField();
        labelRecibe = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        menuEliminarVideo.setText("Eliminar");
        menuEliminarVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarVideoActionPerformed(evt);
            }
        });
        PopMenuElimEdi.add(menuEliminarVideo);

        menuEditarVideo.setText("Editar");
        menuEditarVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarVideoActionPerformed(evt);
            }
        });
        PopMenuElimEdi.add(menuEditarVideo);

        jPanel1.setBackground(new java.awt.Color(45, 164, 242));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Video");

        tableVideo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tableVideo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tableVideo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Equipo", "Color", "Marca", "Disponible"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableVideo.setComponentPopupMenu(PopMenuElimEdi);
        jScrollPane1.setViewportView(tableVideo);

        btnAgregarVideo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregarVideo.setText("Agregar");
        btnAgregarVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVideoActionPerformed(evt);
            }
        });

        btnCargarIdV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCargarIdV.setText("Cargar");
        btnCargarIdV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarIdVActionPerformed(evt);
            }
        });

        btnCargarBDvideo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCargarBDvideo.setText("Actualizar");
        btnCargarBDvideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarBDvideoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID video");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("ID Video:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Equipo:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Marca:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Color:");

        jtfIdVideo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfIdVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdVideoActionPerformed(evt);
            }
        });
        jtfIdVideo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfIdVideoKeyTyped(evt);
            }
        });

        jtfEquipoV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtfMarcaV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtfColorV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labelRecibe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelRecibe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRecibe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Usuario:");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfCargarIdV, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCargarIdV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCargarBDvideo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtfIdVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfEquipoV, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtfColorV, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtfMarcaV, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(58, 58, 58)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnAgregarVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(427, 427, 427)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(labelRecibe, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE))))))
                        .addContainerGap(9, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelRecibe, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jtfIdVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfEquipoV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfColorV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtfMarcaV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregarVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargarIdV)
                    .addComponent(btnCargarBDvideo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jtfCargarIdV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfIdVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdVideoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIdVideoActionPerformed

    private void btnAgregarVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVideoActionPerformed

        Conexion objCon = new Conexion();
        Connection conn = objCon.getConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        PreparedStatement ps = null;
        tableVideo.setModel(modelo);
        String id_producto, disponible;
        
        
        PreparedStatement select = null;
        try{
            disponible = "Si";
            if(!jtfIdVideo.getText().equals("")){
                 
                ps = conn.prepareStatement("INSERT INTO video(id_video,equipo_v,color_v,marca_v,disponible_v) "
                        + "VALUES (?,?,?,?,?)");

                ps.setString(1,jtfIdVideo.getText());
                ps.setString(2,jtfEquipoV.getText());
                ps.setString(3,jtfColorV.getText());
                ps.setString(4,jtfMarcaV.getText());
                ps.setString(5,disponible);

                ps.execute();
                JOptionPane.showMessageDialog(null, "Producto guardado con exito");
                
                CargarData();
                LimpiarTodo();
            }else{
                JOptionPane.showMessageDialog(null, "Producto NO guardado, intentelo nuevamente.");
                CargarData();
                LimpiarTodo();
            }
            
            Object[] fila = new Object[5];
            fila[0] = jtfIdVideo.getText();
            fila[1] = jtfEquipoV.getText();
            fila[2] = jtfColorV.getText();
            fila[3] = jtfMarcaV.getText();
            fila[4] = disponible;
            
            
            modelo.addRow(fila);

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al guardar el producto, el ID ya existe.");
            System.out.println(ex);
            CargarData();
            LimpiarTodo();
        }    
        
    }//GEN-LAST:event_btnAgregarVideoActionPerformed

    private void btnCargarBDvideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarBDvideoActionPerformed
        CargarData();
    }//GEN-LAST:event_btnCargarBDvideoActionPerformed
   
    private void btnCargarIdVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarIdVActionPerformed

        String campo = jtfCargarIdV.getText();
        String where = "";
        
        if (!"".equals(campo)){
            where = " WHERE id_video = '" + campo + "';";
        }
        
        
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            tableVideo.setModel(modelo);
            
            PreparedStatement ps =null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();
            
            String sql = "SELECT id_video,equipo_v,color_v,marca_v,disponible_v FROM video" + where;
            System.out.println(sql);
            ps = con.prepareStatement(sql);
            rs =ps.executeQuery();
            //Pasando resultado de la consulta
            ResultSetMetaData rsMd = rs.getMetaData();
            
            //Cuantos datos regresa esa consulta
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("ID");
            modelo.addColumn("Equipo");
            modelo.addColumn("Color");
            modelo.addColumn("Marca"); 
            modelo.addColumn("Disponible");
            
            //Recorrer
            while(rs.next()){
            
                Object[] filas = new Object[cantidadColumnas];
                
                for(int i = 0; i<cantidadColumnas;i++){
                    filas[i] = rs.getObject(i+1);
                    
                }
                modelo.addRow(filas);
            }
                     
            
            
        }catch (SQLException ex){
            System.err.println(ex.toString());
        }

    }//GEN-LAST:event_btnCargarIdVActionPerformed

    private void jtfIdVideoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfIdVideoKeyTyped

        if(jtfIdVideo.getText().length() >= 10)
        {
            evt.consume();
        }
        
    }//GEN-LAST:event_jtfIdVideoKeyTyped

    private void menuEliminarVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarVideoActionPerformed

        Eliminar();
    }//GEN-LAST:event_menuEliminarVideoActionPerformed

    private void menuEditarVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarVideoActionPerformed
        Editar();
    }//GEN-LAST:event_menuEditarVideoActionPerformed

    
    @Override
    public void Editar(){
        int fila = tableVideo.getSelectedRow();
        
        String id = tableVideo.getValueAt(fila, 0).toString();
        String equipo = tableVideo.getValueAt(fila, 1).toString();
        String color = tableVideo.getValueAt(fila, 2).toString();
        String marca = tableVideo.getValueAt(fila, 3).toString();

        PreparedStatement actualizar = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();
        
        try{
            String sql = "UPDATE video SET equipo_v='"+equipo+"', color_v='"+color+"', marca_v='"+marca+"'"+
                    " WHERE id_video="+id+"";
             
            actualizar = con.prepareStatement(sql);
            actualizar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Actualizado con exito");
            CargarData();
        }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "No se logró Actualizar el Registro");
        }
    }
    
    @Override
    public void Eliminar(){
        int fila = tableVideo.getSelectedRow();
        String valor = tableVideo.getValueAt(fila, 0).toString();
        
        PreparedStatement eliminar = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();
        
        try{
            String sql = "DELETE FROM video WHERE id_video="+valor+"";
            
            eliminar = con.prepareStatement(sql);
            eliminar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Eliminado con exito");
            CargarData();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se logró eliminar el Registro");
        }
        
    }
    
    
    
    @Override
    public void CargarData() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tableVideo.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();

            String sql = "SELECT id_video,equipo_v,color_v,marca_v,disponible_v FROM video";
            //System.out.println(sql);
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            //Pasando resultado de la consulta
            ResultSetMetaData rsMd = rs.getMetaData();

            //Cuantos datos regresa esa consulta
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("Equipo");
            modelo.addColumn("Color");
            modelo.addColumn("Marca");
            modelo.addColumn("Disponible");

            //Recorrer
            while (rs.next()) {

                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);

                }
                modelo.addRow(filas);
            }

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }
    
    @Override
    public void LimpiarTodo() {
        jtfCargarIdV.setText("");
        jtfColorV.setText("");
        jtfEquipoV.setText("");
        jtfIdVideo.setText("");
        jtfMarcaV.setText("");

        jtfIdVideo.requestFocus();    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu PopMenuElimEdi;
    private javax.swing.JButton btnAgregarVideo;
    private javax.swing.JButton btnCargarBDvideo;
    private javax.swing.JButton btnCargarIdV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtfCargarIdV;
    private javax.swing.JTextField jtfColorV;
    private javax.swing.JTextField jtfEquipoV;
    private javax.swing.JTextField jtfIdVideo;
    private javax.swing.JTextField jtfMarcaV;
    public static javax.swing.JLabel labelRecibe;
    private javax.swing.JMenuItem menuEditarVideo;
    private javax.swing.JMenuItem menuEliminarVideo;
    private javax.swing.JTable tableVideo;
    // End of variables declaration//GEN-END:variables

    

    
}
