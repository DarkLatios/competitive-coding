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
public class Magic {
    int N;
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
            
           long a[]=new long[N];
           for(int i=0;i<a.length;i++)
           {
               a[i]=sc.nextInt();
           }
        h(a);    
            }
        
 }
    public void h(long arr[])
    {
        long gcd;
        long fx = 0;
        long pro=1;
        for(int i=0;i<arr.length;i++)
        {
            pro=pro*arr[i];
        }
        
        gcd = greatestCommonDivisor(arr[0], arr[1]);
        
        if(N >=2){
		for(int y=2; y < N; y++){
			gcd = greatestCommonDivisor(gcd, arr[y]);
		}
                System.out.println(gcd);
                fx=gcd;
	}
        
        
        calc(pro,fx);
    }
    public long greatestCommonDivisor (long m, long n){
	long x;
	long y;
	while(m%n != 0){
		x = n;
		y = m%n;
		m = x;
		n = y;
	}
	return n;
}			

    public void calc(long hx,long fx)
    {
        List<Long> ls=new ArrayList<Long>();
        //System.out.println(hx);
        //System.out.println(fx);
        //long M=(int) (Math.pow(10, 9)+7);
        long ans=(int) (Math.pow(hx, fx));
        ls.add(ans);
        al.add(ls);
        
    }
    public static void main(String args[])
    {
        Magic obj=new Magic();
        obj.run();
        for(List s:al)
        {
            for(Object t:s)
            {
                System.out.println(t);
            }
        }
    }
}
