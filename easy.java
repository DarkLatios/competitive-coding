/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class easy {
    static ArrayList<List<String>> al = new ArrayList<List<String>>();
    public void run() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        int T=Integer.parseInt(br.readLine());
        System.out.println("Enter the String");
        for(int i=0;i<T;i++)
        {
            
            String a=br.readLine();
            fis(a);
        }
    }
    public void fis(String a)
    {
        List<String> ls=new ArrayList<>();
        int n = 0,s = 0,e = 0,w=0;
       int l=a.length();
       for(int j=0;j<=l-1;j++)
       {
       char ch=a.charAt(j);
       if(ch=='N')
       {
           n++;
       }
       if(ch=='S')
       {
           s++;
       }
       if(ch=='E')
       {
           e++;
       }
       if(ch=='W')
       {
           w++;
       }
       
       }
//       System.out.println(n);
//       System.out.println(s);
//       System.out.println(e);
//       System.out.println(w);
       if(n>s)
       {
           for(int z=0;z<(n-s);z++)
           {
               ls.add("N");
           }
       }
       else if(s>n)
       {
           for(int d=0;d<(s-n);d++)
           {
               ls.add("S");
           }
       }
       if(e>w)
       {
           for(int f=0;f<(e-w);f++)
           {
               ls.add("E");
           }
       }
        
       else if(w>e)
       {
           for(int o=0;o<(w-e);o++)
           {
               ls.add("W");
           }
       }
        Collections.sort(ls);
        al.add(ls);
        //al.add(ls);
     }
    public static void main(String args[]) throws IOException
    {
        easy obj=new easy();
        obj.run();
        for(List s:al)
        {
            for(Object r:s)
            {
                System.out.print(r);
            }
            System.out.println(" ");
        }
    }
    
}
