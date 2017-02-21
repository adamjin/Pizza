
public class Shape implements Comparable<Shape>{
	private int numRow;
	private int numCol;
	private int prio;
	
	public int getNumRow() {
		return numRow;
	}

	public void setNumRow(int numRow) {
		this.numRow = numRow;
	}

	public int getNumCol() {
		return numCol;
	}

	public void setNumCol(int numCol) {
		this.numCol = numCol;
	}

	public int getPrio() {
		return prio;
	}

	public void setPrio(int prio) {
		this.prio = prio;
	}

	@Override
	public int compareTo(Shape o) {
		// TODO Auto-generated method stub
		//descending order
		return o.prio-this.prio;
	}
}
