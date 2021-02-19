/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int l=20,u=30;
		char a;
		for(int i=l;i<=u;i++){
		    int n=i;
		    int flag=0;
		    for(int j=2;j<n/2;j++){
		        if(n%j==0){
		            System.out.println(n+" is not a prime number");
		            flag=1;
		            break;
		        }
		    }
		    if(flag==0){
		            System.out.println(n+" is a prime number");
		    
		    }
		    
		}
	}
}
