import java.util.*;
public class Solution {


	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i<=n){
            int space = 1;
            while (space <= n-i){
                System.out.print(' ');
                space = space + 1;
                
                
            }
            int star = 1;
            while (star <=i){
                System.out.print('*');
                star++;
            }
            int d = i-1;
            while (d>=1){
                System.out.print('*');
                d = d-1;
                
            }
            System.out.println();
            i++;
            
        }
    
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		
	}

}
