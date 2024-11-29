package com.practice;

public class StringMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matchedcount=stringMatch("xxcaazz", "xxbaaz");
		System.out.println("Matched count : "+matchedcount);
	}

	public static int stringMatch(String a, String b) {
		  // Figure which string is shorter.
		  int len = Math.min(a.length(), b.length());
		  int count = 0;
		  
		  // Look at both substrings starting at i
		  for (int i=0; i<len-1; i++) {
		    String aSub = a.substring(i, i+2);
		    String bSub = b.substring(i, i+2);
		    if (aSub.equals(bSub)) {  // Use .equals() with strings
		      count++;
		    }
		  }

		  return count;
		}
}
