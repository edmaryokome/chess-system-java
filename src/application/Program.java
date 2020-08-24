package application;

import boardgame.Board;
import chess.ChessMatch;
//import boardgame.Position;

public class Program {

	public static void main(String[] args) {
	
		//System.out.println("Hello Wordl!");
		
	   //Position pos = new Position(3, 5);
	   
	   //System.out.println(pos);
		
		//Board board = new Board(8, 8);
		
		ChessMatch chessMatch = new ChessMatch();
		
		UI.printBoard(chessMatch.gePieces());
		
		

	}

}
