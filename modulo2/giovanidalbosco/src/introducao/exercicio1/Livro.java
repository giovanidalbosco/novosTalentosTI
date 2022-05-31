package introducao.exercicio1;

import java.text.SimpleDateFormat;

public class Livro {
    private String titulo;
    private float valor;
    private boolean esgotado;
    private Autor escritor;

    public Livro(String titulo) {
        setTitulo(titulo);
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isEsgotado() {
        return esgotado;
    }
    public void setEsgotado(boolean esgotado) {
        this.esgotado = esgotado;
    }
    
    public Autor getEscritor() {
        return escritor;
    }
    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //StringBuffer tread safe
        //StringBuilder non tread safe
        StringBuilder montadorString = new StringBuilder();
        montadorString.append("Escritor: ");
        montadorString.append(getEscritor().getNome());
        montadorString.append("\nNascido em: ");
        montadorString.append(sdf.format(getEscritor().getDataNascimento()));
        montadorString.append("\nTítulo: ");
        montadorString.append(getTitulo());
        montadorString.append("\nPreço: R$");
        montadorString.append(getValor());
        montadorString.append("\nDisponibilidade: ");
        montadorString.append((isEsgotado()?"Esgotado":"Disponível"));

        return montadorString.toString();

        //fazendo desta forma cada vez que contatena cria uma nova String, gastando muita memória: return "Escritor: " + getEscritor().getNome() + "\nNascido em: " + getEscritor().getDataNascimento() + "\nTítulo: " + getTitulo() + "\nPreço: R$" + getValor() + "\nDisponibilidade: " + (isEsgotado()?"Esgotado":"Disponível");
    }
}
