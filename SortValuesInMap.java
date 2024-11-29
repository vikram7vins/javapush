package com.practice;

public class SortValuesInMap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> hash=new HashMap<> ();
		
		hash.put("amar", 95);
		hash.put("sudheer", 70);
		hash.put("ram", 45);
		hash.put("hem", 28);
		hash.put("krish", 65);
		hash.put("tarak", 35);
		
		List<Entry<String,Integer>> list=new ArrayList<>(hash.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<String,Integer>>(){
			public int compare(Map.Entry<String, Integer> e1,Map.Entry<String, Integer> e2) {
				
				return e1.getValue()-e2.getValue();
			}		
		});
		
		
		for(Map.Entry<String, Integer> e:list) {
			
			System.out.println(e.getKey()+"=="+e.getValue());
		}
		

	}


}
