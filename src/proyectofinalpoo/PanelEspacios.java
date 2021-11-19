/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyectofinalpoo;

import Interface.AccionesVarias;
import Interface.MostrarPanel;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;


public class PanelEspacios extends javax.swing.JPanel implements AccionesVarias {

    public PanelEspacios() {

        initComponents();
        CargarData();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popMenuRegistros = new javax.swing.JPopupMenu();
        menuEliminar = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenuItem();
        menuReservar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEspacio = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfIdE = new javax.swing.JTextField();
        jtfNombreE = new javax.swing.JTextField();
        jtfDescripcionE = new javax.swing.JTextField();
        jtfCapacidadE = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jtfBuscarIdE = new javax.swing.JTextField();
        btnCargarEspa = new javax.swing.JButton();
        btnCargarBDEspa = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnAddEspacios = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        labelRecibe = new javax.swing.JLabel();

        menuEliminar.setText("Eliminar");
        menuEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarActionPerformed(evt);
            }
        });
        popMenuRegistros.add(menuEliminar);

        menuEditar.setText("Editar");
        menuEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarActionPerformed(evt);
            }
        });
        popMenuRegistros.add(menuEditar);

        menuReservar.setText("Reservar");
        menuReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReservarActionPerformed(evt);
            }
        });
        popMenuRegistros.add(menuReservar);

        jPanel1.setBackground(new java.awt.Color(45, 164, 242));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Espacios");

        tableEspacio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tableEspacio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tableEspacio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Capacidad", "Descripción", "Disponible"
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
        tableEspacio.setComponentPopupMenu(popMenuRegistros);
        jScrollPane1.setViewportView(tableEspacio);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("ID Espacio:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Capacidad:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Descripción:");

        jtfIdE.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfIdE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfIdEKeyTyped(evt);
            }
        });

        jtfNombreE.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jtfDescripcionE.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jtfCapacidadE.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("ID espacio:");

        btnCargarEspa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCargarEspa.setText("Cargar");
        btnCargarEspa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCargarEspa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarEspaActionPerformed(evt);
            }
        });

        btnCargarBDEspa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCargarBDEspa.setText("Actualizar");
        btnCargarBDEspa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCargarBDEspa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarBDEspaActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(45, 164, 242));

        btnAddEspacios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAddEspacios.setText("Agregar");
        btnAddEspacios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddEspacios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEspaciosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddEspacios, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(btnAddEspacios, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Usuario:");
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelRecibe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelRecibe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRecibe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfBuscarIdE, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCargarEspa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCargarBDEspa, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfCapacidadE, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfIdE, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfDescripcionE, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jtfNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelRecibe, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtfIdE)
                                    .addComponent(jLabel2))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(10, 10, 10)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelRecibe, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jtfBuscarIdE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCargarEspa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCargarBDEspa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfDescripcionE, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jtfCapacidadE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void btnAddEspaciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEspaciosActionPerformed

        Conexion objCon = new Conexion();
        Connection conn = objCon.getConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        PreparedStatement ps = null;
        tableEspacio.setModel(modelo);
        String id_producto, disponible;

        PreparedStatement select = null;
        try {

            disponible = "Si";

            if (!jtfIdE.getText().equals("")) {
                ps = conn.prepareStatement("INSERT INTO espacios(id_espacios,nombre_e,capacidad_e,descripcion_e,disponible_e) "
                        + "VALUES (?,?,?,?,?)");

                ps.setString(1, jtfIdE.getText());
                ps.setString(2, jtfNombreE.getText());
                ps.setString(3, jtfCapacidadE.getText());
                ps.setString(4, jtfDescripcionE.getText());
                ps.setString(5, disponible);

                ps.execute();

                JOptionPane.showMessageDialog(null, "Producto guardado con exito");
                CargarData();
                LimpiarTodo();
            } else {
                JOptionPane.showMessageDialog(null, "Producto NO guardado, intentelo nuevamente.");
                LimpiarTodo();
                CargarData();
            }

            Object[] fila = new Object[5];
            fila[0] = jtfIdE.getText();
            fila[1] = jtfNombreE.getText();
            fila[2] = jtfCapacidadE.getText();
            fila[3] = jtfDescripcionE.getText();
            fila[4] = disponible;

            modelo.addRow(fila);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar el producto, el ID ya existe.");
            LimpiarTodo();
            CargarData();
            System.out.println(ex);
        }

    }//GEN-LAST:event_btnAddEspaciosActionPerformed

    @Override
    public void CargarData() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tableEspacio.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();

            String sql = "SELECT id_espacios,nombre_e,capacidad_e,descripcion_e,disponible_e FROM espacios";
            //System.out.println(sql);
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            //Pasando resultado de la consulta
            ResultSetMetaData rsMd = rs.getMetaData();

            //Cuantos datos regresa esa consulta
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Capacidad");
            modelo.addColumn("Descripción");
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

    private void btnCargarBDEspaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarBDEspaActionPerformed
        CargarData();

    }//GEN-LAST:event_btnCargarBDEspaActionPerformed

    private void btnCargarEspaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarEspaActionPerformed

        String campo = jtfBuscarIdE.getText();
        String where = "";

        if (!"".equals(campo)) {
            where = " WHERE id_espacios = '" + campo + "';";
        }

        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tableEspacio.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();

            String sql = "SELECT id_espacios,nombre_e,capacidad_e,descripcion_e,disponible_e FROM espacios" + where;
            //System.out.println(sql);
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            //Pasando resultado de la consulta
            ResultSetMetaData rsMd = rs.getMetaData();

            //Cuantos datos regresa esa consulta
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Capacidad");
            modelo.addColumn("Descripción");
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

    }//GEN-LAST:event_btnCargarEspaActionPerformed

    private void jtfIdEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfIdEKeyTyped

        if (jtfIdE.getText().length() >= 10) {
            evt.consume();
        }

    }//GEN-LAST:event_jtfIdEKeyTyped

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

        String label = PanelEspacios.labelRecibe.getText();  //Valor del ID del usuario
        /*--------------------------------------------*/
        double num1 = 1 + Math.random();
        double num2 = 1.1 + Math.random();
        double suma = num1 + num2;
        DecimalFormat df = new DecimalFormat("#.####");
        String random = df.format(suma) + "-E"; //Valor del ID reserva
        /*--------------------------------------------*/

        try {
            PreparedStatement ps = null;

            Statement reserva = null;
            Statement espacio = null;

            ResultSet rs = null;
            ResultSet rs2 = null;

            Conexion conn = new Conexion();
            Connection con = conn.getConexion();

            String id_esp = null;
            String id_prod = null;
            String id_espacio, sql, sql1, tipo_reserva, id_reserva;

            int fila = tableEspacio.getSelectedRow();
            //int fila2 = PanelReserva.tableReserva.getSelectedRow();

            id_espacio = tableEspacio.getValueAt(fila, 0).toString();
            //id_reserva = PanelReserva.tableReserva.getValueAt(fila, 0).toString();

            sql1 = "SELECT id_espacios FROM espacios " + "WHERE id_espacios=" + id_espacio;
            String sql2 = "SELECT id_producto FROM reserva" + " WHERE id_producto=" + id_espacio;

            espacio = con.createStatement();
            rs = espacio.executeQuery(sql1);

            reserva = con.createStatement();
            rs2 = reserva.executeQuery(sql2);

            while (rs.next()) {
                id_esp = rs.getString("id_espacios"); //ID del producto a reservar
                
            }
            while(rs2.next()){
                id_prod = rs2.getString("id_producto");
                
            }
            
            /*-----------------------------------------------*/
            tipo_reserva = "Espacio"; //Tipo de producto
            /*-----------------------------------------------*/
            DateTimeFormatter fomato = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm");

            LocalDateTime salidaNow = LocalDateTime.now();
            LocalDate salidaDate = LocalDate.now();

            String formatSalida = salidaNow.format(fomato); //SALIDA
            /*----------------------------------------------*/
            DateTimeFormatter fomato2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate entrega;
            entrega = salidaDate.plusDays(2); //Entrega
            String formatEntrega = entrega.format(fomato2);
            /*----------------------------------------------*/
            
            if (id_esp.equals(id_prod)){
                JOptionPane.showMessageDialog(null, "El Espacio se encuentra disponible hasta: " + entrega);
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
                ps.setString(3, id_esp);
                ps.setString(4, tipo_reserva);
                ps.setString(5, formatSalida);
                ps.setString(6, formatEntrega);

                ps.execute();
                JOptionPane.showMessageDialog(null, "Producto reservado con exito");

                PreparedStatement psEspacios = null;

                //String id_espacios = tableEspacio.getValueAt(fila, 0).toString();
                String sql3 = "UPDATE espacios SET disponible_e='" + disponible + "' WHERE id_espacios=" + id_espacio;

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
    public void Editar() {
        int fila = tableEspacio.getSelectedRow();

        String id = tableEspacio.getValueAt(fila, 0).toString();
        String nombre = tableEspacio.getValueAt(fila, 1).toString();
        int capacidad = Integer.parseInt(tableEspacio.getValueAt(fila, 2).toString());
        String descripcion = tableEspacio.getValueAt(fila, 3).toString();

        PreparedStatement actualizar = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();

        try {
            String sql = "UPDATE espacios SET nombre_e='" + nombre + "', capacidad_e=" + capacidad + ", descripcion_e='" + descripcion + "'"
                    + "WHERE id_espacios=" + id + "";

            actualizar = con.prepareStatement(sql);
            actualizar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Actualizado con exito");
            CargarData();
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "No se logró Actualizar el Registro");
        }
    }

    @Override
    public void Eliminar() {
        int fila = tableEspacio.getSelectedRow();
        String valor = tableEspacio.getValueAt(fila, 0).toString();

        PreparedStatement eliminar = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();

        try {
            String sql = "DELETE FROM espacios WHERE id_espacios=" + valor + "";

            eliminar = con.prepareStatement(sql);
            eliminar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Eliminado con exito");
            CargarData();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se logró eliminar el Registro");
        }

    }

    @Override
    public void LimpiarTodo() {

        jtfBuscarIdE.setText("");
        jtfCapacidadE.setText("");
        jtfDescripcionE.setText("");
        jtfIdE.setText("");
        jtfNombreE.setText("");

        jtfIdE.requestFocus();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEspacios;
    private javax.swing.JButton btnCargarBDEspa;
    private javax.swing.JButton btnCargarEspa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtfBuscarIdE;
    private javax.swing.JTextField jtfCapacidadE;
    private javax.swing.JTextField jtfDescripcionE;
    private javax.swing.JTextField jtfIdE;
    private javax.swing.JTextField jtfNombreE;
    public static javax.swing.JLabel labelRecibe;
    private javax.swing.JMenuItem menuEditar;
    private javax.swing.JMenuItem menuEliminar;
    private javax.swing.JMenuItem menuReservar;
    private javax.swing.JPopupMenu popMenuRegistros;
    private javax.swing.JTable tableEspacio;
    // End of variables declaration//GEN-END:variables
}
