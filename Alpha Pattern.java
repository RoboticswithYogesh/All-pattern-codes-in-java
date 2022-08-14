import java.util.*;
public class Solution {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i<=n){
            int j = 1;
            char jthChar = (char)('A'+ i-1);
            while (j<=i){
                System.out.print(jthChar);
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