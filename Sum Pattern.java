import java.util.*;
public class Main {
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i<=n){
            int num = 1;
            int sum = 0;
            while (num<=i){
                sum = sum+num;
                if (num ==i){
                    System.out.print(num);
                }else {
                    System.out.print(num +"+");
                }
                num++;
            }
            System.out.print("="+ sum);
            System.out.println();
            i++;
            
            
            
        }
		// Write your code here
	}
}
