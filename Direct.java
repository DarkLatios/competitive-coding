/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Direct {
    
      List<Integer> m = new ArrayList<>();
     static ArrayList<List<Integer>> ls = new ArrayList<List<Integer>>();
    public void disp()
    {
     int M;
     int N;
     //int a[]=new int[N];
     //int b[]=new int[M];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the inputs");
        int T=sc.nextInt();
        for(int l=0;l<T;l++)
        {
            System.out.println("Enter values of N and M");
            N=sc.nextInt();
            M=sc.nextInt();
           int a[]=new int[N];
           int b[]=new int[M];
           System.out.println("Enter values of A and B");
           for(int i=0;i<a.length;i++)
           {
               a[i]=sc.nextInt();
           }
           
                for(int j=0;j<b.length;j++)
           {
               b[j]=sc.nextInt();
           }
               
                
                run(a,b);
        
        }
       }
    
    public void run(int a[],int b[])
    {
        List<Integer> z = new ArrayList<>();
        
        int su=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<b.length;j++)
            {
                
                  su =su+ b[j]*a[i];
                 z.add(su);
                 
            }
            
           
        }
       
       System.out.println(z); 
//       Object obj1=Collections.max(z);
//       m.add((Integer) obj1);
//       ls.add(m);
       
    
    }
    
    
    
//    public void calc()
//    {
//        for(int k:a)
//        {
//            System.out.print(k);
//        }
//    }
    
    
    public static void main(String args[])
    {
        Direct obj=new Direct();
       obj.disp();
       
       for(List s:ls)
       {
           for(Object t:s)
           {
               System.out.println(t);
           }
       }
    }
    
}
