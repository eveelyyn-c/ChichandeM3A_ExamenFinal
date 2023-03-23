
package chichandem3a_examenfinal;

import controlador.ControladorMenuPrincipal;
import vista.VistaPrincipal;


public class ChichandeM3A_ExamenFinal {


    public static void main(String[] args) {
        VistaPrincipal vistaPrincipal = new VistaPrincipal();

        ControladorMenuPrincipal control = new ControladorMenuPrincipal(vistaPrincipal);
        control.iniciaControl();
    }
    
}
