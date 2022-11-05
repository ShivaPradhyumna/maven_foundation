package helloworld;

import java.util.Scanner;

public class sub {
	public static void main(String[] args)
		    {
		        Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();
		        String s = sc.nextLine();
		        String[] arr = s.split(" ");
		        String res = "";
		        int len=Integer.MAX_VALUE, a=0;
		        for(String i: arr)
		        {
		            if(i.length() < len)
		            {
		                len = i.length();
		            }
		        }
		        while(a<len)
		        {
		            if(arr[0].charAt(0) == arr[1].charAt(0))
		            {
		                res+=arr[0].charAt(0);
		            }
		            a++;
		        }
		        System.out.println(res);
		        sc.close();
		    }
		}
