package p220204;
import java.util.Scanner;

public class practice01 {
	
	public static void main(String[] args) {
//		// #1001
//		System.out.println("Hello");
//	
//		// #1002
//		System.out.println("Hello World");
//		
//		// #1003
//		System.out.println("Hello");
//		System.out.println("World");
//		
//		System.out.println("Hello \nWorld");
//		
//		// #1004
//		System.out.println("'Hello'");
//		
//		// #1005
//		System.out.println("\"Hello World\"");
//		
//		// #1006
//		System.out.println("!@#$%^&*()");
//		
//		// #1007
//		System.out.println("C:\\Download\\hello.cpp");
//		
//		// #1010
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자를 입력하세용");
//		
//		int n = scan.nextInt();
//		System.out.println(n);
//		
//		// #1011
//		Scanner scan2 = new Scanner(System.in);
//		System.out.println("알파벳을 하나 입력하세용");
//		
//		String v = scan.nextLine();		// Christmas Tree 안되는 이유 = char 공간이 작음, 작은 따옴표로 감싸줘야 함
//		System.out.println(v);
//		
//		// #1012
//		Scanner scan3 = new Scanner(System.in);
//		System.out.println("숫자를 하나 입력하세요.");
//		
//		float bts = scan.nextInt();
//		System.out.println(bts);
//		
//		// #1013
//		Scanner scan4 = new Scanner(System.in);
//		System.out.println("정수 1을 입력하세요");
//	    int num1 = scan4.nextInt();
//	    
//	    Scanner scan5 = new Scanner(System.in);
//	    System.out.println("정수 2를 입력하세요");
//	    int num2 = scan5.nextInt();
//	    
//	    System.out.println(num1 + ", " + num2);
//		
//		// #1014
//		Scanner scan6 = new Scanner(System.in);
//		System.out.println("실수를 입력하세요 - 최소 소숫점 3자리 이상");
//		float num3 = scan6.nextFloat();
//		
//		System.out.println(Math.round(num3 * 1000)/1000.0);
//		
//		// #1015
//		Scanner scan7 = new Scanner(System.in);
//		System.out.println("실수를 입력하세요 - 2자리 숫자 이상");
//		float num4 = scan7.nextFloat();
//		
//		System.out.println(Math.round(num4 * 100)/100.0);
//		
//		// #1017
//		Scanner scan1017 = new Scanner(System.in);
//		System.out.println("정수를 입력하세요");
//		int num1017 = scan1017.nextInt();
//		
//		System.out.println(num1017 + " " + num1017 + " " + num1017 );
//		
//		
//		
//		// # 1018
//		Scanner scan1018 = new Scanner(System.in);
//		System.out.println("시간을 입력하세요");
//		int a1018 = scan1018.nextInt();
//		
//		System.out.println("분을 입력하세요");
//		int b1018 = scan1018.nextInt();
//		
//		System.out.println(a1018 + ":" + b1018);
		
		// #1019
		String x;
		String [] a;
		Scanner scan1019 = new Scanner(System.in);
		System.out.println("연,월,일을 입력하세요. (YYYY.MM.DD.)");
		x = scan1019.nextLine();
		a = x.split("\\.");
		
		int a1 = Integer.parseInt(a[0]);
		int a2 = Integer.parseInt(a[1]);
		int a3 = Integer.parseInt(a[2]);
		
		System.out.printf("%04d.%02d.%02.", a1,a2,a3);
		
	}

}
