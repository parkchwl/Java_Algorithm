import java.util.Scanner;
public class GeneralMath03 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Test = sc.nextInt(); // 테스트 케이스의 개수

        for(int i = 0; i < Test; i++){
            int C = sc.nextInt(); // 거스름돈 C

            int quater = C / 25; // 입력값을 25로 나눈다.
            C %= 25; // 나머지 값을 C에 갱신한다.

            int  dime = C / 10;
            C %= 10;

            int nickel = C / 5;
            C %= 5;

            int penny = C;

            System.out.println(quater+ " "+ dime + " " +nickel + " "+penny);
        }
    }
}
