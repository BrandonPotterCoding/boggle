
public class Checker {
	
	private Board board;
	
	public Checker(Board b) {
		setBoard(b);
	}
	
	public boolean pathFound(String entry) {
		return true;
		//return false;
	}
	public boolean realWord(String entry) {
		return true;
		//return false;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

}
