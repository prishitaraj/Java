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
		System.out.println("Enter a number: ");
		int x=scan.nextInt();
		scan.close();
		int a[]=new int[100];
		int i=0;
		while(x>0){
		    a[i]=x%2;
		    i+=1;
		    x=x/2;
		}
		for(int j=i-1;j>=0;j--){
		    System.out.print(a[j]);
		}
	}
}
