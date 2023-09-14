//Write a Java Program to sort string array elements based on 
//lowercase and uppercase.

package Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class StringSort {
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("Anshul");
		list.add("ratesh");
		list.add("kshitj");
		list.add("Shubham");
		list.add("Akshay");
		Collections.sort(list);
		System.out.println(list);
		
	}

}

