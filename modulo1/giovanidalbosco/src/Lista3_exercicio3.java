/* Determine o resultado lógico das expressões mencionadas,
assinalando se são verdadeiras ou falsas. 
 
Considere para as respostas os seguintes valores: 
X=1, A=3, B=5, C=8 e D=7  
 
Expressão               |  RES (Verdadeiro?/Falso?) 
RES = !(x>3)            |
RES = (X < 1) & !(B>D)  |
RES = !(D<0) & (C>5)    |
RES = !(X>3) | (C<7)    |
RES = (A>B) | (C>B)     |
RES = (X>=2)            |
RES = (X<1) & (B>=D)    |
RES = (D<0) | (C>5)     |
RES = !(D>3) | !(B<7)   |
RES = (A>B) | !(C>B)    | */

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