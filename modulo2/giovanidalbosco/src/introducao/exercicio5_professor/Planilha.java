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

    public float calcularUltimoValorMedio() {
        float total = 0;
        for(int i = 0; i < getListaContasDeLuz().size(); i++) {
            total += getListaContasDeLuz().get(i).getValorDaConta();
        }
        return total/getListaContasDeLuz().size();
    }

    public float calcularUltimoValorMediov2() {
        float total = 0;
        for(ContaDeLuz umaConta : getListaContasDeLuz()) {
            total += umaConta.getValorDaConta();
        }
        return total / getListaContasDeLuz().size();
    }

    public float calcularUltimoValorMediov3() {
        return (float)listaContasDeLuz.stream().mapToDouble(a -> a.getValorDaConta()).sum() / listaContasDeLuz.size();
    }
    
    public float calcularMaiorValor() {
        float maior = 0;
        for(int i = 0; i < getListaContasDeLuz().size(); i++) {
            if(getListaContasDeLuz().get(i).getValorDaConta() > maior) {
                maior = getListaContasDeLuz().get(i).getValorDaConta();
            }
        }

        return maior;
    }

    public float calcularMenorValor() {
        float menor = getListaContasDeLuz().get(0).getValorDaConta();
        for(int i = 0; i < getListaContasDeLuz().size(); i++) {
            if(getListaContasDeLuz().get(i).getValorDaConta() < menor) {
                menor = getListaContasDeLuz().get(i).getValorDaConta();
            }
        }

        return menor;
    }
}
