/**
 * 
 * Given a number n and check if it is a power of 2???
 * 
 */
package L03_CheckIfPowerOf2;
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
       int val=n&(n-1);
       if(val==0)
           System.out.println(true);
       else
           System.out.println(false);
    }
}
