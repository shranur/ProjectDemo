package com.sample;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solutiona1 {
	
	//just to check the solution

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i;
    String k="", s1="";
    int sum=0, max=0;
    ArrayList<String> al=new ArrayList<String>();
    for(i=0;i<n;i++)
    {
    	al.add(sc.next());
    }
	
	for(i=0;i<al.size();i++)
	{
		k=al.get(i);
		StringTokenizer st= new StringTokenizer(k, "-");
		while(st.hasMoreTokens())
		{
			String s=st.nextToken();
			int a= Integer.parseInt(st.nextToken());
			int b= Integer.parseInt(st.nextToken());
			int c= Integer.parseInt(st.nextToken());
			sum=a+b+c;
			if(sum>max) {
				max=sum;
				s1=s;
			}
		}
	}
	System.out.println(s1);
			}
		}
	
	

