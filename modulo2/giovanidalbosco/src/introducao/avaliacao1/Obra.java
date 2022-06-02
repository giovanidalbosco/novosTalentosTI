package introducao.avaliacao1;

import java.util.ArrayList;

public class Obra {
    private ArrayList<FaseDaObra> listaFases = new ArrayList<>();

    public ArrayList<FaseDaObra> getListaFases() {
        return listaFases;
    }

    public void setListaFases(ArrayList<FaseDaObra> listaFases) {
        this.listaFases = listaFases;
    }

    public String listarDadosDaObra() {
        StringBuilder saida = new StringBuilder();
        
        for(FaseDaObra fases: getListaFases()) {
            saida.append(String.format("\nFase: %s\n", fases.getNome()));
            
            saida.append("\nDados do encarregado:");
            saida.append(String.format("\n -Nome: %s", fases.getEncarregado().getNome()));
            saida.append(String.format("\n -Formação: %s", fases.getEncarregado().getFormacao()));
            saida.append(String.format("\n -Número: %d", fases.getEncarregado().getNumero()));
            saida.append(String.format("\n -Salário: %.2f\n", fases.getEncarregado().getSalario()));
            saida.append("\nDados dos construtores:");
            for(Construtor construtores: fases.getListaConstrutores()) {
                saida.append(String.format("\n -Nome: %s", construtores.getNome()));
                saida.append(String.format("\n -Número: %d", construtores.getNumero()));
                saida.append(String.format("\n -Salário: %.2f", construtores.getSalario()));
                saida.append(String.format("\n -Terceirizado: %s\n", (construtores.isTerceirizado()?"Sim":"Não")));
            }
            saida.append("\nLista de materiais:");
            for(ItemDeConstrucao itens: fases.getListaItens()) {
                saida.append(String.format("\n -Material: %s", itens.getProduto().getNome()));
                saida.append(String.format("\n -Preço: %.2f", itens.getProduto().getPreco()));
                saida.append(String.format("\n -Quantidade: %d\n", itens.getQuantidade()));
            }
        }

        return saida.toString();
    }

    public float calcularValorTotalDaObra() {
        float total = 0f;
        for(FaseDaObra fases: getListaFases()) {
            total += fases.calcularValorDaFaseDaObra();
        }

        return total;
    }
}
