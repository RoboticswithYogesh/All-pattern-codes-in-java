import java.util.*;
public class Main {
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i<=n){
            int space = 1;
            while (space <=i+1-2){
                System.out.print(' ');
                space++;
            }
            int j = 1;
            while (j<=n){
                System.out.print('*');
                j++;
                
            }System.out.println();
            i++;
        }
		// Write your code here

	}
}
