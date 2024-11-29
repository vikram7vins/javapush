package com.practice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list=Arrays.asList(10,20,30,15,18,29,19);
		list.stream()
		.map(s->s+"")  //converts Int to String
		.filter(s->s.startsWith("1"))
		.forEach(System.out::println);

		System.out.println("-------------------------");
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(3);
		list1.add(8);
		list1.add(17);
		list1.add(20);
		
		list1.stream().filter(s->s%2==0).forEach(System.out::println);
		
		System.out.println("---------------------");
		
		List<Integer> list2=Arrays.asList(10,20,30,10,90,40,50,30,40);
		Set<Integer> set=new HashSet<Integer>();
		
		List<Integer> duplicatevalues=list2.stream().filter(s->!set.add(s)).collect(Collectors.toList());
		System.out.println(duplicatevalues);
		
		int count=(int) list2.stream().count();
		
		int max=list2.stream().max(Integer::compare).get();
		int secondlargest=list2.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("Maximum value :"+max);
		System.out.println("Second largest "+secondlargest);
		System.out.println("Count of element in list : "+count);
		System.out.println("===============");
		
		
		System.out.println("Display date and time :"+LocalDateTime.now());
		
		
List<String> list=Arrays.asList("samba","naga","aadi","","ashok","simhadri","samara","","yama");
		
		Stream<String> stream=list.stream();
		stream.forEach(System.out::println);
		
		
		long count=list.stream().filter(x->x.isEmpty()).count();
		System.out.println("-----------------------------------");
		System.out.println("count empty string : "+count);
		
		
		long length=list.stream().filter(s->s.length()<5).count();
		System.out.println("count lenght string : "+length);
		
		
		list.stream().filter(s->s.startsWith("sa")).forEach(s->System.out.println(s));
		
		List<String> li=list.stream().filter(s->!s.isEmpty()).collect(Collectors.toList());
		System.out.println("removed spaces :"+li);
		
		List<String> lenghtString=list.stream().filter(s->s.length()>5).collect(Collectors.toList());
		
		List<String> l=list.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println("upper cases strings :"+l);
		
		
		List<Integer> numericint=Arrays.asList(10,20,40,5,10,5,50,70,90,50);
		Set<Integer> set=new HashSet<Integer>();
		numericint.stream().filter(s->!set.add(s)).forEach(System.out::println);
		
		numericint.stream().sorted().forEach(System.out::println);
		
		System.out.println("display local time and date "+LocalDateTime.now());
		
		System.out.println(LocalDateTime.now());
		
	}

}
