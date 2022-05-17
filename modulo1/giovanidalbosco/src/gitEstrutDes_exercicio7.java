import java.util.Scanner;

public class gitEstrutDes_exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Nota 1:");
        float nota1 = leitor.nextFloat();
        System.out.println("Nota 2:");
        float nota2 = leitor.nextFloat();
        System.out.println("Nota 3:");
        float nota3 = leitor.nextFloat();
        System.out.println("Nota 4:");
        float nota4 = leitor.nextFloat();

        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        if(media >= 7) {
            System.out.println(String.format("A média do aluno foi %.1f. Aluno aprovado!", media));
        } else {
            System.out.println(String.format("A média do aluno foi %.1f. Aluno ficou em exame!", media));
            System.out.println("Digite a nota do exame:");
            float notaExame = leitor.nextFloat();
            media = (media + notaExame) / 2;
            if(media >=5) {
                System.out.println(String.format("A média do aluno foi %.1f. Aluno aprovado!", media));
            } else {
                System.out.println(String.format("A média do aluno foi %.1f. Aluno reprovado!", media));
            }
        }
        leitor.close();
    }
}
