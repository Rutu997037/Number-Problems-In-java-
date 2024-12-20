//Write a program to double a given number.
package Numbers;

import java.util.Scanner;

public class Double {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int Num=sc.nextInt();
		System.out.println(Num+Num);
	}
}
