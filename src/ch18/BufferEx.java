package ch18;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class BufferEx {
	public static void main(String[] args) throws Exception{
		
		//jdk 읽어오는 시간
		long start = System.currentTimeMillis();
		InputStream is = new FileInputStream("");
		while(is.read() != -1) {
			
		}
		long end = System.currentTimeMillis();
		System.out.println("버퍼 미사용 : " + (end - start));
		
		// 보조 스트림
		
		long start2 = System.currentTimeMillis();
		InputStream is2 = new FileInputStream("");
		BufferedInputStream bis = new BufferedInputStream(is2);
		while(is.read() != -1) {
			
		}
		long end2 = System.currentTimeMillis();
		System.out.println("버퍼 사용 : " + (end - start));
	}
}
