import java.io.*;
import java.util.*;

public class numberTheory04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer tk = new StringTokenizer(br.readLine());

        int count = 0;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(tk.nextToken());
            if (isPrime(num)) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}