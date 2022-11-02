/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_cv_07a;

/**
 *
 * @author vinicius
 */
public class POO_CV_07A {

    public static void main(String[] args) {
        //Uma forma de instanciar um objeto da classe Lutador com uma variavel complexa
        Lutador l[] = new Lutador[6];
        //Cada posição do vetor sera um objeto Lutadot diferente..
        l[0] = new Lutador("PrettyBoy","França",31,1.75,68.9,11,12,1);
        l[1] = new Lutador("Putscript","Brasil",29,1.68,57.8,14,2,3);
        l[2] = new Lutador("Snapshadow","EUA",35,1.65,80.9,12,2,1);
        l[3] = new Lutador("Deadcode","Austrália",28, 1.93, 81.6, 13, 0, 2);
        l[4] = new Lutador("UFOcobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
        l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81, 105.7, 12, 2, 4);
        
        //Simulação da luta
        Luta umc = new Luta(); // instancia de um objeto do tipo Luta
        umc.marcarLuta(l[2], l[3]); // chamada a m´étodo do objeto passando 2 objeto da Lutador como parametro
        umc.lutar();
    }
}
