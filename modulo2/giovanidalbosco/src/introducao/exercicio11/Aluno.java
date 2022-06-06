package introducao.exercicio11;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<Nota> listaNotas = new ArrayList<>();
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Nota> getListaNotas() {
        return listaNotas;
    }
    public void setListaNotas(ArrayList<Nota> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public float calcMediaNotas() {
        float total = 0f;
        for(Nota notas: getListaNotas()) {
            total += notas.getValor();
        }
        total /= getListaNotas().size();

        return total;
    }

    public static void main(String[] args) {
        Aluno zezinho = new Aluno();
        zezinho.setNome("Zezinho da Silva");

        Nota nota1 = new Nota();
        nota1.setValor(5f);

        Nota nota2 = new Nota();
        nota2.setValor(7f);

        Nota nota3 = new Nota();
        nota3.setValor(6f);

        zezinho.getListaNotas().add(nota1);
        zezinho.getListaNotas().add(nota2);
        zezinho.getListaNotas().add(nota3);

        float media = zezinho.calcMediaNotas();

        System.out.println(String.format("A média de %s é %.2f", zezinho.getNome(), media));
    }
}
