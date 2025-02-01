/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Font;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import controlador.EmpleadorControlador;
import controlador.PostulanteControlador;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.EmpleadorModelo;
import modelo.PostulanteModelo;

/**
 *
 * @author Dell Core i7
 */
public class EmpleadorVista extends javax.swing.JInternalFrame {

    /**
     * Creates new form Postulantes
     */
    DefaultTableModel modelo = new DefaultTableModel();
    //TODO LO QUE RECIBO DE UNA COMSULTA SQL PUEDE SER 2 TIPOS
    //1 FILA: ObjetoModelo
    ArrayList<EmpleadorModelo> listaEmpleadores = new ArrayList<>();

    EmpleadorModelo e = new EmpleadorModelo();
    EmpleadorControlador eC = new EmpleadorControlador();
    String empresa = "";
    String cargo = "";

    public EmpleadorVista() {
        initComponents();
        SetModel();
        txtCedula.setText(" ");
        txtNombres.setText(" ");
        txtApellidos.setText(" ");
        txtFechaNacimiento.setText(" ");
        txtDireccion.setText(" ");
        txtCorreo.setText(" ");
        cbEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Ministerio de Salud", "IESS", "GAD", "Cámara de Comercio", "Netlife", "Emelnorte", "Emapa"}));
        cbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Gerente General", "Gerente Zonal", "Responsable TTHH", "Miembro TTHH"}));
        
    }

    public void SetModel() {
        //Estructura estaica de tipo cadena con las cabeceras o titulos de la jtable
        String[] cabecera = {"Nro.", "Nombres", "Apellidos", "Cedula", "Direccion", "Correo Electrónico", "Fecha Nacimiento", "Empresa", "Cargo",};
        //SOBRESCRIBIENDO EL PAmodelo.set
        modelo.setColumnIdentifiers(cabecera);
        tblEmpleador.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void SetDatos() {
        Object[] datosFila = new Object[modelo.getColumnCount()];
        int nro = 1;
        // for reducido, creo un puntero de la estructura que voy a recorrer : nombre de la estructur que voy a recorrer
        //sirve para recorrer e imprimir una lista mas no para llenar 
        for (EmpleadorModelo puntero : listaEmpleadores) {
            //CADA POSICIÓN DE DATOS FILA ES UNA CELDA DE LA FILA DE TABLA
            //SI TENGO 10 REGISTROS RECUPERADOS EN UNA CONSULTA
            //TENDRE 11 FILAS, 1 DE LA CABECERA, Y 10 DE LOS REGISTROS A MOSTRAR
            datosFila[0] = nro;
            datosFila[1] = puntero.getNombres();
            datosFila[2] = puntero.getApellidos();
            datosFila[3] = puntero.getCedula();
            datosFila[4] = puntero.getDireccion();
            datosFila[5] = puntero.getCorreoElectronico();
            datosFila[6] = puntero.getFechaNacimiento();
            datosFila[7] = puntero.getEmpresa();
            datosFila[8] = puntero.getCargo();
            nro++;
            modelo.addRow(datosFila);
        }
    }
    
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtFechaNacimiento = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        cbEmpresa = new javax.swing.JComboBox<>();
        btnImprimir = new javax.swing.JButton();
        cbCargo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEmpleador = new javax.swing.JTable();
        btnPdf = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestión de Postulantes");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("FORMULARIO DE EMPLEADORES");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Datos Personales");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Datos de Empleador");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Cedula:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Nombres:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Apellidos:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Fecha de nacimiento:");

        txtCedula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCedula.setText("jTextField1");
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        txtApellidos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtApellidos.setText("jTextField3");

        txtFechaNacimiento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFechaNacimiento.setText("jTextField4");

        txtNombres.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombres.setText("jTextField1");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Dirección:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Correo Electrónico:");

        txtDireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDireccion.setText("jTextField5");

        txtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCorreo.setText("jTextField6");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Empresa:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Cargo:");

        btnCrear.setBackground(new java.awt.Color(204, 255, 204));
        btnCrear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCrear.setText("CREAR");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(204, 255, 204));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        cbEmpresa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administración", "Dirección de Empresas", "Comercio", "Comunicación Corporativa", "Contabilidad", "Criminología", "Derecho", "Desarrolo de Software", "Diseño Gráfico", "Enfermería", "Fisioterapia", "Marketing", "Psicología", "Sociología" }));
        cbEmpresa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbEmpresaItemStateChanged(evt);
            }
        });

        btnImprimir.setBackground(new java.awt.Color(204, 255, 204));
        btnImprimir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnImprimir.setText("IMPRIMIR");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        cbCargo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administración", "Dirección de Empresas", "Comercio", "Comunicación Corporativa", "Contabilidad", "Criminología", "Derecho", "Desarrolo de Software", "Diseño Gráfico", "Enfermería", "Fisioterapia", "Marketing", "Psicología", "Sociología" }));
        cbCargo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCargoItemStateChanged(evt);
            }
        });

        tblEmpleador.setModel(new javax.swing.table.DefaultTableModel(
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
        tblEmpleador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblEmpleador);

        btnPdf.setBackground(new java.awt.Color(204, 255, 204));
        btnPdf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPdf.setText("PDF");
        btnPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdfActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(204, 255, 204));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(204, 255, 204));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(45, 45, 45)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(117, 117, 117)
                                                .addComponent(jLabel8))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txtApellidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                                    .addComponent(txtNombres, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(38, 38, 38)
                                                .addComponent(jLabel9))))
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(18, 18, 18)
                                            .addComponent(cbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                                    .addComponent(txtDireccion)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 934, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabel1)))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(btnLimpiar)
                    .addComponent(btnImprimir)
                    .addComponent(btnBuscar)
                    .addComponent(btnActualizar)
                    .addComponent(btnPdf))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

        e.setNombres(txtNombres.getText());
        e.setCedula(txtCedula.getText());
        e.setNombres(txtNombres.getText());
        e.setApellidos(txtApellidos.getText());
        e.setFechaNacimiento(txtFechaNacimiento.getText());
        e.setDireccion(txtDireccion.getText());
        e.setCorreoElectronico(txtCorreo.getText());
        e.setEmpresa(empresa);
        e.setCargo(cargo);

        listaEmpleadores.add(e);
        eC.insertarEmpleador(e);        
        SetDatos(); //escribe la fila de la tabla
        limpiarTabla();
        cargarTabla(); 


    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarEntradas();

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cbEmpresaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbEmpresaItemStateChanged
        // TODO add your handling code here:
        empresa = cbEmpresa.getSelectedItem().toString();
    }//GEN-LAST:event_cbEmpresaItemStateChanged

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
        //txtADatosPostulacion.setVisible(true);
        e.setNombres(txtNombres.getText());
        e.setCedula(txtCedula.getText());
        e.setNombres(txtNombres.getText());
        e.setApellidos(txtApellidos.getText());
        e.setFechaNacimiento(txtFechaNacimiento.getText());
        e.setDireccion(txtDireccion.getText());
        e.setCorreoElectronico(txtCorreo.getText());
        e.setEmpresa(empresa);
        e.setCargo(cargo);

        //txtADatosPostulacion.setVisible(true);
        //txtADatosPostulacion.setText(e.toString());

    }//GEN-LAST:event_btnImprimirActionPerformed

    private void cbCargoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCargoItemStateChanged
        cargo = cbCargo.getSelectedItem().toString();
    }//GEN-LAST:event_cbCargoItemStateChanged

    private void btnPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfActionPerformed
        e.setNombres(txtNombres.getText());
        e.setCedula(txtCedula.getText());
        e.setNombres(txtNombres.getText());
        e.setApellidos(txtApellidos.getText());
        e.setFechaNacimiento(txtFechaNacimiento.getText());
        e.setDireccion(txtDireccion.getText());
        e.setCorreoElectronico(txtCorreo.getText());
        e.setEmpresa(empresa);
        e.setCargo(cargo);
        
        Document document = new Document();// estructura documentos---->tipo doc 
        try { //si no se genera el pdf no deje de funcionar
            // gestiona archivos de cualquier tipo doc. pdf ---> de salida
            // estructura -----dirección
            //PdfWriter.getInstance(document, new FileOutputStream("formularioEmpleador.pdf"));
            String nombreArchivo = "formularioEmpleador_" + txtCedula.getText() + ".pdf";
            PdfWriter.getInstance(document, new FileOutputStream(nombreArchivo));
            document.open();// abre para empesar a eescribir
            document.setMargins(50, 50, 50, 50);//márgenes
            
            document.setPageSize(PageSize.A4);
            Font font=  FontFactory.getFont(FontFactory.TIMES_BOLD,18,BaseColor.RED);
            Paragraph titulo = new Paragraph("FORMULARIO EMPLEADOR",font);
            titulo.setAlignment(Element.ALIGN_CENTER);// centrar
            document.add(titulo);
                       
            Font cuerpo=  FontFactory.getFont(FontFactory.TIMES,14,BaseColor.BLACK);
            Paragraph detalle = new Paragraph(e.toString(),cuerpo);

            detalle.setSpacingBefore(15);//espaciado
            document.add(detalle);
            //AÑADE PARRAFOS O NUEVO TEXTO
            //document.add(new Paragraph("Nombre: " + txtCedula.getText()));

            document.close(); //se cierra
            JOptionPane.showMessageDialog(this, "PDF generado correctamente.");
        } catch (DocumentException | IOException e) {
            JOptionPane.showMessageDialog(this, "Error al generar el PDF: " );
        
        }
    }//GEN-LAST:event_btnPdfActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String cedula = txtCedula.getText();
        limpiarTabla();
        ArrayList<Object[]> listaFilas = eC.buscarEmpleador(cedula);
        for (Object[] listaFila : listaFilas) {
            modelo.addRow(listaFila);
        }
        //tblEmpleador.setModel(modelo);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        e.setNombres(txtNombres.getText());
        e.setCedula(txtCedula.getText());
        e.setNombres(txtNombres.getText());
        e.setApellidos(txtApellidos.getText());
        e.setFechaNacimiento(txtFechaNacimiento.getText());
        e.setDireccion(txtDireccion.getText());
        e.setCorreoElectronico(txtCorreo.getText());
        e.setEmpresa(empresa);
        e.setCargo(cargo);
        
        eC.actualizarEmpleador(e);
        limpiarTabla();
        cargarTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated

        cargarTabla();
    }//GEN-LAST:event_formInternalFrameActivated
    private void cargarTabla(){
        ArrayList<Object[]> listaFilas = eC.datosEmpleador();
        for (Object[] listaFila : listaFilas) {
            modelo.addRow(listaFila);
        }
        tblEmpleador.setModel(modelo);
    }

    private void limpiarTabla(){
        int a= modelo.getRowCount()-1;
        for (int i = a; i >=0; i--) {
            modelo.removeRow(i);
        }
        //tblMiembrosE.setModel(modelo);
    }
    private void limpiarEntradas(){
    txtCedula.setText("");
    txtNombres.setText("");
    txtApellidos.setText("");
    txtFechaNacimiento.setText("");
    txtCorreo.setText("");
    txtDireccion.setText("");

    }
    
    
    private void tblEmpleadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadorMouseClicked
       DefaultTableModel dtm=(DefaultTableModel)tblEmpleador.getModel();
       txtNombres.setText((String) dtm.getValueAt(tblEmpleador.getSelectedRow(), 1));
       txtApellidos.setText((String) dtm.getValueAt(tblEmpleador.getSelectedRow(), 2));
       txtCedula.setText(dtm.getValueAt(tblEmpleador.getSelectedRow(), 3).toString());
       txtDireccion.setText((String)dtm.getValueAt(tblEmpleador.getSelectedRow(), 4));
       txtCorreo.setText((String)dtm.getValueAt(tblEmpleador.getSelectedRow(), 5));
       txtFechaNacimiento.setText(dtm.getValueAt(tblEmpleador.getSelectedRow(), 6).toString());
       cbEmpresa.setSelectedItem(dtm.getValueAt(tblEmpleador.getSelectedRow(), 7).toString());
       cbCargo.setSelectedItem(dtm.getValueAt(tblEmpleador.getSelectedRow(), 8).toString());
       
    }//GEN-LAST:event_tblEmpleadorMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        limpiarTabla();
        cargarTabla();
    }//GEN-LAST:event_formMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnPdf;
    private javax.swing.JComboBox<String> cbCargo;
    private javax.swing.JComboBox<String> cbEmpresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblEmpleador;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
