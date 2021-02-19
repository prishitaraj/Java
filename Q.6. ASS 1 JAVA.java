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
		int n= scan.nextInt();
		scan.close();
		
		while(n>1)
		{
		  System.out.print(n+",");
		  if(n%2==0){
		      n=n/2;
		  }
		  else{
		      n=3*n+1;
		  }
		}
		System.out.print("1");
	}
}

