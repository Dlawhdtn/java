package kr.lim.test.practice;

import kr.lim.test.entity.Person;
import kr.lim.test.practice.Triangle;

public class Test2 {
	
	//
	// static
	// Heap
	// Stack -> Stack Over Flow (Stack 영역의 범위를 초과한 데이터를 넣으려 할 때)
	//
	
	static int a = 10;
	
	public static void main(String[] args) { //메인 함수
			
		Triangle t1 = new Triangle(5, 10); //지역 객체
		Triangle t2 = new Triangle(15, 25);
		t1.printArea();
		t2.printArea();
		
	}
}