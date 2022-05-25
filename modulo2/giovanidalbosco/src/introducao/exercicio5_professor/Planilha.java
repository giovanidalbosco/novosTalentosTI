package introducao.exercicio5_professor;

import java.util.ArrayList;

public class Planilha {
    private ArrayList<ContaDeLuz> listaContasDeLuz = new ArrayList<>();

    public ArrayList<ContaDeLuz> getListaContasDeLuz() {
        return listaContasDeLuz;
    }
    public void setListaContasDeLuz(ArrayList<ContaDeLuz> listaContasDeLuz) {
        this.listaContasDeLuz = listaContasDeLuz;
    }

    public float calculaUltimoValorMedio() {
        float total = 0;
        for(int i = 0; i < getListaContasDeLuz().size(); i++) {
            total += getListaContasDeLuz().get(i).getValorDaConta();
        }
        return total/getListaContasDeLuz().size();
    }
    
    public float calculaMaiorValor() {
        float maior = 0;
        for(int i = 0; i < getListaContasDeLuz().size(); i++) {
            if(getListaContasDeLuz().get(i).getValorDaConta() > maior) {
                maior = getListaContasDeLuz().get(i).getValorDaConta();
            }
        }

        return maior;
    }

    public float calculaMenorValor() {
        float menor = getListaContasDeLuz().get(0).getValorDaConta();
        for(int i = 0; i < getListaContasDeLuz().size(); i++) {
            if(getListaContasDeLuz().get(i).getValorDaConta() > menor) {
                menor = getListaContasDeLuz().get(i).getValorDaConta();
            }
        }

        return menor;
    }
}
