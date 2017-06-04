import java.util.*;
import java.io.*;

class stringpal{
	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    char c[]=str.toCharArray();
    boolean flag =true;
    int n=str.length()-1;
    for(int i=0;i<=n/2;i++){
    	if (c[i]!=c[n-i]){
    		flag=false;
    	}
    	if (c[i]=='.'){
    		c[i]=c[n-i];
    		flag=true;
    	}
    	if (c[n-i]=='.'){
    		c[n-i]=c[i];
    		flag=true;
    	}
    	if ((n+1)%2==1){
    		
    		if (c[(n+1)/2]=='.'){
    		
    			c[(n+1)/2]='a';
    		}
    	}
    }
    if (flag==true){
    	for(int i=0;i<=n;i++)
    System.out.print(c[i]);
    }
    else System.out.println("not a palindron");
  }
}