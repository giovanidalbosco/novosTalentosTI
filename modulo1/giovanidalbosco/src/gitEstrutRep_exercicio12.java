public class gitEstrutRep_exercicio12 {
    public static void main(String[] args) {
        int paisA = 80000;
        int paisB = 200000;
        for (int anos = 1; ; anos++) {
            paisA *= 1.03;
            paisB *= 1.015;

            System.out.println(paisA);
            System.out.println(paisB);
            if (paisA >= paisB) {
                System.out.printf("Irá demorar %d anos para a população do País A se igualar/passar a do País B", anos);
                break;
            }
        }
    }
}
/*Supondo que a população de um país A seja da ordem de 80.000 habitantes com uma taxa anual de crescimento de 3% e 
que a população de B seja 200.000 habitantes com uma taxa de crescimento de 1,5%. Faça um programa que calcule e 
escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, 
mantidas as taxas de crescimento.*/