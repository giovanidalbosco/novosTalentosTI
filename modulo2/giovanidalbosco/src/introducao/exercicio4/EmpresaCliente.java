package introducao.exercicio4;

public class EmpresaCliente extends PessoaJuridica {
    private long numFuncionarios;
    private String endereço;

    public long getNumFuncionarios() {
        return numFuncionarios;
    }
    public void setNumFuncionarios(long numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

}
