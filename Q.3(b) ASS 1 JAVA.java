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
		System.out.println("Enter the number of lines: ");
		int x=scan.nextInt();
		scan.close();
		int n=x;
		for(int i=1;i<=x;i++){
		    
		    for(int z=n-1;z>0;z--)
		        {
		           System.out.print(" "); 
		        }
		        n=n-1;
		    for(int j=1;j<=i;j++){
		        
		        System.out.print("* ");
		    }
		    System.out.print("\n");
		}
	}
}


