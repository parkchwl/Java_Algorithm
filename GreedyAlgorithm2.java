import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class GreedyAlgorithm2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[][] time = new int[N][2]; //N을 입력받고 N개의 시간 간격을 입력받는다.

        //시간 간격은 시작 시간과 종료 시간으로 이루어진 2차원 배열로 저장된다.

        for(int i = 0; i < N; i++) {
            time[i][0] = in.nextInt();	// 시작시간
            time[i][1] = in.nextInt();	// 종료시간
        }


        // 끝나는 시간을 기준으로 오름차순으로 정렬하기 위해 compare 재정의
        Arrays.sort(time, new Comparator<int[]>() { //Arrays.sort()를 사용하여 2차원 배열 time을 정렬한다.


            @Override
            public int compare(int[] o1, int[] o2) {

                // 종료시간이 같을 경우 시작시간이 빠른순으로 정렬해야한다.
                if(o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }

                return o1[1] - o2[1];
            }

        });

        int count = 0;
        int prev_end_time = 0;

        for(int i = 0; i < N; i++) {    //정렬된 time을 확인하며 Greedy 수행. 조건을 만족하는 경우에 해당 일정 선택후 count를 증가시킨다.

            // 직전 종료시간이 다음 회의 시작 시간보다 작거나 같다면 갱신
            if(prev_end_time <= time[i][0]) {
                prev_end_time = time[i][1];
                count++;
            }
        }

        System.out.println(count);
    }

}