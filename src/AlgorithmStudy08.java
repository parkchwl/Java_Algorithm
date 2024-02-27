import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;

public class AlgorithmStudy08 {
    static char[][] arr = new char [5] [5];
    static boolean [] [] selected = new boolean[5][5];
    static int res = 0;

    static class Pair {
        int first;
        int second;

        public Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++){
            String tmp = br.readLine();
            arr[i] = tmp.toCharArray();
        }
        comb(0,0);
        System.out.println(res);
    }
    private static void comb(int cnt, int start){
        if(cnt == 7){
            bfs();
            return;
        }
        for(int i = start; i < 25; i++){
            selected[i/5][i%5] = true;
            comb(cnt + 1, i+1);
            selected[i/5][i%5] = false;
        }
    }

    private static void bfs(){
        Queue<Pair> q = new ArrayDeque<>();
        boolean [][] visited = new boolean[5][5];
        int [][] dir = new int [][] {{0,1}, {1,0},{0,-1},{-1,0}};
        boolean flag = false;

        for(int i = 0; i < 5; i++){
            for(int j=0; j < 5; i++){
                if(selected[i][j]){
                    flag = true;
                    q.add(new Pair(i,j));
                    visited[i][j] = true;
                    break;
                }
            }
            if (flag)
                break;
        }

        int sCnt = 0; // 다솜파
        int yCnt = 0; // 도연파


        while (!q.isEmpty()) {
            Pair tmp = q.poll();
            if (arr[tmp.first][tmp.second] == 'Y') {
                yCnt++;
            } else if (arr[tmp.first][tmp.second] == 'S') {
                sCnt++;
            }
            for (int i = 0; i < 4; i++) {
                int nextRow = tmp.first + dir[i][0];
                int nextCol = tmp.second + dir[i][1];

                if (check(nextRow, nextCol) && !visited[nextRow][nextCol] && selected[nextRow][nextCol]) {
                    q.add(new Pair(nextRow, nextCol));
                    visited[nextRow][nextCol] = true;
                }
            }
        }

        if (yCnt + sCnt == 7 && sCnt > yCnt)
            res++;
    }

    private static boolean check(int nextRow, int nextCol) {
        return nextRow >= 0 && nextRow < 5 && nextCol >= 0 && nextCol < 5;
    }
}
}