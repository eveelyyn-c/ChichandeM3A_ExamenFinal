
package vista;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;

/**
 *
 * @author monge
 */
public class VistaPrincipal extends javax.swing.JFrame {


    public VistaPrincipal() {
        initComponents();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        btnMedicamentos = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuMedicamento = new javax.swing.JMenu();
        mnItmCrearMedicamento = new javax.swing.JMenuItem();
        mnItmEditarMedicamento = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        btnMedicamentos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnMedicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icons/farmaco.png"))); // NOI18N
        btnMedicamentos.setToolTipText("Crear medicamento");
        btnMedicamentos.setFocusable(false);
        btnMedicamentos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMedicamentos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnMedicamentos);
        jToolBar1.add(jSeparator1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setText("Tienda v1.1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(798, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        mnuMedicamento.setText("Medicamentos");

        mnItmCrearMedicamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        mnItmCrearMedicamento.setText("Crear medicamento");
        mnuMedicamento.add(mnItmCrearMedicamento);

        mnItmEditarMedicamento.setText("Editar medicamento");
        mnuMedicamento.add(mnItmEditarMedicamento);

        jMenuBar1.add(mnuMedicamento);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnMedicamentos() {
        return btnMedicamentos;
    }

    public void setBtnMedicamentos(JButton btnMedicamentos) {
        this.btnMedicamentos = btnMedicamentos;
    }

    public JDesktopPane getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(JDesktopPane escritorio) {
        this.escritorio = escritorio;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public void setjMenuBar1(JMenuBar jMenuBar1) {
        this.jMenuBar1 = jMenuBar1;
    }

    public JMenuItem getjMenuItem1() {
        return jMenuItem1;
    }

    public void setjMenuItem1(JMenuItem jMenuItem1) {
        this.jMenuItem1 = jMenuItem1;
    }

    public JMenuItem getjMenuItem3() {
        return jMenuItem3;
    }

    public void setjMenuItem3(JMenuItem jMenuItem3) {
        this.jMenuItem3 = jMenuItem3;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JToolBar.Separator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(JToolBar.Separator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public JToolBar getjToolBar1() {
        return jToolBar1;
    }

    public void setjToolBar1(JToolBar jToolBar1) {
        this.jToolBar1 = jToolBar1;
    }

    public JMenuItem getMnItmCrearMedicamento() {
        return mnItmCrearMedicamento;
    }

    public void setMnItmCrearMedicamento(JMenuItem mnItmCrearMedicamento) {
        this.mnItmCrearMedicamento = mnItmCrearMedicamento;
    }

    public JMenuItem getMnItmEditarMedicamento() {
        return mnItmEditarMedicamento;
    }

    public void setMnItmEditarMedicamento(JMenuItem mnItmEditarMedicamento) {
        this.mnItmEditarMedicamento = mnItmEditarMedicamento;
    }

    public JMenu getMnuMedicamento() {
        return mnuMedicamento;
    }

    public void setMnuMedicamento(JMenu mnuMedicamento) {
        this.mnuMedicamento = mnuMedicamento;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMedicamentos;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mnItmCrearMedicamento;
    private javax.swing.JMenuItem mnItmEditarMedicamento;
    private javax.swing.JMenu mnuMedicamento;
    // End of variables declaration//GEN-END:variables
}
