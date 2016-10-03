/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic;

/**
 *
 * @author user
 */
public class Sigma {
    public static void main(String args[]) {
        String str="I.am.a.bad.robot";
        String[] parts = str.split("\\.");
        StringBuilder out = new StringBuilder();
        for(String p: parts) {
            //System.err.println(p);
            p = new StringBuilder(p).reverse().toString();
            out.append(p);
            out.append(".");
        }
        //System.err.println(out.toString().length());
        System.out.println(out.toString().substring(0, out.toString().length() - 1));
        
    }
    /*String na="I.am.a.bad.robot";
        System.out.print(na+"\n");
        String ch=".";
        
        StringBuffer sb=new StringBuffer(na);
        String nam=sb.reverse().toString();
        System.out.print(nam+"\n");
        StringTokenizer str=new StringTokenizer(nam,".");
       
        while(str.hasMoreTokens())
        {
            al.add(str.nextToken());
            
        }
        for(Object s:al)
   
        {
        rever(s);*/
}