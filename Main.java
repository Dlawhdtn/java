package kr.lim.test;

import java.util.Scanner;

import kr.lim.test.entity.Person;

public class Main {
	
	public static void main(String[] args) {
		
		// ��ü - Class - Object - Instance
		// Person
		// ������
		// String s = "���ڿ�"
		Person p1 = new Person();
		Person p2 = new Person();
		p1.setName("ȫ�浿1");
		p2.setName("ȫ�浿2");
		
		System.out.println(p1.getName());
		System.out.println(p2.getName());
	} 
}