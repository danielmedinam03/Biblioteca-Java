/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyectofinalpoo;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel Medina
 */
public class PanelReserva extends javax.swing.JPanel {

    /**
     * Creates new form PanelReserva
     */
    public PanelReserva() {
        initComponents();
        CargarData();
    }
    
    public void CargarData() {
        
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            tableReserva.setModel(modelo);
            
            PreparedStatement ps =null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();
            
            String sql = "SELECT id_reserva, id_usuario, id_producto, tipo_reserva, fecha_salida, fecha_entrega FROM reserva";
            //System.out.println(sql);
            ps = con.prepareStatement(sql);
            rs =ps.executeQuery();
            //Pasando resultado de la consulta
            ResultSetMetaData rsMd = rs.getMetaData();
            
            //Cuantos datos regresa esa consulta
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("ID");
            modelo.addColumn("ID Usuario");
            modelo.addColumn("ID Producto");
            modelo.addColumn("Tipo de Reserva");
            modelo.addColumn("Fecha Salida");
            modelo.addColumn("Fecha Entrega");
            
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
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ppMenuEntregar = new javax.swing.JPopupMenu();
        menuEntregar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableReserva = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfIdReserva = new javax.swing.JTextField();
        btnCargarReserva = new javax.swing.JButton();
        btnActualizarReserva = new javax.swing.JButton();

        ppMenuEntregar.setComponentPopupMenu(ppMenuEntregar);

        menuEntregar.setText("Entregar");
        menuEntregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEntregarActionPerformed(evt);
            }
        });
        ppMenuEntregar.add(menuEntregar);

        jPanel1.setBackground(new java.awt.Color(45, 164, 242));

        tableReserva.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tableReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "ID Usuario", "ID Producto", "Tipo de Reserva", "Fecha Salida", "Fecha Entrega"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableReserva.setComponentPopupMenu(ppMenuEntregar);
        jScrollPane1.setViewportView(tableReserva);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel1.setText("Reservas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID:");

        jtfIdReserva.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnCargarReserva.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCargarReserva.setText("Buscar");
        btnCargarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarReservaActionPerformed(evt);
            }
        });

        btnActualizarReserva.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActualizarReserva.setText("Actualizar");
        btnActualizarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarReservaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfIdReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCargarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 416, Short.MAX_VALUE)
                        .addComponent(btnActualizarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(12, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 307, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfIdReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargarReserva)
                    .addComponent(btnActualizarReserva))
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(72, Short.MAX_VALUE)))
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

    private void btnActualizarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarReservaActionPerformed
  
        CargarData();
    }//GEN-LAST:event_btnActualizarReservaActionPerformed

    private void btnCargarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarReservaActionPerformed
        
        String campo = jtfIdReserva.getText();
        String where = "";
        
        if (!"".equals(campo)){
            where = " WHERE id_reserva = '" + campo + "';";
        }
        
        
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            tableReserva.setModel(modelo);
            
            PreparedStatement ps =null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();
            
            String sql = "SELECT id_reserva, id_usuario, id_producto, tipo_reserva, fecha_salida, fecha_entrega FROM reserva"+ where;
            //System.out.println(sql);
            ps = con.prepareStatement(sql);
            rs =ps.executeQuery();
            //Pasando resultado de la consulta
            ResultSetMetaData rsMd = rs.getMetaData();
            
            //Cuantos datos regresa esa consulta
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("ID");
            modelo.addColumn("ID Usuario");
            modelo.addColumn("ID Producto");
            modelo.addColumn("Tipo de Reserva");
            modelo.addColumn("Fecha Salida");
            modelo.addColumn("Fecha Entrega");
            
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
        
        
    }//GEN-LAST:event_btnCargarReservaActionPerformed

    private void menuEntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEntregarActionPerformed
        
        int fila = tableReserva.getSelectedRow();
        String id_reserva = tableReserva.getValueAt(fila, 0).toString();
        String id_producto = tableReserva.getValueAt(fila, 2).toString();
        String tipo_reserva = tableReserva.getValueAt(fila, 3).toString();
        PreparedStatement eliminar = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();
        
        try{
            String sql = "DELETE FROM reserva WHERE id_reserva='"+id_reserva+"'";
            
            eliminar = con.prepareStatement(sql);
            eliminar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Entregado con exito");
            String sql1=null;
            String disponible = "Si";
            PreparedStatement psEspacios = null;
            
            if (tipo_reserva.equals("Libro")){
               
                sql1 = "UPDATE libros SET disponible_l='" + disponible + "' WHERE id_libro='" + id_producto + "'";

            }else if(tipo_reserva.equals("Video")){
            
                sql1 = "UPDATE video SET disponible_v='" + disponible + "' WHERE id_video='" + id_producto + "'";
    
            }else if(tipo_reserva.equals("Espacio")){
            
                sql1 = "UPDATE espacios SET disponible_e='" + disponible + "' WHERE id_espacios='" + id_producto + "'";

            }
            psEspacios = con.prepareStatement(sql1);
            psEspacios.executeUpdate();
            
            CargarData();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se logró eliminar el Registro");
        }
        
    }//GEN-LAST:event_menuEntregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarReserva;
    private javax.swing.JButton btnCargarReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtfIdReserva;
    private javax.swing.JMenuItem menuEntregar;
    private javax.swing.JPopupMenu ppMenuEntregar;
    public static javax.swing.JTable tableReserva;
    // End of variables declaration//GEN-END:variables
}
