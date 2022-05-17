package introducao;

import java.util.ArrayList;

//POJO Plain Old Java Object
public class Celular {
    private String numero;
    private String marca;
    private String modelo;
    private Pessoa dono;

    //OPERADOR DIAMANTE - GENERICS
    private ArrayList<Aplicativo> listaAplicativos = new ArrayList<Aplicativo>();
    
    //CONSTRUTOR
    public Celular(String numero) {
        this.numero = numero;
    }
    
    //GETTERS and SETTERS
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Pessoa getDono() {
        return dono;
    }
    public void setDono(Pessoa dono) {
        this.dono = dono;
    }
    public ArrayList<Aplicativo> getListaAplicativos() {
        return listaAplicativos;
    }
    public void setListaAplicativos(ArrayList<Aplicativo> listaAplicativos) {
        this.listaAplicativos = listaAplicativos;
    }
    
}
