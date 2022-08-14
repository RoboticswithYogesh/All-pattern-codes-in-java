import java.util.*;
public class Solution {


	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i<=n){
            char p = (char)('A'+i-1);
            int j = 1;
            while (j<=i){
                System.out.print(p);
                j++;
                p = (char)(p + 1);
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
