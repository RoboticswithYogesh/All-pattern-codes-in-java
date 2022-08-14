import java.util.*;
public class Solution {


	public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i<=n){
            int j = 1;
            int p = n-i+1;
            while (j <= n-i+1){
                System.out.print(p);
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
