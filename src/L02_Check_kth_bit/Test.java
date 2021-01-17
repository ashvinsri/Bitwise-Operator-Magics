/**
 * Check If kth it is set or not
 * I/P  --->  n=5 (00101)   k=2;
 * O/P  --->  True 
 * 
 */
package L02_Check_kth_bit;
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
        int k=obj.nextInt();
        int val=1<<(k-1);
        System.out.println(n&val);
    }
}
