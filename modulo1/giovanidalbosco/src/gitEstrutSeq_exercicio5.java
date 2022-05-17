import java.util.Scanner;

public class gitEstrutSeq_exercicio5 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = leitor.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String sobreNome = leitor.nextLine();

        String nomeCompleto = nome + " " + sobreNome;

        System.out.print(nomeCompleto);

        leitor.close();
    }
}