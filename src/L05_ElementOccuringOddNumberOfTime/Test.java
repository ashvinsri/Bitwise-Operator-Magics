/**
 * Given an array that contains all elements even number of time except one element.Find odd occurring element
 * 
 */
package L05_ElementOccuringOddNumberOfTime;
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
        int ans=obj.nextInt();
        for(int i=1;i<n;i++)
        {
            ans=ans^(obj.nextInt());
        }
        if(ans!=0)
        System.out.println("Element is="+ans);
        else
        System.out.println("No such element");
    }
}
