package kr.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import kr.test.obj.Person;

public class Main {
	
	public static void main(String[] args) {
		
	// ArrayList �� List(interface)�� ������ ����ü
		List<Integer> list1 = new ArrayList();
		
		/*list1.add(5);  // 0 
		list1.add(10); // 1
		list1.add(15); // 2
		list1.add(20); // 3
		
		for(int i = 0; i < lis1t.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		//foreach -> ���ҵ��� ��ȸ�ϴ� for��
		for(Integer i : list1) {
			System.out.println(i);
		}
		*/
		// ������ �ð����� 
		for(int i = 0; i < 100; i++)
			list1.add(i);
		long start = System.nanoTime();
		// �ð� üũ
		list1.remove(2);
		long end = System.nanoTime();
		
		System.out.println();
		System.out.println("�ҿ�ð� : " + (end - start) +"ns");
		System.out.println(list1);
		
		List<Integer> list2 = new LinkedList();
		
		for(int i = 0; i < 100; i++)
			list2.add(i);
		
		start = System.nanoTime();
		// �ð� üũ
		list2.remove(2);
		end = System.nanoTime();
	
		System.out.println();
		System.out.println("�ҿ�ð� : " + (end - start) +"ns");
		System.out.println(list2);
	}

}
