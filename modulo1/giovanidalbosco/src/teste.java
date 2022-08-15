import java.util.*; 
import java.io.*;


class Main {

    public static String ArrayChallenge(String[] strArr) {
        return strArr[0];
    }

    public static void main (String[] args) {  
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        System.out.print(a); 

        String[] ave = new String[] {"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"};
        
        String[] lista = ave[1].split(",");

        System.out.println(lista[0]);
        for (int i = 0; i < lista.length; i++ ) {
            System.out.println(lista[i]);
        }

    }

}


