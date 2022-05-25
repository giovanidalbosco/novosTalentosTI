package sistema.exception;

public class ValorInvalidoException extends Exception {
    //mensagem de erro + campo + exception

    private String nomeCampo = "";

    // sobrecarga de construtor
    public ValorInvalidoException(String mensagem, Exception origem, String nomeCampo) {
        this(mensagem, origem); // this se refere a propria classe, neste caso "ValorInvalidoException"; this() chama o contrutor dele mesmo
        this.nomeCampo = nomeCampo;
    }
    public ValorInvalidoException(String mensagem, Exception origem) {
        super(mensagem, origem); // super se refere a superclasse pai, neste caso "Exception"; super() chama o contrutor da superclasse
    }
}
