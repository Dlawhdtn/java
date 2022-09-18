package kr.lim.test;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		// if(조건){
		// 		괄호안의 조건이 참일 경우, 실행되는 코드
		// }
		
		// 점수를 입력받아서 90점 이상이면A
		// 		    점수가 80점 이상이면 B
		//		    점수가 70점 이상이면 C
		//		    이외의 경우 D
		System.out.print("점수를 입력하세요 :");
		Scanner sc = new Scanner(System.in);
		int grade;
		grade = sc.nextInt();
		
		if(grade >= 90) {
			System.out.println("A");
		} else if (grade >= 80) {
			System.out.println("B");
		} else if (grade >= 70) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		
		// switch문
		// switch (조건) {
		//  case 값:
		//  	break;
		// }
		grade /= 10;
		switch(grade) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
			break;
		}
	} 
}
