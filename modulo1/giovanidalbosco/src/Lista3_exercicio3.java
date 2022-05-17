public class Lista3_exercicio3 {
    public static void main(String[] args) {
        int X = 1, A = 3, B = 5, C = 8, D = 7;

        System.out.println(!(X > 3)?"Verdadeiro":"Falso");
        System.out.println((X < 1) && !(B > D)?"Verdadeiro":"Falso");
        System.out.println(!(D < 0) && (C > 5)?"Verdadeiro":"Falso");
        System.out.println(!(X > 3) || (C < 7)?"Verdadeiro":"Falso");
        System.out.println((A > B) || (C > B)?"Verdadeiro":"Falso");
        System.out.println((X >= 2)?"Verdadeiro":"Falso");
        System.out.println((X < 1) && (B >= D)?"Verdadeiro":"Falso");
        System.out.println((D < 0) || (C > 5)?"Verdadeiro":"Falso");
        System.out.println(!(D > 3) || !(B < 7)?"Verdadeiro":"Falso");
        System.out.println((A > B) || !(C > B)?"Verdadeiro":"Falso");
    }
}