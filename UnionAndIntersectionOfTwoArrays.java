package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1= {5,6,7,12,3,1,2};
		int[] arr2= {10,20,1,2,30,40};
		Set<Integer> s1=new HashSet<Integer>();
		Set<Integer> s2=new HashSet<Integer>();
		
		for(int i=0;i<arr1.length;i++) {
			
			s1.add(arr1[i]);
		}
		
		for(int j=0;j<arr2.length;j++) {
			s1.add(arr2[j]);
		}
		
		System.out.println("Union of elements "+s1);
		
		System.out.println("=======================");
		
		Set<Integer> s3=new HashSet<Integer>(Arrays.asList(3,4,5,8,9,1,0));
		Set<Integer> s4=new HashSet<Integer>(Arrays.asList(8,10,20,40,50,9));
		
		s3.retainAll(s4);
		
				
		Integer[] result=s3.toArray(new Integer[s3.size()]);
		System.out.println("Intersection of elements "+s3);
		
	}

}
