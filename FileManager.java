package kr.lim;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

	private static FileManager instance;
	public static FileManager getInstance() {
		if(instance == null) instance = new FileManager();
		return instance;
	}
	
	private File file;
	private FileManager() {
		file = new File("test.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch(IOException e) {
				file = null;
			}
		}
	}
	
	public String getString() throws FileException{
		if(file == null) throw new FileException("������ null ���Դϴ�.");
		try(FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);) {
			
			return br.readLine();
		} catch(Exception e) {
			throw new FileException("������ ���� �� �����ϴ�.");
		}
	}
	
	public void readString() throws FileException {
		if(file == null) throw new FileException("������ null ���Դϴ�.");
		
		try(FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);) {
			
			String string = br.readLine();
			while(string != null) {
				System.out.println(string);
				// nextInt();
			}
			
			
		} catch (Exception e) {
			throw new FileException("������ ���� �� �����ϴ�.");
		}
	}
	
	public void writeString(String string) throws FileException {
		if(file == null) throw new FileException("������ null ���Դϴ�.");
		
		// FileWriter(file) ������ ������� ���ϴ�.
		// FileWriter(String) �ش� ��ο� �ִ� ������ ������� ���ϴ�.
		// FileWriter(File, Boolean) true �� �̾ �ۼ� / false ���� �ۼ�
		try {
			FileWriter fw =  new FileWriter(file); // Writer ��ӹ��� FileWriter
			BufferedWriter bw = new  BufferedWriter(fw);
			bw.write(string + "\n");
			bw.flush();
			bw.close();
			fw.close();
		} catch (IOException e) {
			// ���Ͽ� \"
			throw new FileException("���Ͽ�\"" + string + "\"���ڿ��� �� �� �����ϴ�.");
		}
		
	}	
	
}
