import java.util.Scanner;

public class ExemploNumerosPrimitivos {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        //Aula 10/03/2022

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        float primeironumero = sc.nextFloat();
        System.out.println("Digite o segundo número: ");
        float segundonumero = sc.nextFloat();
        sc.close();

        /*
        System.out.println("Escolha o operador: ");
        String operador = sc.next();

        float resultado = 0;
        if(operador == "+"){
            resultado = primeironumero + segundonumero;
        }else if(operador == "-"){
            resultado = primeironumero - segundonumero;
        }else if(operador == "*"){
            resultado = primeironumero * segundonumero;
        }else if(operador == "/"){
            resultado = primeironumero / segundonumero;
        }
        
        System.out.println("O resultado é: " + resultado);
        */
        float resultadosoma = primeironumero + segundonumero;
        float resultadosubtrac = primeironumero - segundonumero;
        float resultadomultiplic = primeironumero * segundonumero;
        float resultadodivisao = primeironumero / segundonumero;
        
        System.out.print("A soma é: "); //print não pula linha
        System.out.println(resultadosoma); //println pula linha

        System.out.println("A soma é: " + resultadosoma); //concatenação

        System.out.println(String.format("A soma é: %.1f", resultadosoma)); //interpolação
        System.out.println(String.format("A subtração é: %.1f", resultadosubtrac));
        System.out.println(String.format("A multiplicação é: %.1f", resultadomultiplic));
        System.out.println(String.format("A divisão é: %.1f", resultadodivisao));

        boolean comparacao = primeironumero == segundonumero;
        System.out.println(comparacao);
        System.out.println(comparacao?"verdadeiro":"falso");

        String nome = "Giovani";
        System.out.println(nome.replace("i","1"));

        char nom = 'G';
        System.out.println((int)nom);
        int num = 71;
        System.out.println((char)num);

        // Aula 14/03/2022

        //int x = 1l; //o "l" converte em "long". Um long não cabe em um int.
        //long y = 1l;
        //float z = 2147483647;
        //int aa = 2147483647.0f; //float usa memoria para representar numeros decimais


    }
}
