package introducao.exercicio2;

public class Hospede {
    private String nome;
    private String CPF;
    private String telefone;

    public Hospede(String CPF) {
        setCPF(CPF);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String toString() {
        StringBuilder hospedeDados = new StringBuilder();
        hospedeDados.append("Nome: ");
        hospedeDados.append(getNome()); 
        hospedeDados.append("\nCPF: "); 
        hospedeDados.append(getCPF());
        hospedeDados.append("\nTelefone: ");
        hospedeDados.append(getTelefone()); 
         
        return hospedeDados.toString();
         
        //porque eu tive que utilizar o toString aqui para aparecer o nome dos hospedes?
    }

}
