package kr.lim.builder;

public class PersonBuildException extends Exception {
	public PersonBuildException(String type) {
		super(type +"(��)�� �������� �ʾҽ��ϴ�.");
	}
}
