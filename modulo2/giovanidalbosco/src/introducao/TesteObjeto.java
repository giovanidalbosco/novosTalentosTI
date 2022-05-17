package introducao;

public class TesteObjeto {
    public String nomeUpper;
    public int idade;


    public TesteObjeto(String nomeUpper) {
        this.nomeUpper = nomeUpper.toUpperCase();
    }
    public TesteObjeto(int idade) {
        this.idade = idade;
    }
    public String nomeUpper() {
        return this.nomeUpper.toUpperCase();
    }
}
