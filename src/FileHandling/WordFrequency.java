package FileHandling;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class WordFrequency {
	public static void main(String[] args) {
		try {
			FileInputStream fp = new FileInputStream("abc.txt");
			Scanner fr = new Scanner(fp);
			String line;
			String[] words;
			HashMap<String, Integer> freq = new HashMap<String, Integer>();
			
			while(fr.hasNext()) {
				line = fr.nextLine();
				String[] lines = line.split(" ");
				for(String w:lines) {
					if(freq.get(w) != null) {
						freq.put(w, freq.get(w) + 1);
					} else {
						freq.put(w, 1);
					}
				}
			}
			
			for(Entry e:freq.entrySet()) {
				System.out.println(e.getKey()+" " + e.getValue());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
