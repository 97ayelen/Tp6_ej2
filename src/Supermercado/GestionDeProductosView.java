/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Supermercado;

import java.awt.Component;
import java.util.TreeSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author crb_p
 */
public class GestionDeProductosView extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    public static TreeSet<Producto> prod = new TreeSet<>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbCategorias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTDescripcion = new javax.swing.JTextField();
        jTCodigo = new javax.swing.JTextField();
        jTPrecio = new javax.swing.JTextField();
        jcbRubro = new javax.swing.JComboBox<>();
        jSStock = new javax.swing.JSpinner();
        jBSalir = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBActualizar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();

        setTitle("DE TODO S.A.: PRODUCTOS");
        setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestion de Productos");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Filtrar po Categoria:");

        jcbCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCategoriasActionPerformed(evt);
            }
        });

        jTableProductos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProductos);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Codigo:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Descripcion:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Precio:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Rubro:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Stock:");

        jTDescripcion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCodigoActionPerformed(evt);
            }
        });

        jTCodigo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jTPrecio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPrecioActionPerformed(evt);
            }
        });

        jSStock.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSStock.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                        .addComponent(jTCodigo)
                        .addComponent(jTPrecio)
                        .addComponent(jcbRubro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSStock, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcbRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jSStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jBSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/exit_run_icon_136655.png"))); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.setHideActionText(true);
        jBSalir.setIconTextGap(10);
        jBSalir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-magnifying-glass-tilted-right-48.png"))); // NOI18N
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBNuevo.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jBNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/nuevo.png"))); // NOI18N
        jBNuevo.setText("Nuevo");
        jBNuevo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jBNuevo.setIconTextGap(16);
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBGuardar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar.png"))); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.setEnabled(false);
        jBGuardar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jBGuardar.setIconTextGap(12);
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBActualizar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jBActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actualizar.png"))); // NOI18N
        jBActualizar.setText("Actualizar");
        jBActualizar.setEnabled(false);
        jBActualizar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jBActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBActualizar.setIconTextGap(12);
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        jBEliminar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eliminar.png"))); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.setEnabled(false);
        jBEliminar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jBEliminar.setIconTextGap(14);
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jcbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jBGuardar)
                                .addGap(41, 41, 41)
                                .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBSalir, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(24, 24, 24)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        int fila = jTableProductos.getSelectedRow();
        if (fila != -1) {
            String s1 = jTableProductos.getValueAt(fila, 0).toString();
            int codigo = Integer.parseInt(s1);
            for (Producto p : prod) {
                if(p.getCodigo() == codigo) {
                    prod.remove(p);
                    modelo.removeRow(fila);
                    JOptionPane.showMessageDialog(this, "Producto eliminado con éxito", "Válido", JOptionPane.INFORMATION_MESSAGE);
                    limpiarCampos(jPanel1);
                    desactivarCampos();
                    jBEliminar.setEnabled(false);
                    break;
                }
            }
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void ArmarCabecera() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Categoria");
        modelo.addColumn("Stock");
        jTableProductos.setModel(modelo);

    }

    private void CargarDatos(Producto p) {
        modelo.addRow(new Object[]{
            p.getCodigo(),
            p.getDescripcion(),
            p.getPrecio(),
            p.getRubro(),
            p.getStock()
        });
    }

    public GestionDeProductosView() {
        initComponents();
        ArmarCabecera();
        llenarCombo();
        desactivarCampos();
    }

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        if (!validaCamposVacios(jPanel1)) {
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos para guardar producto", "Campos incompletos", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            int codigo = Integer.parseInt(jTCodigo.getText().trim());
            String descripcion = jTDescripcion.getText().trim();
            double precio = Double.parseDouble(jTPrecio.getText().trim());
            Categoria rubro = (Categoria) jcbRubro.getSelectedItem();
            int stock = (Integer) jSStock.getValue();
//        VIDEO JtABLE PARTE 1
            Producto pr = new Producto(codigo, descripcion, precio, stock, rubro);

            if (prod.add(pr)) {
                CargarDatos(pr);
                JOptionPane.showMessageDialog(this, "Producto agregado con éxito", "Válido", JOptionPane.INFORMATION_MESSAGE);
                jBGuardar.setEnabled(false);
                desactivarCampos();
                limpiarCampos(jPanel1);
            } else {
                JOptionPane.showMessageDialog(this, "Ya existe un producto con ese código", "Inválido", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        activarCampos();
        limpiarCampos(jPanel1);
        jBGuardar.setEnabled(true);
        jBActualizar.setEnabled(false);
        jBEliminar.setEnabled(false);
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jTCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCodigoActionPerformed

    private void jTPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPrecioActionPerformed

    private void jcbCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCategoriasActionPerformed
        Categoria seleccionada = (Categoria) jcbCategorias.getSelectedItem();
        modelo.setRowCount(0);

        for (Producto p : prod) {
            if (p.getRubro().equals(seleccionada)) {
                CargarDatos(p);
            }
        }
    }//GEN-LAST:event_jcbCategoriasActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
        int fila = jTableProductos.getSelectedRow();
        
        if (!validaCamposVacios(jPanel1)){
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos para guardar producto", "Campos incompletos", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (fila != -1) {
            String s1 = jTableProductos.getValueAt(fila, 0).toString();
            int codigo = Integer.parseInt(s1);
            try {
                for (Producto aux : prod) {
                    if (aux.getCodigo() == codigo) {
                        aux.setCodigo(Integer.parseInt(jTCodigo.getText()));
                        aux.setDescripcion(jTDescripcion.getText());
                        aux.setPrecio(Double.parseDouble(jTPrecio.getText()));
                        aux.setRubro((Categoria) jcbRubro.getSelectedItem());
                        aux.setStock((Integer) jSStock.getValue());
                        JOptionPane.showMessageDialog(this, "El producto se ha modificado exitosamente!", "Válido", JOptionPane.INFORMATION_MESSAGE);
                        limpiarCampos(jPanel1);
                        desactivarCampos();
                            modelo.setValueAt(aux.getDescripcion(), fila, 1);
                            modelo.setValueAt(aux.getPrecio(), fila, 2);
                            modelo.setValueAt(aux.getRubro(), fila, 3);
                            modelo.setValueAt(aux.getStock(), fila, 4);
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Debe ingresar un número válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jTableProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProductosMouseClicked
        int fila = jTableProductos.rowAtPoint(evt.getPoint());
        
        if (fila != -1) {
            jTableProductos.setRowSelectionInterval(fila, fila);
            jBActualizar.setEnabled(true);
            jBEliminar.setEnabled(true);
            String codigo = jTableProductos.getValueAt(fila, 0).toString();
            String descripcion = jTableProductos.getValueAt(fila, 1).toString();
            String precio = jTableProductos.getValueAt(fila, 2).toString();
            String rubro = jTableProductos.getValueAt(fila, 3).toString();
            String stock = jTableProductos.getValueAt(fila, 4).toString();
            jTCodigo.setText(codigo);
            jTDescripcion.setText(descripcion);
            jTPrecio.setText(precio);
            jcbRubro.setSelectedItem(rubro);
            jSStock.setValue(Integer.parseInt(stock));
        }
        
        activarCampos();
        jTCodigo.setEditable(false);
        
    }//GEN-LAST:event_jTableProductosMouseClicked

    private void llenarCombo() {
        for (Categoria aux : Categoria.values()) {
            jcbCategorias.addItem(aux);
            jcbRubro.addItem(aux);
        }
    }

    private void activarCampos() {
        jTCodigo.setEditable(true);
        jTDescripcion.setEditable(true);
        jTPrecio.setEditable(true);
        jcbRubro.setEnabled(true);
        jSStock.setEnabled(true);
    }

    private void desactivarCampos() {
        jTCodigo.setEditable(false);
        jTDescripcion.setEditable(false);
        jTPrecio.setEditable(false);
        jcbRubro.setEnabled(false);
        jSStock.setEnabled(false);
    }

    public boolean validaCamposVacios(JPanel panel) {
        for (Component comp : panel.getComponents()) {
            if (comp instanceof JTextField) {
                JTextField txt = (JTextField) comp;
                if (txt.getText().trim().isEmpty()) {
                    return false;
                }
            } else if (comp instanceof JComboBox) {
                JComboBox combo = (JComboBox) comp;
                Object selected = combo.getSelectedItem();
                if (selected == null || selected.toString().trim().isEmpty()) {
                    return false;
                }
            }
        }

        return true;
    }

    public void limpiarCampos(JPanel panel) {
        for (Component c : panel.getComponents()) {
            if (c instanceof JTextField) {
                JTextField caja = (JTextField) c;
                caja.setText("");
            } else if (c instanceof JComboBox) {
                JComboBox combo = (JComboBox) c;
                combo.setSelectedIndex(-1);
            } else if (c instanceof JSpinner) {
                JSpinner op = (JSpinner) c;
                op.setValue(0);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSStock;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTDescripcion;
    private javax.swing.JTextField jTPrecio;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JComboBox<Categoria> jcbCategorias;
    private javax.swing.JComboBox<Categoria> jcbRubro;
    // End of variables declaration//GEN-END:variables

}
