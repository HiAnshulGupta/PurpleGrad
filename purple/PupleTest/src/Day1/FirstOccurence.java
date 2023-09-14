//Write a Java program to find the first occurrence of a given  element
//from the list.

package Day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FirstOccurence {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("how many element you want to add");
		int ListSize = sc.nextInt();
		for (int i = 0; i < ListSize; i++) {
			System.out.println("enter the number at index" + i);
			num.add(sc.nextInt());
		}
		System.out.println("which number you want to find");
		int target = sc.nextInt();
		

		int firstOccurrenceIndex = findFirstOccurrence(num, target);

		if (firstOccurrenceIndex != -1) {
			System.out.println("First occurrence of " + target + " is at index " + firstOccurrenceIndex);
		} else {
			System.out.println(target + " is not found in the list.");
		}
	}

	public static int findFirstOccurrence(List<Integer> list, int target) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == target) {
				return i; 
			}
		}
		return -1; 
	}

}
