package introducao.avaliacao2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Curriculo {
    private Pessoa pessoa;
    private ArrayList<ExperienciaProfissional> listaExperienciasProfissionais = new ArrayList<>();
    private ArrayList<Formacao> listaFormacoes = new ArrayList<>();
    
    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    public ArrayList<ExperienciaProfissional> getListaExperienciasProfissionais() {
        return listaExperienciasProfissionais;
    }
    
    public ArrayList<Formacao> getListaFormacoes() {
        return listaFormacoes;
    }

    public String gerarCurriculo() {
        StringBuilder sb = new StringBuilder();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sb.append(String.format("Nome: %s\n", pessoa.getNome()));
        sb.append(String.format("Data de nascimento: %s\n", sdf.format(pessoa.getDataNascimento())));
        
        sb.append("\nHistórico escolar:\n");
        for(Formacao formacao : listaFormacoes) {
            sb.append(String.format("Formação: %s\n", formacao.getNome()));
            sb.append(String.format("Ano Conclusão: %d\n", formacao.getAnoConclusao()));
        }
        sb.append("\nExperiência profissional:\n");
        for(ExperienciaProfissional experiencia : listaExperienciasProfissionais) {
            sb.append(String.format("Cargo: %s\n", experiencia.getNome()));
            sb.append(String.format("Ano Conclusão: %s\n", experiencia.getAnoConclusao()));
        }

        return sb.toString();
    }

    public int contarNumExperienciasProfissionais() {
        int contador = 0;
        for(ExperienciaProfissional experiencia : listaExperienciasProfissionais) {
            contador++;
        }
        return contador;
    }

}
