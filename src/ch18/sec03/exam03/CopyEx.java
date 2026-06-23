package ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyEx {
	public static void main(String[] args)throws Exception {
		String originalFileName = "C:/Users/fzaca/Downloads/image.png";
		String targetFileName = "C:/Temp/test2.png";
		
		InputStream is = new FileInputStream(originalFileName);
		OutputStream os = new FileOutputStream(targetFileName);
		
		byte[] data = new byte[1024];
		int num = 0;
		while( (num = is.read(data)) != -1) {
			os.write(data, 0, num);
		}
		
		os.flush();
		os.close();
		is.close();
		
		System.out.println("복사가 잘 되었습니다.");
	}
}
