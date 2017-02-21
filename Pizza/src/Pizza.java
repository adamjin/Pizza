
public class Pizza {

	private int Row; //R
	private int Column; //C
	private int minSliceLength; //2L
	private int maxSliceLength; //H
	private char[][] cell;
	public int getRow() {
		return Row;
	}
	public void setRow(int row) {
		Row = row;
	}
	public int getColumn() {
		return Column;
	}
	public void setColumn(int column) {
		Column = column;
	}
	public int getMinSliceLength() {
		return minSliceLength;
	}
	public void setMinSliceLength(int minSliceLength) {
		this.minSliceLength = minSliceLength;
	}
	public int getMaxSliceLength() {
		return maxSliceLength;
	}
	public void setMaxSliceLength(int maxSliceLength) {
		this.maxSliceLength = maxSliceLength;
	}
	public char[][] getCell() {
		return cell;
	}
	public void setCell(char[][] cell) {
		this.cell = cell;
	}

}
