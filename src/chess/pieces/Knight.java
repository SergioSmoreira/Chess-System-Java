package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece {

	public Knight(Board board, Color color) {
		super(board, color);
		
	}
	
	@Override
	public String toString() {
	return "N";
     }

	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p == null || p.getColor() != getColor();
	}
	
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0,0);
		
		// Possibilidade jogada 1
				
		p.setValues(position.getRow() -1, position.getColumn() -2 );
		if (getBoard().positionExists(p) && canMove(p) ) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		// Possibilidade jogada 2
				
				p.setValues(position.getRow() -2, position.getColumn() - 1 );
				if (getBoard().positionExists(p) && canMove(p) ) {
					mat[p.getRow()][p.getColumn()] = true;
				}
				
				// Possibilidade jogada 3		
				
				p.setValues(position.getRow() - 2 , position.getColumn() + 1);
				if (getBoard().positionExists(p) && canMove(p) ) {
					mat[p.getRow()][p.getColumn()] = true;
				}

				// Possibilidade jogada 4
						
				p.setValues(position.getRow() - 1 , position.getColumn() + 2);
				if (getBoard().positionExists(p) && canMove(p) ) {
					mat[p.getRow()][p.getColumn()] = true;
				}
				
				// Possibilidade jogada 5		
				
				p.setValues(position.getRow() + 1, position.getColumn() + 2);
				if (getBoard().positionExists(p) && canMove(p) ) {
					mat[p.getRow()][p.getColumn()] = true;
				}
				
				// Possibilidade jogado 6
				
				p.setValues(position.getRow() + 2, position.getColumn() + 1);
				if (getBoard().positionExists(p) && canMove(p) ) {
					mat[p.getRow()][p.getColumn()] = true;
				}
				
				// Possibilidade jogado 7
				
				p.setValues(position.getRow() + 2, position.getColumn() - 1);
				if (getBoard().positionExists(p) && canMove(p) ) {
					mat[p.getRow()][p.getColumn()] = true;
				}
				
				// Possibilidade jogado 8
				
				p.setValues(position.getRow() + 1, position.getColumn() - 2);
				if (getBoard().positionExists(p) && canMove(p) ) {
					mat[p.getRow()][p.getColumn()] = true;
				}
				
		return mat;
	} 
}