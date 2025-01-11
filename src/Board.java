
public class Board {
	
	private String[][] board;
	
	public Board() {
		board=new String[5][5];
	}
	
	public void setBoard(Diebag dice) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				board[i][j]=dice.drawDie().dieSide();
			}
			
		}
	}
	
	public void displayBoard() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(board[i][j]+"\t");
			}
			System.out.println("\n");
			
		}
	}

}
