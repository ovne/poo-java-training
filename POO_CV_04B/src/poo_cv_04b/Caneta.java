package poo_cv_04b;
public class Caneta {
    //Declaração de atributos
    private String modelo;
    private String cor;
    private int carga;
    private boolean tampa;
    
    //Método construtor
    public Caneta(){
        this.tampar();
        this.setModelo("BIC");
        this.setCor("Azul");
        this.setCarga(100);
    }
    //métodos acessores
    public String getModelo(){
        return this.modelo;
    }
    public String getCor(){
        return this.cor;
    }
    public int getCarga(){
        return this.carga;
    }
    public boolean getTampa(){
        return this.tampa;
    }
    
    //Métodos modificadores
    public void setModelo(String m){
        this.modelo = m;
    }
    public void setCor(String c){
        this.cor = c;
    }
    public void setCarga(int l){
        this.carga = l;
    }
    
    //Métodos de caneta
    public void tampar(){
        this.tampa = true;
    }
    public void destampar(){
        this.tampa = false;
    }
    public void escrever(){
        if (this.tampa == true){
            System.out.println("ERRO - Caneta tampada");
        }else{
            System.out.println("Olá, mundo!");
            this.carga -= 10;
            }
        }
    
    void status(){
        System.out.println("Modelo:" + this.getModelo());
        System.out.println("Cor:" + this.getCor());
        System.out.println("Carga atual:" + this.carga);
        System.out.println("Tapada?" + this.tampa);
        }
    }
