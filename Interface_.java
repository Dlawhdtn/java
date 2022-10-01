package kr.lim.project.interface_;

public interface Interface_ {

	// 함수(코드제외)만 정의가능 -> 함수 선언만 가능하다.
	
	// 함수 선언의 기본형태
	// 접근제어자 반환타입 이름(매개변수);
	
	// 삼각형과 사각형은 Interface_ 라는 애를 상속 받을 예정.
	// 넓이를 반환하는 함수가 필요함.
	
	// 상속받는 객체(구현체)는 반드시 아래 함수들을 구현해야 할 의무가 생긴다.
	public int getArea();

}
