/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author user
 */
public class pal {
     
    //ArrayList<List<String>> al = new ArrayList<List<String>>();
    
    
    
//    public  void isPalin() {
//
// 
//    //
//    //List<String> la = new ArrayList<>();
//    LinkedHashSet<String> lhs = new LinkedHashSet<String>(); 
//
//    for( ArrayList<List<String>> s:ab.subList(0, 1))
//    {
//       //System.out.println(s);
//         
//        lhs.addAll(s);
//        s.clear();
//         s.addAll(lhs);
//        s.remove(0);
//        ab.add(s);
//       
//        }
//   
//    
//    }
    
           
      

    
   public  void isnam()
    {
        
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter The number");
            int T=sc.nextInt();
            System.out.println("Enter the strings");
            for (int j=0;j<=T;j++)
            {
                permutation(sc.nextLine());
               
            }
            
            
        } 
	public  void permutation(String str) { 
    permutation("", str); 
}

private  void permutation(String prefix, String str) {
    List<String> y=new ArrayList<>();
    List<String> listString = new ArrayList<>();
    ArrayList<ArrayList<List<String>>> ab = new ArrayList<ArrayList<List<String>>>();
    ArrayList<List<String>> al = new ArrayList<List<String>>();
    int n = str.length();
    if (n == 0)
    {
        if(prefix.equals(new StringBuilder(prefix).reverse().toString()))
        {
            
       listString.add(prefix);
       
        }  
            
    }
    
    else {
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
    }
    
     
       al.add(listString);
       ab.add(al);
       System.out.println(ab.get(0));
       
//       for(ArrayList t:ab.subList(0, 1))
//       {
//           for(Object s:t.subList(0, 1))
//           {
//               check((List<String>) s);
//               break;
//           }
//           break;
//       }
}
public void check(List<String> y)
{
    //System.out.println(y);
    List<String> sa = new ArrayList<>();
for(String p:y)
{
    if(y.isEmpty())
    {
        continue;
    }
    if(p.equals(new StringBuilder(p).reverse().toString()))
    {
        sa.add(p);
    }
}
//System.out.println(sa);
}




public static void main(String args[]) throws IOException
{
   pal obj=new pal();
   obj.isnam();
   //obj.isPalin();
   
//      for(List l: ab){
//        System.out.print("{ ");
//        for(Object s: l){
//        System.out.print(s+"\t");
//        }
//        System.out.println("}");
//    }
}
}

