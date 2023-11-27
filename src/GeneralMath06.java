import java.util.Scanner;
public class GeneralMath06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int count = 0;
        int i = 1;
        int bunmo = 0;
        int num = 0;
        while(count <  x){
            count = count + i;
            i++;
        }

        if((i-1)%2 ==0){
            bunmo = 1 + (count - x);
            num = (i-1) - (count-x);
        } else {
            bunmo = (i-1) - (count-x);
            num = 1 + (count - x);
        }

        System.out.println(num + "/" + bunmo);
    }
}
