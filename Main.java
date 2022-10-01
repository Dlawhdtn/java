package kr.lim.project;

import kr.lim.project.abstract_.XY;
import kr.lim.project.interface_.AllInterface;
import kr.lim.project.interface_.Interface_;
import kr.lim.project.interface_.NameInterface;

public class Main {

	// class, interface, abstract class
	// interface - implements (상속을 여러개 받을 수 있다.) [다중 상속]
	//           - interface 끼리 상속이 가능하다. (extends)
	// abstract class - extends
	// implements
	// design pattern ->
	//					singleton pattern
	
	public static void main(String[] args) {
		
		// 정적메모리 -> static
		
		int a = 10; // stack -> 10 -> a (메모리 주소의 이름)
		
		// a = 10 ->
		
		// 생성자를 호출하면 객체가 heap(동적 메모리) 영역안에 생성이 된다. 
		// heap 영역안에 생성을 했다.
				
		Rectangle r1 = new Rectangle(15, 5);
		Rectangle r2 = new Rectangle(15, 5);
		
		r1.setX(100);
		
		System.out.println("r1의 x :" + r1.getX());
		System.out.println("r2의 x :" + r2.getX());
		//System.out.println(r1.equals(r2));
		
		SingletonRectangle2 sr2 = SingletonRectangle2.getInstance();
		SingletonRectangle2 sr1 = SingletonRectangle2.getInstance(10, 15);
		
		System.out.println("sr1의 x :" + sr1.getX());
		System.out.println("sr2의 x :" + sr2.getX());
		sr1.setX(100);
		System.out.println("sr1의 x :" + sr1.getX());
		System.out.println("sr2의 x :" + sr2.getX());
		//System.out.println(sr1.equals(sr2));
		//System.out.println(i1.getName());
	}
}