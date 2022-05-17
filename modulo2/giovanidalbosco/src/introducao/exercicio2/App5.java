package introducao.exercicio2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class App5 {
    public static void main(String[] args) {
        Hospede pessoa1 = new Hospede("111.111.111-11");
        pessoa1.setNome("Zezinho");
        pessoa1.setTelefone("5555-1234");

        Hospede pessoa2 = new Hospede("222.222.222-22");
        pessoa2.setNome("Mariazinha");
        pessoa2.setTelefone("5555-4321");

        Hospede pessoa3 = new Hospede("333.333.333-33");
        pessoa3.setNome("Luizinho");
        pessoa3.setTelefone("5555-1122");

        Hospede pessoa4 = new Hospede("444.444.444-44");
        pessoa4.setNome("Huguinho");
        pessoa4.setTelefone("5555-2233");

        Hospede pessoa5 = new Hospede("555.555.555-55");
        pessoa5.setNome("Paulinha");
        pessoa5.setTelefone("5555-5555");

        Calendar dataInicial = GregorianCalendar.getInstance();
        dataInicial.set(2022,3,28);
        Calendar dataFinal = GregorianCalendar.getInstance();
        dataFinal.set(2022,4,5);

        Reserva reserva1 = new Reserva(1001);
        reserva1.setDataInicial(dataInicial.getTime());
        reserva1.setDataFinal(dataFinal.getTime());

        dataInicial.set(2022,3,21);
        dataFinal.set(2022,3,28);
        Reserva reserva2 = new Reserva(1002);
        reserva2.setDataInicial(dataInicial.getTime());
        reserva2.setDataFinal(dataFinal.getTime());

        reserva1.getListaHospedes().add(pessoa1);
        reserva1.getListaHospedes().add(pessoa2);
        Quarto quarto1 = new Quarto();
        quarto1.setNumero(100);
        reserva1.setQuarto(quarto1);

        reserva2.getListaHospedes().add(pessoa3);
        reserva2.getListaHospedes().add(pessoa4);
        reserva2.getListaHospedes().add(pessoa5);
        Quarto quarto2 = new Quarto();
        quarto2.setNumero(200);
        reserva2.setQuarto(quarto2);

        System.out.println(reserva1 + "\n");
        System.out.println(reserva2);

    }
}
