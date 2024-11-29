package com.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamsPractice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list=Arrays.asList(2,3,4,5);
		List<Integer> square=list.stream().map(s->s*s).collect(Collectors.toList());
		List<Integer> qube=square.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(list);
		System.out.println(square);
		System.out.println(qube);
		
		
		
		
		List<String> lstring=Arrays.asList("sudheer","vikram","bhanu","raju","madhan","srinu","sundar");
		
		Set<String> names=lstring.stream().filter(s->s.startsWith("s")).collect(Collectors.toSet());
		System.out.println(names);
		
		
		List<String> name=Arrays.asList("Zoo","xmas","Tap","Asia","Canada","Japan");
		List<String> fina=name.stream().sorted().collect(Collectors.toList());
		System.out.println(fina);
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(50, "ram");
		map.put(90, "sudheer");
		map.put(80, "jam");
		map.put(40, "dheer");
		map.put(10, "cat");
		map.put(15, "jacck");
		
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);
		
		
		List<String> lam=Arrays.asList("samba","naga","simhadri","ashok","devara");
		lam.forEach(a->System.out.println(a));
		
		//****Stream API is a way to express and process collections of objects.
				//***Enable us to perform operations like filtering, mapping,reducing and sorting.
				List<Integer> al=Arrays.asList(3,6,2,7,4,8);
				
				List<Integer> li=al.stream()
						.map(x->x*x)
						.collect(Collectors.toList());
				
				System.out.println("Display map method   "+li);
				
				
				List<String> str=Arrays.asList("sudheer","ram","hem","dhana","Amar","sangam");
				
				List<String> list=str.stream()
						.filter(s->s.startsWith("s"))
						.collect(Collectors.toList());
				
				
				System.out.println("display filter method values :"+list);
				
				
				
		
		}
		
	

}

}
