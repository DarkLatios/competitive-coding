/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic;

import com.sun.jmx.remote.internal.ArrayQueue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class qued {
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
        Queue<String> m = null;
        m.add("");
        int c=0;
        while(c<=a)
        {
            String s1=m.peek();
            String s2=s1;
            m.add(s1.concat("2"));
            c++;
            if (c==a)
        {
            for(Object d:m)
            {
                System.out.print(d);
            }
            
            break;
        }
            m.add(s2.concat("3"));
            c++;
            
             if (c==a)
        {
            for(Object x:m)
            {
               System.out.print(x); 
            }
            
            break;
        }
             
        }
        
    }
    public static void main(String args[])
    {
        qued obj=new qued();
        obj.run();
    }
}
