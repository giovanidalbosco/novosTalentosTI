package introducao.exercicio1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class App4 {
    public static void main(String[] args) {
        //Date data = new Date(1945,1,1); //está riscado porque o método está deprecated(defasado). Tentar utilizar o GregorianCalendar
        Calendar data = GregorianCalendar.getInstance();
        data.set(1945,00,01);
        
        Calendar data2 = GregorianCalendar.getInstance();
        data2.set(1955,01,27);

        Autor autor1 = new Autor("Deitel", data.getTime());
        Autor autor2 = new Autor("Grady Booch", data2.getTime());

        Livro livro1 = new Livro("Java como programar");
        livro1.setValor(349f);
        livro1.setEsgotado(false);
        livro1.setEscritor(autor1);

        Livro livro2 = new Livro("UML guia do usuário");
        livro2.setValor(165f);
        livro2.setEsgotado(false);
        livro2.setEscritor(autor2);

        Livro livro3 = new Livro("Java 2 ensino didático");
        livro3.setValor(126f);
        livro3.setEsgotado(true);
        autor2.setDataNascimento(data2.getTime());
        livro3.setEscritor(autor2);

        /*System.out.println(livro1.getTitulo());
        System.out.println(livro1.getValor());
        System.out.println(livro1.isEsgotado());
        System.out.println(livro1.getEscritor());

        System.out.println(livro2.getTitulo());
        System.out.println(livro2.getValor());
        System.out.println(livro2.isEsgotado());
        System.out.println(livro2.getEscritor());

        System.out.println(livro3.getTitulo());
        System.out.println(livro3.getValor());
        System.out.println(livro3.isEsgotado());
        System.out.println(livro3.getEscritor());
        */
        System.out.println(livro1 + "\n");
        System.out.println(livro2 + "\n");
        System.out.println(livro3);

    }
}
