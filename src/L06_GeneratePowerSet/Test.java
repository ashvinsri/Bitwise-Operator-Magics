/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L06_GeneratePowerSet;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String str=obj.next();
        int n=str.length();
        int count=1<<n;
        for(int i=0;i<count;i++)
        {
            for(int j=0;j<n;j++)
            {
                //check if particular bit is set then print it
                int c=i&(1<<j);
                if(c>0)
                {
                    System.out.print(str.charAt(j));
                }
           
            }
            System.out.print(",");
        }
    }
}
