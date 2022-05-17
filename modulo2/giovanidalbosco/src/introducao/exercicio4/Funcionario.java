package introducao.exercicio4;

public class Funcionario extends PessoaFisica {
    private String funcao;
    private long cadastro;

    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    public long getCadastro() {
        return cadastro;
    }
    public void setCadastro(long cadastro) {
        this.cadastro = cadastro;
    }

}
