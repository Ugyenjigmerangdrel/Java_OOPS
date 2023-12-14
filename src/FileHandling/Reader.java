package FileHandling;
import java.io.*;
import java.util.*;

public class Reader {
	public static void main(String[] args) {
		try {
			FileInputStream fp = new FileInputStream("abc.txt");
			Scanner bf = new Scanner(fp);
			
			while(bf.hasNext()) {
				System.out.println(bf.nextLine());
			}
			
			FileWriter fo = new FileWriter("abcd.txt");
			BufferedWriter fw = new BufferedWriter(fo);
			
			fw.write("Hello");
			fw.newLine();
			fw.write("Hi");
			
			fw.close();
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
