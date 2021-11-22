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
import java.sql.Statement;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel Medina
 */
public class PanelVideo extends javax.swing.JPanel implements AccionesVarias {

   
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
        menuReserva = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVideo = new javax.swing.JTable();
        btnAgregarVideo = new javax.swing.JButton();
        btnCargarIdV = new javax.swing.JButton();
        btnCargarBDvideo = new javax.swing.JButton();
        lblIdBuscar = new javax.swing.JLabel();
        jtfCargarIdV = new javax.swing.JTextField();
        lblIdV = new javax.swing.JLabel();
        lblEquipo = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        jtfIdVideo = new javax.swing.JTextField();
        jtfEquipoV = new javax.swing.JTextField();
        jtfMarcaV = new javax.swing.JTextField();
        jtfColorV = new javax.swing.JTextField();
        labelRecibe = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();

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

        menuReserva.setText("Reserva");
        menuReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReservaActionPerformed(evt);
            }
        });
        PopMenuElimEdi.add(menuReserva);

        jPanel1.setBackground(new java.awt.Color(45, 164, 242));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 102));
        lblTitle.setText("Video");

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

        lblIdBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIdBuscar.setText("ID video");

        lblIdV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIdV.setText("ID Video:");

        lblEquipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEquipo.setText("Equipo:");

        lblMarca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMarca.setText("Marca:");

        lblColor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblColor.setText("Color:");

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

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setText("Usuario:");
        lblUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblIdBuscar)
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
                                    .addComponent(lblIdV)
                                    .addComponent(lblMarca))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtfIdVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(lblEquipo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfEquipoV, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblColor)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtfColorV, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtfMarcaV, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(58, 58, 58)
                                    .addComponent(lblTitle)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnAgregarVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(427, 427, 427)
                                            .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelRecibe, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdV)
                            .addComponent(lblEquipo)
                            .addComponent(jtfIdVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfEquipoV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfColorV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblColor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMarca)
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
                    .addComponent(lblIdBuscar)
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
        try {
            disponible = "Si";
            if (!jtfIdVideo.getText().equals("")) {
                
                ps = conn.prepareStatement("INSERT INTO video(id_video,equipo_v,color_v,marca_v,disponible_v) "
                        + "VALUES (?,?,?,?,?)");

                ps.setString(1, jtfIdVideo.getText());
                ps.setString(2, jtfEquipoV.getText());
                ps.setString(3, jtfColorV.getText());
                ps.setString(4, jtfMarcaV.getText());
                ps.setString(5, disponible);

                ps.execute();
                JOptionPane.showMessageDialog(null, "Producto guardado con exito");

                CargarData();
                LimpiarTodo();
            } else {
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

        } catch (Exception ex) {
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

        if (!"".equals(campo)) {
            where = " WHERE id_video = '" + campo + "';";
        }

        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tableVideo.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();

            String sql = "SELECT id_video,equipo_v,color_v,marca_v,disponible_v FROM video" + where;
            System.out.println(sql);
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

    }//GEN-LAST:event_btnCargarIdVActionPerformed

    private void jtfIdVideoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfIdVideoKeyTyped

        if (jtfIdVideo.getText().length() >= 10) {
            evt.consume();
        }

    }//GEN-LAST:event_jtfIdVideoKeyTyped

    private void menuEliminarVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarVideoActionPerformed

        Eliminar();
    }//GEN-LAST:event_menuEliminarVideoActionPerformed

    private void menuEditarVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarVideoActionPerformed
        Editar();
    }//GEN-LAST:event_menuEditarVideoActionPerformed

    private void menuReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReservaActionPerformed

        Reservar();

    }//GEN-LAST:event_menuReservaActionPerformed

    @Override
    public void Reservar() {

        String label = PanelVideo.labelRecibe.getText();  //Valor del ID del usuario
        /*--------------------------------------------*/
        double num1 = 1 + Math.random();
        double num2 = 1.1 + Math.random();
        double suma = num1 + num2;
        DecimalFormat df = new DecimalFormat("#.####");
        String random = df.format(suma) + "-V"; //Valor del ID reserva
        /*--------------------------------------------*/

        try {
            PreparedStatement ps = null;

            Statement reserva = null;
            Statement video = null;

            ResultSet rs = null;
            ResultSet rs2 = null;

            Conexion conn = new Conexion();
            Connection con = conn.getConexion();

            String id_vid = null;
            String id_prod = null;
            String id_video, sql, sql1, tipo_reserva, id_reserva;

            int fila = tableVideo.getSelectedRow();

            id_video = tableVideo.getValueAt(fila, 0).toString();

            sql1 = "SELECT id_video FROM video " + "WHERE id_video=" + id_video;
            String sql2 = "SELECT id_producto FROM reserva" + " WHERE id_producto=" + id_video;

            video = con.createStatement();
            rs = video.executeQuery(sql1);

            reserva = con.createStatement();
            rs2 = reserva.executeQuery(sql2);

            while (rs.next()) {
                id_vid = rs.getString("id_video"); //ID del producto a reservar

            }
            while (rs2.next()) {
                id_prod = rs2.getString("id_producto");

            }

            /*-----------------------------------------------*/
            tipo_reserva = "Video"; //Tipo de producto
            /*-----------------------------------------------*/
            DateTimeFormatter fomato = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm");

            LocalDateTime salidaNow = LocalDateTime.now();
            LocalDate salidaDate = LocalDate.now();

            String formatSalida = salidaNow.format(fomato); //SALIDA
            /*----------------------------------------------*/
            DateTimeFormatter fomato2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate entrega;
            entrega = salidaDate.plusDays(0); //Entrega
            String formatEntrega = entrega.format(fomato2);
            /*----------------------------------------------*/

            if (id_vid.equals(id_prod)) {
                JOptionPane.showMessageDialog(null, "El equipo se encuentra disponible hasta: " + entrega);
            } else {

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
                ps.setString(3, id_vid);
                ps.setString(4, tipo_reserva);
                ps.setString(5, formatSalida);
                ps.setString(6, formatEntrega);

                ps.execute();
                JOptionPane.showMessageDialog(null, "Producto reservado con exito");

                PreparedStatement psVideo = null;

                String sql3 = "UPDATE video SET disponible_v='" + disponible + "' WHERE id_video=" + id_video;

                psVideo = con.prepareStatement(sql3);
                psVideo.executeUpdate();

                CargarData();
            }

        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "No se logró Actualizar el Registro");
        }
    }

    @Override
    public void Editar() {
        int fila = tableVideo.getSelectedRow();

        String id = tableVideo.getValueAt(fila, 0).toString();
        String equipo = tableVideo.getValueAt(fila, 1).toString();
        String color = tableVideo.getValueAt(fila, 2).toString();
        String marca = tableVideo.getValueAt(fila, 3).toString();

        PreparedStatement actualizar = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();

        try {
            String sql = "UPDATE video SET equipo_v='" + equipo + "', color_v='" + color + "', marca_v='" + marca + "'"
                    + " WHERE id_video=" + id + "";

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
        int fila = tableVideo.getSelectedRow();
        String valor = tableVideo.getValueAt(fila, 0).toString();

        PreparedStatement eliminar = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();

        try {
            String sql = "DELETE FROM video WHERE id_video=" + valor + "";

            eliminar = con.prepareStatement(sql);
            eliminar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Eliminado con exito");
            CargarData();
        } catch (SQLException e) {
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtfCargarIdV;
    private javax.swing.JTextField jtfColorV;
    private javax.swing.JTextField jtfEquipoV;
    private javax.swing.JTextField jtfIdVideo;
    private javax.swing.JTextField jtfMarcaV;
    public static javax.swing.JLabel labelRecibe;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblEquipo;
    private javax.swing.JLabel lblIdBuscar;
    private javax.swing.JLabel lblIdV;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUser;
    private javax.swing.JMenuItem menuEditarVideo;
    private javax.swing.JMenuItem menuEliminarVideo;
    private javax.swing.JMenuItem menuReserva;
    private javax.swing.JTable tableVideo;
    // End of variables declaration//GEN-END:variables

}
