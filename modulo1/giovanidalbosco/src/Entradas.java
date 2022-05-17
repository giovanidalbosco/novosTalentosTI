import java.util.Scanner;
// import java.util.Vector;


public class Entradas{
    //Escrever dentro das chaves
    public static void main(String[] args){
        System.out.println("Favor digitar seu nome: ");
        Scanner leitor = new Scanner(System.in); //Objeto "Scanner". "System.in" entrada pelo teclado
        String nome = leitor.nextLine();
        System.out.println(nome);
        

        /* Vetores
        Vector<Integer> vector = new Vector<>();
        System.out.println("Vetor: " + vector);
        vector.add(1);
        vector.add(5);
        System.out.println("Vetor: " + vector);
        vector.add(1, 3);
        System.out.println("novo Vetor: " + vector);
        System.out.println(vector.size());
        
        int b = 0;
        float y = 0;
        for(int a = 1; a <= 4; a++){
            System.out.println(String.format("Digite a nota %d", a));
            Scanner nota = new Scanner(System.in);
            Float x = nota.nextFloat();
            y = x + y;
            b = a;
        }

        float media = y / b;
        System.out.println("A média é: " + media);
        */

        
        //float nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, media = 0;
        final float nota1, nota2, nota3, nota4, percPresenca;
        Scanner leitor1 = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        nota1 = Float.parseFloat(leitor.nextLine()); //conversao entre tipo objeto pra tipo primitivo. Classe wrapper
        System.out.println("Digite a segunda nota");
        nota2 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a terceira nota");
        nota3 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a quarta nota");
        nota4 = Float.parseFloat(leitor.nextLine());

        final var media = (nota1 + nota2 + nota3 + nota4) / 4.0f; //"var" permite que o JAVA crie a variável com o tipo do valor que foi atribuido no código
        //final float media = (nota1 + nota2 + nota3 + nota4) / 4.0f;

        System.out.println(String.format("A média das notas é: %.1f", media));

        System.out.println("Digite o percentual de presença do aluno: ");
        percPresenca = Float.parseFloat(leitor.nextLine());

        boolean result = media >= 6 && percPresenca >= 70;

        System.out.println("Situação: " + (result?"Aprovado":"Reprovado")); //operador ternário

        if(result == true){
            System.out.println("Aluno aprovado");
        }
        else{
            System.out.println("Aluno reprovado");
        }
        leitor.close();
        leitor1.close();
    }   
}