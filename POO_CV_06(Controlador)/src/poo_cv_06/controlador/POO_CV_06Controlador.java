package poo_cv_06.controlador;

/**
 *
 * @author vinicius
 */
public class POO_CV_06Controlador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControleRemoto toshiba = new ControleRemoto();
        
        toshiba.ligar();
        toshiba.play();
        toshiba.maisVolume();
        toshiba.maisVolume();
        //toshiba.ligarMudo();
        toshiba.abrirMenu();
    }
}
 