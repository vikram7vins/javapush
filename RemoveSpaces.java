package com.practice;

public class RemoveSpaces {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="sudheer is a bad boy";
		char[] letters=name.toCharArray();
		
		StringBuffer stringbuf=new StringBuffer();
		
		for(int i=0;i<letters.length;i++) {
			
			if((letters[i] != ' ')&&(letters[i] != '\t')) {
				
				stringbuf.append(letters[i]);
				
			}
			
		}
		System.out.println("Display string without space : "+stringbuf);
	}

}
