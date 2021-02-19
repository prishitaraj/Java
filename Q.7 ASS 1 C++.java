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
		System.out.println("Enter the length of the array");
		Scanner scan=new Scanner(System.in);
		int a[]=new int[30];
		int n=scan.nextInt();
		System.out.println("Enter the numbers of the array");
		for(int i=0;i<n;i++) {
		    a[i]=scan.nextInt();
		}
		
		int g=a[0];
		for(int i=0;i<n;i++) {
		    if(a[i]>g) {
		    g=a[i];
		    }
		}
		System.out.println("greatest element is "+g);
	}
}
