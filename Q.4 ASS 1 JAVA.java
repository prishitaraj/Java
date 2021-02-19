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
		
		int sum=0;
		while(x>0)
		{
		    sum=sum+x%10;
		    x=x/10;
		}
		    System.out.println(sum);
		
	}
}
