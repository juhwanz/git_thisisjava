package subject;

import java.util.*;
import java.io.*;

public class Omok {
	static int[] dx = {-1,-1,0,1,1,1,0,-1}; // 위쪽 방향부터 시계방향.
	static int[] dy = {0,1,1,1,0,-1,-1,-1};
	
	static Scanner sc = new Scanner(System.in);
	
    public static void main(String[] args) {
    	
        Player user = new Player("사용자", "O");
        Player computer = new Player("컴퓨터", "X");
        Board board = new Board(19);
        play(board, user, computer);
    }
    
    private static void play(Board board, Player user, Player computer) {
        board.print(); // 바둑판 그리기
        
        while(true) {  // 돌 두기. : 열 - 행
        	
        	// 1번 플레이어 입력
        	prepare(user, board);
        	
        	// 2번 플레이어 입력
        	prepare(computer, board);
        }
    }
    
    public static void prepare(Player player, Board board) {
    	System.out.println();
    	System.out.print(">");
    	String str = sc.nextLine();
    	int col = str.split(" ")[0].charAt(0)-65;
    	int row = Integer.parseInt(str.split(" ")[1]);
    	
    	player.setting(board, row, col);
    	board.print();
    	
    	
    	if(check(board, player,row, col)) {
    		System.err.println();
    		System.out.println(player.name +" :  승리");
    		System.exit(0);
    	}
    }
    
    public static boolean check(Board board, Player player, int row, int col) {
    	
    	for(int dir = 0; dir<8; dir++) {
    		
    		int count1 = 0;
    		int nx1 = row;
    		int ny1 = col;
    		
    		int count2 = 0;
    		int nx2 = row;
    		int ny2 = col;
    		
    		while(true) {
    			
    			nx1 += dx[dir];
    			ny1 += dy[dir];
    			
    			if(nx1 <0 || ny1 <0 || nx1 >= board.size || ny1 >=board.size) {
    				break;
    			}
    			
    			if(!board.map[nx1][ny1].equals(player.stone)) {
    				break;
    			}
    				
    			if(board.map[nx1][ny1].equals(player.stone)) {
    				count1++;
    			}

    		}
    		
    		while(true) {
    			
    			nx2 -= dx[dir];
    			ny2 -= dy[dir];
    			
    			if(nx2 <0 || ny2 <0 || nx2 >= board.size || ny2 >=board.size) {
    				break;
    			}

    			if(!board.map[nx2][ny2].equals(player.stone)) {
    				break;
    			}
    			if(board.map[nx2][ny2].equals(player.stone)) {
    				count2++;
    			}
    			
    		}
    			
    		if(count1 + count2 +1 >= 5) {
				return true;
			}
    		
    		
    		
    	}
    	return false;
    }
}
