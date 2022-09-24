package kr.lim.test;

import java.util.Scanner;

import kr.lim.test.entity.Person;

public class Main {
	
	public static void main(String[] args) {
		
		// °´Ã¼ - Class - Object - Instance
		// Person
		// »ý¼ºÀÚ
		// String s = "¹®ÀÚ¿­"
		Person p1 = new Person();
		Person p2 = new Person();
		p1.setName("È«±æµ¿1");
		p2.setName("È«±æµ¿2");
		
		System.out.println(p1.getName());
		System.out.println(p2.getName());
	} 
}