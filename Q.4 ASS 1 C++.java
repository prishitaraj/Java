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
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int x= scan.nextInt();
		System.out.println("Enter 2nd number:");
		int y= scan.nextInt();
		scan.close();
	    
	    int z=x*y;
	    System.out.println("Multiplication of the two numbers = "+z);
		
	}
}
