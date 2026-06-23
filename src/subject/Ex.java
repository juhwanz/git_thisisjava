package subject;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex {
	/*
	 부동 소수점 오차
	 1. 상품 가격 : 1000.10원, 수수료 : 0.20원 합계는?
	 2. 1천만원 대출, 연이율 3.5% -> 대출 이자는?
	 */
	
	public static void main(String[] args) {
		//--------------------------
		double price = 1000.10;
		double exPrice = 0.20;
		
		double sum = price + exPrice;
		System.out.println(sum);
		//---------------------------
		//BigDecimal
		BigDecimal a = new BigDecimal(0.2);  // X
		System.out.println(a);
		
		BigDecimal b = new BigDecimal("0.2"); // O
		System.out.println(b);
		b.setScale(0, RoundingMode.HALF_UP);
		
		BigDecimal c = new BigDecimal(String.valueOf(price));
		BigDecimal d = new BigDecimal(String.valueOf(exPrice));
		System.out.println(c.add(b));
		//----------------------------
		
		double tax = 100000000;
		double exTax = tax * (35/10);
		System.out.println(tax);
	}
}
