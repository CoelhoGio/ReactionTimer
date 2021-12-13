package reacting;

import java.text.DecimalFormat;
import java.util.Scanner;

public class React {

	public static void main(String[] args) throws InterruptedException {
		String pattern = "0.00";
		DecimalFormat dF = new DecimalFormat(pattern);
		
		System.out.println("3");
		Thread.sleep(1000);
		System.out.println("2");
		Thread.sleep(1000);
		System.out.println("1");
		Thread.sleep(1000);
		System.out.println("Go!!!");
		
		long startTime = System.currentTimeMillis();
		
		Scanner s = new Scanner(System.in);
		s.next();
		
		long stopTime = System.currentTimeMillis();
		
		double d = (stopTime - startTime)/1000d;
		String result = dF.format(d);
		
		System.out.println(result + " seconds");
		s.close();
	}

}
