package kr.lim.test;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		// if(조건) {
		// 		괄호안의 조건이 참일 경우, 실행되는 코드		
		// }
		System.out.print("나이를 입력하세요 :");
		int age;
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		// 사용자가 입력 한 숫자 (나이) 성인인 (age > 19) 경우, 실행 될 코드를 조건문을 통해 표현
		// 위의 내용이 거짓이면서, 아래의 내용이 참인 경우
		if(age > 19) {
			System.out.println("성인입니다.");
		}
		else if(age < 8) {
			// age <= 19 && age < 8
			System.out.println("어린이입니다.");
		}
		else{
			//age <= 19 && age >= 8
			System.out.println("청소년입니다.");
		}
		//else{
		//	바로 위에 존재하는 if 문의 조건이 거짓인경우 실행 될 코드.
		//}
		//else if(조건) {
		//		바로 위에 존재하는 if 문의 조건이 거짓이면서 자신의 조건이 참인경우, 실행 될 코드
		//}
		
	} 
}
