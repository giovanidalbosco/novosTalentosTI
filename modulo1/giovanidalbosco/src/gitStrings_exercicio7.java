import java.util.Scanner;

public class gitStrings_exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = leitor.nextLine().toLowerCase();
        String nomeSplited[] = nome.split(" ", 0);

        String conectores[] = {"e","do","da","dos","das","de","di","du"};

        String iniciais = "";
        int teste = 0;
        for (int i = 0; i < nomeSplited.length; i++) {
            for (int j = 0; j < conectores.length; j++) {
                if (nomeSplited[i].equals(conectores[j])) {
                    teste++;
                }
            }
            if (teste == 0) {
            iniciais += nomeSplited[i].charAt(0);
            }
            teste = 0;
        }
        System.out.println(iniciais.toUpperCase());
        leitor.close();
    }
}
/*7. Escreva um programa que, a partir de um nome informado pelo usuário, exiba suas iniciais. As iniciais são
formadas pela primeira letra de cada nome, sendo que todas deverão aparecer em maiúsculas na saída do programa.
Note que os conectores e, do, da, dos, das, de, di, du não são considerados nomes e, portanto, não devem ser
considerados para a obtenção das iniciais. As iniciais devem ser impressas em maiúsculas, ainda que o nome seja
entrado todo em minúsculas.

Exemplos:

 Maria das Graças Pimenta => MGP
 João Carlos dos Santos => JCS             */