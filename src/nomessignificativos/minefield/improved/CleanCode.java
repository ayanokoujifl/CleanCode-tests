package nomessignificativos.minefield.improved;

import java.util.ArrayList;

import java.util.List;


public class CleanCode {

	public static List<Cell> gameBoard = new ArrayList<>();

	public static List<Cell> getFlaggedCells() {
		List<Cell> flaggedCells = new ArrayList<>();
		for (Cell cell : gameBoard) {
			if (cell.isFlagged()) {
				flaggedCells.add(cell);
			}
		}
		return flaggedCells;
	}

	public static void main(String[] args) {
		gameBoard.add(new Cell(4));
		gameBoard.add(new Cell(4));
		gameBoard.add(new Cell(1));
		gameBoard.add(new Cell(0));
		gameBoard.add(new Cell(1));
		gameBoard.add(new Cell(4));
		
		getFlaggedCells().stream().forEach(x-> System.out.println(x.getStatus()));
	}
	
}

