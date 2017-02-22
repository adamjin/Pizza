import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Paths;

public class FileProcess {
	
	public static void main(String[] args) {
		FileProcess process = new FileProcess();
		process.readFromList(process.readInputFile("dataset/big.in"));
//		List<Integer[]> list = CutPizza.findFactors(6);
//		for(Integer[] in: list){
//			for(int i:in)
//				System.out.print(i + " ");
//			System.out.println();
//		}
	}
	public List<String> readInputFile(String path){
		File file = new File(path);
		String readLine = "";
		List<String> list = new ArrayList<>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			while((readLine=reader.readLine())!=null){
					list.add(readLine);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	public Pizza readFromList(List<String> list){
		String[] metaData = list.get(0).split(" ");
		Pizza pizza = new Pizza(Integer.parseInt(metaData[0]), Integer.parseInt(metaData[1]), Integer.parseInt(metaData[2]), Integer.parseInt(metaData[3]), null);
		char[][] cells = new char[list.size()-1][];
		int count = 0;
		for(String lines: list.subList(1, list.size())){
			cells[count++]= lines.toCharArray();
		}
		pizza.setCell(cells);
		System.out.println("Columns "+pizza.getColumn() +" Rows "+pizza.getRow()+" minSLiceLength "+pizza.getMinSliceLength()+ " maxSliceLength "+pizza.getMaxSliceLength() );
		for(char[] ch: pizza.getCell()){
			for(char c: ch)
			System.out.print(""+c);
			System.out.println();
		}
		return pizza;
	}
	
	public void writeOutputFile(Result result){
		//impl
		String resultString = result.toString();
		writeStringIntoFile(resultString);
	}
	
	private void writeStringIntoFile(String resultString){
		//impl
		byte data[] = resultString.getBytes();
		Path file = Paths.get("./test.out");
		try{
			Files.write(file, data);
		} catch (IOException x) {
		      System.err.println(x);
	    }
	}
}
