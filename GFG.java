/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author user
 */
public class GFG {
    
    
     static ArrayList<List<String>> al = new ArrayList<List<String>>();
     
     public void take()
     {
         Scanner sc=new Scanner(System.in);
         {
             System.out.println("Enter the number");
             int T=sc.nextInt();
             System.out.println("Enter the strings");
             for(int i=0;i<=T;i++)
             {
                 run(sc.nextLine());
             }
         }
     }
    public void run(String str1)
    {
         List<String> listString = new ArrayList<>();
        StringBuffer sb=new StringBuffer(str1);
        String str=sb.reverse().toString();
        String[] parts = str.split("\\.");
        StringBuilder out = new StringBuilder();
        for(String p: parts) {
           
            p = new StringBuilder(p).reverse().toString();
            out.append(p);
            out.append(".");
        }
            String nam=out.toString().substring(0, out.toString().length() - 1);
            listString.add(nam);
            al.add(listString);
    }
    
    
    public static void main(String args[]) throws IndexOutOfBoundsException
    {
        GFG obj=new GFG();
        obj.take();
        al.remove(0);
        for(List l: al){
        for(Object s: l){
        System.out.println(s);
        }
    }
        
    }

    private void reverse(Object s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
