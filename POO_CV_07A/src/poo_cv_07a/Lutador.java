
package poo_cv_07a;
 /**
 *
 * @author vinicius
 */
public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // getter setters
    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getNacionalidade() {
        return nacionalidade;
    }

    protected void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    protected int getIdade() {
        return idade;
    }

    protected void setIdade(int idade) {
        this.idade = idade;
    }

    protected double getAltura() {
        return altura;
    }

    protected void setAltura(double altura) {
        this.altura = altura;
    }

    protected double getPeso() {
        return peso;
    }

    protected void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    protected String getCategoria() {
        return categoria;
    }

    protected void setCategoria() {
        if(this.getPeso() < 52.2){
            this.categoria = "Inapto";
        }else if(this.getPeso() <= 70.3){
            this.categoria = "Leve";
        }else if(this.getPeso() <= 83.9){
            this.categoria = "Médio";
        }else if(this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        }else this.categoria = "Inapto"; 
    }

    protected int getVitorias() {
        return vitorias;
    }

    protected void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    protected int getDerrotas() {
        return derrotas;
    }

    protected void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    protected int getEmpates() {
        return empates;
    }

    protected void setEmpates(int empates) {
        this.empates = empates;
    }
    
    //construtor
    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    //Métodos
    public void apresentar(){
        System.out.println("LADIES and GENTLEMAN !!! \nApresentandoo:");
        System.out.println(this.getNome());
        System.out.println("Natural de "+this.getNacionalidade());
        System.out.println(this.getIdade()+" anos de idade");
        System.out.println(this.getAltura()+" de altura");
        System.out.println("Pesando "+ this.getPeso()+" kg");
        System.out.println("Na categoria "+this.getCategoria());
        System.out.println("Com "+this.getVitorias()+" vitorias");
        System.out.println(this.getDerrotas()+" derrotas");
        System.out.println("e "+this.getEmpates()+" empates");
    }
    
    public void status(){
        System.out.println("Lutador: "+this.getNome());
        System.out.println("Categoria: "+this.getCategoria());
        System.out.println("Vitórias: "+this.getVitorias());
        System.out.println("Derrotas: "+this.getDerrotas());
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empate(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
}
