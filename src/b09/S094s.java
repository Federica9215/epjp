package b09;

import java.util.ArrayList;



public class S094s {
	


	public static ArrayList<Integer> join(int[] a, int [] b) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int i=0;
		int j=0;
		
		for (;i<=a.length; i++) {
			if(a[i]<b[j]) {
				result.add(a[i]);
			}
			else if (a[i]>b[j]) {
				result.add(b[j]);
				j++;
				i--;
			
			}
			else if (i==a.length) {
				for(;j<b.length;j++) {
					result.add(b[j]);
				}
			}else if (j==b.length) {
				for(;i<a.length;i++) {
					result.add(a[i]);
				}
		}
		}
		return result;

	}

}
