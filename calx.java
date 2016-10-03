/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class calx {
    public void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the test case");
        int N=sc.nextInt();
        int a;
        String s;
        for(int i=0;i<N;i++)
        {
            System.out.println("Enter The digit");
            a=sc.nextInt();
            System.out.println("Enter the String");
            Scanner sc1=new Scanner(System.in);
            s=sc1.nextLine();
            calc(s,a);
        }
        
    }
    private void calc(String t,int z,String res)
    {
        int len=t.length();
        
        if(z==0)
        {
            res=t;
            System.out.print(res);
        }
        if(len<=z)
        {
            return;
        }
        int min=0;
        for(int j=1;j<=z;j++)
           if(t.charAt(j)<t.charAt(min))
               min=j;
               
           
        res=res+t.charAt(min);
       System.out.print(res+"res");
        //System.out.println();
        String new_str = t.substring(min+1, len-min);
        //System.out.print(new_str+",");
        //System.out.println();
        calc(new_str, z-min, res); 
    }
    public String calc(String s, int n)
{
    String res = "";
    calc(s, n, res);
 
    return res;
}
    
    public static void main(String args[])
    {
        calx obj=new calx();
        obj.run();
    }
}
