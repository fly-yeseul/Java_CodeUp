package p220209;

import java.util.Scanner;

public class cdd {
	public static void main(String[] args) {
		
//		// #1020
//		// 주민번호 입력받아 형태 바꿔 출력하기 
//		// 000907-1121112
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("주민등록번호를 입력하세요.");
//		String x = sc.nextLine();
//		String [] a = x.split("\\-");
//		
//		int a1 = Integer.parseInt(a[0]);
//		int a2 = Integer.parseInt(a[1]);
//		
//		
//		System.out.printf("%06d%07d", a1, a2);
//		
//		
//		// #1021
//		// 1개의 단어를 입력받아 그대로 출력해보자.
//		String s;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("단어를 입력하세요(51자 이내)");
//		s = sc.next();
//		
//		String[] data = s.split("");
//		
//		for (int i = 0; i < data.length; i++) {
//			System.out.print(data[i]);
//		}
//		
//		
//		// #1022
//		// 
//		String s;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("단어를 입력하세요.");
//		s = sc.next();
//		
//		System.out.println(s);
//		
//		// #1023
//		// 실수 1개를 입력받아 정수 부분과 실수 부분으로 나누어 출력한다.
//		// 1.414213
//		Scanner sc = new Scanner(System.in);
//		Double a;
//		System.out.println("실수를 입력하세요.");
//		a = sc.nextDouble();
//		
//		String s = String.valueOf(a);
//		// toString()과 비교해서 null 발생 시 NPE 발생하지 않는다는 특징이 있다.
//		// >> 오류를 일으키지 않으므로 valueOf를 쓰 것이 권장된다.
//		String [] sr = s.split("\\.");
//		System.out.println(sr[0] + '\n' + sr[1]);
//		
//		// #1024
//		// 입력받은 영단어의 각 문자를 한 줄에 한 개씩 출력
//		
//		Scanner sc = new Scanner(System.in);
//		String a;
//		System.out.println("영단어를 입력하세요: ");
//		a = sc.next();
//		// next(): 공백 이전 문자 리턴
//		// nextLine(): Enter 입력 이전 문자 리턴
//		
//		String [] aa = a.split("");
//		
//		for (int i = 0; i < aa.length; i++) {
//			System.out.println(aa[i]);
//		}
//		
//		// #1025
//		// 75254 각 자리수 따로 출력
//		
//		// charAt(): String으로 저장된 문자열 중에서 한 글자만 선택해서 char 타입으로 변환
//		// char > int : charAt() - '0'
//		
//		String s;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("6자리 이하 숫자를 입력하세용");
//		s = sc.next();
//		
//		int [] data = new int[s.length()];
//		
//		for (int i = 0; i < s.length(); i++) {
//			data[i] = s.charAt(i)-'0';
//		}
//		
//		System.out.println("[" + data[0] * 10000 + "]");
//		System.out.println("[" + data[1] * 1000 + "]");
//		System.out.println("[" + data[2] * 100 + "]");
//		System.out.println("[" + data[3] * 10 + "]");
//		System.out.println("[" + data[4] * 1 + "]");
//		
//		
//		// #1027
//		// yyyy.mm.dd > dd-mm-yyyy로 출력
//		String s;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("연월일을 입력하세요(yyyy.mm.dd)");
//		s = sc.nextLine();
//		
//		String [] data = s.split("\\.");
//		// 특수문자를 구분자로 하고싶을 때에는 \\를 붙여줘야한다!!!!
//		
//		System.out.println(data[2] + "-" + data[1] + "-" + data[0]);
//		
//		
//		// #1028
//		// 정수 입력받아 출력하기   2147483648
//		
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력하세용.");
//		long num = sc.nextLong();
//		
//		System.out.println(num);
//		
//		// #1029
//		// 실수 입력받아 출력하기    3.14159265359
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("실수를 입력하세요.");
//		double num = sc.nextDouble();
//		
//		System.out.println(num);
//		
//		
//		// #1030
//		// 정수 입력받아 출력하기 	-2147483649
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력하세요.");
//		long num = sc.nextLong();
//		
//		System.out.println(num);
		
		// #1031
		// 10진수 입력받아 8진수로 출력하기

		// 내 답안
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력하세요");
//		int a = sc.nextInt();
//		
//		String octal = Integer.toOctalString(a);
//		System.out.println(octal);
//		
//		// 예시답안
//		Scanner sc = new Scanner(System.in);
//		System.out.println("입력하세요");
//		int i = sc.nextInt();
//		
//		System.out.printf("%o", i);
//		
//		// #1032
//		// 10진수를 입력받아 16진수로 출력하기
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("입력하세용");
//		
//		int a = sc.nextInt();
//		
//		System.out.printf("%x", a);
//		
//		
//		// # 1033
//		// 10진수를 입력받아 16진수 대문자로 출력하기
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("입력하세용");
//		
//		int a = sc.nextInt();
//		System.out.printf("%X", a);
//		
//		// #1034
//		// 8진수를 입력받아 10진수로 출력하기
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("입력하세용");
//		String i = sc.next();
//		
//		int o = Integer.valueOf(i, 8);
//		
//		System.out.printf("%d", o);
//		
//		// #1035
//		// 16진수 입력받아 8진수로 출력하기
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("입력하세요");
//		
//		String i = sc.next();
//		
//		int o = Integer.valueOf(i, 16);
//		
//		System.out.printf("%o", o);
//		
//		// #1036
//		// 영문자 1개를 입력받아 아스키 코드표의 10진수 값으로 출력해보자.
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("영문자 1개를 입력하세용.");
//		char i = sc.nextLine().charAt(0);
//		
//		int a = (int)i;
//		System.out.println(a);
//		
//		// #1037
//		// 10진 정수 1개를 입력받아 아스키 문자로 출력해보자.(0~255)
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력하세요(0~255)");
//		int a = sc.nextInt();
//		
//		char b = (char)a;
//		System.out.println(b);
//		
//		
//		// #1038
//		// 정수 2개를 입력받아 합을 출력하는 프로그램을 작성해보자.
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 두개를 띄어쓰기를 이용하여 구분하여 입력하세요.");
//		String s = sc.nextLine();
//		
//		String [] data = s.split(" ");
//		
//		long x = Long.valueOf(data[0]);
//		long y = Long.valueOf(data[1]);
//		
//		System.out.println(x + " + " + y + " = " +  (x + y));
//		
//		
//		// #1039
//		// 정수 큰거를 입력받아 합을 출력하는 프로그램을 작성해보자.
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("큰 정수 두 개를 띄어쓰기를 이용하여 구분하여 입력하세요.");
//		String s = sc.nextLine();
//		
//		String [] data = s.split(" ");
//		
//		long x = Long.valueOf(data[0]);
//		long y = Long.valueOf(data[1]);
//		
//		System.out.println(x + " + " + y + " = " +  (x + y));
//		
//		
//		// #1040
//		// 입력된 정수의 부호를 바꿔 출력해보자.
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력하세용~~~~");
//		long i = sc.nextLong();
//		
//		System.out.println(-i);
//		
//		// #1041
//		// 영문자 1개를 입력받아 그 다음 문자를 출력해보자.
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("영문자를 입력하시면 그 다음 문자가 출력됩니당!");
//		char a = sc.next().charAt(0);
//		
//		int i = Integer.valueOf(a);
//		i += 1;
//		
//		char b = (char) i;
//		
//		System.out.println(b);
//		
//		
//		// #1042
//		// 정수 2개(a, b) 를 입력받아 a를 b로 나눈 몫을 출력해보자.
//		// 정수로 계산된 값을 실수로 출력
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int a;
//		int b;
//		int sum;
//		
//		System.out.println("a 값을 입력하세요.");
//		a = sc.nextInt();
//		
//		System.out.println("b 값을 입력하세요.");
//		b = sc.nextInt();
//		
//		sum = a / b;
//		
//		System.out.println(sum);
//		
//		// #1043
//		// 정수 2개(a, b) 를 입력받아 a를 b로 나눈 나머지를 출력해보자.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수 a를 입력하세요.");
//		int a = sc.nextInt();
//		
//		System.out.println("정수 b를 입력하세요.");
//		int b = sc.nextInt();
//		
//		int sum = a % b;
//		
//		System.out.println(sum);
//		
//		// #1044
//		// 정수를 1개 입력받아 1만큼 더해 출력해보자.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수 a를 입력하세요.");
//		int a = sc.nextInt();
//		
//		System.out.println(++a);
//		
//		// #1045
//		// 정수 2개(a, b)를 입력받아 합, 차, 곱, 몫, 나머지, 나눈 값을 자동으로 계산해보자.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수 a를 입력하세요.");
//		int a = sc.nextInt();
//		
//		System.out.println("정수 b를 입력하세요.");
//		int b = sc.nextInt();
//		
//		System.out.println(a + " + " + b + " = " + (a + b));
//		System.out.println(a + " - " + b + " = " + (a - b));
//		System.out.println(a + " x " + b + " = " + (a * b));
//		System.out.println(a + " / " + b + " = " + (a / b));
//		System.out.println(a + " % " + b + " = " + (a % b));
//		System.out.println(a + " % " + b + " = " + String.format("%,2f",(float)a / b));
//		
//		
//		// #1046
//		// 정수 3개를 입력받아 합과 평균을 출력해보자.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수 a를 입력하세요.");
//		int a = sc.nextInt();
//		
//		System.out.println("정수 b를 입력하세요.");
//		int b = sc.nextInt();
//		
//		System.out.println("정수 c를 입력하세요.");
//		int c = sc.nextInt();
//		
//		float avg = (a+b+c)/3;
//		
//		System.out.println("a+b+c = " + (a+b+c));
//		System.out.println("a,b,c의 평균 = " + avg);
//		
//		
//		// #1047
//		// 정수 1개를 입력받아 2배 곱해 출력해보자.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수 a를 입력하세용.");
//		int a = sc.nextInt();
//		
//		System.out.printf("%d", a << 1 );
//		System.out.println();
//		System.out.printf("%d", a << 2 );
//		System.out.println();
//		System.out.printf("%d", a >> 1 );
//		System.out.println();
//		System.out.printf("%d", a >> 2 );
//		
//		
//		// #1048
//		// 정수 2개(a, b)를 입력받아 a를 2b배 곱한 값으로 출력해보자.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수 a를 입력하세요.");
//		int a = sc.nextInt();
//		
//		System.out.println("정수 b를 입력하세요.");
//		int b = sc.nextInt();
//		
//		System.out.printf("%d", a << b);
//		
//		// #1049
//		// 두 정수(a, b)를 입력받아 a가 b보다 크면 1을, a가 b보다 작거나 같으면 0을 출력하는 프로그램을 작성해보자.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수 a를 입력하세요.");
//		int a = sc.nextInt();
//		
//		System.out.println("정수 b를 입력하세요.");
//		int b = sc.nextInt();
//		
//		if(a > b) {
//			System.out.println("1");
//		}
//		else {
//			System.out.println("0");
//		}
//		
//		// #1050
//		// 두 정수(a, b)를 입력받아 a와 b가 같으면 1을, 같지 않으면 0을 출력하는 프로그램을 작성해보자.
//
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수 a를 입력하세요.");
//		int a = sc.nextInt();
//		
//		System.out.println("정수 b를 입력하세요.");
//		int b = sc.nextInt();
//		
//		if(a == b) {
//			System.out.println("1");
//		}
//		else {
//			System.out.println("0");
//		}
//		
//		// #1051
//		// 두 정수(a, b)를 입력받아 b가 a보다 크거나 같으면 1을, 그렇지 않으면 0을 출력하는 프로그램을 작성해보자.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수 a를 입력하세요.");
//		int a = sc.nextInt();
//		
//		System.out.println("정수 b를 입력하세요.");
//		int b = sc.nextInt();
//		
//		if(b >= a) {
//			System.out.println("1");
//		}
//		else{
//			System.out.println("0");
//		}
//		
//		// #1052
//		// 두 정수(a, b)를 입력받아 a와 b가 서로 다르면 1을, 그렇지 않으면 0을 출력하는 프로그램을 작성해보자.
//
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수 a를 입력하세요.");
//		int a = sc.nextInt();
//		
//		System.out.println("정수 b를 입력하세요.");
//		int b = sc.nextInt();
//		
//		if(a != b) {
//			System.out.println("1");
//		}
//		else {
//			System.out.println("0");
//		}
//		
//		// #1053
//		// 1(true, 참) 또는 0(false, 거짓) 이 입력되었을 때 반대로 출력하는 프로그램을 작성해보자.
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("참 혹은 거짓 입력(1/0)");
//		
//		int a = sc.nextInt();
//		
//		if (a == 1) {
//			System.out.println("0");
//		}
//		
//		if (a == 0) {
//			System.out.println("1");
//		}
//		
//		// #1054
//		// 두 개의 참(1) 또는 거짓(0)이 입력될 때, 모두 참일 때에만 참을 출력하는 프로그램을 작성해보자.
//
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("첫 번째 논리값을 입력하세요.");
//		int a = sc.nextInt();
//		
//		System.out.println("두 번째 논리값을 입력하세요.");
//		int b = sc.nextInt();
//		
//		if(a==1 && b==1) {
//			System.out.println(1);
//		}
//		else {
//			System.out.println(0);
//		}
//		
//		// #1055
//		// 두 개의 참(1) 또는 거짓(0)이 입력될 때, 하나라도 참이면 참을 출력하는 프로그램을 작성해보자.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("첫 번째 논리값을 입력하세요.");
//		int a = sc.nextInt();
//		
//		System.out.println("두 번째 논리값을 입력하세요.");
//		int b = sc.nextInt();
//		
//		if (a == 1 || b == 1) {
//			System.out.println(1);
//		}
//		else {
//			System.out.println(0);
//		}
//		
//		// #1056
//		// 두 가지의 참(1) 또는 거짓(0)이 입력될 때, 참/거짓이 서로 다를 때에만 참을 출력하는 프로그램을 작성해보자.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("첫 번째 논리값을 입력하세요.");
//		int a = sc.nextInt();
//		
//		System.out.println("두 번째 논리값을 입력하세요.");
//		int b = sc.nextInt();
//		
//		if((a==1&&b==0)||(a==0&&b==1)) {
//			System.out.println(1);
//		}
//		else {
//			System.out.println(0);
//		}
//		
//		// #1057
//		// 두 개의 참(1) 또는 거짓(0)이 입력될 때, 참/거짓이 서로 같을 때에만 참이 계산되는 프로그램을 작성해보자.
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫 번째 논리값을 입력하세요");
//		int a = sc.nextInt();
//		
//		System.out.println("두 번째 논리값을 입력하세요");
//		int b = sc.nextInt();
//		
//		if ((a==1 && b==1)||(a==0 && b==0)) {
//			System.out.println(1);
//		}
//		else {
//			System.out.println(0);
//		}
//		
//		// #1058
//		// 두 개의 참(1) 또는 거짓(0)이 입력될 때, 모두 거짓일 때에만 참이 계산되는 프로그램을 작성해보자.
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫 번째 논리값을 입력하세요.");
//		int a = sc.nextInt();
//		
//		System.out.println("두 번째 논리값을 입력하세요.");
//		int b = sc.nextInt();
//		
//		if(a==0 && b==0) {
//			System.out.println(1);
//		}
//		else {
//			System.out.println(0);
//		}
//		
//		
//		// #1059
//		// 입력 된 정수를 비트단위로 참/거짓을 바꾼 후 정수로 출력해보자.
//		// 비트단위(bitwise)연산자 ~ 를 붙이면 된다.(~ : tilde, 틸드라고 읽는다.)
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력하세요.");
//		int a = sc.nextInt();
//		int b = ~a;
//		
//		System.out.println(b);
//		
//		
//		// #1060
//		// 입력된 정수 두 개를 비트단위로 and 연산한 후 그 결과를 정수로 출력해보자.
//		// 비트단위(bitwise)연산자 &를 사용하면 된다.(and, ampersand, 앰퍼센드라고 읽는다.)
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫 번째 정수를 입력하세요");
//		int a = sc.nextInt();
//		
//		System.out.println("두 번째 정수를 입력하세요");
//		int b = sc.nextInt();
//		
//		int c = a & b;
//		
//		System.out.println(c);
//		
//		
//		// #1061
//		// 입력된 정수 두 개를 비트단위로 or 연산한 후 그 결과를 정수로 출력해보자.
//		// 비트단위(bitwise) 연산자 |(or, vertical bar, 버티컬바)를 사용하면 된다.
//
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫 번째 정수를 입력하세요");
//		int a = sc.nextInt();
//		
//		System.out.println("두 번째 정수를 입력하세요");
//		int b = sc.nextInt();
//		
//		int c = a | b;
//		
//		System.out.println(c);
//		
//		// #1062
//		// 입력된 정수 두 개를 비트단위로 xor 연산한 후 그 결과를 정수로 출력해보자.
//		// 비트단위(bitwise) 연산자 ^(xor, circumflex/caret, 서컴플렉스/카릿)를 사용하면 된다.
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫 번째 정수를 입력하세요.");
//		int a = sc.nextInt();
//		
//		System.out.println("두 번째 정수를 입력하세요.");
//		int b = sc.nextInt();
//		
//		int c = a ^ b;
//		
//		System.out.println(c);
//		
//		
//		// #1063
//		// 입력된 두 정수 a, b 중 큰 값을 출력하는 프로그램을 작성해보자.
//		// 단, 조건문을 사용하지 않고 3항 연산자 ? 를 사용한다.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("첫 번째 정수를 입력하세요.");
//		int a = sc.nextInt();
//		
//		System.out.println("두 번째 정수를 입력하세요.");
//		int b = sc.nextInt();
//		
//		System.out.println(a>b ? a:b);
//		
//		
//		// #1064
//		// 입력된 세 정수 a, b, c 중 가장 작은 값을 출력하는 프로그램을 작성해보자.
//		// 단, 조건문을 사용하지 않고 3항 연산자 ? 를 사용한다.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("첫 번째 정수를 입력하세요.");
//		int a = sc.nextInt();
//		
//		System.out.println("두 번째 정수를 입력하세요.");
//		int b = sc.nextInt();
//		
//		System.out.println("세 번째 정수를 입력하세요.");
//		int c = sc.nextInt();
//		
//		System.out.println(a < b ? (a < c ? a : c) : b);
//		
//
//		
//		// #1065
//		// 세 정수 a, b, c가 입력되었을 때, 짝수만 출력해보자.
//
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("a를 입력하세요.");
//		int a = sc.nextInt();
//		
//		System.out.println("b를 입력하세요.");
//		int b = sc.nextInt();
//		
//		System.out.println("c를 입력하세요.");
//		int c = sc.nextInt();
//		
//		if(a%2==0) {
//			System.out.println(a);
//		}
//		if(b%2==0) {
//			System.out.println(b);
//		}
//		if(c%2==0) {
//			System.out.println(c);
//		}
//		
//		// #1066
//		// 세 정수 a, b, c가 입력되었을 때, 짝(even)/홀(odd)을 출력해보자.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("a를 입력하세요.");
//		int a = sc.nextInt();
//		
//		System.out.println("b를 입력하세요.");
//		int b = sc.nextInt();
//		
//		System.out.println("c를 입력하세요.");
//		int c = sc.nextInt();
//		
//		if(a%2==0) {
//			System.out.println("짝(even)");
//		}
//		else {
//			System.out.println("홀(odd)");
//		}
//		
//		if (b%2==0) {
//			System.out.println("짝(even)");
//		}
//		else {
//			System.out.println("홀(odd)");
//		}
//		
//		if (c%2==0) {
//			System.out.println("짝(even)");
//		}
//		else {
//			System.out.println("홀(odd)");
//		}
//
//		
//		// #1067
//		// 정수 1개가 입력되었을 때, 음(minus)/양(plus)과 짝(even)/홀(odd)을 출력해보자.
//
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수를 입력하세요.");
//		int a = sc.nextInt();
//		
//		if (a>=0) {
//			System.out.println("plus");
//			if (a%2==0) {
//				System.out.println("even");
//			}
//			else {
//				System.out.println("odd");
//			}
//		}
//		else {
//			System.out.println("minus");
//			if(a%2==0) {
//				System.out.println("even");
//			}
//			else {
//				System.out.println("odd");
//			}
//		}
//		
//		
//		// #1068
//		// 점수(정수, 0 ~ 100)를 입력받아 평가를 출력해보자.
//		
//		// 90 ~ 100 : A
//		// 70 ~  89 : B
//		// 40 ~  69 : C
//		//  0 ~  39 : D
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("점수를 입력하세요.");
//		int a = sc.nextInt();
//		
//		if (a>=90) {
//			System.out.println("A");
//		} else if (a>=70) {
//			System.out.println("B");
//		} else if (a>=40) {
//			System.out.println("C");
//		} else {
//			System.out.println("D");
//		}
//		
//		
//		// #1069
//		// 평가를 문자(A, B, C, D, ...)로 입력받아 내용을 다르게 출력해보자.
//		// 평가 : 내용
//		// A : best!!!
//		// B : good!!
//		// C : run!
//		// D : slowly~
//		// 나머지 문자들 : what?
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("평가그거를 입력하세요.");
//		char a = sc.nextLine().charAt(0);
//		
//		switch(a) {
//		case 'A':
//			System.out.println("best!!!");
//			break;
//			
//		case 'B':
//			System.out.println("good!!");
//			break;
//			
//		case 'C':
//			System.out.println("run!");
//			break;
//			
//		case 'D':
//			System.out.println("slowly~");
//			break;
//			
//		default:
//			System.out.println("what?");
//			break;
//		}
//		
//		
//		// #1070
//		// 월이 입력될 때 계절 이름이 출력되도록 해보자.
//
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("월 숫자를 입력하세용(1~12)");
//		int a = sc.nextInt();
//		
//		switch(a) {
//		
//		case 12:
//		case 1:
//		case 2:
//			System.out.println("Winter");
//			break;
//			
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("Spring");
//			break;
//			
//		case 6:
//		case 7:
//		case 8:
//			System.out.println("Summer");
//			break;
//			
//		case 9:
//		case 10:
//		case 11:
//			System.out.println("Fall");
//			break;
//		}
//		
//		// #1071
//		// 0 입력될 때까지 무한 출력하기
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자입력하셈");
//		
//		while(true) {
//			int a = sc.nextInt();
//			
//			if(a==0) {
//				break;
//			}
//			System.out.println(a);
//		}
//		
//		// #1072
//		// 0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			int a = sc.nextInt();
//			
//			if(a==0) {
//				break;
//			}
//			System.out.println(a);
//		}
//		
//		
//		// #1073
//		// 정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수를 입력하세요.");
//		int a = sc.nextInt();
//		
//		while(a!=0) {
//			System.out.println(a);
//			a--;
//		}
//		
//		// #1074
//		// 정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수를 입력하세요.");
//		int a = sc.nextInt();
//		
//		while(a >= 1) {
//			System.out.println(a);
//			a--;
//		}
//		
//		// #1075
//		// 정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수를 입력하세요.");
//		int a = sc.nextInt();
//		
//		while(a>=0) {
//			System.out.println(a);
//			a--;
//		}
//		
//		
//		// 번외 for문으로 해보기
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수를 입력하세요.");
//		int a = sc.nextInt();
//		
//		for (int i = a; i >= 0; i--) {
//			System.out.println(i);
//		}
//		
//		
//		// #1075
//		// 정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
//		
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력하세요.");
//		int a = sc.nextInt();
//		
//		while(a-1 >= 0) {
//			System.out.println(a-1);
//			a--;
//		}
//		
//		
//		// #1076
//		// 영문자(a ~ z) 1개가 입력되었을 때 그 문자까지의 알파벳을 순서대로 출력해보자.
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("알파벳을 입력하세요");
//		char a = sc.next().charAt(0);
//		
//		for (char i = 'a'; i <= a; i++) {
//			System.out.println(i+" ");
//		}
//		
//		// #1077
//		// 정수(0 ~ 100) 1개를 입력받아 0부터 그 수까지 순서대로 출력해보자.
//
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수를 입력하세요.");
//		int a = sc.nextInt();
//		
//		for (int i = 0; i <= a; i++) {
//			System.out.println(i);
//		}
//		
//		// #1078
//		// 정수(1 ~ 100) 1개를 입력받아 1부터 그 수까지 짝수의 합을 구해보자.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수를 입력하세요(1~100)");
//		int a = sc.nextInt();
//		int sum = 0;
//		
//		for (int i = 0; i <= a; i++) {
//			if (i % 2 ==0) {
//				sum += i;
//			}
//		}
//		
//		System.out.println(sum);
//		
//		
//		// #1079
//		// 'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램을 작성해보자.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("알파벳을 입력하세요.");
//		
//
//		while(true) {
//			char a = sc.next().charAt(0);
//			if(a == 'q') {
//				System.out.println(a);
//				break;
//			}
//			System.out.println(a);
//		}
//		
//		// #1080
//		// 1, 2, 3 ... 을 계속 더해 나갈 때, 그 합이 입력한 정수(0 ~ 1000)보다 같거나 작을 때까지 계속 더하는 프로그램을 작성해보자.
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력하세요(1~1000)");
//		int a = sc.nextInt();
//		int sum = 0;
//		
//		for (int i = 1; sum <= a; i++) {
//			sum += i;
//			
//			if (sum >= a) {
//				System.out.println(i);
//				break;
//			}
//		}
//		
//		
//		// #1081
//		// 1부터 n까지, 1부터 m까지 숫자가 적힌 서로 다른 주사위 2개를 던졌을 때 나올 수 있는 모든 경우를 출력해보자.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수 n을 입력하세요.");
//		int n = sc.nextInt();
//		
//		System.out.println("정수 m을 입력하세요.");
//		int m = sc.nextInt();
//		
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= m; j++) {
//				System.out.println(i+","+j);
//			}
//		}
//		
//		
//		// #1082
//		// A, B, C, D, E, F 중 하나가 입력될 때, 1부터 F까지 곱한 16진수 구구단의 내용을 출력해보자.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("A,B,C,D,E,F 중 하나를 입력하세용.");
//		String a = sc.next();
//		
//		int num = Integer.parseInt(a, 16);
//		
//		for(int i = 1; i<16; i++) {
//			System.out.printf("%X*%X=%X\n", num,i,num*i);
//		}
//		
//		
//		// #1083
//		// 369게임 프로그래밍
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("1~10 사이의 정수를 입력하세요.");
//		int a = sc.nextInt();
//		
//		for (int i = 1; i <= a; i++) {
//			if(i%3==0) {
//				System.out.println("짝");
//			}
//			else if(i%3!=0){
//				System.out.println(i);
//			}
//		}
//		
//		
//		// #1084
//		// 주어진 rgb 빛들을 다르게 섞어 만들 수 있는 모든 경우의 조합(r g b)과 총 가짓 수를 계산해보자.
//		// 다른프로젝트 참고하기
//		
//		
//		
//		// #1085
//		// 소리 파일 저장용량 계산하기
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("h 값을 입력하세요.");
//		double h = sc.nextDouble();
//		
//		System.out.println("b 값을 입력하세요.");
//		double b = sc.nextDouble();
//		
//		System.out.println("c 값을 입력하세요.");
//		double c = sc.nextDouble();
//		
//		System.out.println("s 값을 입력하세요.");
//		double s = sc.nextDouble();
//		
//		double total = (h*b*c*s)/8/Math.pow(2,10)/Math.pow(2, 10);
//				
//		
//		System.out.println(String.format("%.1f", total) + " MB");
//		System.out.println(Math.round(total*10)/10.0 + " MB");
//		
//		
//		// 다시보기@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//		// #1086
//		// 그림 파일 저장용량 계산하기
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("입력하세용");
//		String a = sc.next();
//		
//		String [] data = a.split(" ");
//		
//		int a1 = Integer.parseInt(data[0]);
//		int a2 = Integer.parseInt(data[1]);
//		int a3 = Integer.parseInt(data[2]);
//		
//		double total = (double)(a1*a2*a3)/8/1024/1024;
//		
//		System.out.printf("%.2f MB", total);
//		
//		
//		
//		// #1087
//		// 1, 2, 3 ... 을 순서대로 계속 더해나갈 때,
//		// 그 합이 입력한 정수보다 작을 동안만 계속 더하는 프로그램을 작성해보자.
//		
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		
//		int a = sc.nextInt();
//		int sum = 0;
//		
//		for(int i = 0; ; i++ ) {
//			sum += i;
//			if (sum > a) {
//				break;
//			}
//		}
//		
//		System.out.println(sum);
//		
//		
//		// #1088
//		// 1부터 입력한 정수까지 1씩 증가시켜 출력하는 프로그램을 작성하되,
//		// 3의 배수인 경우는 출력하지 않도록 만들어보자.
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력하세요.");
//		int a = sc.nextInt();
//		
//		for (int i = 1; i <= a; i++) {
//			if(i%3==0) {
//				continue;
//			}
//			System.out.println(i);
//		}
//		
//		
//		
//		// #1089
//		// 시작 값(a), 등차(d), 몇 번째인지를 나타내는 정수(n)가 입력될 때
//		// n번째 수를 출력하는 프로그램을 만들어보자.
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("시작 값을 입력하세요.");
//		int a = sc.nextInt();
//		
//		System.out.println("등차를 입력하세요.");
//		int d = sc.nextInt();
//		
//		System.out.println("몇 번째를 볼지 입력하세요.");
//		int n = sc.nextInt();
//		
//		int sum = a;
//		
//		for (int i = 1; i < n ; i++) {
//			sum += d;
//		}
//		
//		System.out.println(sum);
//		
//		
//		// #1090
//		// 시작 값(a), 등비(r), 몇 번째인지를 나타내는 정수(n)가 입력될 때
//		// n번째 수를 출력하는 프로그램을 만들어보자.
//		
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("시작값을 입력하세요");
//		int a = sc.nextInt();
//		
//		System.out.println("등비를 입력하세요");
//		int r = sc.nextInt();
//		
//		System.out.println("몇 번째를 볼건지 입력하세요");
//		int n = sc.nextInt();
//		
//		int result = a;
//		
//		for(int i = 1; i < n; i++) {
//			result *= r;
//		}
//		
//		System.out.println(result);
//		
//		
//		// #1091
//		// 시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째인지를 나타내는 정수(n)가 입력될 때,
//		// n번째 수를 출력하는 프로그램을 만들어보자.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("시작값을 입력하세요.");
//		int a = sc.nextInt();
//		
//		System.out.println("곱할 값을 입력하세요.");
//		int m = sc.nextInt();
//		
//		System.out.println("더할 값을 입력하세요.");
//		int d = sc.nextInt();
//		
//		System.out.println("몇 번째를 볼건지 입력하세요.");
//		int n = sc.nextInt();
//		
//		int result = a;
//		
//		for (int i = 1; i < n; i++) {
//			result = result * m + d;
//		}
//		
//		System.out.println(result);
//		
//		
//		// #1092
//		// 같은 날 동시에 가입한 3명의 사람들이 온라인 채점시스템에 들어와 문제를 푸는 날짜가
//		// 매우 규칙적이라고 할 때, 다시 모두 함께 문제를 풀게 되는 그날은 언제일까?
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("첫번째사람");
//		int a = sc.nextInt();
//		
//		System.out.println("두번째사람");
//		int b = sc.nextInt();
//		
//		System.out.println("세번째사람");
//		int c = sc.nextInt();
//		
//		int day = 1;
//		
//		while(day % a != 0 || day % b != 0 || day % c != 0 ) {
//			day++;
//		}
//		System.out.println(day);
//		
//		
//		// #1093
//		// 출석 번호를 n번 무작위로 불렀을 때, 각 번호(1 ~ 23)가 불린 횟수를 각각 출력해보자.
//		
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("부른 횟수를 입력하세요");
//		
//		int n = sc.nextInt();
//		
//		int [] arr = new int [23];
//		
//		for(int i = 0; i < n; i++) {
//			arr[sc.nextInt()-1]++;
//		}
//		
//		for(int j = 0; j < arr.length; j++) {
//			System.out.print(arr[j] + " ");
//		}
//		
//		
//		// #1094
//		// 출석 번호를 n번 무작위로 불렀을 때, 부른 번호를 거꾸로 출력해 보자.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("부를 횟수를 입력하세요.");
//		int n = sc.nextInt();
//		
//		int [] arr = new int [n];
//		
//		for (int i = 0; i < n; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		for (int j = n-1; j >= 0; j--) {
//			System.out.print(arr[j] + " ");
//		}
//		
//		
//		// #1095
//		// 출석 번호를 n번 무작위로 불렀을 때, 가장 빠른 번호를 출력해 보자.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("부를 횟수를 입력하세요.");
//		int n = sc.nextInt();
//		
//		int min = 24;
//		int [] arr = new int [23];
//		
//		for (int i = 0; i < n; i++) {
//			arr[i] = sc.nextInt();
//			if(arr[i]<min) {
//				min = arr[i];
//			}
//		}
//		
//		System.out.println(min);
//		
//		
//		// #1096
//		// 바둑판(19 * 19)에 n개의 흰 돌을 놓는다고 할 때,
//		// n개의 흰 돌이 놓인 위치를 출력하는 프로그램을 작성해보자.
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("돌의 개수를 입력하세용.");
//		int n = sc.nextInt();
//		
//		int [][] arr = new int [19][19];
//		
//		for (int i = 0; i < n; i++) {
//			int x = sc.nextInt();
//			int y = sc.nextInt();
//			
//			arr[x-1][y-1] = 1;
//		}
//		
//		for (int j = 0; j < 19; j++) {
//			for (int k = 0; k < 19; k++) {
//				System.out.print(arr[j][k] + " ");
//			}
//			System.out.println();
//		}
//		
//		
//		// #1097
//		// 바둑판(19 * 19)에 흰 돌(1) 또는 검정 돌(0)이 모두 꽉 채워져 놓여있을 때,
//		// n개의 좌표를 입력받아 십(+)자 뒤집기한 결과를 출력하는 프로그램을 작성해보자.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int [][] arr = new int [19][19];
//		
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}
//		
//		int n = sc.nextInt();
//		for(int i = 0; i < n; i++) {
//			int x = sc.nextInt()-1;
//			int y = sc.nextInt()-1;
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[x][j] == 0) {
//					arr[x][j] = 1;
//				} else {
//					arr[x][j] = 0;
//				}
//			}
//			for (int j = 0; j < arr.length; j++) {
//				if(arr[j][y] == 0) {
//					arr[j][y] = 1;
//				} else {
//					arr[j][y] = 0;
//				}
//			}
//			
//		}
//		
//		for(int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length ; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//		
//		// #1098
//		// 격자판을 채운 막대의 모양을 출력하는 프로그램을 만들어보자.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int w = sc.nextInt();
//		int h = sc.nextInt();
//		
//		int [][] arr = new int [w+1][h+1];
//		
//		int n = sc.nextInt();
//		
//		for (int i = 0; i < n; i++) {
//			int l = sc.nextInt();
//			int d = sc.nextInt();
//			int x = sc.nextInt();
//			int y = sc.nextInt();
//			
//			if (d == 0) {
//				for(int j = 0; j < l; j++) {
//					arr[x][y+j] = 1;
//				}
//			} else if (d == 1) {
//				for (int j = 0; j < l; j++) {
//					arr[x+j][y] = 1;
//				}
//			}
//			
//		}
//		
//		for (int i = 1; i <= h; i++) {
//			for (int j = 1; j <= w; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		// #1099
		// 개미새끼
		
		Scanner sc = new Scanner(System.in);
		
		int [][] arr = new int [10][10];
		
		
		// 상자 모양 잡기
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		// 시작점 (2,2)
		int x = 1; // 이건 쓸모없었다고 한다.
		int y = 1;
		int end = 0;

		for (int i = 1; i < arr.length; i++) {
			if (end == 1) {
				break;
			} else {
				for (int j = y; j < arr.length; j++) {
					// 2를 만나면 9를 쓰고 끝
					if (arr[i][j] == 2) {
						arr[i][j] = 9;
						end = 1;
						break;

						// 1을 만나면 밑으로 내려감 (continue 문으로 상위 반복문으로 빠져나감
					} else if (arr[i][j] == 1) {
						y = j - 1;
						break;
					} else if (arr[i][j] == 0) {
						arr[i][j] = 9;
					}
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		

		

		
		
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
