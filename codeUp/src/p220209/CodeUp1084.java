package p220209;

import java.io.*;

public class CodeUp1084 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s[] = br.readLine().split(" ");
		int count = 0;
		
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int c = Integer.parseInt(s[2]);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < a; i++ ) {
			for (int j = 0; j < b; j++ ) {
				for (int k = 0; k < c; k++) {
					bw.write(i + " " + j + " " + k + "\n");
					count++;
					
				}
			}
		}
		
		bw.write(String.valueOf(count));
		bw.flush();
		
				
		
		
		
		
		
	}

}
