package kr.lim.builder;

public class PersonBuilder {
	private String name;
	private String schoolName;
	private int age;
	private int height;
	private int weight;
	
	public  PersonBuilder() {
		name = "null";
		schoolName = "�б��� �� �� �����ϴ�.";
		age = 1;
		height = 1;
		weight = 1;
	}
	/**
	 * �̸��� �����ϴ� �޼��� �Դϴ�.
	 * @param name StringŸ���̸� null���� �����մϴ�.
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
		if(name == null) throw new PersonBuildException("�̸�");
		return new Person(name, schoolName, age, height, weight);
	}
	
}
