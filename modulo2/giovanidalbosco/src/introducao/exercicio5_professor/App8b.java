package introducao.exercicio5_professor;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class App8b {
    public static void main(String[] args) {
        Calendar calendario = GregorianCalendar.getInstance();
        Planilha plan1 = new Planilha();

        calendario.set(2022, 05, 24);
        ContaDeLuz conta1 = 
            new ContaDeLuz(300f, calendario.getTime(), 
                          1, 32, 
                          calendario.getTime(), 0);
        
        calendario.set(2022, 05, 23);
        ContaDeLuz conta2 = 
            new ContaDeLuz(400f, calendario.getTime(), 
                        2, 42, 
                        calendario.getTime(), 0);
        plan1.getListaContasDeLuz().add(conta1);
        plan1.getListaContasDeLuz().add(conta2);

        System.out.println(plan1.calcularMaiorValor());
        System.out.println(plan1.calcularMenorValor());
        System.out.println(plan1.calcularUltimoValorMedio());
    }
}