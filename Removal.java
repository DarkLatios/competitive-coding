/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Removal {
    static ArrayList<List<String>> al = new ArrayList<List<String>>();
    public void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input");
        int t=sc.nextInt();
        System.out.println("Enter the strings");
        for(int i=0;i<=t;i++)
        {
            check(sc.nextLine());
        }
    }
    public void check(String nams)
    {
     List<String> ls=new ArrayList<String>(); 
    String nam=nams.replace("ac","");
    String name=nam.replace("b", "");
     ls.add(name);
     al.add(ls);
    }
    public static void main(String args[])
    {
    
        Removal obj=new Removal();
        obj.run();
        al.remove(0);
        for(List s:al)
        {
            for(Object na:s)
            {
                System.out.println(na);
            }
        }
    
}
}