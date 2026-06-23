package ch03.sec02;


import java.util.*;
import java.io.*;

public class Quiz {
	public static void main(String[] args) {
		/*
		 *퀴즈 : 파일첨부 서버 저장 상황
		 */
		
		String filename = "내사진.jpgee";
		String newFilename = "";
		
		//--------------------------------
		System.out.println(filename.substring(filename.indexOf(".")));
		
		//-----------------------------------
		
		String[] file = filename.split("\\.");
		
		
		newFilename = String.valueOf(System.currentTimeMillis()) + "." + file[1]; 
		
		
		
		System.out.println(newFilename);
	}
}
