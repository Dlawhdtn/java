package kr.lim.test;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		// ��Ȳ ������ (����� ������)
		//(����)? �� : ����;
		// boolean Ÿ���� �� (true / false)
		int number = new Scanner(System.in).nextInt();
		// �Է¹��� ���� 50���� ũ��, 100�̶�� ���ڸ� ����ϰ�, 50���� ������ 0�̶�� ���ڸ� ����ϴ� ����
		//System.out.println(number > 50 ? 100 : 0);
		//int a = number > 50 ? 100 : 0;
		String text = number > 19 ? "�����Դϴ�." : "û�ҳ��Դϴ�.";
		// text�� ���� number�� ���� 19���� ū ��쿡�� �����Դϴ�
		// �� ���� ���, û�ҳ��Դϴ� -> ����
		System.out.println(text);
		// ++ , -- (���������� [���׿�����])
		// +-, +=, /=, %=, = (���Կ�����)
		// x 10 ->
		//number = number * 10;
		number *= 10;
		System.out.println(number);
	} 
}
