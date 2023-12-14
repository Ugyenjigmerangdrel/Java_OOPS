package FileHandling;
import java.io.*;

public class FileWriting {
	public static void main(String[] args) {
		try {
			BufferedWriter ow = new BufferedWriter(new FileWriter("w.txt"));
			String line1 = "hell yeah";
			ow.write(line1);
			ow.newLine();
			ow.write("We need to close ow");
			ow.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
