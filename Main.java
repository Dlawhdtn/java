package kr.lim.test;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		// �迭
		// ������ ���� or ��ü�� ����
		int a = 5;
		int b = 10;
		int c = 15;
		
		// ����Ÿ�� �����̸�;
		// int[] name = new int[3]; // name -> [int][int][int]
		// name[0] = 5;
		// name[1] = 10;
		// name[2] = 15;
		int[] name = { 5, 10, 15, 20, 25, 30 }; // name -> [5][10][15]
		// 1���� �迭
		int[] name1 = new int[3]; // name1 -> [][][]
		name1 [0] = 5;
		name1 [1] = 10;
		name1 [2] = 15;
		
		// ������ �迭
		int[][] name2 = new int [5][3]; // name2 -> [int[3] [int[3]] [int[3]] [int[3]] [int[3]]
		name2 [0][1] = 5; // ù��° ���� ù��° ���� 5
		name2 [1][2] = 10; // �ι�° ���� �ι�° ���� 10
		name2 [2][3] = 15; // ����° ���� ����° ���� 15
		
		
		// for(int i = 0; i < ?; i++) {}
		// name �迭���� ���Ҹ� �ϳ��ϳ� ����ϰ����.
		// �ش� ��ü ���� object �����ϰ���� ��,'.' ����
		for(int i = 0; i < name.length; i++) {
			// name[0] -> �迭���� 0��° ������ ��
			// name[0] = 10;
			System.out.println(name[" + i + "] = + name[i]);
		}
	} 
}
