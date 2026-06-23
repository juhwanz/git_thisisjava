package ch03.sec02;

public class SolutionMain {
	public static void main(String[] args) {
		Solution s = new Solution();
		int result = s.solution(5000, new int[] {10000, -13000,-4000,-2000,6500,-20000});
		int result2 = s.solution(34151, new int[] {-34152, -40000, -50000});
		System.out.println(result);
		System.out.println(result2);
		
	}
}

class Solution {
	public int solution (int m, int[] ledger) {
		int account = 0;
		
		
		for(int l : ledger) {
			
			int Exaccount = account;
			
			account += l;
			
			if(account < -m) {
				account = Exaccount;
			}
		}
		
		return account;
	}
}
