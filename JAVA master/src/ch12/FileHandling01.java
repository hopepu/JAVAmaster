package ch12;

import java.io.File;

public class FileHandling01 {
	
	public static void main(String[] args) {
		
		File finfo = new File("C:\\Users\\whdyd\\eclipse-workspace\\JAVAmaster\\JAVA master\\src\\ch12");
		
		if(finfo.exists()) {
			System.out.println("파일의 이름 : " + finfo.getName());
			System.out.println("파일의 경로 : " + finfo.getAbsolutePath());
			System.out.println("파일 쓰기 가능 여부 : " + finfo.canWrite());
			System.out.println("파일 읽기 가능 여부 : " + finfo.canRead());
			System.out.println("파일의 크기 : " + finfo.length());
			
		} else {
			System.out.println("존재하는 파일이 아닙니다.");
		}

	}
}
