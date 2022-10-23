package kr.lim;

public class Person {

	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person(String data) {
		// split - ���ڿ� ������
		String[] args = data.split(":");
		// {"ȫ�浿", "54"}
		this.name = args[0];
		// int -> Integer
		this.age = Integer.parseInt(args[1]);
	}
	
	public void printInformation() {
		// �̸� 12
		System.out.println(name + " " + age);
	}
	
	public String toString() {
		return name + ":" + age;
	}
	
}
