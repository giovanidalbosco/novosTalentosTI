import java.util.Scanner;

public class gitEstrutSeq_exercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner nota = new Scanner(System.in);
        int b = 0;
        float y = 0;
        for(int a = 1; a <= 4; a++){
            System.out.println(String.format("Digite a nota %dª do bimestre", a));
            Float x = nota.nextFloat();
            y = x + y;
            b = a;
        }

        float media = y / b;

        System.out.printf("A média bimestral das notas é: %.1f", media);

        nota.close();
    }
}
