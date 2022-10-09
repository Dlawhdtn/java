package kr.test.obj;

public enum SchoolType {

	ELE("�ʵ��б�", 8, 13),
	MID("���б�", 14, 16),
	HIGH("����б�", 17, 19),
	UNIV("���б�", 20);
	
	private String name; // �̸� ������ ��� ����
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
	
	// Person ��ü�� �ش� Ÿ�Կ� �´� �����ΰ�? true / false
	public boolean checkAge(Person person) {
		return person.getAge() >= minAge || person.getAge() <= maxAge;				
	}
	
}
