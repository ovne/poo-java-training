/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_cv_06.controlador;

/**
 *
 * @author vinicius
 */
public class ControleRemoto implements Controlador {
    /* Atributos - para um objeto encapsulado, todos os
    atributos são privados*/
    private boolean ligado;
    private int volume;
    private int currentVolume;
    private boolean tocando;
    
    //Métodos especiais (acessores e modificadores)
    private boolean getLigado(){    
        return ligado;
    }
    
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private int getVolume() {
        return volume;
    }

    private int getCurrentVolume() {
        return currentVolume;
    }

    private void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
    
    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {    
        this.tocando = tocando;
    }

    //Construtor
    public ControleRemoto() {
        this.setLigado(false);
        this.setTocando(false);
        this.setVolume(25);
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado()){
            System.out.println("---Menu---");
            System.out.print("Volume: "+this.getVolume()+" ");
            // "representação gráfica" do volume
            for (int i = 0; i < this.getVolume(); i +=10){
                System.out.print("♪");
            }
            System.out.println();
            System.out.println("Reproduzindo: "+this.getTocando());
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("bye-bye");
    }

    @Override
    public void maisVolume() {
        // é razoavel checar se esta ligado para entao aumentar o volume
        if(this.getLigado()){
            if(this.getVolume() < 100){
                this.setVolume(this.getVolume() + 5);
            }else{
                System.out.println("Volume Máximo!");
            }
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            if(this.getVolume() > 0){
                this.setVolume(this.getVolume() - 5);
            }else{
                System.out.println("Volume Minimo!");
            }
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado()){
            if(this.getVolume() > 0){
                this.setCurrentVolume(this.getVolume());
                this.setVolume(0);
            }else{
                System.out.println("Mudo");
            }
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(this.getCurrentVolume());
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
    
}
