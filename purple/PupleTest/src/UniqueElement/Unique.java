package UniqueElement;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] input= {3,2,4,3,6,2,8};
		Set<Integer> list=new HashSet<Integer>();
		for(int i=0;i<input.length;i++) {
			list.add(input[i]);
		}
		System.out.println(list);
		
	}

}
