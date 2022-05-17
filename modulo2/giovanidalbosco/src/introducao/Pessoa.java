package introducao;

public class Pessoa {
    // atributos da classe
    //escopo de vida de instancia
    //ENCAPSULAMENTO - POJO Plain Old Java Object
    private String nome; 
    private int idade;
    private String CPF;
    private float altura;
    //public int numero[] = new int[10];
    
    //GETTER e SETTER
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        if(!nome.equals("")) {
            this.nome = nome;
        }
    }

    //comportamento
    //CONSTRUTOR - inicializar um objeto e definir valores obrigatorios
    //para ser um CONSTRUTOR tem que ter o mesmo nome da classe
    public Pessoa(String nome) {
        System.out.println(nome);
        //this.nome = nome.toUpperCase(); //quando a variável local é igual a da maior estancia, o this serve para referenciar as variaveis do Objeto.
        setNome(nome); // fazendo desta forma, toda alteração do nome da variável fica no GET/SET
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCPF() {
        return this.CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    //MÉTODO (função)
    //assinatura de um método:
    //modificadordeacesso tipoderetorno nomedometodo(parametros) { corpo }
    public String podeDirigir() {
        if (this.idade >= 18) {
            return "Pode dirigir!";
        } else {
            return "Não pode dirigir!";
        }
        /*
        Não existe um método dentro do outro. Exemplo:
        public void mostraCPF() {
            System.out.println(this.CPF);
        }
        */
    }
    public void mostraCPF() {
        System.out.println(this.CPF);
    }
}
