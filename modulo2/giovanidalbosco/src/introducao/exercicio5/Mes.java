package introducao.exercicio5;

public class Mes {
    private String nome;
    
    public Mes(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        // TODO Auto-generated method stub
        return getNome();
    }
}
