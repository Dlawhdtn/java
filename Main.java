package kr.lim.test;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		// ��ü�� ����
		// ��ü�̸� �̸�;
		
		// ��ü�� �� ����
		// �̸� = ��ü�� ����;
		
		// ��ü�� �������� ����
		// new ��ü�̸�(����) -> ��ü�� ����
		
		// ��ĳ�ʴ� ����ڰ� �Է��ϴ� ���� ���� System input
		// System.out ( �ܼ� ) -> �ܼ�.print(asd)
		// System.in
		
		Scanner asd = new Scanner(System.in);
		
		// ������ ����
		// ����Ÿ�� �����̸�;
		// ������ �� ����
		// �����̸� = ��;
		// ������ �ʱ�ȭ + ����
		// ����Ÿ�� �����̸� = ��;
		//String line = asd.nextLine(); //���ڿ��� ���� ��
		//int number1 = asd.nextInt();
		
		/*System.out.print("���� 1�� �Է��ϼ��� :");
		int number1 = asd.nextInt();
		
		System.out.print("���� 2�� �Է��ϼ��� :");
		int number2 = asd.nextInt();*/
		
		//System.out.print("�� ���� ����= " + (number1 + number2));
		
		// format ( ���� ���ڸ� ���� ������ ǥ���ϴ� ��)
		// %s - ���ڿ�
		// %c - ����
		// %d - ����
		// %f - �Ǽ�
		// System.out.printf
		//System.out.printf("%d + %d = %d",number1, number2, number1 + number2);
		//String output = String.format("%d + %d = %d",number1, number2, number1 + number2);
		
		System.out.print("���� 1�� �Է��ϼ��� :");
		String number1 = asd.nextLine();
		
		System.out.print("���� 2�� �Է��ϼ��� :");
		String number2 = asd.nextLine();
		
		//Integer.parseInt(number1); // int ��
		// try catch
		/* try {
			������ �ڵ�
		} catch(��������) {
			���� �߻��� ������ �ڵ�
		} */
		try {
			System.out.print(Integer.parseInt(number1) + Integer.parseInt(number2));
		} catch(NumberFormatException e) {
			System.out.print("���ڸ� �Է��ϼ���");
		}
		System.out.print(Integer.parseInt(number1) + Integer.parseInt(number2));
	}
}
