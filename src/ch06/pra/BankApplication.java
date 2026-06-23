package ch06.pra;

import java.util.*;
import java.io.*;

public class BankApplication {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account[] account = new Account[100];
		
		int idx = 0;
		
		while(true) {
			
			System.out.println("-----------------------------------------------------");
			System.out.println("1.계좌 생성  |  2.계좌목록 |  3.예금 | 4. 출금 | 5. 종료 ");
			System.out.println("-----------------------------------------------------");
			
			System.out.println("선택 > ");
			int n = sc.nextInt();
			
			if(n == 1) {
				System.out.println("-----------------");
				System.out.println("계좌 생성");
				System.out.println("-----------------");
				
				System.out.println("계좌번호:");
				String num = sc.next();
				
				System.out.println("계좌주:");
				String name = sc.next();
				
				System.out.println("초기 입금액:");
				int money = sc.nextInt();
				
				account[idx] = new Account(num,name,money);
				System.out.println("결과: 계좌가 생성되었습니다.");
				idx++;
			}
			if(n == 2) {
				System.out.println("-----------------");
				System.out.println("계좌 목록");
				System.out.println("-----------------");
				for(int i = 0; i<idx; i++) {
					System.out.println(account[i].getAccoutNum()+"\t"+account[i].getAccountName()+"\t"+account[i].getMoney());
				}
			}
			if(n==3) {
				System.out.println("-----------------");
				System.out.println("예금");
				System.out.println("-----------------");
				
				System.out.println("계좌번호:");
				String target = sc.next();
				
				System.out.println("예금액:");
				int plusM = sc.nextInt();
				
				for(int i = 0; i<idx; i++) {
					if(target.equals(account[i].getAccoutNum())) {
						account[i].plusMoney(plusM);
					}
				}
			}
			if( n == 4) {
				System.out.println("-----------------");
				System.out.println("출금");
				System.out.println("-----------------");
				
				System.out.println("계좌번호:");
				String target = sc.next();
				System.out.println("출금액:");
				int minusM = sc.nextInt();
				
				for(int i = 0; i<idx; i++) {
					if(target.equals(account[i].getAccoutNum())) {
						account[i].minusMoney(minusM);
					}
				}
				System.out.println("결과: 출금이 성공되었습니다.");
			}
			if( n == 5) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			
		}
		
	}
}
