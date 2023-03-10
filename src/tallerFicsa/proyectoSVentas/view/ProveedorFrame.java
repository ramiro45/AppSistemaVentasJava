/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package tallerFicsa.proyectoSVentas.view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tallerFicsa.proyectoSVentas.controller.PersonaJpaController;
import tallerFicsa.proyectoSVentas.entity.Persona;

/**
 *
 * @author Usuario
 */
public class ProveedorFrame extends javax.swing.JInternalFrame {
 private PersonaJpaController proobj = new PersonaJpaController();
    private DefaultTableModel model;
    private List<Persona> listaProveedor;
    private Persona Proveedor = new Persona();
    private String accion = "";
    /**
     * Creates new form ProveedorFrame
     */
    public ProveedorFrame() {
        initComponents();
        listarProveedores();
        disableForm();
       
    }
     private void disableForm() {
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnNuevo.setEnabled(true);
        btnEditar.setEnabled(true);
        btnEliminar.setEnabled(true);
        txtId.setText("");
        txtNombre.setText("");
       txtDireccion.setText("");
   txtEmail.setText("");
     txtId.setText("");
     txtNombre.setText("");
     txtNumerodoc.setText("");
     txtTelefono.setText("");
    }

    private void enableForm() {
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnNuevo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }
    
     private void listarProveedores() {
        model = (DefaultTableModel) tblDatos.getModel();
        if (model.getRowCount() > 0) {
            model.setNumRows(0);
        }
        Object[] obj = new Object[7];
        try {
       listaProveedor = proobj.findPersonaEntities();
            for (int i = 0; i < listaProveedor.size(); i++) {
                Proveedor = (Persona) listaProveedor.get(i);
                if(Proveedor.getTipoPersona().contentEquals("Proveedor")){
                obj[0] = Proveedor.getIdpersona();
                obj[1] = Proveedor.getNombre();
                obj[2] = Proveedor.getTipoDocumento();
                obj[3] = Proveedor.getNumDocumento();
                obj[4] = Proveedor.getDireccion();
                obj[5] = Proveedor.getTelefono();
                obj[6] = Proveedor.getEmail();
               
                model.addRow(obj);
                }
            }
            tblDatos.setModel(model);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error en el sistema", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        txtNumerodoc = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTipoDoc = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Proveedores");

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setText("ID:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Email");

        txtId.setEditable(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tallerFicsa/proyectoSVentas/Images/add.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tallerFicsa/proyectoSVentas/Images/cancelar.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(204, 204, 204));
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(204, 204, 204));
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel7.setText("N??");

        tblDatos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tblDatos.setBackground(new java.awt.Color(153, 255, 255));
        tblDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "TIPO DOC.", "NUMERO", "DIRECCION", "TELEFONO", "Email"
            }
        ));
        tblDatos.setFocusable(false);
        tblDatos.getTableHeader().setResizingAllowed(false);
        tblDatos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblDatos);

        jLabel8.setText("Tipo Documento:");

        jLabel9.setText("Direci??n");

        jLabel10.setText("Telefono");

        txtTipoDoc.setBackground(new java.awt.Color(0, 204, 255));
        txtTipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RUC", "DNI" }));
        txtTipoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoDocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnNuevo)
                                .addGap(40, 40, 40)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtTipoDoc, javax.swing.GroupLayout.Alignment.LEADING, 0, 225, Short.MAX_VALUE)
                                    .addComponent(txtNumerodoc, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 155, Short.MAX_VALUE)))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(153, 153, 153))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(btnCancelar)
                    .addComponent(txtTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNumerodoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnNuevo)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            //
            Persona Proveedor =new Persona();
          
          Proveedor.setTipoPersona("Proveedor");
            Proveedor.setNombre(txtNombre.getText());
             Proveedor.setTipoDocumento((String) txtTipoDoc.getSelectedItem());
              Proveedor.setNumDocumento(txtNumerodoc.getText());
              Proveedor.setDireccion(txtDireccion.getText());
              Proveedor.setTelefono(txtTelefono.getText());
              Proveedor.setEmail(txtEmail.getText());
                        int rpta = 0;
            switch (accion) {
                case "Agregar":
                proobj.create(Proveedor);
                rpta = 1;
                listarProveedores();
                disableForm();
                break;
                case "Editar":
                 Proveedor.setIdpersona(Integer.parseInt(txtId.getText()));
               Proveedor.setVentaList(proobj.findPersona(Integer.parseInt(txtId.getText())).getVentaList());
               Proveedor.setIngresoList(proobj.findPersona(Integer.parseInt(txtId.getText())).getIngresoList()); 
               proobj.edit(Proveedor);
                rpta = 1;
                 listarProveedores();
                disableForm();
                break;
                default:
                JOptionPane.showConfirmDialog(null, "No se encontro la accion", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
            if (rpta == 1) {
                JOptionPane.showMessageDialog(null, "Operacion realizada correctamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                
                disableForm();
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error en el sistema", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        disableForm();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtTipoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoDocActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tblDatos.getSelectedRowCount() == 1) {
                        try {
                                this.accion = "Editar";
                                enableForm();
                                int row = tblDatos.getSelectedRow();
                                txtId.setText(tblDatos.getValueAt(row, 0).toString());
                                PersonaJpaController catobj = new PersonaJpaController();
                                List<Persona> Proveedor = proobj.findPersonaEntities();
                                Persona Prov = new Persona();
                                Prov = proobj.findPersona(Integer.parseInt(txtId.getText()));
                                txtId.setText(String.valueOf(Prov.getIdpersona()));
                                txtNombre.setText(Prov.getNombre());
                                if (Prov.getTipoDocumento().equals("DNI")) {
                                      txtTipoDoc.setSelectedItem("DNI");
                                    } else {
                                        txtTipoDoc.setSelectedItem("RUC");
                                    }
                                
                                txtNumerodoc.setText(Prov.getNumDocumento());
                                txtDireccion.setText(Prov.getDireccion());
                                txtTelefono.setText(Prov.getTelefono());
                                txtEmail.setText(Prov.getEmail());
                                txtNombre.requestFocus();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Ocurrio algun error", "Informacion", JOptionPane.WARNING_MESSAGE);
                
                            }
               

        } else {
            JOptionPane.showMessageDialog(null, "Tiene que seleccionar algun registro", "Informacion", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        enableForm();
        txtId.requestFocus();
        accion = "Agregar";
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         if (tblDatos.getSelectedRowCount() == 1) {
            try {
                int row = tblDatos.getSelectedRow();
                int id = Integer.parseInt(tblDatos.getValueAt(row, 0).toString());
                String nombre = tblDatos.getValueAt(row, 1).toString();
                if(JOptionPane.showConfirmDialog(null, "??Seguro que desea eliminar " + nombre + "?") == JOptionPane.YES_OPTION) {
                   proobj.destroy(id);
//                proobj.findEliminadoLogico(id);
                    JOptionPane.showMessageDialog(null, "Operacion realizada correctamente", "Informaci??n", JOptionPane.INFORMATION_MESSAGE);
                    listarProveedores();
                       disableForm();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error en el sistema", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
             
        } else {
            JOptionPane.showMessageDialog(null, "Tiene que seleccionar un registro", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumerodoc;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JComboBox<String> txtTipoDoc;
    // End of variables declaration//GEN-END:variables
}
