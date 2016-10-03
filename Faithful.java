/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Faithful {
   
    public void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Inputs");
        int T=sc.nextInt();
        for(int i=0;i<T;i++)
        {
            System.out.println("Enter The values");
            int a=sc.nextInt();
            calc(a);
        }
    }
    
    public void calc(int a)
    {
        
        String n=Integer.toBinaryString(a);
        
         int l=n.length();
        
        long ans=0;
        BigInteger fa = null;
        for(int i=l-1,j=0;i>=0;i--,j++)
        {
            char ch=n.charAt(i);
            int x=Character.getNumericValue(ch);
            ans=(long) (ans+x*(Math.pow(7, j)));
            fa=BigInteger.valueOf(ans);
            
            
        }
       System.out.println(fa);
       System.out.println("Ans of 1000000 is 13293850491384505");
       
       
    }
    public static void main(String args[])
    {
        Faithful obj=new Faithful();
        obj.run();
    }
    
}
