
package basic;


import java.util.*;
import java.util.Scanner;

class basic
{
     public static void main(String args[])
    {
        basic obj=new basic();
        obj.run();
        obj.amber();
        
    }
    public void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1");
        
        int a=sc.nextInt();
        System.out.println("enter number two");
        
        double b=sc.nextDouble();
        double sum=a+b;
        double difference=a-b;
        double mult=a*b;
        double div=a/b;
        System.out.println("The sum is"+ sum);
        System.out.println("the differnce is="+ difference);
        System.out.println("the product is="+ mult);
        
    }
    public void amber()
    {
        System.out.println("I am better than Aditya");
    }
   
}