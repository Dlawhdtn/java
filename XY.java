package kr.lim.project.abstract_;

// class 앞에 abstract 붙이면 추상 객체로 생성이 됨
public abstract class XY {
	
	protected int x;
	protected int y;

	// <-- public XY() {}
	public XY() {
	}
	public XY(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("부모객체가 생성되었습니다.");
	}
	//getter, setter
	public int getX() {return x;}
	public int getY() {return y;}
	public void setX(int x) {this.x = x;}
	public void setY(int y) {this.y = y;}
}
