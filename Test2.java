package kr.lim.test.practice;

import kr.lim.test.entity.Person;
import kr.lim.test.practice.Triangle;

public class Test2 {
	
	//
	// static
	// Heap
	// Stack -> Stack Over Flow (Stack ������ ������ �ʰ��� �����͸� ������ �� ��)
	//
	
	static int a = 10;
	
	public static void main(String[] args) { //���� �Լ�
			
		Triangle t1 = new Triangle(5, 10); //���� ��ü
		Triangle t2 = new Triangle(15, 25);
		t1.printArea();
		t2.printArea();
		
	}
}