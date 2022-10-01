package kr.lim.project;

import kr.lim.project.abstract_.XY;
import kr.lim.project.interface_.AllInterface;

public class Rectangle extends XY implements AllInterface {

	// ��ü����
	// - ��������� Ŭ���� ���ο����� ���ٰ����ϴ�. (must private)
	
	// private - ���ο����� ����
	// public - ��ΰ� ����
	// (default) - ���� ��Ű�� ����
	// protected - ��Ӱ��踸 ����
	// ���������� ��ü�̸�(�Ű�����) {�ڵ�}
	// �����ε�
	
	public Rectangle() {
		super(10, 10);
		System.out.println("�Ű������� ���� �簢���� �����Ǿ����ϴ�.");
	}
	
	private int x;
	
	// this -> �ڽ��� ��ü
	// super -> �θ� ��ü
	public Rectangle(int x, int y) {
		super(x, y);
		System.out.println("�Ű������� �ִ� �簢���� �����Ǿ����ϴ�.");
	}
	
	// setter, getter (���� Ȥ�� ������ �� �ִ� ����� ����ϴ� �Լ�[function, method]
	//   ��>�����ڰ� �ʿ��ϴ� ������ ��쿡�� ���

	// ���������� ��ȯŸ�� �̸�(�Ű�����) {�ڵ�;}
	//{
	//	x = ��;
	//	?? ��ȯ�� ����.
	//}
	// 15 -> stack ���� ���� -> number��� �̸����� ���� �����ϰ� �Ѵ�.	
	// @Override
	// ��ӹ��� ��ü���� �θ�ü�� �޼��带 ������ �� ��,
	@Override
	public int getArea() {
		return x * y;
	}

	@Override
	public String getName() {
		return "�簢��";
	}
}