/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class freqsort {
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
           sort(a); 
            }
        
        
 }
     public void sort(int arr[])
             {
                 int c=0;
                 Arrays.sort(arr);
                 for(int i=0;i<arr.length;i++)
                 {
                    if(arr[i]==arr[i+1])
                    {
                        c++;
                    }
                 }
             }
    public static void main(String args[])
    {
        
    }
    
}
