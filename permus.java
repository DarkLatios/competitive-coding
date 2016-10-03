/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic;



import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author user
 */
public class permus {
    static ArrayList<List<String>> al = new ArrayList<List<String>>(); 
    static List<String> ab = new ArrayList<String>();
    List<String> ls = new ArrayList<String>();          
    
//  public void add()
//  {
//   List<String> listString = new ArrayList<String>();
//   listString.add("YES");
//   al.add(listString);
//   
//  }
    
    

    
   public  void isnam() throws InterruptedException
    {
        
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter The number");
            int T=sc.nextInt();
            System.out.println("Enter the strings");
            for (int j=0;j<T;j++)
            {
                Scanner sc2=new Scanner(System.in);
                permutation(sc2.nextLine());
               
            }
            
            
        } 
	public  void permutation(String str)  { 
    permutation("", str); 
}

private  void permutation(String prefix, String str)  {
    
    //List<String> fin = new ArrayList<String>();
    
    int n = str.length();
    if (n == 0)
    {
       
       ls.add(prefix);
       System.out.print(prefix+",");
       if(ls.isEmpty()==true)
       {
           ls.remove(ls.indexOf(n));     
       }
       
       al.add(ls);
       calc(al);
      
 }

    else {
        
        //System.out.print(ls);
        
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
    
    
    }
    
   
      
}
public void calc(ArrayList<List<String>> x)
{
    
    int s=0;
    for(List n:x.subList(0, 1))
    {
        System.out.print(n);
     for(Object na:n)
     {
         int nam=Integer.parseInt((String) na);
         s=s+nam;
     }
     System.out.println(s);
}
    
}
public static void main(String args[]) throws IOException, InterruptedException
{
   permus obj=new permus();
   obj.isnam();
   //obj.isPalin(); 
      //for(List l: a.subList(0, 1)){
        //System.out.println(l);
    }
}

