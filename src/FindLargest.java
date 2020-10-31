import java.util.ArrayList;

public class FindLargest {
	public static Comparable findLargest(Comparable[] arr) {
		if (arr.length == 0) 
			return null;
		ArrayList <Comparable> copyArray = new ArrayList <Comparable> ();
		
		for (int i = 0; i < arr.length; i ++) {
			copyArray.add(i, arr[i]);
		}
		
		int i = 0;
		final int end = copyArray.size() - 1;
		while (i < end) {
			if (copyArray.get(0).compareTo(copyArray.get(1)) < 0) {
				copyArray.remove(0);
			}
			else if (copyArray.get(0).compareTo(copyArray.get(1)) > 0) {
				copyArray.remove(1);
			}
			i ++;
		}
		
		return copyArray.get(0);
	}
}
