/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Find {
    static ArrayList<List<Integer>> ls = new ArrayList<List<Integer>>();
    
    
   public  void run() throws IOException
    {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            //Scanner sc=new Scanner(System.in);
            System.out.println("Enter The number");
            int T=Integer.parseInt(br.readLine());
            System.out.println("Enter the strings");
            for (int j=0;j<T;j++)
            {
                 //Scanner sc2=new Scanner(System.in);
                String a=br.readLine();
                String b=br.readLine();
                disp(a,b);
               
            } 
        } 
   public void disp(String a,String b)
   {
       List<Integer> y = new ArrayList<Integer>();
       if(a.contains(b))
       {
           int in=a.lastIndexOf(b)+1;
           y.add(in);
       }
       else
       {
           y.add(-1);
       }
       ls.add(y);
   }
    public static void main(String args[]) throws IOException
    {
        Find obj=new Find();
        obj.run();
        for(List s:ls)
        {
            for(Object t:s)
            {
                System.out.println(t);
            }
        }
    }
    
}
