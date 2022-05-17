package introducao.exercicio4;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App7 {
    public static void main(String[] args) {
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Zezinho");
        funcionario1.setCPF("111.111.111-11");
        try {
            funcionario1.setDataNascimento(data.parse("07/01/1990"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        funcionario1.setTelefone("(22)2222-2222");
        funcionario1.setCadastro(55555);
        funcionario1.setFuncao("Funileiro");

        EmpresaCliente empresa1 = new EmpresaCliente();
        empresa1.setNome("Joãozinho Inc.");
        empresa1.setCNPJ("11.111.111/0001-11");
        try {
            empresa1.setDataCriacao(data.parse("01/01/2000"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        empresa1.setTelefone("(33)3333-3333");
        empresa1.setNumFuncionarios(200);
        empresa1.setEndereço("Rua Não Existe");

        PessoaFisica pessoa1 = funcionario1;
        System.out.println(pessoa1.getNome() + "\n" + pessoa1.getCPF() + "\n" + pessoa1.getTelefone() + "\n" + data.format(pessoa1.getDataNascimento()) + "\n");

        PessoaJuridica pessoa2 = empresa1;
        System.out.println(pessoa2.getNome() + "\n" + pessoa2.getCNPJ() + "\n" + pessoa2.getTelefone() + "\n" + data.format(pessoa2.getDataCriacao()) + "\n");

        Pessoa pessoa3 = pessoa1;
        System.out.println(pessoa3.getNome() + "\n" + pessoa3.getTelefone() + "\n");

        Pessoa pessoa4 = pessoa2;
        System.out.println(pessoa4.getNome() + "\n" + pessoa4.getTelefone() + "\n");

        Funcionario funcionario2 = (Funcionario)pessoa3;
        System.out.println(funcionario2.getNome() + "\n" + funcionario2.getCPF() + "\n" + funcionario2.getTelefone() + "\n" + data.format(funcionario2.getDataNascimento()) + "\n" + funcionario2.getCadastro() + "\n" + funcionario2.getFuncao() + "\n");

        EmpresaCliente empresa2 = (EmpresaCliente)pessoa4;
        System.out.println(empresa2.getNome() + "\n" + empresa2.getCNPJ() + "\n" + empresa2.getTelefone() + "\n" + data.format(empresa2.getDataCriacao()) + "\n" + empresa2.getEndereço() + "\n" + empresa2.getNumFuncionarios());
    }
}
