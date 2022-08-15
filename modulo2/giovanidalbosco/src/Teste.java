import java.util.Arrays;

public class Teste {  
    public static void main(String[] args) {  
        String teste = "abcde";

        teste.indexOf("a");

        String[] teste_split = teste.split("");

        System.out.println(Arrays.toString(teste_split));
    }
}