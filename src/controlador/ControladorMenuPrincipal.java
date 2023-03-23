package controlador;

import modelo.ModeloMedicamento;
import vista.VistaPrincipal;
import vista.VistaMedicamento;

public class ControladorMenuPrincipal {

    VistaPrincipal vistaPrincipal;

    public ControladorMenuPrincipal(VistaPrincipal vistaprincipal) {
        this.vistaPrincipal = vistaprincipal;
        vistaprincipal.setVisible(true);
    }

    public void iniciaControl() {
        vistaPrincipal.getMnuMedicamento().addActionListener(l -> crudMedicamentos());
        vistaPrincipal.getBtnMedicamentos().addActionListener(l -> crudMedicamentos());
    }

    private void crudMedicamentos() {
        VistaMedicamento vista = new VistaMedicamento();
        ModeloMedicamento modelo = new ModeloMedicamento();

        vistaPrincipal.getEscritorio().add(vista);

        ControladorMedicamento control = new ControladorMedicamento(modelo, vista);
        control.iniciarControl();
    }

    public void ControladorPrincipal(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        vistaPrincipal.setVisible(true);
    }
}
