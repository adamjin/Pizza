
public class Slice {

	private int numCells;
	private int[] coordinateLeftUp;
	private int[] coordinateRightDown;
	private int leftover;
	private int m;//number of rows of the slice
	private int n;//number of columns of the slice
	public int getNumCells() {
		return numCells;
	}
	public void setNumCells(int numCells) {
		this.numCells = numCells;
	}
	public int[] getCoordinateLeftUp() {
		return coordinateLeftUp;
	}
	public void setCoordinateLeftUp(int[] coordinateLeftUp) {
		this.coordinateLeftUp = coordinateLeftUp;
	}
	public int[] getCoordinateRightDown() {
		return coordinateRightDown;
	}
	public void setCoordinateRightDown(int[] coordinateRightDown) {
		this.coordinateRightDown = coordinateRightDown;
	}
	public int getLeftover() {
		return leftover;
	}
	public void setLeftover(int leftover) {
		this.leftover = leftover;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	
}
