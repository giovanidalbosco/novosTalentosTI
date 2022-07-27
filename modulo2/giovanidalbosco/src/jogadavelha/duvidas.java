package jogadavelha;

import java.util.ArrayList;
import java.util.HashMap;

public class duvidas {
    public static void main(String[] args) {
        
        ArrayList<Integer> coordenadas = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> posicoes = new HashMap<>();

        int h = 1;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                coordenadas.add(x);
                coordenadas.add(y);

                posicoes.put(h, coordenadas);
                h++;

                coordenadas.remove(0);
                coordenadas.remove(0);      
            }  
        }

        System.out.println(coordenadas);
        System.out.println(posicoes);
    }
}
