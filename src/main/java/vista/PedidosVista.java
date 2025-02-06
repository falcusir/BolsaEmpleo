/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import controlador.PedidosControlador;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.PedidosModelo;

/**
 *
 * @author Dell Core i7
 */
public class PedidosVista extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<PedidosModelo> listaPedidos = new ArrayList<>();
    
    PedidosModelo p = new PedidosModelo();
    PedidosControlador pC = new PedidosControlador();
    
    public PedidosVista() {
        initComponents();
        SetModel();
    }
    
    public void SetModel() {
        //Estructura estaica de tipo cadena con las cabeceras o titulos de la jtable
        String[] cabecera = {"Nro.", "Fecha Pedido", "Fecha Entrega", "Monto", "Estado",};
        //SOBRESCRIBIENDO EL PAmodelo.set
        modelo.setColumnIdentifiers(cabecera);
        tblListarPedidos.setModel(modelo);
    }
    
    public void SetDatos() {
        Object[] datosFila = new Object[modelo.getColumnCount()];
        int nro = 1;
        // for reducido, creo un puntero de la estructura que voy a recorrer : nombre de la estructur que voy a recorrer
        //sirve para recorrer e imprimir una lista mas no para llenar 
        for (PedidosModelo puntero : listaPedidos) {
            //CADA POSICIÓN DE DATOS FILA ES UNA CELDA DE LA FILA DE TABLA
            //SI TENGO 10 REGISTROS RECUPERADOS EN UNA CONSULTA
            //TENDRE 11 FILAS, 1 DE LA CABECERA, Y 10 DE LOS REGISTROS A MOSTRAR
//            datosFila[0] = nro;
//            datosFila[1] = puntero.getNombres();
//            datosFila[2] = puntero.getApellidos();
//            datosFila[3] = puntero.getCedula();
//            datosFila[4] = puntero.getDireccion();
//            datosFila[5] = puntero.getCorreoElectronico();
//            datosFila[6] = puntero.getFechaNacimiento();
//            datosFila[7] = puntero.getEmpresa();
//            datosFila[8] = puntero.getCargo();
//            nro++;
//            modelo.addRow(datosFila);
        }
    }
    

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListarPedidos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Examen Grupo 2");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Cédula:");

        txtCedula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnBuscar.setBackground(new java.awt.Color(204, 255, 204));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblListarPedidos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblListarPedidos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String cedula = txtCedula.getText();
        //limpiarTabla();
        ArrayList<Object[]> listaFilas = pC.buscarPedidos(cedula);
        for (Object[] listaFila : listaFilas) {
            modelo.addRow(listaFila);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListarPedidos;
    private javax.swing.JTextField txtCedula;
    // End of variables declaration//GEN-END:variables
}
