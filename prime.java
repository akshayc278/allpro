import java.io.*;
import java.util.*;


class prime{
	public static void main (String[] args) {
		
		
		int n=13;
		for (int i=1;i<n;i++){
			int count=0;
			for(int j=1;j<n;j++){
				if (i%j==0){
				count++;
				}
				
			}
			if (count==2){
				System.out.println(i);
			}
		}
 }
}