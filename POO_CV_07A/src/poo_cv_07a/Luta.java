package poo_cv_07a;

import java.util.Random;

/**
 *
 * @author vinicius
 */
public class Luta {
    // Atributos
    /* A classe Luta tem como atributos objetos da classe Lutador */
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    // Métodos
    // Esse método recebe como parametros 2 objetos de Lutador
    public void marcarLuta(Lutador l1, Lutador l2){
        //1º Verificar condições impeditivas da Luta
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            System.out.println("Luta não permitida.");
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante  = null;
        }
    }
    
    public void lutar(){
        //a luta inicia se estiver aprovada
        if (this.aprovada) {
            System.out.println("=====A LUTA DO SÉCULO=====");
            this.desafiado.apresentar();
            System.out.println("=====CONTRA=====");
            this.desafiante.apresentar();
            
            System.out.println("=====FIM DA LUTA=====");
            Random num = new Random();
            int resultado = num.nextInt(3);
            
            switch (resultado){
                case 0: // Empate
                    System.out.println("Temos um empate!");
                    this.desafiado.empate();
                    this.desafiante.empate();
                    break;
                case 1: // Desafiado vence
                    System.out.println("Vitoria de "+this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // Desafiante vence
                    System.out.println("Vitoria de "+this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        } else {
            System.out.println("Luta não permitida.");
        }
    }
}
