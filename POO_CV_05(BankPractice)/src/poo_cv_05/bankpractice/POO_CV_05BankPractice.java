/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_cv_05.bankpractice;

/**
 *
 * @author vinicius
 */
public class POO_CV_05BankPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaBanco minhaConta = new ContaBanco();
        minhaConta.abrirConta();
        minhaConta.sacar();
    }
}
