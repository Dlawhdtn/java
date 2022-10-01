/*package kr.lim.project;

import kr.lim.project.abstract_.XY;
import kr.lim.project.interface_.AllInterface;
public class SingletonRectangle extends XY implements AllInterface {

	private static SingletonRectangle instance;
	
	public static SingletonRectangle getInstance() {
		if(instance == null) {
			// private -> 내부접근
			instance = new SingletonRectangle();
		}
		
		//-> 무조건 값이 있는 상태
		return instance;
	}
	public static SingletonRectangle getInstance(int x, int y) {
		if(instance == null) {
			// private -> 내부접근
			instance = new SingletonRectangle();
		}
		

}
*/