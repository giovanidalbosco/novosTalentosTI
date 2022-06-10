public class Pessoa {
    public int ano_atual = 2022;
    public int idade;
    public String nome;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String ano_nascimento(String nome, int ano_nascimento) {
        StringBuilder sb = new StringBuilder();
        idade = ano_atual - ano_nascimento;
        sb.append(nome);
        sb.append(idade);
        return sb.toString();
    }


    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Adriano", 23);
        System.out.println(pessoa1.idade);

        pessoa1.ano_nascimento("Adriano", 1975);

        System.out.println(pessoa1.idade);


    }
}