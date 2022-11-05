package helloworld;
import java.util.*;

public class cn {
	 
	  static String toBin(int num)
	  {
	    String bin = "";
	    while (num > 0) {
	      if ((num & 1) != 0)
	        bin = "1" + bin;
	      else
	        bin = "0" + bin;
	      num = num >> 1;
	    }
	    return bin;
	  }

	  static int toDec(String bin)
	  {
	    int num = 0;
	    for (int i = 0; i < bin.length(); i++) {
	      if (bin.charAt(i) == '1')
	        num += 1 << (bin.length() - i - 1);
	    }
	    return num;
	  }
	 
	  static void CRC(String dataword, String generator)
	  {
	    int l_gen = generator.length();
	    int gen = toDec(generator);
	 
	    int dword = toDec(dataword);
	 
	    int dividend = dword << (l_gen - 1);
	 
	    int shft = (int)Math.ceil(Math.log(dividend + 1) / Math.log(2)) - l_gen;
	    int rem;
	 
	    while ((dividend >= gen) || (shft >= 0)) {
	      rem = (dividend >> shft) ^ gen;
	      dividend = (dividend & ((1 << shft) - 1)) | (rem << shft);
	      shft = (int)Math.ceil(Math.log(dividend + 1)/ Math.log(2))- l_gen;
	    }
	 
	    int codeword = (dword << (l_gen - 1)) | dividend;
	    rem = 0;
	    while ((dividend >= gen)) {
		      rem = (dividend >> shft) ^ gen;
		      dividend = (dividend & ((1 << shft) - 1)) | (rem << shft);
		      shft = (int)Math.ceil(Math.log(dividend + 1)/ Math.log(2))- l_gen;
		    }
		 
	    codeword = (dword << (l_gen - 1)) | dividend;
	    System.out.println((rem==0)?"accepted":"rejected");
	  }
	 
	  public static void main(String[] args)
	  {
	    String dataword, generator;
	    Scanner sc= new Scanner(System.in);
//	    System.out.println("enter dataword size: ");
//	    int ds = sc.nextInt();
//	    System.out.println("enter dataword: ");
	    
	    dataword = sc.next();
	    generator = sc.next();
	    CRC(dataword, generator);
	  }
}
