//Write a Java program to 
//remove all the occurrences of a given  element from the list.

package Day1;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		List<Integer> numbers=new ArrayList<Integer>();
		System.out.println("how many element you want to add");
		int listSize=sc.nextInt();
		for (int i = 0; i < listSize; i++) {
			System.out.println("enter the element at index :"+ i);
			numbers.add(sc.nextInt());
		}
		System.out.println("enter the remove element");
		int target=sc.nextInt();
		System.out.println("List before removing element :"+ numbers);
		
		List<Integer> remEle= RemoveElement(numbers,target);
		System.out.println("List After Removing element"+ remEle);

	}
	public static List<Integer> RemoveElement(List<Integer> list,int target){
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)==target) {
				list.remove(i);
			}
		}
		return list;
	}

}
