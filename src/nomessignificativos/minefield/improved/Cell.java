package nomessignificativos.minefield.improved;

public class Cell {

	private int status;

	public Cell(int status) {
		super();
		this.status = status;
	}

	public boolean isFlagged() {
		if (status == 4) {
			return true;
		}
		return false;
	}

	public int getStatus() {
		return status;
	}
	
}
