/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic;

import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Rep {
        int N;
        int le=(int) (Math.pow(2, N)+2);
    static ArrayList<List<Long>> al = new ArrayList<List<Long>>();
    public void run()
 {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the inputs");
        int T=sc.nextInt();
        for(int l=0;l<T;l++)
        {
            //System.out.println("Enter values of N and M");
            N=sc.nextInt();
            
           int a[]=new int[le];
           for(int i=0;i<le;i++)
           {
               a[i]=sc.nextInt();
           }
        h(a);    
            }
        
 }
    public void h(int arr[])
    {
        List<Integer> ls=new ArrayList<Integer>();
        Arrays.sort(arr);
        Map<Integer,Integer>counts;
        for( in arr)
        {
            counts[num]+=1;
        }
        
       
      
    }
    public static void main(String args[])
    {
        Rep obj=new Rep();
        obj.run();
    }
}
