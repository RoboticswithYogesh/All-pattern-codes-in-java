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
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		
	}

}
