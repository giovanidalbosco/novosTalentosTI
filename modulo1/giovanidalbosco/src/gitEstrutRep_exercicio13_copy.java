import java.math.BigInteger;

public class gitEstrutRep_exercicio13_copy {
    public static void main(String[] args) {
        BigInteger graos = BigInteger.valueOf(1); //inicializa a variável graos com o valor "1"
        BigInteger total = BigInteger.valueOf(0); //inicializa a variável total com o valor "0"
        for (int casas = 1; casas <= 64; casas++) {
            total = total.add(graos); //adiciona a variável total o valor da variável graos
            System.out.printf("Na casa " + casas + " há " + graos + " grão(s)\n");
            graos = graos.multiply(BigInteger.valueOf(2)); //multiplica a variável graos por "2"
        }
        System.out.println("Total de graos que o monge recebeu foi de " + graos);
    }
}
/*Uma rainha requisitou os serviços de um monge e disse-lhe que pagaria qualquer preço. O monge, necessitando de 
alimentos, indagou à rainha sobre o pagamento, se poderia ser feito com grãos de trigo dispostos em um tabuleiro 
de xadrez (que possui 64 casas), de tal forma que o primeiro quadro deveria conter apenas um grão e os quadros 
subsequentes, o dobro do quadro anterior. Crie um programa para calcular o total de grãos que o monge recebeu.*/

/*
Você pode usar o tipo BigInteger no lugar do int, a diferença é que o BigInteger é uma classe e seus objetos são 
imutáveis, e os seus métodos retornam um valor, sem alterar o objeto que chamou o método, isso torna um pouco 
chatinho de trabalhar com ele, mas resolve o seu problema. 
*/