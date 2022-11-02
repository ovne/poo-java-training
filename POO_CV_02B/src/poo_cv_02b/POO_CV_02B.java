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
        /*Agora vou instanciar alguns objetos da classe CanetaMágica, isto é,
      criar um objeto CanetaMágica, atribuir valores aos seus atributos e ver 
      o que esse objeto pode fazer (métodos)*/
    
        CanetaMágica c1 = new CanetaMágica(); // criado uma caneta de nome c1
        
        // atribuindo valores aos atributos
        c1.carga = 20; 
        c1.cor = "Preta";
        c1.ponta = 0.5;        
        c1.tampa = true;
        
        //Agora testando o ação de alguns métodos
        c1.destampar();
        c1.status();
        System.out.println();
        c1.poema();
        System.out.println();
        c1.status();
        System.out.println();
        c1.poema();
        
        //todos os métodos do meu simples objeto parecem agir como o esperado
    }
}
