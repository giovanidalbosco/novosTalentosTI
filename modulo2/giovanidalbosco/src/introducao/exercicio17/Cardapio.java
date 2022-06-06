package introducao.exercicio17;

import java.util.ArrayList;

public class Cardapio {
    private ArrayList<ItemCardapio> listaItensCardapio = new ArrayList<>();

    public ArrayList<ItemCardapio> getListaItensCardapio() {
        return listaItensCardapio;
    }
    public void setListaItensCardapio(ArrayList<ItemCardapio> listaItensCardapio) {
        this.listaItensCardapio = listaItensCardapio;
    }

    public String gerarCardapio() {
        StringBuffer sb = new StringBuffer();
        sb.append("Cardápio:\n\n");
        for(ItemCardapio item: getListaItensCardapio()) {
            if(item.isDisponivel()) {
                sb.append(String.format("Prato: %s -> Preço: %.2f\n", item.getPrato().getNome(), item.getPrato().getPreco()));
            }
        }

        return sb.toString();
    }
    
    public static void main(String[] args) {
        Cardapio card = new Cardapio();
        
        Prato prato1 = new Prato();
        prato1.setNome("Bifão");
        prato1.setPreco(10f);

        Prato prato2 = new Prato();
        prato2.setNome("Feijoada");
        prato2.setPreco(30f);

        Prato prato3 = new Prato();
        prato3.setNome("Dobradinha");
        prato3.setPreco(50f);

        Prato prato4 = new Prato();
        prato4.setNome("Hamburguer");
        prato4.setPreco(20f);

        ItemCardapio item1 = new ItemCardapio();
        item1.setPrato(prato1);
        item1.setDisponivel(true);

        ItemCardapio item2 = new ItemCardapio();
        item2.setPrato(prato2);
        item2.setDisponivel(true);

        ItemCardapio item3 = new ItemCardapio();
        item3.setPrato(prato3);
        item3.setDisponivel(false);

        ItemCardapio item4 = new ItemCardapio();
        item4.setPrato(prato4);
        item4.setDisponivel(true);

        card.getListaItensCardapio().add(item1);
        card.getListaItensCardapio().add(item2);
        card.getListaItensCardapio().add(item3);
        card.getListaItensCardapio().add(item4);

        System.out.print(card.gerarCardapio());
    }

}
