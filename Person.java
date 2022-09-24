package kr.lim.test.entity;

public class Person {
	// �̸�(���ڿ�), ����(����)
	private String name; // ���(��ü) ����
	public int age;
	
	// ������
	// public Person() {} <-- �ٸ� �����ڰ� ������ �Ǹ� ���� ��
	// ���������� ��ü�̸�(�Ű�����) {}
	
	// �������� -> ���������� �켱������ ���� ����.
	
	// ������ �����ε�
	// 1��  ���� ( ���̸� �Է����� ���� ��� = ���� �⺻�� 1)
	public Person() {
		name = "�̸�����";
		age = 1;
	}
	
	public Person(String name) {
		this.name = name;
		age = 1;
	}
	public Person(String name, int age) {
		// a = "������";
		// b = 22;
		// this ��ü �ڱ� �ڽ�
		this.name = name;
		this.age = age;
	}
	// public - ��ü����
	// private - ���ο����� ����
	// (default) - ���� ��Ű�� �������� ����
	// protected - ��� ���迡���� ����
	
	// �ż���, �Լ�
	// ��ȯŸ�� �ż����(�Ű�����) {}
	// ���� �ܾ�� ����� �����Ѵ�.
	// ù���� �ҹ��� ���� �̾����� �ܾ� �빮�� ����
	//getter - ���ο� private ����� ������ �ܺο��� �޼��带 ���� �������� ����
	
	public String getName() {
		return name;
	}
	
	// int, long, double, short, byte, String, float
	// setter - ���ο� private ����� ������ �ܺο��� �޼��带 ���� �����ϴ� ����
	public void setName(String name) {
		this.name = name;
	}
	
	public void getAge(int age) {
		if(age >= 15) this.age = age;
	}
	
	// �̸��� ���̸� ����ϴ� �޼���
	public void printInfo() {
		// ���ڿ� + �� = ���ڿ� ������ ����
		// "����"+15 => ����15 
		// �̸� : (name��) ���� : (age��)
		System.out.println("�̸� : "+name+" ���� : "+age);
	}
	
	//���̸� �� �� ������Ű�� �޼���
	public void addAge() {
		age++; // age + 1
	}
}





