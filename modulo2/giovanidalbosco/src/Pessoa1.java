public class Pessoa1 {
    private int ano_atual = 2022;
    private int idade;
    private String nome;

    public int getAno_atual() {
        return ano_atual;
    }
    public void setAno_atual(int ano_atual) {
        this.ano_atual = ano_atual;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa1(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public String ano_nascimento(String nome, int ano_nascimento) {
        StringBuilder sb = new StringBuilder();
        setIdade(ano_atual - ano_nascimento);
        sb.append(nome);
        sb.append(getIdade());
        return sb.toString();
    }


    public static void main(String[] args) {
        Pessoa1 pessoa1 = new Pessoa1("Adriano", 23);

        System.out.println(pessoa1.getIdade());

        pessoa1.ano_nascimento("Adriano", 1975);

        System.out.println(pessoa1.getIdade());


    }
}
