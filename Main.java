package kr.lim.test;

public class Main {
	// ���� �ּ�
	/* <- ������ �ּ� ����
	 ������ �ּ� �� -> */
	// public - ������ ������
	// private - ������ ������� (�ܺη� ����)
	public static void main(String[] args) {
		//������ ����
		//����Ÿ�� �����̸�;
		int num;
		//������ �� ����(�ʱ�ȭ)
		//�����̸� = ��;
		num = 5;
		//������ ����� �ʱ�ȭ
		int num2 = 4;
		double d = 0.3;
		//������ �� ��
		// == ������ ��
		// != �ٸ��� ��
		// >  ���� ���� ū��
		// <  ������ ���� ū��
		// >= ���ʰ��� ũ�ų� ������
		// <= ������ ���� ũ�ų� ������
		// false ����
		// true  ��
		String name = "������";
		String a = "ABC";
		int number = 123;
		int number2 = 456;
		// ���� + �ڵ� ����ȯ
		String b = name + a + number + number2;
		String c = number + number2 + name + a;
		//String = ����(X) Ŭ���� (O)
		//����� ����ȯ
		double e = 2.5;
		int n = (int)e;
		// int = ���� double = �Ǽ�
		System.out.print(n);
	}
}
