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
public class Sorted {
    
   // static ArrayList<ArrayList<List<Integer>>> al = new ArrayList<ArrayList<List<Integer>>>();
   static ArrayList<List<Integer>> al = new ArrayList<List<Integer>>();
    public void run()
 {
     
     int N;
     
  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the inputs");
        int T=sc.nextInt();
        for(int l=0;l<T;l++)
        {
            System.out.println("Enter values of N");
            N=sc.nextInt();
           int a[]=new int[N];
           for(int i=0;i<a.length;i++)
           {
               a[i]=sc.nextInt();
           }
           sort(a,N); 
            }
        
        
 }
    public void sort(int arr[],int n)
    {
        List<Integer> tab2=new ArrayList<Integer>();
        
        
        int next, i, j;
    for (i=0; i<n; i++)
    {
        next = -1;
        for (j = i+1; j<n; j++)
        {
            if (arr[i] < arr[j])
            {
                next = arr[j];
                break;
            }
        }
        tab2.add(next);
        //System.out.print(tab2+"\t");
        
        
    }   
    
    //ab.add(tab2);
    al.add(tab2);
    
    }
    public static void main(String args[])
    {
        Sorted obj=new Sorted();
        obj.run();
        //System.out.println(al);
        for(List s:al)
        {
            for(Object t:s)
            {
                System.out.print(t+" ");
            }
            System.out.println(" ");
       }
   
    }
    
}
