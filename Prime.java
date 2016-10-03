/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Prime {
    static ArrayList<List<Integer>> al=new ArrayList<List<Integer>>(); 
    public void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Test Case");
        int T=sc.nextInt();
        System.out.println("Enter the range");
        int m=0,n=0;
        for(int i=0;i<T;i++)
        {
            n=sc.nextInt();
            m=sc.nextInt();
            calc(n,m);
        }
        
    }
    public void calc(int n,int m)
    {
        List<Integer> ls=new ArrayList<Integer>();
        for(int j=n;j<=m;j++)
            
        {
            boolean isPrime=true;
            for(int k=2;k<j;k++)
            {
                
                if((j%k)==0)
                {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime)
            {
                ls.add(j);
                ls.remove(new Integer(1));
                
            }
        }
        al.add(ls);
    }
    public static void main(String args[])
    {
        Prime obj=new Prime();
        obj.run();
        for(List t:al)
        {
            for(Object s:t)
            {
              System.out.print(s+" ");  
            }
            System.out.println();
    }
    }
}
 