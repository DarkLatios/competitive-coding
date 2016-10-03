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
public class permu {
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
    
    
public  void isPalin()  {
    List<String> fina = new ArrayList<String>();
    fina.addAll(ls);
    al.add(fina);
//System.out.println(al);
for(List s:al)
{
    //System.out.println(s);
    for(Object a:s)
    {
        //System.out.println(a);
        
        int ar=Integer.parseInt(a.toString());
        //System.out.println(ar);
        if(ar%8==0)
        {
            //System.out.print(ar);
            ab.add("YES");
            //System.out.print(ab);
            return;
            
        }
        
    }
    
   
    
}
  ab.add("NO");
 //System.out.println(ab);
 
 
 }
    
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
    
    List<String> fin = new ArrayList<String>();

    int n = str.length();
    if (n == 0)
    {
       
       ls.add(prefix);
       if(ls.isEmpty()==true)
       {
           ls.remove(ls.indexOf(n));
           
       }
      
 }

    else {
        
        //System.out.print(ls);
        
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
    
    
    }
    
   
  
      
}
public static void main(String args[]) throws IOException, InterruptedException
{
   permu obj=new permu();
   obj.isnam();
   obj.isPalin(); 
      for(String l: ab){
        System.out.println(l);
    }
}
}
