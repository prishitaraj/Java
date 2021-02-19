/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n=scan.nextInt();
		System.out.println("Enter the marks of "+n+" students");
		int a[]= new int[100];
		for(int i=0;i<n;i++) {
		    a[i]=scan.nextInt();
		}
		scan.close();
		int sum=0, avg=0;
		for(int i=0;i<n;i++) {
		    sum=sum+a[i];
		}
		avg=sum/n;
		
		System.out.println("The sum of the marks is "+sum);
		System.out.println("The avg of the marks is "+avg);
		
	}
}
