package streams;
import java.net.*;
import java.io.*;
import java.util.*;

public class sample4 
{
 public static void main(String[] args) 
 {
  int n;
  Scanner sc = new Scanner(System.in);
  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  do
  {
   System.out.println("\n Menu: \n 1. DNS 2. Reverse DNS 3. Exit \n");
   System.out.println("\n Enter your choice");
//   n = Integer.parseInt(System.console().readLine()); 
   n = Integer.parseInt(sc.next()); 
   if(n==1)
   {
    try 
    {
     System.out.println("\n Enter Host Name ");
     String hname=in.readLine();
     InetAddress address;
     address = InetAddress.getByName(hname);
     System.out.println("Host Name: " + address.getHostName());
     System.out.println("IP: " + address.getHostAddress());
     address.
    } 
    catch(IOException ioe) 
    {
     ioe.printStackTrace();
    }
   }
   if(n==2)
   {
    try 
    {
       System.out.println("\n Enter IP address");
       String ipstr = in.readLine();
       InetAddress ia = InetAddress.getByName(ipstr);
//       System.out.println("IP: "+ipstr);
       System.out.println("IP: "+ia.getHostAddress());
       System.out.println("Host Name: " +ia.getHostName());
     } 
    catch(IOException ioe) 
    {
     ioe.printStackTrace();
    }
   }
  }while(!(n==3));
 }
}