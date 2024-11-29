package com.practice;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="WELCOME";
		int vcount = 0,ccount=0;
		
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U') {
				
				vcount ++;
				System.out.println("Display vowel letters "+str.charAt(i));
			}else {
				
				ccount++;
				System.out.println("display consonanats "+str.charAt(i));
			}
			
			
		}
		System.out.println("display v count "+vcount);
		System.out.println("display c count "+ccount);
		
	}
	
}
