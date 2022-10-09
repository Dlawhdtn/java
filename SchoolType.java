package kr.test.obj;

public enum SchoolType {

	ELE("초등학교", 8, 13),
	MID("중학교", 14, 16),
	HIGH("고등학교", 17, 19),
	UNIV("대학교", 20);
	
	private String name; // 이름 저장할 멤버 변수
	private int minAge;
	private int maxAge;
	
	SchoolType(String name, int minAge) {
		this.name = name;
		this.minAge = minAge;
		maxAge = Integer.MAX_VALUE;
	}
	
	SchoolType(String name, int minAge, int maxAge) {
		this.name = name;
		this.minAge = minAge;
		this.maxAge = maxAge;
	}
	
	public String getName() {
	 return name;	
	}
	
	// Person 객체는 해당 타입에 맞는 나이인가? true / false
	public boolean checkAge(Person person) {
		return person.getAge() >= minAge || person.getAge() <= maxAge;				
	}
	
}
