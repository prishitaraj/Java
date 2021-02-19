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
		System.out.print("Enter the number:");
		Scanner scan= new Scanner(System.in);
		int x= scan.nextInt();
		scan.close();
		
		for(int i=1;i<=10;i++)
		{
		   	System.out.println(x+" x "+i+" = "+x*i); 
		}
	}
}
