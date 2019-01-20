package demo1;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		int n,max;
		System.out.println("Enter no of element/n");;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		} 
		max=a[0];
		for(int i=0;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
	}

}