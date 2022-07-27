package jogadavelha;

public class Jogador {
    public int id;
    public String jogada;

    public Jogador(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getJogada() {
        return jogada;
    }

    public void setJogada(String jogada) {
        this.jogada = jogada;
    }

}