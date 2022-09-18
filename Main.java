package kr.lim.test;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		// 상황 연산자 (제어문과 유사함)
		//(조건)? 참 : 거짓;
		// boolean 타입의 값 (true / false)
		int number = new Scanner(System.in).nextInt();
		// 입력받은 값이 50보다 크면, 100이라는 숫자를 출력하고, 50보다 작으면 0이라는 숫자를 출력하는 구문
		//System.out.println(number > 50 ? 100 : 0);
		//int a = number > 50 ? 100 : 0;
		String text = number > 19 ? "성인입니다." : "청소년입니다.";
		// text의 값은 number의 값이 19보다 큰 경우에만 성인입니다
		// 이 외의 경우, 청소년입니다 -> 저장
		System.out.println(text);
		// ++ , -- (증감연산자 [단항연산자])
		// +-, +=, /=, %=, = (대입연산자)
		// x 10 ->
		//number = number * 10;
		number *= 10;
		System.out.println(number);
	} 
}
