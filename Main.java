/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i<=n){
            int space = 1;
            while (space <= n-i){
                System.out.print(' ');
                space = space +1;
                
            }
            int j = 1;
            int p = j;
            while (j <= i)
            {
                
                System.out.print(p);
                p++;
                j++;
                    
            }
            System.out.println();
            i++;
            
        }
		
	}
}
