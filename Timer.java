package kr.lim;

// abstract class - Thread
// interface - Runnable
/*public class Timer extends Thread {

	private int waitSec;
	
	public Timer(int waitSec) {
		this.waitSec = waitSec;
	}
	
	@Override
	public void run() {
		long start = System.currentTimeMillis();
		while(System.currentTimeMillis() - start < (waitSec * 1000));
		
		System.out.println("�ð��� �ƽ��ϴ�.");
	}
}*/

public class Timer implements Runnable {
	
	private int waitSec;
	
	public Timer(int waitSec) {
		this.waitSec = waitSec;
	}
	
	@Override
	public void run() {
	long start = System.currentTimeMillis();
	while(System.currentTimeMillis() - start < (waitSec * 1000));
		
	System.out.println("�ð��� �ƽ��ϴ�.");
	}
}
