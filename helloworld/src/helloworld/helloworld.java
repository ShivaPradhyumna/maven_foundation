package helloworld;

import java.util.Scanner;
import java.util.Stack;

public class helloworld {
	public static void main(String[] args) {
		Stack<Character> s= new Stack<>();
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		char[] ch = st.toCharArray();
		int i=Integer.MAX_VALUE, len = st.length(), res = 0;
		while(i<len)
		{
			if(ch[i] == '(' || ch[i] == '[' || ch[i] == '{')
			{
				s.push(st.charAt(i));
			}
			else if((!s.isEmpty()) && ((ch[i] == ')' && s.peek() == '(') || (ch[i] == ']' && s.peek() == '[') || (ch[i] == '}' && s.peek() == '{')))
			{
				s.pop();
			}
			else
			{
				res=-1;
				break;
			}
			i++;
		}
		if(s.isEmpty() && res==0)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		sc.close();
	}
}
