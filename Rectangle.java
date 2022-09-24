package kr.lim.test.practice;

public class Rectangle {
	
	private int x, y;
	
	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void printArea() {
		System.out.println("사각형의 넓이는 :"+ (x*y));
	}
	

}
