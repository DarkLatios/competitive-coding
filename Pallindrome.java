/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic;

import java.io.IOException;

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pallindrome {
    
static ArrayList<List<String>> al = new ArrayList<List<String>>();

    
public static void isnam()
    {
        
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter The number");
            int T=sc.nextInt();
            System.out.println("Enter the strings");
            for (int j=0;j<=T;j++)
            {
                check(sc.nextLine());
               
            }
            
            
        }

      
        

    private static void check(String name)
    {

 List<String> listString = new ArrayList<>();
    

int l=name.length();
for (int i = 0; i <=l; i++) 
{
for (int j = i +1; j <= l; ++j)
{
String pref = name.substring(i, j);
if (isPalin(pref)) 
{
listString.add(pref);
}

}
}
al.add(listString);
    }
    
          
 
       
        
    

public static boolean isPalin(String pal) {

 
if(!pal.equals(new StringBuilder(pal).reverse().toString())) {

return false;
}



return true;

}
public static void main(String args[])
{
    Pallindrome obj=new Pallindrome();
    obj.isnam();
    al.remove(0);
    for(List l: al){
        System.out.print("{ ");
        for(Object s: l){
        System.out.print(s+"\t");
        }
        System.out.println("}");
    }
    
}

}
