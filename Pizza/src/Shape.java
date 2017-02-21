
public class Shape implements Comparable<Shape>{
	private int numRow;
	private int numCol;
	private int prio;
	
	@Override
	public int compareTo(Shape o) {
		// TODO Auto-generated method stub
		//descending order
		return o.prio-this.prio;
	}
}
