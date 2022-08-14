import java.util.*;
public class Main {
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i<=n){
            int ln = i;
            while (ln<=n){
                System.out.print(2*ln-1);
                ln++;
                
            }
            int rn = 1;
            while (rn <i){
                System.out.print(2*rn-1);
                rn++;
                
            }
            System.out.println();
            i++;
        }
		// Write your code here
	}
}
