package subject;

public class Player {
	
    String name;
    String stone; // O, X
    Player(String name, String stone) {
        this.name = name;
        this.stone = stone;
    }
    
    // 돌 두기.
    public void setting(Board board, int row, int col) {
    	board.map[row][col] = stone;
    }
    
}
