package kr.test.obj;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class School {
	
	// �б� �̸� ������ ��� ����
	private String name;
	
	// �б� Ÿ���� �����ϴ� ��� ����
	private SchoolType type;
	
	// �л��� ������ ����Ʈ
	private Set<Person> students;
	
	public School(String name, SchoolType type) {
		this.name = name;
		this.type = type;
		students = new HashSet();
	}
		
	// ���ܸ� �����ִ� throw
	
	public boolean addPerson(Person person) throws OverlapException {
		if(students.contains(person)) {
			throw new OverlapException(person.getName() + "�� �ߺ��˴ϴ�.");
		}
		
		if(type.checkAge(person)) {
			students.add(person);
			return true;
		} else return false;
	}
	
	public void printStudents() {
		System.out.println(name+type.getName());
		for(Person person : students) {
			System.out.println(person.getName() + " " + person.getAge());
		}
	}
	
}
