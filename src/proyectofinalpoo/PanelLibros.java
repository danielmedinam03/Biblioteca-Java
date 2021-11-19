/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyectofinalpoo;

import Interface.AccionesVarias;
import conexion.Conexion;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Daniel Medina
 */
public class PanelLibros extends javax.swing.JPanel implements AccionesVarias{

    /**
     * Creates new form PanelLibros
     */
    public PanelLibros() {
        initComponents();
        CargarData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        PopMenu = new javax.swing.JPopupMenu();
        menuEliminar = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenuItem();
        menuReservar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfBuscarID = new javax.swing.JTextField();
        btnCargarLib = new javax.swing.JButton();
        btnCargarLibro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfIDLib = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfNombreLib = new javax.swing.JTextField();
        jtfAutorLib = new javax.swing.JTextField();
        jtfPaginasLib = new javax.swing.JTextField();
        jtfAnioLib = new javax.swing.JTextField();
        jtfEditorialLib = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnAgregarLib = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLibro = new javax.swing.JTable();
        labelRecibe = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        menuEliminar.setText("Eliminar");
        menuEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarActionPerformed(evt);
            }
        });
        PopMenu.add(menuEliminar);

        menuEditar.setText("Editar");
        menuEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarActionPerformed(evt);
            }
        });
        PopMenu.add(menuEditar);

        menuReservar.setText("Reservar");
        menuReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReservarActionPerformed(evt);
            }
        });
        PopMenu.add(menuReservar);

        jPanel1.setBackground(new java.awt.Color(45, 164, 242));
        jPanel1.setForeground(new java.awt.Color(34, 95, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ID:");

        jtfBuscarID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfBuscarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBuscarIDActionPerformed(evt);
            }
        });

        btnCargarLib.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCargarLib.setText("Actualizar");
        btnCargarLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarLibActionPerformed(evt);
            }
        });

        btnCargarLibro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCargarLibro.setText("Cargar ");
        btnCargarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarLibroActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Autor:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Editorial:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Nro de Páginas:");

        jtfIDLib.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfIDLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIDLibActionPerformed(evt);
            }
        });
        jtfIDLib.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfIDLibKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Año:");

        jtfNombreLib.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfNombreLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreLibActionPerformed(evt);
            }
        });

        jtfAutorLib.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfAutorLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAutorLibActionPerformed(evt);
            }
        });

        jtfPaginasLib.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfPaginasLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPaginasLibActionPerformed(evt);
            }
        });

        jtfAnioLib.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfAnioLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAnioLibActionPerformed(evt);
            }
        });
        jtfAnioLib.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfAnioLibKeyTyped(evt);
            }
        });

        jtfEditorialLib.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfEditorialLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEditorialLibActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Libreria UCC");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnAgregarLib.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAgregarLib.setText("Agregar");
        btnAgregarLib.setBorder(null);
        btnAgregarLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLibActionPerformed(evt);
            }
        });

        tableLibro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tableLibro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tableLibro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Autor", "Editorial", "# de Paginas", "Año", "Disponible"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableLibro.setComponentPopupMenu(PopMenu);
        jScrollPane1.setViewportView(tableLibro);

        labelRecibe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelRecibe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRecibe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Usuario:");
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jtfBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCargarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCargarLib)
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfIDLib, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(12, 12, 12)
                                .addComponent(jtfNombreLib, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfAutorLib, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelRecibe, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfEditorialLib, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfPaginasLib, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfAnioLib, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addComponent(btnAgregarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(labelRecibe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfIDLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jtfAutorLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombreLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfEditorialLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jtfPaginasLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jtfAnioLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargarLibro)
                    .addComponent(btnCargarLib))
                .addGap(95, 95, 95))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfBuscarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBuscarIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfBuscarIDActionPerformed

    private void btnCargarLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarLibActionPerformed
        CargarData();
        LimpiarTodo();
    }//GEN-LAST:event_btnCargarLibActionPerformed

    private void jtfIDLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIDLibActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIDLibActionPerformed

    private void jtfNombreLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreLibActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreLibActionPerformed

    private void jtfAutorLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAutorLibActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfAutorLibActionPerformed

    private void jtfPaginasLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPaginasLibActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPaginasLibActionPerformed

    private void jtfAnioLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAnioLibActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfAnioLibActionPerformed

    private void jtfEditorialLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEditorialLibActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEditorialLibActionPerformed

    private void btnAgregarLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLibActionPerformed
        
        try{
            Conexion objCon = new Conexion();
            Connection conn = objCon.getConexion();
            DefaultTableModel modelo = new DefaultTableModel();
            PreparedStatement ps = null;
            tableLibro.setModel(modelo);
            String id_producto, disponible;

            PreparedStatement select = null;
            
            disponible = "Si";
            if(!jtfIDLib.getText().equals("")){
                ps = conn.prepareStatement("INSERT INTO libros(id_libro,nombre_l,autor_l,editorial_l,nro_paginas_l,anio_l,disponible_l) "
                        + "VALUES (?,?,?,?,?,?,?)");

                ps.setString(1,jtfIDLib.getText());
                ps.setString(2,jtfNombreLib.getText());
                ps.setString(3,jtfAutorLib.getText());
                ps.setString(4,jtfEditorialLib.getText());
                ps.setString(5,jtfPaginasLib.getText());
                ps.setString(6,jtfAnioLib.getText());
                ps.setString(7,disponible);

                ps.execute();
                JOptionPane.showMessageDialog(null, "Producto guardado con exito");
                CargarData();
                LimpiarTodo();
            }else{
                JOptionPane.showMessageDialog(null, "Producto NO guardado, intentelo nuevamente.");
                CargarData();
                LimpiarTodo();
            }
            Object[] fila = new Object[7];
            fila[0] = jtfIDLib.getText();
            fila[1] = jtfNombreLib.getText();
            fila[2] = jtfAutorLib.getText();
            fila[3] = jtfEditorialLib.getText();
            fila[4] = jtfPaginasLib.getText();
            fila[5] = jtfAnioLib.getText();
            fila[6] = disponible;
            
            modelo.addRow(fila);

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al guardar el producto, el ID ya existe.");
            System.out.println(ex);
            CargarData();
            
        }
        
    }//GEN-LAST:event_btnAgregarLibActionPerformed

    private void btnCargarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarLibroActionPerformed

        String campo = jtfBuscarID.getText();
        String where = "";
        
        if (!"".equals(campo)){
            where = " WHERE id_libro = '" + campo + "';";
        }
        
        
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            tableLibro.setModel(modelo);
            
            PreparedStatement ps =null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();
            
            String sql = "SELECT id_libro, nombre_l, autor_l, editorial_l, nro_paginas_l, anio_l, disponible_l FROM libros " + where;
            //System.out.println(sql);
            ps = con.prepareStatement(sql);
            rs =ps.executeQuery();
            //Pasando resultado de la consulta
            ResultSetMetaData rsMd = rs.getMetaData();
            
            //Cuantos datos regresa esa consulta
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Autor");
            modelo.addColumn("Editorial");
            modelo.addColumn("# de Páginas");
            modelo.addColumn("Año");
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
        
    }//GEN-LAST:event_btnCargarLibroActionPerformed

    private void jtfIDLibKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfIDLibKeyTyped

        if(jtfIDLib.getText().length() >= 10){
            evt.consume();
        }

    }//GEN-LAST:event_jtfIDLibKeyTyped

    private void jtfAnioLibKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfAnioLibKeyTyped

        if(jtfAnioLib.getText().length() >= 4){
            evt.consume();
        }
    }//GEN-LAST:event_jtfAnioLibKeyTyped

    private void menuEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarActionPerformed
        Eliminar();
    }//GEN-LAST:event_menuEliminarActionPerformed

    private void menuEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarActionPerformed
        Editar();
    }//GEN-LAST:event_menuEditarActionPerformed

    private void menuReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReservarActionPerformed

        Reservar();
        
    }//GEN-LAST:event_menuReservarActionPerformed

    public void Reservar() {

        String label = PanelLibros.labelRecibe.getText();  //Valor del ID del usuario
        /*--------------------------------------------*/
        double num1 = 1 + Math.random();
        double num2 = 1.1 + Math.random();
        double suma = num1 + num2;
        DecimalFormat df = new DecimalFormat("#.####");
        String random = df.format(suma) + "-L"; //Valor del ID reserva
        /*--------------------------------------------*/

        try {
            PreparedStatement ps = null;

            Statement reserva = null;
            Statement libro = null;

            ResultSet rs = null;
            ResultSet rs2 = null;

            Conexion conn = new Conexion();
            Connection con = conn.getConexion();

            String id_lib = null;
            String id_prod = null;
            String id_libro, sql, sql1, tipo_reserva, id_reserva;

            int fila = tableLibro.getSelectedRow();
            //int fila2 = PanelReserva.tableReserva.getSelectedRow();

            id_libro = tableLibro.getValueAt(fila, 0).toString();
            //id_reserva = PanelReserva.tableReserva.getValueAt(fila, 0).toString();

            sql1 = "SELECT id_libro FROM libros " + "WHERE id_libro=" + id_libro;
            String sql2 = "SELECT id_producto FROM reserva" + " WHERE id_producto=" + id_libro;

            libro = con.createStatement();
            rs = libro.executeQuery(sql1);

            reserva = con.createStatement();
            rs2 = reserva.executeQuery(sql2);

            while (rs.next()) {
                id_lib = rs.getString("id_libro"); //ID del producto a reservar
                
            }
            while(rs2.next()){
                id_prod = rs2.getString("id_producto");
                
            }
            
            /*-----------------------------------------------*/
            tipo_reserva = "Libro"; //Tipo de producto
            /*-----------------------------------------------*/
            DateTimeFormatter fomato = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm");

            LocalDateTime salidaNow = LocalDateTime.now();
            LocalDate salidaDate = LocalDate.now();

            String formatSalida = salidaNow.format(fomato); //SALIDA
            /*----------------------------------------------*/
            DateTimeFormatter fomato2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate entrega;
            entrega = salidaDate.plusDays(5); //Entrega
            String formatEntrega = entrega.format(fomato2);
            /*----------------------------------------------*/
            
            if (id_lib.equals(id_prod)){
                JOptionPane.showMessageDialog(null, "El Libro se encuentra disponible hasta: " + entrega);
            }else{

                Conexion objCon = new Conexion();

                DefaultTableModel modelo = new DefaultTableModel();
                PanelReserva reservar = new PanelReserva();
                reservar.tableReserva.setModel(modelo);
                String disponible;

                sql = "INSERT INTO reserva(id_reserva,id_usuario,id_producto,tipo_reserva,fecha_salida,fecha_entrega) " + ""
                        + "VALUES (?,?,?,?,?,?)";

                disponible = "No";
                ps = con.prepareStatement(sql);

                ps.setString(1, random);
                ps.setString(2, label);
                ps.setString(3, id_lib);
                ps.setString(4, tipo_reserva);
                ps.setString(5, formatSalida);
                ps.setString(6, formatEntrega);

                ps.execute();
                JOptionPane.showMessageDialog(null, "Producto reservado con exito");

                PreparedStatement psEspacios = null;

                //String id_espacios = tableEspacio.getValueAt(fila, 0).toString();
                String sql3 = "UPDATE libros SET disponible_l='" + disponible + "' WHERE id_libro=" + id_libro;

                psEspacios = con.prepareStatement(sql3);
                psEspacios.executeUpdate();

                CargarData();
            }
            

        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "No se logró Actualizar el Registro");
        }
    }

    
    @Override
    public void Editar(){
        int fila = tableLibro.getSelectedRow();
        
        String id = tableLibro.getValueAt(fila, 0).toString();
        String nombre = tableLibro.getValueAt(fila, 1).toString();
        String autor = tableLibro.getValueAt(fila, 2).toString();
        String editorial = tableLibro.getValueAt(fila, 3).toString();
        int nroPaginas = Integer.parseInt(tableLibro.getValueAt(fila, 4).toString());
        int anio = Integer.parseInt(tableLibro.getValueAt(fila, 5).toString());

        
        PreparedStatement actualizar = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();
        
        try{
            String sql = "UPDATE libros SET nombre_l='"+nombre+"', autor_l='"+autor+"', editorial_l='"+editorial+"'"+
                    ", nro_paginas_l="+nroPaginas+", anio_l="+anio+" WHERE id_libro="+id+"";
             
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
        int fila = tableLibro.getSelectedRow();
        String valor = tableLibro.getValueAt(fila, 0).toString();
        
        PreparedStatement eliminar = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();
        
        try{
            String sql = "DELETE FROM libros WHERE id_libro="+valor+"";
            
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
        
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            tableLibro.setModel(modelo);
            
            PreparedStatement ps =null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();
            
            String sql = "SELECT id_libro, nombre_l, autor_l, editorial_l, nro_paginas_l, anio_l, disponible_l FROM libros";
            //System.out.println(sql);
            ps = con.prepareStatement(sql);
            rs =ps.executeQuery();
            //Pasando resultado de la consulta
            ResultSetMetaData rsMd = rs.getMetaData();
            
            //Cuantos datos regresa esa consulta
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Autor");
            modelo.addColumn("Editorial");
            modelo.addColumn("# de Páginas");
            modelo.addColumn("Año");
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
    }
    
    @Override
    public void LimpiarTodo() {
        jtfAnioLib.setText("");
        jtfAutorLib.setText("");
        jtfBuscarID.setText("");
        jtfEditorialLib.setText("");
        jtfIDLib.setText("");
        jtfNombreLib.setText("");
        jtfPaginasLib.setText("");

        jtfIDLib.requestFocus();    
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu PopMenu;
    private javax.swing.JButton btnAgregarLib;
    private javax.swing.JButton btnCargarLib;
    private javax.swing.JButton btnCargarLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtfAnioLib;
    private javax.swing.JTextField jtfAutorLib;
    private javax.swing.JTextField jtfBuscarID;
    private javax.swing.JTextField jtfEditorialLib;
    private javax.swing.JTextField jtfIDLib;
    private javax.swing.JTextField jtfNombreLib;
    private javax.swing.JTextField jtfPaginasLib;
    public static javax.swing.JLabel labelRecibe;
    private javax.swing.JMenuItem menuEditar;
    private javax.swing.JMenuItem menuEliminar;
    private javax.swing.JMenuItem menuReservar;
    private javax.swing.JTable tableLibro;
    // End of variables declaration//GEN-END:variables
}
