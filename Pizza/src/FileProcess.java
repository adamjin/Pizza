import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileProcess {
	
	public Pizza readInputFile(String path){
		//impl
		return null;
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
