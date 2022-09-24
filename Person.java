package kr.lim.test.entity;

public class Person {
	// 이름(문자열), 나이(정수)
	private String name; // 멤버(객체) 변수
	public int age;
	
	// 생성자
	// public Person() {} <-- 다른 생성자가 생성이 되면 삭제 됨
	// 접근지시자 객체이름(매개변수) {}
	
	// 지역변수 -> 지역변수의 우선순위가 가장 높다.
	
	// 생성자 오버로딩
	// 1살  시작 ( 나이를 입력하지 않은 경우 = 나이 기본값 1)
	public Person() {
		name = "이름없음";
		age = 1;
	}
	
	public Person(String name) {
		this.name = name;
		age = 1;
	}
	public Person(String name, int age) {
		// a = "임종수";
		// b = 22;
		// this 객체 자기 자신
		this.name = name;
		this.age = age;
	}
	// public - 전체공개
	// private - 내부에서만 공개
	// (default) - 같은 패키지 내에서만 공개
	// protected - 상속 관계에서만 공개
	
	// 매서드, 함수
	// 반환타입 매서드명(매개변수) {}
	// 시작 단어는 동사로 시작한다.
	// 첫글자 소문자 시작 이어지는 단어 대문자 시작
	//getter - 내부에 private 선언된 변수를 외부에서 메서드를 통해 가져가는 형식
	
	public String getName() {
		return name;
	}
	
	// int, long, double, short, byte, String, float
	// setter - 내부에 private 선언된 변수를 외부에서 메서드를 통해 설정하는 형식
	public void setName(String name) {
		this.name = name;
	}
	
	public void getAge(int age) {
		if(age >= 15) this.age = age;
	}
	
	// 이름과 나이를 출력하는 메서드
	public void printInfo() {
		// 문자열 + 값 = 문자열 묶여서 리턴
		// "나이"+15 => 나이15 
		// 이름 : (name값) 나이 : (age값)
		System.out.println("이름 : "+name+" 나이 : "+age);
	}
	
	//나이를 한 살 증가시키는 메서드
	public void addAge() {
		age++; // age + 1
	}
}





