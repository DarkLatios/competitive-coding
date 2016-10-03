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
public class panagram {
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
                func(br.readLine());
               
            } 
        } 
    public void func(String n)
       {
           List<Integer> b = new ArrayList<Integer>();
           if((n.contains("a")||n.contains("A"))&&(n.contains("b")||n.contains("B"))&&(n.contains("c")||n.contains("C"))&&(n.contains("d")||n.contains("D"))&&(n.contains("E")||n.contains("e"))&&(n.contains("f")||n.contains("F"))&&(n.contains("g")||n.contains("G"))&&(n.contains("h")||n.contains("H"))&&(n.contains("i")||n.contains("I"))&&(n.contains("j")||n.contains("J"))&&(n.contains("k")||n.contains("K"))&&(n.contains("l")||n.contains("L"))&&(n.contains("m")||n.contains("M"))&&(n.contains("n")||n.contains("N"))&&(n.contains("o")||n.contains("O"))&&(n.contains("p")||n.contains("P"))&&(n.contains("q")||n.contains("Q"))&&(n.contains("r")||n.contains("R"))&&(n.contains("s")||n.contains("S"))&&(n.contains("t")||n.contains("T"))&&(n.contains("u")||n.contains("U"))&&(n.contains("v")||n.contains("V"))&&(n.contains("w")||n.contains("W"))&&(n.contains("x")||n.contains("X"))&&(n.contains("y")||n.contains("Y"))&&(n.contains("z")||n.contains("Z")))
           {
               b.add(1);
           }
           else
           {
               b.add(0);
           }
           ls.add(b);
       }
   public static void main(String args[]) throws IOException
   {
       panagram obj=new panagram();
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
