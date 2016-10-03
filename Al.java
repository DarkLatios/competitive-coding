/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;
/**
 *
 * @author user
 */
public class Al {
     
    static ArrayList<List<Integer>> ls = new ArrayList<List<Integer>>();
    
    
   public  void isnam() throws IOException
    {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            //Scanner sc=new Scanner(System.in);
            System.out.println("Enter The number");
            int T=Integer.parseInt(br.readLine());
            System.out.println("Enter the strings");
            for (int j=0;j<T;j++)
            {
                 //Scanner sc2=new Scanner(System.in);
                func(br.readLine());
               
            }
            
            
        } 
    
    
    
    
    public void func(String n) throws IOException
    {
        List<Integer> b = new ArrayList<Integer>();
            
        n=String.format("%-1000s", n);
    
    
    if((!n.contains("1"))&&(!n.contains("2"))&&(!n.contains("3"))&&(!n.contains("4"))&&(!n.contains("5"))&&(!n.contains("6"))&&(!n.contains("7"))&&(!n.contains("8"))&&(!n.contains("9"))&&(!n.contains("0")))   
    
      {
         
         b.add(-1);
         ls.add(b);
      }
      else
     {
    List<Integer> ab = new ArrayList<Integer>();
       
    int c=0;
    int a=0;
    int l=n.length();
    for(int i=0;i<l-1;i++)
    {
        if(n.charAt(i)==' ')
        {
            
            String na=n.substring(c+1, i);
            
            if((na.contains("1")||na.contains("2")||na.contains("3")||na.contains("4")||na.contains("5")||na.contains("6")||na.contains("7")||na.contains("8"))&&!na.contains("9"))
            {
                 a=Integer.parseInt(na);
                 ab.add(a);
                
            }
            c=i;
            
        }
        
    }
        
Object obj1=Collections.max(ab);
b.add(  (Integer) obj1);
ls.add(b);
    }
    
    
    }
    public static void main(String args[])throws IOException
    {
        Al obj=new Al();
        obj.isnam();
        for(List s:ls)
        {
            for(Object sa:s)
            {
                System.out.println(sa);
            }
        }
    }
}
