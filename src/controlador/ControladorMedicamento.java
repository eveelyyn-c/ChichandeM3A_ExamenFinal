package controlador;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;
import modelo.ModeloMedicamento;
import modelo.Medicamento;
import vista.VistaMedicamento;

public class ControladorMedicamento {
    
    ModeloMedicamento modelo;
    VistaMedicamento vista;
    private JFileChooser jfc; 
    public ControladorMedicamento(ModeloMedicamento modelo, VistaMedicamento vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        cargarMedicamentosTabla();
    }
    
    public void iniciarControl() {
        vista.getBtnActualizar().addActionListener(l -> cargarMedicamentosTabla());
        vista.getBtnCrear().addActionListener(l -> abrirDialogCrear());
        vista.getBtnEditar().addActionListener(l -> abrirYCargarDatosEnElDialog());
        vista.getBtnAceptar().addActionListener(l -> crearEditarMedicamento());
        vista.getBtnExaminar().addActionListener(l -> seleccionarFoto());
        vista.getBtnEliminar().addActionListener(l -> eliminarMedicamento());
        buscarMedicamento();
    }
    
    public void cargarMedicamentosTabla() {
        vista.getTblMedicamento().setDefaultRenderer(Object.class, new ImagenTabla());
        vista.getTblMedicamento().setRowHeight(100);
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) vista.getTblMedicamento().getModel();
        tblModel.setNumRows(0);
        List<Medicamento> listap = modelo.listaMedicamentosTabla();
        Holder<Integer> i = new Holder<>(0);
        listap.stream().forEach(pe -> {
            
            tblModel.addRow(new Object[10]);
            vista.getTblMedicamento().setValueAt(pe.getCodigo(), i.value, 0);
            vista.getTblMedicamento().setValueAt(pe.getNomcomercial(), i.value, 1);
            vista.getTblMedicamento().setValueAt(pe.getNomgenerico(), i.value, 2);
            vista.getTblMedicamento().setValueAt(pe.getElaboracion(), i.value, 3);
            vista.getTblMedicamento().setValueAt(pe.getExpiracion(), i.value, 4);
            vista.getTblMedicamento().setValueAt(pe.getCosto(), i.value, 5);
            vista.getTblMedicamento().setValueAt(pe.getPvp(), i.value, 6);
            vista.getTblMedicamento().setValueAt(pe.getReceta(), i.value, 7);
            
            Image foto = pe.getImagen();
            if (foto != null) {
                
                Image nimg = foto.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                ImageIcon icono = new ImageIcon(nimg);
                DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                renderer.setIcon(icono);
                vista.getTblMedicamento().setValueAt(new JLabel(icono), i.value, 8);
                
            } else {
                vista.getTblMedicamento().setValueAt(null, i.value, 8);
            }
            
            i.value++;
        });
    }
    
    public void abrirDialogCrear() {
        vista.getjDlgMedicamentos().setName("Crear nuevo medicamento");
        vista.getjDlgMedicamentos().setLocationRelativeTo(vista);
        vista.getjDlgMedicamentos().setSize(546, 486);
        vista.getjDlgMedicamentos().setTitle("Crear nuevo medicamento");
        vista.getjDlgMedicamentos().setVisible(true);
        limpiarDatos();
    }
    
    private void crearEditarMedicamento() {
        if ("Crear nuevo medicamento".equals(vista.getjDlgMedicamentos().getName())) {

            //INSERTAR
            String nomcomercial = vista.getTxtNomcomercial().getText();
            String nomgenerico = vista.getTxtNomgenerico().getText();
            Date elaboracion = vista.getJcElaboracion().getDate();
            Date expiracion = vista.getJcExpiracion().getDate();
//          double costo = Double.valueOf((Double)vista.getSpinnerPvp().getValue());
//          double pvp = Double.valueOf((Double)vista.getSpinnerPvp().getValue());
            double costo = (Double) vista.getSpinnerCosto().getValue();
            double pvp = (Double) vista.getSpinnerPvp().getValue();
            String receta = vista.getReceta().getSelection().toString();
            ModeloMedicamento medicamento = new ModeloMedicamento();
            medicamento.setNomcomercial(nomcomercial);
            medicamento.setNomgenerico(nomgenerico);
            java.sql.Date elaboracionSQL = new java.sql.Date(elaboracion.getTime());
            medicamento.setElaboracion(elaboracionSQL);
            java.sql.Date expiracionSQL = new java.sql.Date(expiracion.getTime());
            medicamento.setExpiracion(expiracionSQL);
            medicamento.setCosto(costo);
            medicamento.setPvp(pvp);
            medicamento.setReceta(receta);
            
            if (vista.getLabelFoto().getIcon() == null) { 

                if (medicamento.crearMedicamentoSinFoto()) {
                    vista.getjDlgMedicamentos().setVisible(false);
                    JOptionPane.showMessageDialog(vista, "Medicamento Creado Satisfactoriamente");
                } else {
                    JOptionPane.showMessageDialog(vista, "No se pudo crear el medicamento");
                }
            } else 
            {
                //Foto
                try {
                    
                    FileInputStream foto = new FileInputStream(jfc.getSelectedFile());
                    int longitud = (int) jfc.getSelectedFile().length();
                    
                    medicamento.setFoto(foto);
                    medicamento.setLongitud(longitud);
                    
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ControladorMedicamento.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (medicamento.crearMedicamentoFoto()) {
                    vista.getjDlgMedicamentos().setVisible(false);
                    JOptionPane.showMessageDialog(vista, "Medicamento Creado Satisfactoriamente");
                } else {
                    JOptionPane.showMessageDialog(vista, "No se pudo crear el medicamento");
                }
            }
            
        } else {

            //EDITAR
            int codigo = Integer.parseInt(vista.getTxtIdentificacion().getText());
            String nomcomercial = vista.getTxtNomcomercial().getText();
            String nomgenerico = vista.getTxtNomgenerico().getText();
            Date elaboracion = vista.getJcElaboracion().getDate();
            Date expiracion = vista.getJcExpiracion().getDate();
            double costo = (Double) vista.getSpinnerCosto().getValue();
            double pvp = (Double) vista.getSpinnerPvp().getValue();
            String receta = vista.getReceta().getSelection().toString();
            
            ModeloMedicamento medicamento= new ModeloMedicamento();
            
            medicamento.setCodigo(codigo);
            medicamento.setNomcomercial(nomcomercial);
            medicamento.setNomgenerico(nomgenerico);
            java.sql.Date elaboracionSQL = new java.sql.Date(elaboracion.getTime());
            medicamento.setElaboracion(elaboracionSQL);
            java.sql.Date expiracionSQL = new java.sql.Date(expiracion.getTime());
            medicamento.setExpiracion(expiracionSQL);
            medicamento.setCosto(costo);
            medicamento.setPvp(pvp);
            medicamento.setReceta(receta);
            
            if (vista.getLabelFoto().getIcon() == null) {
                if (medicamento.modificarMedicamentoSinFoto()) {
                    
                    vista.getjDlgMedicamentos().setVisible(false);
                    JOptionPane.showMessageDialog(vista, "Medicamento modificado Satisfactoriamente");
                } else {
                    JOptionPane.showMessageDialog(vista, "No se pudo modificar el medicamento");
                }
            } else {
                //Foto
                try {
                    FileInputStream img = new FileInputStream(jfc.getSelectedFile());
                    int longitud = (int) jfc.getSelectedFile().length();
                    medicamento.setFoto(img);
                    medicamento.setLongitud(longitud);
                } catch (FileNotFoundException | NullPointerException ex) {
                    Logger.getLogger(ControladorMedicamento.class.getName()).log(Level.SEVERE, null, ex);
                }
             
                if (medicamento.modificarMedicamentoFoto()) {
                    
                    vista.getjDlgMedicamentos().setVisible(false);
                    JOptionPane.showMessageDialog(vista, "Medicamento modificado Satisfactoriamente");
                } else {
                    JOptionPane.showMessageDialog(vista, "No se pudo modificar el medicamento");
                }
            }
        }
        cargarMedicamentosTabla();
    }
    
    public void seleccionarFoto() {
        
        vista.getLabelFoto().setIcon(null);
        jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado = jfc.showOpenDialog(null);
        
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                Image imagen = ImageIO.read(jfc.getSelectedFile()).getScaledInstance(vista.getLabelFoto().getWidth(), vista.getLabelFoto().getHeight(), Image.SCALE_DEFAULT);
                vista.getLabelFoto().setIcon(new ImageIcon(imagen));
                vista.getLabelFoto().updateUI();
                
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(vista, "Error: " + ex);
            }
        }
    }
    
    public void eliminarMedicamento() {

        int fila = vista.getTblMedicamento().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Aun no ha seleccionado una fila");
        } else {
            int response = JOptionPane.showConfirmDialog(vista, "¿Seguro que desea eliminar esta información?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                int codigo;
                codigo = (Integer) vista.getTblMedicamento().getValueAt(fila, 0);
                if (modelo.eliminarMedicamento(codigo)) {
                    JOptionPane.showMessageDialog(null, "El medicamento fue eliminado exitosamente");
                    cargarMedicamentosTabla();
                } else {
                    JOptionPane.showMessageDialog(null, "Error: El medicamento no se pudo eliminar");
                }
            }
        }
    }
    
    public void abrirYCargarDatosEnElDialog() {
        
        int seleccion = vista.getTblMedicamento().getSelectedRow();
        if (seleccion == -1) {
            JOptionPane.showMessageDialog(null, "Aun no ha seleccionado una fila");
        } else {
            int codigo = (Integer) vista.getTblMedicamento().getValueAt(seleccion, 0);
            modelo.listaProductoJDialog().forEach((pe) -> {
                if (pe.getCodigo() == codigo) {
                    vista.getjDlgMedicamentos().setName("Editar");
                    vista.getjDlgMedicamentos().setLocationRelativeTo(vista);
                    vista.getjDlgMedicamentos().setSize(546, 486);
                    vista.getjDlgMedicamentos().setTitle("Editar");
                    vista.getjDlgMedicamentos().setVisible(true);
                    
                    vista.getTxtIdentificacion().setText(String.valueOf(pe.getCodigo()));
                    vista.getTxtNomcomercial().setText(pe.getNomcomercial());
                    vista.getTxtNomcomercial().setText(pe.getNomcomercial());
                    vista.getJcElaboracion().setDate(pe.getElaboracion());
                    vista.getJcExpiracion().setDate(pe.getExpiracion());
                    vista.getSpinnerCosto().setValue(pe.getCosto());
                    vista.getSpinnerPvp().setValue(pe.getPvp());
                    
                    if (pe.getReceta().equalsIgnoreCase("Si")) {
                        vista.getRbSi().setSelected(true);
                    } else {
                        if (pe.getReceta().equalsIgnoreCase("No")) {
                            vista.getRbNo().setSelected(true);
                        }
                    }
                    
                    vista.getLabelFoto().setIcon(modelo.ConsultarFotoJDialog(codigo));
                }
            });
        }
    }
    
    public void buscarMedicamento() {
        
        KeyListener eventoTeclado = new KeyListener() {//Crear un objeto de tipo keyListener(Es una interface) por lo tanto se debe implementar sus metodos abstractos

            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
            @Override
            public void keyPressed(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
            @Override
            public void keyReleased(KeyEvent e) {
                
                vista.getTblMedicamento().setDefaultRenderer(Object.class, new ImagenTabla());
                vista.getTblMedicamento().setRowHeight(100);

                DefaultTableModel tblModel;
                tblModel = (DefaultTableModel) vista.getTblMedicamento().getModel();
                tblModel.setNumRows(0);

                List<Medicamento> listap = modelo.buscarMedicamento(vista.getTxtBuscar().getText());
                Holder<Integer> i = new Holder<>(0);
                listap.stream().forEach(pe -> {
                    tblModel.addRow(new Object[9]);
                    vista.getTblMedicamento().setValueAt(pe.getCodigo(), i.value, 0);
                    vista.getTblMedicamento().setValueAt(pe.getNomcomercial(), i.value, 1);
                    vista.getTblMedicamento().setValueAt(pe.getNomgenerico(), i.value, 2);
                    vista.getTblMedicamento().setValueAt(pe.getElaboracion(), i.value, 3);
                    vista.getTblMedicamento().setValueAt(pe.getExpiracion(), i.value, 4);
                    vista.getTblMedicamento().setValueAt(pe.getCosto(), i.value, 5);
                    vista.getTblMedicamento().setValueAt(pe.getPvp(), i.value, 6);
                    vista.getTblMedicamento().setValueAt(pe.getReceta(), i.value, 7);
                    
                    Image foto = pe.getImagen();
                    if (foto != null) {
                        
                        Image nimg = foto.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                        ImageIcon icono = new ImageIcon(nimg);
                        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                        renderer.setIcon(icono);
                        vista.getTblMedicamento().setValueAt(new JLabel(icono), i.value, 8);
                        
                    } else {
                        vista.getTblMedicamento().setValueAt(null, i.value, 8);
                    }
                    
                    i.value++;
                });
            }
        };
        
        vista.getTxtBuscar().addKeyListener(eventoTeclado); 
    }
    
    public void limpiarDatos() {
        vista.getTxtIdentificacion().setText("");
        vista.getTxtNomcomercial().setText("");
        vista.getTxtNomcomercial().setText("");
        vista.getSpinnerCosto().setValue(0);
        vista.getSpinnerPvp().setValue(0);
        vista.getLabelFoto().setIcon(null);
        
        vista.getTxtIdentificacion().setVisible(false);
        vista.getLblCodigo().setVisible(false);
    }
    
}
