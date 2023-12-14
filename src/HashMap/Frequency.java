package HashMap;

import java.util.HashMap;

public class Frequency {

	public static void main(String[] args) {
		//arr[] = [10, 20, 30, 40, 50]
		try {
			HashMap<Integer,Integer> freqTable = new HashMap<Integer, Integer>();
			int[] arr = {1,1,3,4,2,1,2,2};
			
			for(int i:arr) {
				if(freqTable.get(i) != null) {
					freqTable.put(i, freqTable.get(i)+1);
				} else {
					freqTable.put(i, 1);
				}
			}
			
			for(Integer i:freqTable.keySet()) {
				System.out.println(i + " "+freqTable.get(i));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
