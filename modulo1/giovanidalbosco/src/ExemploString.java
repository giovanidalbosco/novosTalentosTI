import java.util.Arrays;

public class ExemploString {
    public static void main(String[] args) {
        
        //converter String to array de char
        String texto = "Universidade da região de Joinville";
        char textoArray[] = texto.toCharArray();

        //converter inteiro em String
        int num = 12355;
        String tex = Integer.toString(num);
        System.out.println(tex.charAt(2));

        //converter array em String
        int numeros[] = {0,1,2,3,4,5,6};
        String numerosLista = Arrays.toString(numeros);

        System.out.println(numerosLista);
        
        System.out.println(Arrays.toString(textoArray));

        System.out.println(texto.charAt(0));
        System.out.println(textoArray[0]);
        System.out.println(texto.replace(' ','#'));

        System.out.println(texto.substring(26,35));

        System.out.println(texto.split(","));
        System.out.println(Arrays.toString(texto.split(",")));
    }
}

