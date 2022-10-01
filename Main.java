package kr.lim.project;

import kr.lim.project.abstract_.XY;
import kr.lim.project.interface_.AllInterface;
import kr.lim.project.interface_.Interface_;
import kr.lim.project.interface_.NameInterface;

public class Main {

	// class, interface, abstract class
	// interface - implements (����� ������ ���� �� �ִ�.) [���� ���]
	//           - interface ���� ����� �����ϴ�. (extends)
	// abstract class - extends
	// implements
	// design pattern ->
	//					singleton pattern
	
	public static void main(String[] args) {
		
		// �����޸� -> static
		
		int a = 10; // stack -> 10 -> a (�޸� �ּ��� �̸�)
		
		// a = 10 ->
		
		// �����ڸ� ȣ���ϸ� ��ü�� heap(���� �޸�) �����ȿ� ������ �ȴ�. 
		// heap �����ȿ� ������ �ߴ�.
				
		Rectangle r1 = new Rectangle(15, 5);
		Rectangle r2 = new Rectangle(15, 5);
		
		r1.setX(100);
		
		System.out.println("r1�� x :" + r1.getX());
		System.out.println("r2�� x :" + r2.getX());
		//System.out.println(r1.equals(r2));
		
		SingletonRectangle2 sr2 = SingletonRectangle2.getInstance();
		SingletonRectangle2 sr1 = SingletonRectangle2.getInstance(10, 15);
		
		System.out.println("sr1�� x :" + sr1.getX());
		System.out.println("sr2�� x :" + sr2.getX());
		sr1.setX(100);
		System.out.println("sr1�� x :" + sr1.getX());
		System.out.println("sr2�� x :" + sr2.getX());
		//System.out.println(sr1.equals(sr2));
		//System.out.println(i1.getName());
	}
}