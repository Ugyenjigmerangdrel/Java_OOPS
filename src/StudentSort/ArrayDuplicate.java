package StudentSort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class ArrayDuplicate {
	public List<Integer> duplicates(int[] a, int n){
		List<Integer> dups = new ArrayList<Integer>();
		HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
		
		for(int i=0; i<n; i++) {
			if(freq.get(a[i]) != null) {
				freq.put(a[i], freq.get(a[i])+1);
			}else {
				freq.put(a[i], 1);
			}
		}
		
		for(Entry f:freq.entrySet()) {
			if((int)(f.getValue()) >= 2) {
				dups.add((Integer)(f.getKey()));
			}
		}
	}
}
