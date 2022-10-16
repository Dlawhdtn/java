package kr.lim.builder;

public class PersonBuildException extends Exception {
	public PersonBuildException(String type) {
		super(type +"(이)가 설정되지 않았습니다.");
	}
}
