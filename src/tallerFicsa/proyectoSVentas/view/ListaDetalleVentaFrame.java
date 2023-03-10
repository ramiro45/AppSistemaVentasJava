/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package tallerFicsa.proyectoSVentas.view;

import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tallerFicsa.proyectoSVentas.controller.DetalleIngresoJpaController;
import tallerFicsa.proyectoSVentas.controller.DetalleVentaJpaController;
import tallerFicsa.proyectoSVentas.controller.IngresoJpaController;
import tallerFicsa.proyectoSVentas.entity.DetalleIngreso;
import tallerFicsa.proyectoSVentas.entity.DetalleVenta;
import tallerFicsa.proyectoSVentas.entity.Ingreso;

/**
 *
 * @author Usuario
 */
public class ListaDetalleVentaFrame extends javax.swing.JInternalFrame {


    private DefaultTableModel model;
    private DetalleVentaJpaController dvenobj = new DetalleVentaJpaController();
    private List<DetalleVenta> listadetalleVentas;
    private DetalleVenta detalle = new DetalleVenta();

    /**
     * Creates new form ListaDetalleIngresoFrame
     */
    public ListaDetalleVentaFrame(int idIngreso) {
        initComponents();
        
        listaDetalles(idIngreso);
 
    }

    


    private void listaDetalles(int idIngreso) {

//        JButton btn = new JButton("...");
        model = (DefaultTableModel) tblDatos.getModel();
        if (model.getRowCount() > 0) {
            model.setNumRows(0);
        }
        Object[] obj = new Object[6];
        try {
            listadetalleVentas = dvenobj.ListarDetalleVentaxIdVenta(idIngreso);
            for (int i = 0; i < listadetalleVentas.size(); i++) {
                detalle = (DetalleVenta) listadetalleVentas.get(i);
                obj[0] = detalle.getIddetalleVenta();
                obj[1] = detalle.getIdarticulo().getNombre();
                obj[2] = detalle.getCantidad();
                obj[3] = detalle.getPrecioVenta();
                obj[4] = detalle.getDescuento();
                model.addRow(obj);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Detalle de cada Venta");

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("DETALLE DE CADA VENTA DE PRODUCTOS");

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Articulo", "Cantidad", "Precio Venta", "Descuento"
            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatos;
    // End of variables declaration//GEN-END:variables
}
