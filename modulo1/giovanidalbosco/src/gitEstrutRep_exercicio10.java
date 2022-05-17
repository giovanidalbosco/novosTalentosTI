public class gitEstrutRep_exercicio10 {
    public static void main(String[] args) {
        float alturaA = 1.5f;
        float alturaF = 1.1f;
        System.out.println("Resultados:");
        for(int x = 1;; x++) { //seria errado fazer isto?
            alturaA += .02f;
            alturaF += .03f;
            if(alturaA < alturaF) {
                System.out.printf("Felisberto demorou %d anos para ficar maior que Anacleto", x);
                break;
            }
        }
    }
}
/*Anacleto tem 1,50m e cresce 2 centímetros por ano, enquanto Felisberto tem 1,10m e cresce 3 centímetros por ano. 
Construa um programa que calcule e apresente quantos anos serão necessários para que Felisberto seja maior que 
Anacleto.*/