package kr.lim.project.abstract_;

// class �տ� abstract ���̸� �߻� ��ü�� ������ ��
public abstract class XY {
	
	protected int x;
	protected int y;

	// <-- public XY() {}
	public XY() {
	}
	public XY(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("�θ�ü�� �����Ǿ����ϴ�.");
	}
	//getter, setter
	public int getX() {return x;}
	public int getY() {return y;}
	public void setX(int x) {this.x = x;}
	public void setY(int y) {this.y = y;}
}
