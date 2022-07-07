package introducao.avaliacao2;

public class ExperienciaProfissional {
    private String nome;
    private String anoConclusao; // Obs.: na classe Formação está int, e aqui está String
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getAnoConclusao() {
        return anoConclusao;
    }
    public void setAnoConclusao(String anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

}
