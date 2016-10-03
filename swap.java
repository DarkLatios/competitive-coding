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
public class swap {
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
        List<Integer> ls=new ArrayList<>();
        int s=arr[M-1];
        System.out.println(s);
        arr[M-1]=arr[arr.length-1-(M-1)];
        System.out.println(arr[M]);
        arr[arr.length-1-(M-1)]=s;
        for(Integer d:arr)
        {
            ls.add(d);
        }
        al.add(ls);
}
public static void main(String args[])
{
    swap obj=new swap();
    obj.run();
    for(List r:al)
    {
        for(Object f:r)
        {
            System.out.print(f+" ");
        }
        System.out.println();
    }
}

}
