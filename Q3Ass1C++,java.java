/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x= scan.nextInt();
		scan.close();
		
		if(x%2==0)	{
		    System.out.println(x+" is an even number");
		}
		else  {
		    System.out.println(x+" is an odd number");
		}
	}
}
