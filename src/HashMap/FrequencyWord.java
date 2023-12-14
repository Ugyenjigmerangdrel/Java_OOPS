package HashMap;
import java.util.*;

public class FrequencyWord {
	public static void main(String[] args) {
		String line= "hello we hello, hi. my- ab long, hi,,--";
		String nline = line.replaceAll(",|\\.|\\-", "");
		System.out.println(nline);
		String[] words = nline.split(" ");
		
		HashMap<String, Integer> freq = new HashMap<String, Integer>();
		
		for(String w:words) {
			if(freq.get(w) != null) {
				freq.put(w, freq.get(w)+1);
			} else {
				freq.put(w, 1);
			}
		}
		
		
		for(String f:freq.keySet()) {
			System.out.println(f + " = " + freq.get(f));
		}
		
	}
}
