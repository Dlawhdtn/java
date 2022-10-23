package kr.lim;

public class Person {

	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person(String data) {
		// split - 문자열 가르기
		String[] args = data.split(":");
		// {"홍길동", "54"}
		this.name = args[0];
		// int -> Integer
		this.age = Integer.parseInt(args[1]);
	}
	
	public void printInformation() {
		// 이름 12
		System.out.println(name + " " + age);
	}
	
	public String toString() {
		return name + ":" + age;
	}
	
}
