import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class SetMap06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		List<String> list = new ArrayList<String>();

		for(int i = 0; i < N; i++) {
			hash.put(br.readLine(), 1);
		}

		int count = 0;

		for(int i = 0; i < M; i++) {
			String input = br.readLine();
			if(hash.get(input) != null) {
				list.add(input);
				count++;
			}
		}

		//정렬
		Collections.sort(list);

		sb.append(count).append("\n");
		for(int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)).append("\n");
		}
		System.out.println(sb);
	}

}
