package base.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderAndParse {

	public static void main(String[] args) throws IOException {
		double allNum;
		double num1;
		double num2;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader buf = new BufferedReader(isr);
		// BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		num1 = Double.parseDouble(buf.readLine());
		num2 = Double.parseDouble(buf.readLine());
		allNum = num1 + num2;
		System.out.println(allNum);
	}

}
