package poo_cv_02b;

/**
 *
 * @author vinicius
 */
public class POO_CV_02B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CanetaMágica c1 = new CanetaMágica(); // criado uma caneta de nome c1
        c1.modelo = "POSCA";
        c1.cor = "Preta";
        c1.status();
        System.out.println();
        c1.carga = 80;
        c1.tampar();
        c1.poema();
    }
}
