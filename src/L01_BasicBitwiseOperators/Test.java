/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L01_BasicBitwiseOperators;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
        int a=13,b=5;
        System.out.println(a&b);
        int c=4,d=5;
        System.out.println(c|d);
        int e=6,f=7;
        System.out.println(e&1);
        System.out.println(f&1);
        
        int g=5;
        System.out.println(g>>2);        //Divides the number by 2^k
        System.out.println(g<<2);        //Multiplies the number by 2^k
        int n=3; //find number of comination i.e. 2^3;
        System.out.println(1<<n);
    }
}
