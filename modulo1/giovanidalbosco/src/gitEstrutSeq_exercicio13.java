public class gitEstrutSeq_exercicio13 {
    public static void main(String[] args) throws Exception {
        int A = 10;
        int B = 20;

        //isso está certo?
        int C = A;
        A = B;
        B = C;

        System.out.println("A = " + A);
        System.out.print("B = " + B);
    }
}