package kr.lim.test;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		// if(����) {
		// 		��ȣ���� ������ ���� ���, ����Ǵ� �ڵ�		
		// }
		System.out.print("���̸� �Է��ϼ��� :");
		int age;
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		// ����ڰ� �Է� �� ���� (����) ������ (age > 19) ���, ���� �� �ڵ带 ���ǹ��� ���� ǥ��
		// ���� ������ �����̸鼭, �Ʒ��� ������ ���� ���
		if(age > 19) {
			System.out.println("�����Դϴ�.");
		}
		else if(age < 8) {
			// age <= 19 && age < 8
			System.out.println("����Դϴ�.");
		}
		else{
			//age <= 19 && age >= 8
			System.out.println("û�ҳ��Դϴ�.");
		}
		//else{
		//	�ٷ� ���� �����ϴ� if ���� ������ �����ΰ�� ���� �� �ڵ�.
		//}
		//else if(����) {
		//		�ٷ� ���� �����ϴ� if ���� ������ �����̸鼭 �ڽ��� ������ ���ΰ��, ���� �� �ڵ�
		//}
		
	} 
}
