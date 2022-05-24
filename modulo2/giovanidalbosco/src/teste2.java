import java.util.HashMap;


import java.util.HashMap;

public class teste2 {
    public static void main(String[] args) {
        
        HashMap<String, Float> lista = new HashMap<>();

        lista.put("remedio", 0f);
        lista.put("roupa", 0f);


        System.out.println(lista.containsKey("remedio"));
        System.out.println(lista.get("remedio"));

        
        for(int i = 0; i < 5; i++) {
            if(lista.containsKey("remedio")) {
                lista.put("remedio",lista.get("remedio") + 5f);
            }
        }

        System.out.println(lista.get("remedio"));

    }
}
