import java.util.Scanner;

public class GeneralMath07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        int day = (V - B - 1) / (A - B) + 1;

        System.out.println(day);

        sc.close();
    }
}