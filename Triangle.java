package kr.lim.test.practice;
public class Triangle {
	// x �غ�
	// y ����
	private int x, y;
	
	public Triangle(int x, int y) {
		this.x = x;
		this.y = y;		
	}
	
	// static �������� x y���� ���� ������.
	public void printArea() {
		System.out.println("�ﰢ���� ���̴� :"+ (x*y/2));
	}
}