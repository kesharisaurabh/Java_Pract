package NumericComputation;
import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class Solution {
	    public static void main(String args[] ) throws Exception {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
	        Scanner sc=new Scanner(System.in);
	        int id=sc.nextInt();
	        double balance=sc.nextDouble();
	        double intrestRate=sc.nextDouble();
	        int noOfYears=sc.nextInt();
	        Account ac=new Account(id, balance, intrestRate);
	        double result=Solution.calculateInterest(ac,noOfYears);
	        System.out.println(String.format("%.3f", result));
	        
	    }
	    
	    public static double calculateInterest(Account a, int noOfYears)
	    {
	    	double result;
	    	double rateintrest=(a.intrestRate*noOfYears)/100;
	    	double cintrestRate=a.intrestRate+rateintrest;
	    	
	    	result=a.balance+cintrestRate;
	        return result;
	    }
	}




