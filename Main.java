package kr.lim.test;

public class Main {
	// 한줄 주석
	/* <- 여러줄 주석 시작
	 여러줄 주석 끝 -> */
	// public - 완전히 공개된
	// private - 완전히 비공개된 (외부로 부터)
	public static void main(String[] args) {
		//변수의 선언
		//변수타입 변수이름;
		int num;
		//변수의 값 저장(초기화)
		//변수이름 = 값;
		num = 5;
		//변수의 선언과 초기화
		int num2 = 4;
		double d = 0.3;
		//변수의 값 비교
		// == 같은지 비교
		// != 다른지 비교
		// >  왼쪽 값이 큰지
		// <  오른쪽 값이 큰지
		// >= 왼쪽값이 크거나 같은지
		// <= 오른쪽 값이 크거나 같은지
		// false 거짓
		// true  참
		String name = "임종수";
		String a = "ABC";
		int number = 123;
		int number2 = 456;
		// 연산 + 자동 형변환
		String b = name + a + number + number2;
		String c = number + number2 + name + a;
		//String = 변수(X) 클래스 (O)
		//명시적 형변환
		double e = 2.5;
		int n = (int)e;
		// int = 정수 double = 실수
		System.out.print(n);
	}
}
