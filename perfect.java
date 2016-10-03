/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class perfect {

    static ArrayList<List<Integer>> al = new ArrayList<List<Integer>>();
    public void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int T = sc.nextInt();
        System.out.println("Enter Inputs");
        for(int i=0;i<T;i++)
        {
            test(sc.nextInt()); ;
        }
    }
    public void test(int number)throws ArithmeticException
    {
         List<Integer> ls=new ArrayList<Integer>();        
        
        int temp = 0;
        int i=1;
        do
            
            {
            if(number%i == 0)
             {
            temp+=i;
            
             }
            i++;
            }while(i<number);
        
          if(temp == number){
            
            ls.add(1);
        } else {
            
            ls.add(0);
        }

        
        
    
        al.add(ls);
        //System.out.println(al);
    }
    
    public static void main(String args[])
    {
        
    perfect obj=new perfect();
    obj.run();
    
    for(List s:al)
    {
        for(Object t:s)
        {
            System.out.println(t);
        }
    }
}
}
