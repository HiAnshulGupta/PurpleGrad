//Write program to swap characters in a String

package Day1;

import java.io.CharArrayReader;
import java.util.Scanner;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("write anything ");
		String s=sc.next();
		System.out.println("which index you want to swap");
		int index1=sc.nextInt();
		int index2=sc.nextInt();
		
		System.out.println("Original String :"+" "+ s);
		
		String swapString= SwapString(s,index1,index2);
		System.out.println("After Swaping"+" "+ swapString);
		
	}
	public static String SwapString(String s,int index1,int index2) {
		char[] CharArray=s.toCharArray();
		
		char temp=CharArray[index1];
		CharArray[index1]=CharArray[index2];
		CharArray[index2]=temp;
				
		return new String(CharArray);
	}

}
