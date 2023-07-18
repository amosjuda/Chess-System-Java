package boardgame;

public abstract class Piece {
	// protected = #
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	public Board getBoard() {
		return board;
	}
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		// concrete method using a abstract method - hook methods - hook with subclass, in the case possibleMoves
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
