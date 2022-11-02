
package poo_cv_02b;

/**
 *
 * @author vinicius
 */
public class CanetaMágica {
    //declarando atributos da minha classe
    String cor;
    double ponta;
    int carga;
    boolean tampa;
    
    //declarando alguns metodos que desejo que meu objeto CanetaMágica execute
    void tampar(){
        this.tampa = true;
    } 
    void destampar(){
        this.tampa = false;
    }
    void poema(){
        if (this.tampa == true){
            System.out.println("Ei! Canetas tampadas não escrevem poemas!");
        }else if (this.carga <= 0){
            System.out.println("Sem tinta irmão :( ");
        }else{
            System.out.println("Minha terra tem palmeiras \n"
                    + "onde canta o Sábia \n"
                    + "e as aves que aqui gorjeiam, \n"
                    + "não gorjeiam como lá! \n"
                    + "Não permita oh Deus que eu morra \n"
                    + "sem que eu volte para lá \n"
                    + "sem que eu volte avistar as palmeiras\n"
                    + "onde canta o Sábia");
        }
        this.carga = this.carga - 20;
    }
    void status(){
        System.out.println("Olá, mundo! Eu sou uma Caneta Mágica");
        System.out.println("Minha cor é:" + this.cor);
        System.out.println("Minha ponta é:" + this.ponta);
        System.out.println("Minha carga atual é:" + this.carga);
        if(this.tampa == false)System.out.println("Ah sim, estou destampada");
        else System.out.println("Estou tampada, hein!");
    }
    
    /* o this. é uma auto referencia ao objeto que chamar algum atributo da
    classe. Sempre que é preciso modificar os atributos dentro da própria classe
    é preciso utilizar this. Em suma, this. sera substituido por qualquer objeto
    que chamar os atributos ou métodos da classe */
}
