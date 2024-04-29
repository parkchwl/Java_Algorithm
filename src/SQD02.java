import java.util.Scanner;
import java.util.Stack;


public class SQD02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < num; i++)
        {
            int command = sc.nextInt();

            switch (command){
                case 1 :
                    int x = sc.nextInt();
                    stack.push(x);
                    break;
                case 2 :
                    if(stack.isEmpty()) System.out.println("-1");
                    else System.out.println(stack.pop());
                    break;
                case 3 :
                    System.out.println(stack.size());
                    break;
                case 4 :
                    if(stack.isEmpty()) System.out.println("1");
                    else System.out.println("0");
                    break;
                case 5 :
                    if(stack.isEmpty()) System.out.println("-1");
                    else System.out.println(stack.peek());
                    break;
            }
        }
    }
}