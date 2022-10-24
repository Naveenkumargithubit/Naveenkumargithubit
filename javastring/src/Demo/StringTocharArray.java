package Demo;

import java.util.Arrays;
import java.util.Scanner;

public class StringTocharArray {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter string");
		  String len=sc.nextLine();
	char[]	 g= len.toCharArray();
	System.out.println(Arrays.toString(g));
		
	}

}
