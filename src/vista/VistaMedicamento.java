package vista;

import com.toedter.calendar.JDateChooser;
import javax.accessibility.AccessibleContext;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author monge
 */
public class VistaMedicamento extends javax.swing.JInternalFrame { //Esto se pone para que se muestre adentro del desktop pane

    public VistaMedicamento() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        receta = new javax.swing.ButtonGroup();
        jDlgImprimir = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        SpinnerSueldomaximo = new javax.swing.JSpinner();
        SpinnerSueldominimo = new javax.swing.JSpinner();
        btnGenerarReporte = new javax.swing.JButton();
        jDlgMedicamentos = new javax.swing.JDialog();
        txtIdentificacion = new javax.swing.JTextField();
        txtNomcomercial = new javax.swing.JTextField();
        labelFoto = new javax.swing.JLabel();
        btnExaminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        spinnerPvp = new javax.swing.JSpinner();
        spinnerCosto = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        txtNomgenerico = new javax.swing.JTextField();
        jcExpiracion = new com.toedter.calendar.JDateChooser();
        jcElaboracion = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        RbSi = new javax.swing.JRadioButton();
        RbNo = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMedicamento = new javax.swing.JTable();

        jDlgImprimir.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Datos requeridos");

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel13.setText("Título del reporte:");

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel14.setText("Sueldo mínimo:");

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel15.setText("Sueldo máximo:");

        txtTitulo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        SpinnerSueldomaximo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        SpinnerSueldomaximo.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));

        SpinnerSueldominimo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        SpinnerSueldominimo.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));

        btnGenerarReporte.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnGenerarReporte.setText("Generar reporte");
        btnGenerarReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jDlgImprimirLayout = new javax.swing.GroupLayout(jDlgImprimir.getContentPane());
        jDlgImprimir.getContentPane().setLayout(jDlgImprimirLayout);
        jDlgImprimirLayout.setHorizontalGroup(
            jDlgImprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jDlgImprimirLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jDlgImprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jDlgImprimirLayout.createSequentialGroup()
                        .addGroup(jDlgImprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(33, 33, 33)
                        .addGroup(jDlgImprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SpinnerSueldomaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SpinnerSueldominimo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDlgImprimirLayout.createSequentialGroup()
                        .addComponent(btnGenerarReporte)
                        .addGap(98, 98, 98)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jDlgImprimirLayout.setVerticalGroup(
            jDlgImprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDlgImprimirLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel12)
                .addGap(27, 27, 27)
                .addGroup(jDlgImprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jDlgImprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(SpinnerSueldominimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jDlgImprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(SpinnerSueldomaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnGenerarReporte)
                .addGap(26, 26, 26))
        );

        txtIdentificacion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        txtNomcomercial.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        labelFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnExaminar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnExaminar.setText("Examinar");

        btnCancelar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");

        btnAceptar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnAceptar.setText("Aceptar");

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel7.setText("PVP:");

        lblCodigo.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        lblCodigo.setText("Código:");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel4.setText("Nombre comercial:");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel5.setText("Costo:");

        spinnerPvp.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        spinnerPvp.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10000, 1));

        spinnerCosto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        spinnerCosto.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 10000.0d, 1.0d));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel8.setText("Nombre genérico:");

        txtNomgenerico.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jcExpiracion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jcElaboracion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel3.setText("Fecha elaboración");

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel6.setText("Fecha expiración");

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel9.setText("¿Éste medicamento se está vendiendo con receta?");

        receta.add(RbSi);
        RbSi.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        RbSi.setText("Sí");

        receta.add(RbNo);
        RbNo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        RbNo.setText("No");

        javax.swing.GroupLayout jDlgMedicamentosLayout = new javax.swing.GroupLayout(jDlgMedicamentos.getContentPane());
        jDlgMedicamentos.getContentPane().setLayout(jDlgMedicamentosLayout);
        jDlgMedicamentosLayout.setHorizontalGroup(
            jDlgMedicamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDlgMedicamentosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jDlgMedicamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDlgMedicamentosLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jDlgMedicamentosLayout.createSequentialGroup()
                        .addGroup(jDlgMedicamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAceptar)
                            .addComponent(jLabel4)
                            .addGroup(jDlgMedicamentosLayout.createSequentialGroup()
                                .addGroup(jDlgMedicamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(lblCodigo)
                                    .addComponent(jLabel3))
                                .addGap(26, 26, 26)
                                .addGroup(jDlgMedicamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomcomercial, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomgenerico, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcElaboracion, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5)
                            .addGroup(jDlgMedicamentosLayout.createSequentialGroup()
                                .addGroup(jDlgMedicamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(32, 32, 32)
                                .addGroup(jDlgMedicamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spinnerCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcExpiracion, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spinnerPvp, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jDlgMedicamentosLayout.createSequentialGroup()
                                .addComponent(RbSi)
                                .addGap(30, 30, 30)
                                .addComponent(RbNo)))
                        .addGap(47, 47, 47)
                        .addGroup(jDlgMedicamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDlgMedicamentosLayout.createSequentialGroup()
                                .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDlgMedicamentosLayout.createSequentialGroup()
                                .addGroup(jDlgMedicamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCancelar)
                                    .addComponent(btnExaminar))
                                .addGap(72, 72, 72))))))
        );
        jDlgMedicamentosLayout.setVerticalGroup(
            jDlgMedicamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDlgMedicamentosLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jDlgMedicamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jDlgMedicamentosLayout.createSequentialGroup()
                        .addGroup(jDlgMedicamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigo)
                            .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDlgMedicamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNomcomercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDlgMedicamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtNomgenerico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jDlgMedicamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcElaboracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(12, 12, 12))
                    .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jDlgMedicamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDlgMedicamentosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnExaminar)
                        .addGap(94, 94, 94))
                    .addGroup(jDlgMedicamentosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jDlgMedicamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcExpiracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jDlgMedicamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(spinnerCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDlgMedicamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(spinnerPvp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(14, 14, 14)))
                .addGap(4, 4, 4)
                .addGroup(jDlgMedicamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RbSi, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RbNo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jDlgMedicamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addGap(35, 35, 35))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar");

        txtBuscar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(51, 51, 51));
        txtBuscar.setBorder(null);

        btnActualizar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnActualizar.setText("Actualizar");

        btnEliminar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");

        btnCrear.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnCrear.setText("Crear");

        btnEditar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnEditar.setText("Editar");

        btnImprimir.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnImprimir.setText("Imprimir");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnActualizar)
                .addGap(31, 31, 31)
                .addComponent(btnCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addGap(34, 34, 34)
                .addComponent(btnEliminar)
                .addGap(35, 35, 35)
                .addComponent(btnImprimir)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnActualizar)
                        .addComponent(btnCrear)
                        .addComponent(btnEditar)
                        .addComponent(btnEliminar)
                        .addComponent(btnImprimir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 187, 45));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Farmacia 1.0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tblMedicamento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tblMedicamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cód", "Nombre", "Génerico", "Fecha ela.", "Fecha exp.", "Costo", "PVP", "Receta", "Imagen"
            }
        ));
        jScrollPane1.setViewportView(tblMedicamento);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Set y  Get
    
    public JButton getBtnAceptar() {
        return btnAceptar;
    }

    public void setBtnAceptar(JButton btnAceptar) {
        this.btnAceptar = btnAceptar;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtnCrear() {
        return btnCrear;
    }

    public void setBtnCrear(JButton btnCrear) {
        this.btnCrear = btnCrear;
    }

    public JButton getBtnEditar() {
        return btnEditar;
    }

    public void setBtnEditar(JButton btnEditar) {
        this.btnEditar = btnEditar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnExaminar() {
        return btnExaminar;
    }

    public void setBtnExaminar(JButton btnExaminar) {
        this.btnExaminar = btnExaminar;
    }

    public JButton getBtnGenerarReporte() {
        return btnGenerarReporte;
    }

    public void setBtnGenerarReporte(JButton btnGenerarReporte) {
        this.btnGenerarReporte = btnGenerarReporte;
    }

    public JButton getBtnImprimir() {
        return btnImprimir;
    }

    public void setBtnImprimir(JButton btnImprimir) {
        this.btnImprimir = btnImprimir;
    }

    public JDialog getjDlgImprimir() {
        return jDlgImprimir;
    }

    public void setjDlgImprimir(JDialog jDlgImprimir) {
        this.jDlgImprimir = jDlgImprimir;
    }

    public JDialog getjDlgMedicamentos() {
        return jDlgMedicamentos;
    }

    public void setjDlgMedicamentos(JDialog jDlgMedicamentos) {
        this.jDlgMedicamentos = jDlgMedicamentos;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel12() {
        return jLabel12;
    }

    public void setjLabel12(JLabel jLabel12) {
        this.jLabel12 = jLabel12;
    }

    public JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public JLabel getjLabel14() {
        return jLabel14;
    }

    public void setjLabel14(JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    public JLabel getjLabel15() {
        return jLabel15;
    }

    public void setjLabel15(JLabel jLabel15) {
        this.jLabel15 = jLabel15;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public JRadioButton getRbNo() {
        return RbNo;
    }

    public void setRbNo(JRadioButton RbNo) {
        this.RbNo = RbNo;
    }

    public JRadioButton getRbSi() {
        return RbSi;
    }

    public void setRbSi(JRadioButton RbSi) {
        this.RbSi = RbSi;
    }

    

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(JSeparator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public JDateChooser getJcElaboracion() {
        return jcElaboracion;
    }

    public void setJcElaboracion(JDateChooser jcElaboracion) {
        this.jcElaboracion = jcElaboracion;
    }

    public JDateChooser getJcExpiracion() {
        return jcExpiracion;
    }

    public void setJcExpiracion(JDateChooser jcExpiracion) {
        this.jcExpiracion = jcExpiracion;
    }

    public JLabel getLabelFoto() {
        return labelFoto;
    }

    public void setLabelFoto(JLabel labelFoto) {
        this.labelFoto = labelFoto;
    }

    public JLabel getLblCodigo() {
        return lblCodigo;
    }

    public void setLblCodigo(JLabel lblCodigo) {
        this.lblCodigo = lblCodigo;
    }

    public ButtonGroup getReceta() {
        return receta;
    }

    public void setReceta(ButtonGroup receta) {
        this.receta = receta;
    }

    public JSpinner getSpinnerCosto() {
        return spinnerCosto;
    }

    public void setSpinnerCosto(JSpinner spinnerCosto) {
        this.spinnerCosto = spinnerCosto;
    }

    public JSpinner getSpinnerPvp() {
        return spinnerPvp;
    }

    public void setSpinnerPvp(JSpinner spinnerPvp) {
        this.spinnerPvp = spinnerPvp;
    }

    public JTable getTblMedicamento() {
        return tblMedicamento;
    }

    public void setTblMedicamento(JTable tblMedicamento) {
        this.tblMedicamento = tblMedicamento;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public void setTxtBuscar(JTextField txtBuscar) {
        this.txtBuscar = txtBuscar;
    }

    public JTextField getTxtIdentificacion() {
        return txtIdentificacion;
    }

    public void setTxtIdentificacion(JTextField txtIdentificacion) {
        this.txtIdentificacion = txtIdentificacion;
    }

    public JTextField getTxtNomcomercial() {
        return txtNomcomercial;
    }

    public void setTxtNomcomercial(JTextField txtNomcomercial) {
        this.txtNomcomercial = txtNomcomercial;
    }

    public JTextField getTxtNomgenerico() {
        return txtNomgenerico;
    }

    public void setTxtNomgenerico(JTextField txtNomgenerico) {
        this.txtNomgenerico = txtNomgenerico;
    }

    public JTextField getTxtTitulo() {
        return txtTitulo;
    }

    public void setTxtTitulo(JTextField txtTitulo) {
        this.txtTitulo = txtTitulo;
    }
    
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RbNo;
    private javax.swing.JRadioButton RbSi;
    private javax.swing.JSpinner SpinnerSueldomaximo;
    private javax.swing.JSpinner SpinnerSueldominimo;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnExaminar;
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JDialog jDlgImprimir;
    private javax.swing.JDialog jDlgMedicamentos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private com.toedter.calendar.JDateChooser jcElaboracion;
    private com.toedter.calendar.JDateChooser jcExpiracion;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.ButtonGroup receta;
    private javax.swing.JSpinner spinnerCosto;
    private javax.swing.JSpinner spinnerPvp;
    private javax.swing.JTable tblMedicamento;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNomcomercial;
    private javax.swing.JTextField txtNomgenerico;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
