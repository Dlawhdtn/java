package kr.lim;

import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	
	// �����ڷ� â�� ũ�⸦ �޴´�.
	// MyFrame�� �����Ǹ� �ڵ����� â�� �������.
	private long time = 0;
	private JLabel label = null;
	
	public MyFrame(int x , int y) {
		this(x,y,null);
	}
	
	public MyFrame(int x , int y, String title) {
		
		super(title);

		setSize(x, y);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		JPanel panel = new JPanel();
		this.add(panel);
		panel.setBackground(Color.GRAY);
		
		label = new JLabel();
		label.setText("���콺�� Ŭ���غ�����!");
		panel.add(label);
		
		panel.addMouseListener(new MyMouseListener(this));
		try {
			Random random = new Random();
			
			// 10 ~ 20 -> 10, 11, 12 ... 20
			int waitSec = random.nextInt(11) + 3;
			
			Thread.sleep(waitSec * 1000L); //1000L = 1s // n�ʰ� �������
			// �ð� ���
			time = System.currentTimeMillis();
			panel.setBackground(Color.blue);
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void click() {
		long clickedTime = System.currentTimeMillis();
		if(time == 0) {
			
		} else {
			long elaps = clickedTime - time;
			label.setText("����! -"+elaps);
		}
	}
	
}