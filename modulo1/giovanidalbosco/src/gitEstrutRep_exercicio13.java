public class gitEstrutRep_exercicio13 {
    public static void main(String[] args) {
        long graos = 0;
        long total = 0;
        for (int casas = 0; casas < 64; casas++) {
            graos = (long)Math.pow(2,casas);
            System.out.printf("Na casa %d há %d grão(s)\n", casas+1, graos); //usando o double perde precisão a partir de 2^58. Usando o long resolve o problema menos para a última casa 2^63
            total = total + graos;
        }
        System.out.println("Total de graos que o monge recebeu foi de " + graos);
    }
}
/*Uma rainha requisitou os serviços de um monge e disse-lhe que pagaria qualquer preço. O monge, necessitando de 
alimentos, indagou à rainha sobre o pagamento, se poderia ser feito com grãos de trigo dispostos em um tabuleiro 
de xadrez (que possui 64 casas), de tal forma que o primeiro quadro deveria conter apenas um grão e os quadros 
subsequentes, o dobro do quadro anterior. Crie um programa para calcular o total de grãos que o monge recebeu.*/