package kr.lim.project;

import kr.lim.project.interface_.Interface_;
import kr.lim.project.interface_.NameInterface;

public class Triangle implements Interface_,NameInterface{

	// ��ü����
	// - ��������� Ŭ���� ���ο����� ���ٰ����ϴ�. (must private)
	
	// private - ���ο����� ����
	// public - ��ΰ� ����
	// (default) - ���� ��Ű�� ����
	// protected - ��Ӱ��踸 ����
	private int x;
	private int y;
	
	// ���������� ��ü�̸�(�Ű�����) {�ڵ�}
	// �����ε�
	public Triangle() {
		System.out.println("�Ű������� ���� �簢���� �����Ǿ����ϴ�.");
	}
	
	public Triangle(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("�Ű������� �ִ� �簢���� �����Ǿ����ϴ�.");
	}
	
	// setter, getter (���� Ȥ�� ������ �� �ִ� ����� ����ϴ� �Լ�[function, method]
	//   ��>�����ڰ� �ʿ��ϴ� ������ ��쿡�� ���
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	// ���������� ��ȯŸ�� �̸�(�Ű�����) {�ڵ�;}
	//{
	//	x = ��;
	//	?? ��ȯ�� ����.
	//}
	// 15 -> stack ���� ���� -> number��� �̸����� ���� �����ϰ� �Ѵ�.
	public void setX(int x) {
		this.x = x;
	}

	public void setX() {
		this.x = 1;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	// @Override
	// ��ӹ��� ��ü���� �θ�ü�� �޼��带 ������ �� ��,
	@Override
	public int getArea() {
		return x * y / 2;
	}

	@Override
	public String getName() { 
		return "�ﰢ��";
	}
}