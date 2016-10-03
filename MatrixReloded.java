
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
 class MatrixReloaded {
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Rows and columns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][] = new int[r][c];
        System.out.println("Enter the elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            a[i][j]=sc.nextInt();
        }
        System.out.println("The Matrix is");
        for(int k=0;k<r;k++)
        {
            for(int t=0;t<c;t++)
            {
           System.out.print(a[k][t]+"\t");
        }
        
            System.out.print("\n");
    }
        int trans[][]=new int[c][r];
    for(int m=0;m<r;m++)
    {
    for(int n=0;n<c;n++)
    {
       trans[m][n]=a[n][m];  
    }
    }
    System.out.println("The transpose is");
    for(int z=0;z<c;z++)
    {
    for(int x=0;x<r;x++)
    {
      System.out.print(trans[z][x]+"\t");
    }
    System.out.println();
    }
 // This part Calculates Everything in once,Simply Un-Comment and comment others..............  
//    for(int l=0;l<c/2;l++)
//    {
//        for(int p=l;p<c-l-1;p++)
//        {
//           String temp=a[l][p];
//           a[l][p]=a[p][c-l-1];
//           a[p][c-1-l] = a[c-l-1][c-1-p];
//           a[c-1-l][c-1-p] = a[c-1-p][l];
//           a[c-1-p][l]=temp;
//        }
//    }
//    System.out.println("90 Degrees Left Rotated Matrix");
//    for(int w=0;w<r;w++)
//    {
//        for(int s=0;s<c;s++)
//        {
//            System.out.print(a[w][s]+"\t");
//        }
//        System.out.println();
//    }
//////////////////////////////////////////////////////////////////////////////////////////////
 //NOT THIS PART...............
       
    int left[][]=new int[c][r];
    System.out.println("Rotated Matrix 90 Degrees to Left");
    for(int w=0;w<c;w++)
    {
        for(int s=0;s<r;s++)
        {
            left[w][s]=trans[w][s];
        }
    }
    for(int v=0;v<trans.length/2;v++)
    {
        for(int q=0;q<trans[0].length;q++)
        {
            int tempx=trans[v][q];
            trans[v][q]=trans[trans.length-v-1][q];
            trans[trans.length-v-1][q]=tempx;
        }
    }
    for(int d=0;d<c;d++)
    {
        for(int u=0;u<r;u++)
        {
           System.out.print(trans[d][u]+"\t");
        }
        System.out.println();
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////  
    System.out.println("Rotated Matrix 90 Degrees to Right");
    for(int q=0;q<left[0].length/2;q++)
    {
        for(int v=0;v<left.length;v++)
        {
            int tempx=left[v][q];
            left[v][q]=left[v][trans[0].length-q-1];
            left[v][left[0].length-q-1]=tempx;
        }
    }
    for(int d=0;d<c;d++)
    {
        for(int u=0;u<r;u++)
        {
           System.out.print(left[d][u]+"\t");
        }
        System.out.println();
    }
    
    
    
    }
    
    }


