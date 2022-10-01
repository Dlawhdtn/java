package kr.lim.project;

import kr.lim.project.abstract_.XY;
import kr.lim.project.interface_.AllInterface;

public class SingletonRectangle2 extends XY implements AllInterface {

	// 객체지향
	// - 멤버변수는 클래스 내부에서만 접근가능하다. (must private)
	
	// private - 내부에서만 접근
	// public - 모두가 접근
	// (default) - 같은 패키지 접근
	// protected - 상속관계만 접근
	// 접근제어자 객체이름(매개변수) {코드}
	// 오버로딩
	
	private static SingletonRectangle2 instance;
	
	public static SingletonRectangle2 getInstance() {
		if(instance == null) {
			// private -> 내부접근
			instance = new SingletonRectangle2();
		}
		
		//-> 무조건 값이 있는 상태
		return instance;
	}
	public static SingletonRectangle2 getInstance(int x, int y) {
		if(instance == null) {
			// private -> 내부접근
			instance = new SingletonRectangle2(x,y);
		}
		return instance;
	}
	
	public SingletonRectangle2() {
		super();
		System.out.println("매개변수가 없는 사각형이 생성되었습니다.");
	}
	
	private int x;
	
	// this -> 자신의 객체
	// super -> 부모 객체
	public SingletonRectangle2(int x, int y) {
		super(x, y);
		System.out.println("매개변수가 있는 사각형이 생성되었습니다.");
	}
	
	// setter, getter (설정 혹은 가져갈 수 있는 기능을 담당하는 함수[function, method]
	//   ㄴ>개발자가 필요하다 느끼는 경우에만 사용

	// 접근제어자 반환타입 이름(매개변수) {코드;}
	//{
	//	x = 값;
	//	?? 반환값 없음.
	//}
	// 15 -> stack 영역 생성 -> number라는 이름으로 접근 가능하게 한다.	
	// @Override
	// 상속받은 객체에서 부모객체의 메서드를 재정의 할 때,
	@Override
	public int getArea() {
		return x * y;
	}

	@Override
	public String getName() {
		return "사각형";
	}
}