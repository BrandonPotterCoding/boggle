import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Board {
	
	private char[][] board;
	
	public Board() {
		board=new char[5][5];
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
				if (board[i][j]=='Q'||board[i][j]=='q')
					System.out.print("Qu"+"\t");
				else
					System.out.print(board[i][j]+"\t");
			}
			System.out.println("\n");
			
		}
	}

	public boolean findWord(String word) {
		word = word.toUpperCase().replaceAll("QU", "Q");
		System.out.println(word);
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if(dfs(i, j, 0, word))
					return true;
			}
		}
		return false;
	}

	private boolean dfs(int i, int j, int wordIndex, String word) {
		if(i < 0 || i >= board.length || j < 0 || j >= board[i].length)
			return false;
		if(board[i][j]!=word.charAt(wordIndex))
			return false;
		if(wordIndex == word.length() - 1)
			return true;
		board[i][j] = '*';

		boolean foundAnswer = dfs(i-1, j-1, wordIndex+1, word)||
				dfs(i, j-1, wordIndex+1, word) ||
				dfs(i+1, j-1, wordIndex+1, word) ||
				dfs(i-1, j, wordIndex+1, word) ||
				dfs(i, j, wordIndex+1, word) ||
				dfs(i+1, j, wordIndex+1, word) ||
				dfs(i-1, j+1, wordIndex+1, word) ||
				dfs(i, j+1, wordIndex+1, word) ||
				dfs(i+1, j+1, wordIndex+1, word);

		board[i][j] = word.charAt(wordIndex);

		return foundAnswer;
	}


}
