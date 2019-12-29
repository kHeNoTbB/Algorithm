package D4;

import java.util.Comparator;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class 염라대왕의이름정렬 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(bf.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(bf.readLine());
			HashSet<String> tmp = new HashSet<>();
			for (int i = 0; i < N; i++) {
				tmp.add(bf.readLine());
			}
			List<String> list = new LinkedList<>(tmp);

			Comparator<String> userCom = new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					// 길이가 긴 o1이 더 큰 것
					if (o1.length() > o2.length())
						return 1;

					// 길이가 같을 때는 비교하기
					else if (o1.length() == o2.length())
						return o1.compareTo(o2);

					return -1;
				}

			};
			Collections.sort(list, userCom);
			System.out.println("#"+tc);
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < list.size(); i++) {
				//String s = list.get(i);
				sb.append(list.get(i)+"\n");
			}
			bw.write(sb.toString());
			bw.flush();
		}
		bw.close();
	}
	
}

