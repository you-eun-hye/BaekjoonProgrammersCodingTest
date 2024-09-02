import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        System.out.println(A+B-C);
        System.out.println(Integer.parseInt(Integer.toString(A)+Integer.toString(B))-C);

        in.close();
    }
}