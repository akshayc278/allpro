import java.util.*;
import java.io.*;

class jumping{
	public static boolean method(int n,int x[]){
		for(int k=0;k<n;k++){
			for(int l=1;l<n-1;l++){
				if(x[l-1]>x[l]){
					int temp=x[l-1];
					x[l-1]=x[l];
					x[l]=temp;
				}
			}
		}
		if(x[0]>n){
			return false;
			}
		for(int k=1;k<n;k++){
			if (x[k-1]+n<x[k]) return false;
		}
		return true;
	}
	public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     for(int i=0;i<t;i++){
         int n=sc.nextInt();
         int m=sc.nextInt();
         int x[]=new int[m];
         for(int j=0;j<m;j++){
         	x[i]=sc.nextInt();
         	
         }
         if (method(n,x)==false){
         	System.out.println("failed");
         }
         else System.out.println("passed");
     }
  
  }
}