import java.util.Scanner;

public class Geometry08 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int[] cm=new int[3];
		int max=0;
		int index=0;
		int answer=0;
		int other=0;
		
		for(int i=0;i<3;i++) {
			cm[i]=scanner.nextInt();
			if(max<cm[i]) {
				max=cm[i];
				index=i;
			}
		}
		
		if(index==0) {
			other=cm[1]+cm[2];
			answer=getTotal(max, other);
		}
		else if(index==1) {
			other=cm[0]+cm[2];
			answer=getTotal(max, other);
		}
		else{
			other=cm[0]+cm[1];
			answer=getTotal(max, other);
		}
		
		System.out.println(answer);
	}

	public static int getTotal(int max, int other) {
		int answer;
		if(max<other) {
			answer=max+other;
		}
		else {
			answer=other*2-1;
		}
		
		return answer;
	}

}