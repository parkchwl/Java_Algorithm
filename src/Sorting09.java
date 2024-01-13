import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Sorting09 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] data = new String[n];

		for (int i=0; i<n; i++)
			data[i] = br.readLine();

		Arrays.sort(data, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} else {
					return s1.length() - s2.length();
				}
			}
		});

		System.out.println(data[0]);
		for (int i=1; i<n; i++) {
			if (!data[i].equals(data[i-1])) {
				System.out.println(data[i]);
			}
		}
	}
}
