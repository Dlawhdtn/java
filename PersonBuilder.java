package kr.lim.builder;

public class PersonBuilder {
	private String name;
	private String schoolName;
	private int age;
	private int height;
	private int weight;
	
	public  PersonBuilder() {
		name = "null";
		schoolName = "학교를 알 수 없습니다.";
		age = 1;
		height = 1;
		weight = 1;
	}
	/**
	 * 이름을 설정하는 메서드 입니다.
	 * @param name String타입이면 null값을 무시합니다.
	 * @return
	 */
	public PersonBuilder setName(String name) {
		if(name != null) this.name = name;
		return this;
	}
	
	public PersonBuilder setSchoolName(String schoolName) {
		this.schoolName = schoolName;
		return this;
	}
	public PersonBuilder setAge(int age) {
		this.age = age;
		return this;
	}
	public PersonBuilder setHeight(int height) {
		this.height =height;
		return this;
	}
	
	
	public PersonBuilder setWeight(int weight) {
		this.weight = weight;
		return this;
	}
	
	public Person build() throws PersonBuildException {
		if(name == null) throw new PersonBuildException("이름");
		return new Person(name, schoolName, age, height, weight);
	}
	
}
