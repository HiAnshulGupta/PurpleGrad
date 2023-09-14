//Write a Java program to 
//find all the occurrences of a given  element from the list.

package Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		

		List<Integer> AllOccurrence = AllOccurrence(num, target);

		System.out.println("Element  occurs at positions: " + AllOccurrence);
	}

	public static List<Integer> AllOccurrence(List<Integer> list, int target) {
		List<Integer> Occu=new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == target) {
				Occu.add(i);
				
			}
		}
		return Occu; 

	}

}
