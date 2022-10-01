package kr.lim.project;

import kr.lim.project.abstract_.XY;
import kr.lim.project.interface_.AllInterface;

public class SingletonRectangle2 extends XY implements AllInterface {

	// ��ü����
	// - ��������� Ŭ���� ���ο����� ���ٰ����ϴ�. (must private)
	
	// private - ���ο����� ����
	// public - ��ΰ� ����
	// (default) - ���� ��Ű�� ����
	// protected - ��Ӱ��踸 ����
	// ���������� ��ü�̸�(�Ű�����) {�ڵ�}
	// �����ε�
	
	private static SingletonRectangle2 instance;
	
	public static SingletonRectangle2 getInstance() {
		if(instance == null) {
			// private -> ��������
			instance = new SingletonRectangle2();
		}
		
		//-> ������ ���� �ִ� ����
		return instance;
	}
	public static SingletonRectangle2 getInstance(int x, int y) {
		if(instance == null) {
			// private -> ��������
			instance = new SingletonRectangle2(x,y);
		}
		return instance;
	}
	
	public SingletonRectangle2() {
		super();
		System.out.println("�Ű������� ���� �簢���� �����Ǿ����ϴ�.");
	}
	
	private int x;
	
	// this -> �ڽ��� ��ü
	// super -> �θ� ��ü
	public SingletonRectangle2(int x, int y) {
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