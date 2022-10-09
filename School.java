package kr.test.obj;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class School {
	
	// 학교 이름 저장할 멤버 변수
	private String name;
	
	// 학교 타입을 지정하는 멤버 변수
	private SchoolType type;
	
	// 학생들 저장할 리스트
	private Set<Person> students;
	
	public School(String name, SchoolType type) {
		this.name = name;
		this.type = type;
		students = new HashSet();
	}
		
	// 예외를 던져주는 throw
	
	public boolean addPerson(Person person) throws OverlapException {
		if(students.contains(person)) {
			throw new OverlapException(person.getName() + "이 중복됩니다.");
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
