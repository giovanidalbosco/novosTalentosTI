import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class teste2 {
    public static void main(String[] args) {
        
        ArrayList<Integer> coordPos1 = new ArrayList<>();
        ArrayList<Integer> coordPos2 = new ArrayList<>();
        ArrayList<Integer> coordPos3 = new ArrayList<>();
        ArrayList<Integer> coordPos4 = new ArrayList<>();
        ArrayList<Integer> coordPos5 = new ArrayList<>();
        ArrayList<Integer> coordPos6 = new ArrayList<>();
        ArrayList<Integer> coordPos7 = new ArrayList<>();
        ArrayList<Integer> coordPos8 = new ArrayList<>();
        ArrayList<Integer> coordPos9 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> coordenadas = new ArrayList<>();
        
        Collections.addAll(coordenadas, coordPos1, coordPos2, coordPos3, coordPos4, coordPos5, coordPos6, coordPos7, coordPos8, coordPos9);
        
        HashMap<Integer, ArrayList<Integer>> posicoes = new HashMap<>();

        //cria o mapa de posições possíveis para jogada
        int h1 = 0;
        int h2 = 1;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                coordenadas.get(h1).add(x);
                coordenadas.get(h1).add(y);
                posicoes.put(h2, coordenadas.get(h1));
                
                h1++;
                h2++; 
            }  
        }

        posicoes.get(1).get(1);

        System.out.println(posicoes.get(1).get(1));

        int somaLinha = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(String.format("%d, %d", i, j));
                somaLinha++;
            }
            System.out.println(String.format("Soma linha %d: %d", i, somaLinha));
            somaLinha = 0;
        }
    }
}
