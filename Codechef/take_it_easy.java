/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    int[] arr=new int[n];
		    int sum=0;
		    for(int j=0;j<n;j++){
		        arr[j]=sc.nextInt();
		        sum+=arr[j];
		    }
		    
		    if(sum%n==0){
		        boolean temp=true;
		        
		        for(int j=0;j<n;j++){
		            if((sum/n-arr[j])%2!=0){
		                temp=false;
		                break;
		            }
		        }
		        if(temp==true)
		        System.out.println("YES");
		        else
		        System.out.println("NO");
		    }
		    else
		    System.out.println("NO");
		  //  int temp=sum/n;
		  //  if( temp%n==0)
		  //  System.out.println("YES");
		  //  else
		  //  System.out.println("NO");
		    
		}
	}
}
