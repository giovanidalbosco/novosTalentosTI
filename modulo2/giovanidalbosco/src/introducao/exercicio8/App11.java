package introducao.exercicio8;

public class App11 {
    public static void main(String[] args) {
    EquipeDeVendas equipe1 = new EquipeDeVendas();
    EquipeDeVendas equipe2 = new EquipeDeVendas();
    
    Vendedor vendedor1 = new Vendedor();
    vendedor1.setNome("Zezinho");
    vendedor1.setId(1);
    vendedor1.setMetaVendas(5000f);
    vendedor1.setPercComissao(10);
    vendedor1.setTelefone("1111-1111");
    
    
    Vendedor vendedor2 = new Vendedor();
    vendedor2.setNome("Luizinho");
    vendedor2.setId(2);
    vendedor2.setMetaVendas(3000f);
    vendedor2.setPercComissao(7);
    vendedor2.setTelefone("2222-2222");
    //vendedor2.setEquipeDeVendas(equipe1);

    Vendedor vendedor3 = new Vendedor();
    vendedor3.setNome("Huguinho");
    vendedor3.setId(3);
    vendedor3.setMetaVendas(6000f);
    vendedor3.setPercComissao(12);
    vendedor3.setTelefone("3333-3333");
    //vendedor3.setEquipeDeVendas(equipe1);

    Vendedor vendedor4 = new Vendedor();
    vendedor4.setNome("Mariazinha");
    vendedor4.setId(4);
    vendedor4.setMetaVendas(10000f);
    vendedor4.setPercComissao(20);
    vendedor4.setTelefone("4444-4444");
    //vendedor4.setEquipeDeVendas(equipe2);

    Vendedor vendedor5 = new Vendedor();
    vendedor5.setNome("Paulinha");
    vendedor5.setId(5);
    vendedor5.setMetaVendas(4000f);
    vendedor5.setPercComissao(8);
    vendedor5.setTelefone("5555-5555");
    //vendedor5.setEquipeDeVendas(equipe2);

    Gerente gerente1 = new Gerente();
    gerente1.setNome("Giovani");
    gerente1.setId(1);
    gerente1.setSetor("Vendas");
    gerente1.setTelefone("6666-6666");
    
    Gerente gerente2 = new Gerente();
    gerente2.setNome("Marina");
    gerente2.setId(2);
    gerente2.setSetor("Projetos");
    gerente2.setTelefone("7777-7777");
    
    //vendedor1.setEquipeDeVendas(equipe1); // O método que está comentado no Vendedor permite que funcione assim
    equipe1.getListaVendedores().add(vendedor1);
    equipe1.getListaVendedores().add(vendedor2);
    equipe1.getListaVendedores().add(vendedor3);
    equipe2.getListaVendedores().add(vendedor4);
    equipe2.getListaVendedores().add(vendedor5);
    
    equipe1.setGestor(gerente1);
    equipe2.setGestor(gerente2);
    
    System.out.println(equipe1.listarEquipe());
    System.out.println(equipe2.listarEquipe());
    }
}
