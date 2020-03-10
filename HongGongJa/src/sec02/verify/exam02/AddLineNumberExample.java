package sec02.verify.exam02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class AddLineNumberExample {
	public static void main(String[] args) throws IOException {
		String filePath = "src/sec02/verify/exam02/AddLineNumberExample.java";
		Reader reader = new FileReader(filePath);
		BufferedReader br = new BufferedReader(reader);
		
		int lineNo = 1;
		String line;
		while(true) {
			line = br.readLine();
			if(line == null) break;
			System.out.printf("%02d %s\n", lineNo++, line);
		}
		br.close();
	}
}
