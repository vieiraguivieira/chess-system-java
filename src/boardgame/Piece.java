package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // por padrao j� vem nulo, s� enfatizando didaticamente
	}

	protected Board getBoard() {
		return board;
	}

		
}
