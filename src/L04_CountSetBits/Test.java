/**
 * Count the number of Set Bits
 * I/P =5 (0101)   
 * O/P= 2
 * One way is to traverse each and every bit and check 1 it will take O(n) where n is number of bits inefficient for large numbers like 10^8
 * so One efficient way is BRIAN KARNIGHAM ALGO
 * where in each step we will make last set bit 0 and break loop when number reaches to 0 so we have to traverse only set bits O(k)
 * Print number of steps as answer
 */
package L04_CountSetBits;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int res=0;
        while(n>0)
        {
            n=n&(n-1);   // Making lastmost bit as 0
            res++;
        }
        System.out.println("Number of Set Bits="+res);
    }
}
