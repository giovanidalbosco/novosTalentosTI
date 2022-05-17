import java.util.Scanner;

public class gitEstrutDes_exercicio9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Lado 1 do triângulo:");
        int lado1 = leitor.nextInt();
        System.out.println("Lado 2 do triângulo:");
        int lado2 = leitor.nextInt();
        System.out.println("Lado 3 do triângulo:");
        int lado3 = leitor.nextInt();

        boolean verificacao1 = lado1 < lado2 + lado3;
        boolean verificacao2 = lado2 < lado1 + lado3;
        boolean verificacao3 = lado3 < lado1 + lado2;

        if(verificacao1 == true && verificacao2 == true && verificacao3 ==true) {
            if(lado1 == lado2 && lado1 == lado3) {
                System.out.println("Triângulo equilátero");
            } else if(lado1 != lado2 && lado1 !=lado3 && lado2 != lado3) {
                System.out.println("Triângulo escaleno");
            } else {
                System.out.println("Triângulo isósceles");
            }
        } else {
            System.out.println("Não é possível formar um triângulo");
        }
        leitor.close();
    }
}
