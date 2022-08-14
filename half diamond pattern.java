import java.util.*;
import java.lang.Math;
public class Solution {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i =1;
        System.out.println('*');
        if (n==0){
            System.out.print('*');
        }while (i<=n){
            System.out.print('*');
            int j= 1;
            int k = 1;
            while (j<=i){
                System.out.print(k);
                k++;
                j++;
                
            }
            k= k-2;
            int l = 1;
            while (l<=i-1){
                System.out.print(k);
                k--;
                l++;
                
            }System.out.println('*');
            i++;
        }
        // this portion for reversing loop
        i = i-2;
        if (i>0){
            while (i>0){
                System.out.print('*');
                int j = 1;
                int k= 1;
                while (j<=i){
                    System.out.print(k);
                    k++;
                    j++;
                    
                }
                k = k-2;
                int l= 1;
                while (l<=i-1){
                    System.out.print(k);
                    k--;
                    l++;
                    
                }
                System.out.println('*');
                i--;
                
            }System.out.println('*');
        }
            
    }
}