package FileHandling;

import java.io.*;

public class Store{
	public static void main(String[] args) {
		try {
			Student s = new Student("Ugyen", 12);
			FileOutputStream fp = new FileOutputStream("adc.txt");
			ObjectOutputStream os = new ObjectOutputStream(fp);
			os.writeObject(s);
			os.close();
			
			FileInputStream f = new FileInputStream("adc.txt");
			ObjectInputStream oi = new ObjectInputStream(f);
			
			Student st = (Student)(oi.readObject());
			System.out.print(st);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
