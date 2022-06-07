package introducao.exercicio18;

import java.util.ArrayList;

public class Loja {
    private ArrayList<Setor> listaSetores = new ArrayList<>();

    public ArrayList<Setor> getListaSetores() {
        return listaSetores;
    }
    public void setListaSetores(ArrayList<Setor> listaSetores) {
        this.listaSetores = listaSetores;
    }

    public String gerarCatalogo() {
        StringBuffer sb = new StringBuffer();
        for(Setor setor: getListaSetores()) {
            sb.append(String.format("Setor: %s\n", setor.getNome()));
            for(Produto produto: setor.getListaProdutos()) {
                sb.append(String.format("Produto: %s\n", produto.getNome()));
                sb.append(String.format("Preço: %.2f\n", produto.getPreco()));
                sb.append(String.format("Fornecedor: %s\n\n", produto.getFornecedor().getNome()));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Fornecedor forn1 = new Fornecedor();
        forn1.setNome("Karsten");

        Fornecedor forn2 = new Fornecedor();
        forn2.setNome("Dohler");        
        
        Produto produto1 = new Produto();
        produto1.setNome("Travesseiro");
        produto1.setPreco(70f);
        produto1.setFornecedor(forn1);

        Produto produto2 = new Produto();
        produto2.setNome("Cobertor");
        produto2.setPreco(250f);
        produto2.setFornecedor(forn1);

        Produto produto3 = new Produto();
        produto3.setNome("Toalha");
        produto3.setPreco(100f);
        produto3.setFornecedor(forn1);

        Produto produto4 = new Produto();
        produto4.setNome("Toalha de banho");
        produto4.setPreco(60f);
        produto4.setFornecedor(forn2);

        Produto produto5 = new Produto();
        produto5.setNome("Toalha de rosto");
        produto5.setPreco(30f);
        produto5.setFornecedor(forn2);
        
        Setor setor1 = new Setor();
        setor1.setNome("Cama");
        setor1.getListaProdutos().add(produto1);
        setor1.getListaProdutos().add(produto2);

        Setor setor2 = new Setor();
        setor2.setNome("Mesaa");
        setor2.getListaProdutos().add(produto3);

        Setor setor3 = new Setor();
        setor3.setNome("Banho");
        setor3.getListaProdutos().add(produto4);
        setor3.getListaProdutos().add(produto5);

        Loja loja1 = new Loja();
        loja1.getListaSetores().add(setor1);
        loja1.getListaSetores().add(setor2);
        loja1.getListaSetores().add(setor3);

        System.out.print(loja1.gerarCatalogo());

    }
}
