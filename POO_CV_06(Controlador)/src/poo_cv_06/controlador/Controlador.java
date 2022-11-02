package poo_cv_06.controlador;

/**
 *
 * @author vinicius
 */
public interface Controlador {
    /* Definindo os métodos abstratos. Os métodos ne interface vão ser a única
    forma de acesso e comunicação com o objeto que essa interface vai implementar*/
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
    
}
