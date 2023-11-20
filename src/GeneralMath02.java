import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class GeneralMath02{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // StringTokenizaer를 사용하여 BufferedReader에서 읽은 입력을 토큰화한다. 공백을 구분자로 한다.

        int N = Integer.parseInt(st.nextToken()); //StringTokenizer의 nextToken()메서드로 다음 토큰을 얻는다.
        int B = Integer.parseInt(st.nextToken()); //parseInt()를 사용하여 이를 정수로 변환한다.

        StringBuilder sb = new StringBuilder();

        while(N != 0){
            if(N%B >= 10) sb.append((char) ((N%B) + 55)); // N을 B로 나눈 나머지를 StringBuilder에 추가하고, 그 후 N을 B로 나눈다.
            else sb.append(N%B);
            N /= B; // N이 0이 될때까지 반복한다.
        }
        System.out.println(sb.reverse().toString()); // 역으로 출력한다.
    }
}