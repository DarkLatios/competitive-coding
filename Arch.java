package basic;


public class Arch {
    
    int a=500;
    int lens=String.valueOf(a).length();
    
    public void run()
    {
        
        for(int i=1;i<=9;i++)
        {
            System.out.println(i);
            run2(i);
            
        }
        
    }
    public void run2(int m)
    {
        String n=Integer.toString(m);
        for(int k=0;k<=a;k++)
        {
            String n2=Integer.toString(k);
            String na=n+n2;
            check(na);
        }
    }
    
    public void check(String na)
    {
   int l=na.length();
   for(int j=0;j<l-1;j++)
   {
            char x=na.charAt(j);
            char y=na.charAt(j+1);
            int nu1=Character.getNumericValue(x);
            
            int nu2=Character.getNumericValue(y);
            
            if((nu2==nu1+1)||(nu2==nu1-1))
            {
               
            }
            else
            {
                break;
            }
   
   }
    
        
    }
    
        
    public static void main(String args[])
    {
        Arch obj=new Arch();
        obj.run();
    }
}

