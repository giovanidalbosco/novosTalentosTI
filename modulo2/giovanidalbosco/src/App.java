import introducao.Pessoa;
import introducao.Aplicativo;
import introducao.Celular;
//import introducao.*; => importa todas as classes dentro de introducao

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa zezinho = new Pessoa("Zezinho da Silva");
        //zezinho.nome = "Zezinho da Silva";
        //zezinho.setNome("Zezinho da Silva");
        zezinho.setIdade(15);
        zezinho.setAltura(1.75f);
        zezinho.setCPF("123.456.789-10");

        Pessoa luizinho = new Pessoa("Luizinho da Silva");
        luizinho.setIdade(43);
        luizinho.setAltura(1.67f);
        luizinho.setCPF("123.456.789-11");

        System.out.println(zezinho.getNome());
        System.out.println(zezinho.getIdade());
        System.out.println(zezinho.getAltura());
        System.out.println(zezinho.getCPF()+"\n");

        System.out.printf("%s\n%d\n%.2f\n%s\n\n", luizinho.getNome(), luizinho.getIdade(), luizinho.getAltura(), luizinho.getCPF());

        System.out.println(zezinho.podeDirigir());

        zezinho.mostraCPF();

        Celular startak = new Celular("99999999");
        startak.setModelo("PT 550");
        startak.setMarca("Motorola");
        
        startak.setDono(zezinho);

        Aplicativo app1 = new Aplicativo("Angry birds");
        Aplicativo app2 = new Aplicativo("Whatsapp");
        Aplicativo app3 = new Aplicativo("Tiktok");
        Aplicativo app4 = new Aplicativo("Instagram");

        startak.getListaAplicativos().add(app1);
        startak.getListaAplicativos().add(app2);
        startak.getListaAplicativos().add(app3);
        startak.getListaAplicativos().add(app4);

        startak.getListaAplicativos().remove(2);
        startak.getListaAplicativos().set(2, new Aplicativo("Grobopray"));
        System.out.println(startak.getListaAplicativos().indexOf(app1)); //retorna a posição do app1

        for(int i = 0; i < startak.getListaAplicativos().size(); i++) {
            System.out.println(startak.getListaAplicativos().get(i));
        }

        //for(Aplicativo umApp:startak.getListaAplicativos()) { desta forma não funciona porque 
        for(Object umApp:startak.getListaAplicativos()) {
            System.out.println(umApp);
        }



        
    }
}
