package introducao.exercicio3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App6 {
    public static void main(String[] args) {
        Comprador zezinho = new Comprador();
        zezinho.setId(300);
        zezinho.setNome("Zezinho da Silva");
        zezinho.setEndereço("Rua Lalala 100");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Pedido pedido1 = new Pedido();
        pedido1.setId(1);
        try {
            pedido1.setData(sdf.parse("29/04/2022"));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } /*finally {

        }*/

        ItemPedido item1 = new ItemPedido();
        item1.setId(1);
        item1.setQuantidade(1);
        item1.setValorVenda(7500f);

        ItemPedido item2 = new ItemPedido();
        item2.setId(2);
        item2.setQuantidade(1);
        item2.setValorVenda(4000f);

        Produto produto1 = new Produto();
        produto1.setId(1001);
        produto1.setNome("PS5");
        produto1.setValor(8000f);

        Produto produto2 = new Produto();
        produto2.setId(1002);
        produto2.setNome("Xbox SX");
        produto2.setValor(5000f);

        pedido1.setCliente(zezinho);
        pedido1.getListaItens().add(item1);
        pedido1.getListaItens().add(item2);
        item1.setProduto(produto1);
        item2.setProduto(produto2);

        System.out.printf("Valor total da compra: R$ %.2f", pedido1.calcValorTotal());

        Comprador luizinho = new Comprador();
        luizinho.setId(400);
        luizinho.setNome("Luizinho da Silva");
        luizinho.setEndereço("Rua Lelele 200");

        Pedido pedido2 = new Pedido();
        pedido2.setId(1);
        try {
            pedido2.setData(sdf.parse("30/04/2022"));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        ItemPedido item3 = new ItemPedido();
        item3.setId(3);
        item3.setQuantidade(3);
        item3.setValorVenda(900f);

        ItemPedido item4 = new ItemPedido();
        item4.setId(4);
        item4.setQuantidade(2);
        item4.setValorVenda(1000f);
        
        ItemPedido item5 = new ItemPedido();
        item5.setId(5);
        item5.setQuantidade(5);
        item5.setValorVenda(700f);

        Produto produto3 = new Produto();
        produto3.setId(1003);
        produto3.setNome("Super Nintendo");
        produto3.setValor(1000f);

        Produto produto4 = new Produto();
        produto4.setId(1004);
        produto4.setNome("Mega Drive");
        produto4.setValor(1100f);

        Produto produto5 = new Produto();
        produto5.setId(1005);
        produto5.setNome("Atari");
        produto5.setValor(750f);

        pedido2.setCliente(luizinho);
        pedido2.getListaItens().add(item3);
        pedido2.getListaItens().add(item4);
        pedido2.getListaItens().add(item5);
        item3.setProduto(produto3);
        item4.setProduto(produto4);
        item5.setProduto(produto5);

        System.out.printf("\nValor total da compra 2: R$ %.2f", pedido2.calcValorTotal());
    }    
}
