package kr.lim.test;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		// if(����){
		// 		��ȣ���� ������ ���� ���, ����Ǵ� �ڵ�
		// }
		
		// ������ �Է¹޾Ƽ� 90�� �̻��̸�A
		// 		    ������ 80�� �̻��̸� B
		//		    ������ 70�� �̻��̸� C
		//		    �̿��� ��� D
		System.out.print("������ �Է��ϼ��� :");
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
		
		// switch��
		// switch (����) {
		//  case ��:
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
