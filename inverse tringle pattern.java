import java.util.*;
public class Solution {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i<=n){
            int j = 1;
            int p = n+1-i;
            while (j<=i){
                System.out.print(p);
                j++;
                p++;       
            }System.out.println();
            i++;
            
        }
		//Your code goes here
	}
}