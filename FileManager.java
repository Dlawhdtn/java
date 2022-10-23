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
		if(file == null) throw new FileException("파일이 null 값입니다.");
		try(FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);) {
			
			return br.readLine();
		} catch(Exception e) {
			throw new FileException("파일을 읽을 수 없습니다.");
		}
	}
	
	public void readString() throws FileException {
		if(file == null) throw new FileException("파일이 null 값입니다.");
		
		try(FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);) {
			
			String string = br.readLine();
			while(string != null) {
				System.out.println(string);
				// nextInt();
			}
			
			
		} catch (Exception e) {
			throw new FileException("파일을 읽을 수 없습니다.");
		}
	}
	
	public void writeString(String string) throws FileException {
		if(file == null) throw new FileException("파일이 null 값입니다.");
		
		// FileWriter(file) 파일을 쓰기모드로 엽니다.
		// FileWriter(String) 해당 경로에 있는 파일을 쓰기모드로 엽니다.
		// FileWriter(File, Boolean) true 면 이어서 작성 / false 새로 작성
		try {
			FileWriter fw =  new FileWriter(file); // Writer 상속받은 FileWriter
			BufferedWriter bw = new  BufferedWriter(fw);
			bw.write(string + "\n");
			bw.flush();
			bw.close();
			fw.close();
		} catch (IOException e) {
			// 파일에 \"
			throw new FileException("파일에\"" + string + "\"문자열을 쓸 수 없습니다.");
		}
		
	}	
	
}
