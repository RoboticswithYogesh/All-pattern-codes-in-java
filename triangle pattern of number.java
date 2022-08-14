import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int i =1 ;
        while (i<=n){
            int space = 1;
            while (space <=n-i){
                System.out.print(' ');
                space++;
                
            }
            int j= 1;
            while (j<=i){
                System.out.print(j+i-1);
                j++;
                
            }
            int dec = 2;
            int p =2;
            while (dec<=i){
                System.out.print(i+i-p);
                p++;
                dec++;
                
            }System.out.println();
            i++;
        }
    }
}