/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Sale {
    
    static ArrayList<List<Integer>> al = new ArrayList<List<Integer>>();
    int M;
 public void run()
 {
     
     int N;
     
  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the inputs");
        int T=sc.nextInt();
        for(int l=0;l<T;l++)
        {
            System.out.println("Enter values of N and M");
            N=sc.nextInt();
            M=sc.nextInt();
           int a[]=new int[N];
           for(int i=0;i<a.length;i++)
           {
               a[i]=sc.nextInt();
           }
            sorti(a);
            }
        
 }
 public void sorti(int arr[])
 {
     List <Integer> ab=new ArrayList<Integer>();
     int su=0;
    //System.out.println(" Max Sum is"+sum);
    Arrays.sort(arr, 0, arr.length);
//    for(Object q:arr)
//    {
//        System.out.print(q+",");
//   }
        for(int h=0;h<M;h++)
        {
            if(arr[h]<=0)
            {
             int mo=-1*arr[h];
            su=su+mo;
            }
        }
     if(su>=0)
     {
      ab.add(su);
       al.add(ab);
       
     }
     else
     {
    ab.add(0);
    al.add(ab);
     }
    
   
 }
 public static void main(String args[])
 {
     Sale obj=new Sale();
     obj.run();
     System.out.println(al);
     //al.remove(0);
     for(List v:al)
     {
         for(Object d:v)
         {
             System.out.println(d);
         }
     }
 }
}
