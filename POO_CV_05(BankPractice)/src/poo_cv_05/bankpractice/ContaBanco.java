package poo_cv_05.bankpractice;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class ContaBanco {
    // instanciando objeto Scanner para obter entradas
    Scanner input = new Scanner(System.in);
    // atributos
    public int numConta;
    protected String tipoConta;
    private String cliente;
    private double saldo;
    private boolean statusConta;
    
    // getters e setters
    private void setNumConta(){
        // Gera um némero pseudo randomico para a nova conta
        this.numConta = new Random().nextInt(1000);
    }
    
    public int getNumConta(){
        return this.numConta;
    }
    
    private void setTipo(int entrada){
        if(entrada == 0){
            this.tipoConta = "Conta Corrente";
            this.setSaldo(50);
        }else if(entrada == 1){
            this.tipoConta = "Conta Poupança";
            this.setSaldo(150);
        }else System.out.println("ERRO - Entrada invalida, repita o processo de abertura.");
    }
    
    public String getTipo(){
        return this.tipoConta;
    }
    
    private void setCliente(String nomeCliente){
       this.cliente = nomeCliente;
    }
    
    public String getCliente(){
        return this.cliente;
    }
    
    private double setSaldo(double valor){
        this.saldo = valor;
        return this.saldo;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setStatus(boolean status){
        this.statusConta = status;
    }
    
    public boolean getStatus(){
        return this.statusConta;
    }

    // Construtor
    public ContaBanco() {
        setNumConta();
        setSaldo(0);
        setStatus(false);
    }
    
    // Rotinas
    public void abrirConta(){
        System.out.println("BEM VINDO AO MyBank!");
        System.out.println("Entre com o seu nome: ");
        setCliente(input.nextLine());
        
        System.out.println("Qual tipo de conta gostaria: \n" + 
                "Digite '0' para Conta corrente ou '1' para conta poupança.");
        setTipo(input.nextInt());
        setStatus(true);
        System.out.println("Sua conta foi criada com sucesso!");
        System.out.println();
        statusGeral();
    }
    
    public void fecharConta(){
        
    }
    
    public void depositar(){
        if(this.statusConta){
            System.out.println("Entre com o valor do seu deposito: ");
            this.saldo += setSaldo(input.nextDouble());
        }else System.out.println("ERRO - Conta inativa.");
        System.out.println();
        statusGeral();
    }
    
    public void sacar(){
        if(this.statusConta){
            System.out.println("Entre com o valor para saque: ");
            double saque = input.nextDouble();
            if(saque <= getSaldo()){
                this.saldo -= setSaldo(saque);
                System.out.println("Retire seu saque de R$: "+saque);
            }else{
                System.out.println("Saldo Insuficiente.");
            }
        }else{
            System.out.println("ERRO - Conta Inativa.");
        }
        statusGeral();
    }
    
    public void statusGeral(){
        System.out.println("Cliente: "+this.getCliente());
        System.out.println("Nº da conta: "+this.getNumConta());
        System.out.println("Tipo de conta: "+this.getTipo());
        System.out.println("Saldo atual: "+this.getSaldo());
    }
}
