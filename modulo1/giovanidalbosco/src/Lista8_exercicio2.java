public class Lista8_exercicio2 {
    public static void main(String[] args) {
        int a = 0;
        int valor = 0;
        while (a <= 500) {
            if (a % 2 == 0) {
                valor += a;
                System.out.println(a);
            }            
            a++;
        }
        System.out.println("soma = " + valor);

    }
}
/*56) Elabore um programa que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500.*/