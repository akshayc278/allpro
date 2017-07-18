import java.util.*;
import java.io.*;


class monkeys{
    static int pro(int x[],int n){
    	int max=0;
    	for (int i=0;i<n;i++){
    		int p=x[i];
    		//System.out.println(p);
    		int count=0,o=0;
    		boolean flag=false;
    			 o=i+p;
    		while(flag==false){
    			
    			count++;
    		//	System.out.println(p);
    			if (o>n-1)
    				while(o>n-1)
    					o=o-n;	
    			if (x[o]==x[i]){
    				flag=true;
    			}
    			else o++;
    		}
    			System.out.println(count);
    			if (count>max){
    		max=count;
    	
    	}
    	}
    
    	return max ;
    }
	public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     System.out.println("enter the element");
     int x[]=new int[n];
     for(int j=0;j<n;j++)
     {
     	x[j]=sc.nextInt();
     	}
    System.out.print("Process ending");
   
     System.out.print("this is max"+pro(x,n));
     
  }
}