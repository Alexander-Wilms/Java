import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

	public static void main(String[] args) {
		String content = "Lorem ipsom dolor sit amet\n";

		FileWriter fw;
		BufferedWriter bw;
		
		try {
			fw = new FileWriter("test.txt");
			bw = new BufferedWriter(fw);
			bw.write(content);	
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
			
	}

}
