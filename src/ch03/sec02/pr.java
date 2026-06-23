package ch03.sec02;

import java.util.*;

public class pr {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i<=100; i++) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		
		System.out.println(sum);
		
		//-----------------------------
		
		while(true) {
			int a = (int)(Math.random()*6) +1;
			int b = (int)(Math.random()*6) +1;
			if( (a+b) == 5) {
				
				break;
			}
		}
		
		//------------------------------------
		
		for(int x = 1; x<11; x++) {
			for(int y=1; y<11; y++) {
				if( (4*x + 5*y) == 60) {
					System.out.println( "(" + x + ", " + y + ")" );
					
				}
			}
		}
		
		//------------------------------------
		
		for(int i = 1; i<6; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// ------------------------------
		Scanner sc = new Scanner(System.in);
		int total = 0;
		while(true) {
			System.out.println("------------------------------------");
			System.out.println("1.예금  |  2. 출금 |  3.잔고 |  4.종료");
			System.out.println("------------------------------------");
			System.out.println("선택> " );
			int n = sc.nextInt();
			if(n ==1) {
				System.out.println("예금액>");
				int t = sc.nextInt();
				total += t;
			}
			
			else if(n==2) {
				System.out.println("출금액>");
				int t = sc.nextInt();
				total -= t;
			}
			else if(n==3) {
				System.out.println("잔고>" + total);
			}
			else {
				break;
			}
		}
	}
}
