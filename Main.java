package kr.lim.test;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		// for (변수 초기화(선언이 있어야 하는 경우 = 위에 해당 변수가 선언된 적이 없는 경우); 조건식; 증감식) {
		//      
		//
		//
		// }
		
		// 변수의 선언 (변수의 선언은 여러번 이루어 질 수 없다)
		// 변수타입 변수이름;
		
		// 변수의 값 저장
		// 변수이름 = 값;
		
		// 변수의 선언과 초기화
		// 변수타입 변수이름 = 값;
		
		int a = 0; // 변수의 값을 개발자가 원하는 값으로 저장을 시키기 떄문
		
		a = 15; // 원래의 값을 무시하고 강제로 15를 저장(초기화)
		
		// i를 통해서 10번 반복.
		// i가 9까지 0~9 1씩 증가하면서 반복하면 10번을 반복한다.
		
		for(int i = 0; i <= 9; i++) {
			System.out.println(i);
		}
		
		// while(조건식(결과값이 boolean [true or false])){
		//
		// }
		
		boolean switchA = false;
		
		switchA = true;
		
		// 15부터 1씩 감소하면서 반복하는데 0보다 큰 경우 반복
		while(a > 0) {
			System.out.println(a);
			a--; // 15, 14, ... 1
		}
		
		// a = 0
		
		// 아래의 do while은 {}지역을 공통적으로 소유하게 됩니다.
		// do는 한 번만 실행, while은 조건에 의해 반복실 행
		// do {}코드를 실행하고 while문의 조건을 비교해서 참이면 while{}반복 실행
		do {
			a++;
			System.out.println(a);
		} while(a != 0 && a <15);
				
	} 
}
