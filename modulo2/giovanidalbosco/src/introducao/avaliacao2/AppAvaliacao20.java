package introducao.avaliacao2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AppAvaliacao20 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Formacao form1 = new Formacao();
        form1.setNome("Ensino Médio");
        form1.setAnoConclusao(1999);

        Formacao form2 = new Formacao();
        form2.setNome("Curso Novos Talentos em TI");
        form2.setAnoConclusao(2022);

        ExperienciaProfissional exp1 = new ExperienciaProfissional();
        exp1.setNome("Monstro em Java");
        exp1.setAnoConclusao("2022");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Zezinho");
        try {
            pessoa1.setDataNascimento(sdf.parse("01/12/1980"));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        Curriculo curr1 = new Curriculo();
        curr1.setPessoa(pessoa1);
        curr1.getListaFormacoes().add(form1);
        curr1.getListaFormacoes().add(form2);
        curr1.getListaExperienciasProfissionais().add(exp1);
        
        Formacao form3 = new Formacao();
        form3.setNome("Ensino Médio");
        form3.setAnoConclusao(2000);

        Formacao form4 = new Formacao();
        form4.setNome("Curso Novos Talentos em TI");
        form4.setAnoConclusao(2022);

        ExperienciaProfissional exp2 = new ExperienciaProfissional();
        exp2.setNome("DBA em MariaDB");
        exp2.setAnoConclusao("Atual");

        ExperienciaProfissional exp3 = new ExperienciaProfissional();
        exp3.setNome("Desenvolvedora FullStack");
        exp3.setAnoConclusao("2021");

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Mariazinha");
        try {
            pessoa2.setDataNascimento(sdf.parse("10/07/1981"));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        Curriculo curr2 = new Curriculo();
        curr2.setPessoa(pessoa2);
        curr2.getListaFormacoes().add(form3);
        curr2.getListaFormacoes().add(form4);
        curr2.getListaExperienciasProfissionais().add(exp2);
        curr2.getListaExperienciasProfissionais().add(exp3);

        System.out.println(curr1.gerarCurriculo());
        System.out.println(String.format("Número de experiências profissionais: %d\n", curr1.contarNumExperienciasProfissionais()));

        System.out.println(curr2.gerarCurriculo());
        System.out.println(String.format("Número de experiências profissionais: %d", curr2.contarNumExperienciasProfissionais()));

    }
}
