/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic;

import com.sun.jmx.snmp.BerDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class binary {
    static ArrayList<List<String>> al = new ArrayList<List<String>>();
    public void run()
    {
        
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the inputs");
        int T=sc.nextInt();
        for(int l=0;l<T;l++)
        {
            //System.out.println("Enter values of N and M");
            N=sc.nextInt();
           disp(N);
    }
        
    }
    public void disp(int a)
        {
            List<String> ls=new ArrayList<>();
            for(int i=1;i<=a;i++)
            {
                String bin=Integer.toBinaryString(i);
                ls.add(bin);
            }
            al.add(ls);
        }
    public static void main(String args[])
    {
     binary obj=new binary();
     obj.run();
     for(List p:al)
     {
         for(Object t:p)
         {
             System.out.print(t+" ");
         }
         System.out.println();
     }
    }
}
