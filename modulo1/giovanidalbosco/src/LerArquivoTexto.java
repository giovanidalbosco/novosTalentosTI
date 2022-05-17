import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LerArquivoTexto {
    public static void main(String[] args) {
        try{
            Scanner leitor = new Scanner(new File("C:/Users/1217007614/Desktop/modulo1/giovanidalbosco/src/Teste.tx2t"));
            while(leitor.hasNext()){
                System.out.println(leitor.nextLine());
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
