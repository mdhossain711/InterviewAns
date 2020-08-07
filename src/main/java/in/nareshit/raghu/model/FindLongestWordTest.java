package in.nareshit.raghu.model;

import java.util.Arrays;
import java.util.Comparator;

public class FindLongestWordTest {

	public static void main(String[] args) {
		String string = "How the Avocado Become the Fruit of the golbal Trade";
		String s = string.toLowerCase();
		String word[]=s.split(" ");
		String result[] = new String[3];
		Comparator <String> lengthCompare = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o2.length(),o1.length());
			}
		};
		Arrays.sort(word,lengthCompare);
		
		for(int i=0;i<3;i++)
		{
			result[i]="#"+word[i];
		}
		System.out.println(Arrays.toString(result));
	}

}
