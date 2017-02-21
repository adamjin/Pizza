
public class Result {

	private int numSlice; //number of slices
	
	private Slice[] slices; //representation of the slice

	public int getNumSlice() {
		return numSlice;
	}

	public void setNumSlice(int numSlice) {
		this.numSlice = numSlice;
	}

	public Slice[] getSlices() {
		return slices;
	}

	public void setSlices(int[][] slice) {
		this.slices = slices;
	}
	
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append(this.numSlice).append("\\n");
		for(Slice slice : this.getSlices()){
			str.append(slice.getCoordinateLeftUp()[0]).append(" ")
			.append(slice.getCoordinateLeftUp()[1]).append(" ")
			.append(slice.getCoordinateRightDown()[0]).append(" ")
			.append(slice.getCoordinateRightDown()[1]).append("\\n");
		}
		return str.toString();
	}
}
