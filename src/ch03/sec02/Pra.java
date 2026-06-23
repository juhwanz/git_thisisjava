package ch03.sec02;

import java.util.*;
import java.io.*;

public class Pra {
	public static void main(String[] args) {
		// ----------1 ------------------
		int max = Integer.MIN_VALUE;
		int[] array = {1,5,3,8,2};
		for(int i = 0; i<array.length; i++) {
			max = Math.max(max, array[i]);
		}
		
		System.out.println(max);
		
		//------------2--------------------
		int[][] array2 = { {95,86}, {83, 92 ,96}, {78,83,93,87,88} };
		
		int sum = 0;
		double avg = 0;
		int t = 0;
		for(int i = 0; i<array2.length; i++) {
			for(int j = 0; j<array2[i].length; j++) {
				sum+= array2[i][j];
				t++;
			}
		}
		
		avg = (double)sum / t;
		System.out.println(sum);
		System.out.println(avg);
		
		//--------------3------------
		Scanner sc = new Scanner(System.in);
		int studentNum = 0;
		
		System.out.println("--------------------------------------------------------");
		System.out.println("1.학생수  |  2. 점수입력 |  3. 점수리스트 |  4. 분석  |  5. 종료");
		System.out.println("--------------------------------------------------------");
		
		System.out.print("선택>");
		int n = sc.nextInt();
		
		if(n == 1) {
			System.out.print("학생수>");
			studentNum = sc.nextInt();
			
		}
		
		int[] arr = new int[studentNum];
		int total = 0;
		int max2 = 0;
		while(true) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1.학생수  |  2. 점수입력 |  3. 점수리스트 |  4. 분석  |  5. 종료");
			System.out.println("--------------------------------------------------------");
			
			System.out.print("선택>");
			n = sc.nextInt();
			
			
			if(n==2) {
				for(int i = 0; i<arr.length; i++) {
					System.out.print("[" + i + "]");
					arr[i] = sc.nextInt();
					total += arr[i];
					max2 = Math.max(max2, arr[i]);
				}
			}
			
			if(n == 3) {
				for(int a : arr) {
					System.out.println(a); 
				}
			}
			
			if( n == 4) {
				System.out.println("최고 점수 :"+max2);
				System.out.printf("평균 : %.1f", (double) total / studentNum );;
				System.out.println();
			}
			if( n == 5) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		}
		
		
	}
}
