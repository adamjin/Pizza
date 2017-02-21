import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileProcess {
	
	public static void main(String[] args) {
		FileProcess process = new FileProcess();
		process.readInputFile("dataset/example.in");
	}
	public Pizza readInputFile(String path){
		File file = new File(path);
		String readLine = "";
		int count = 0;
		Pizza pizza = null;
		List<String> list = new ArrayList<>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			while((readLine=reader.readLine())!=null){
				if(count==0){
					count++;
					String[] metaData = readLine.split(" ");
					pizza = new Pizza(Integer.parseInt(metaData[0]), Integer.parseInt(metaData[1]), Integer.parseInt(metaData[2]), Integer.parseInt(metaData[3]), null);
				}else{
					list.add(readLine);
				}
			}
			char[][] cells = new char[list.size()][];
			count=0;
			for(String row:list){
				cells[count++]= row.toCharArray();
			}
			pizza.setCell(cells);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//pizza.setCell
		return pizza;
	}
	
	public File writeOutputFile(Result result){
		//impl
		return null;
	}
}
