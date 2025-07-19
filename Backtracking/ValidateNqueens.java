import java.util.*;
class ValidateNqueens{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] board = new int[n][n];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n ;j++){
				board[i][j] = sc.nextInt();
			}
		}

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(board[i][j] == 1){
					if(!valid(board,i,j)){
						System.out.println("Not a valid board");
						return;
					}
				}
			}
		}

		System.out.println("Valid Board");
	}

	private static boolean valid(int[][] board, int i, int j){
		for(int r = i - 1 ; r > -1 ; r --){
			if(board[r][j] == 1)
				return false;
		}

		for(int r = i-1 , c = j-1; r > -1 && c > -1; r--,c--){
			if(board[r][c] == 1) return false;
		}

		for(int r = i-1, c = j+1; r > -1 && c < board.length; r--,c++){
			if(board[r][c] == 1) return false;
		}

		return true;
	}
}
