package com.java8.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Check_optiona {

//	public static void main(String[] args) {

	/*
	 * List<Integer> num = new ArrayList<Integer>();
	 * 
	 * num.add(2); num.add(6); num.add(9); num.add(11);
	 * 
	 * // boolean list_empt = num.isEmpty();
	 * 
	 * if (num.isEmpty()) { System.out.println("list is empty"); }
	 * 
	 * for (Integer nums : num) {
	 * 
	 * System.out.println(nums);
	 * 
	 * }
	 * 
	 * /* if (list_empt == true) { System.out.println("list is empty !."); } else {
	 * System.out.println("list is not empty. !."); }
	 */

	public static void main(String args[]) {
		/*
		 * List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		 * Set<Integer> set = new HashSet<>(); myList.stream().filter(n ->
		 * !set.add(n)).forEach(System.out::println);
		 * 
		 * int max = myList.stream().max(Integer::compare).get();
		 * System.out.println("max number present in the list !!!");
		 * System.out.println(max);
		 */

		List<Integer> stream = Arrays.asList(2, 34, 54, 23, 33, 20, 59, 11, 19, 37, 44);
		Map<Integer, List<Integer>> map = new HashMap();

		for (Integer i : stream) {
			int key = i / 10 * 10;

			System.out.println("key :: " + key);
			List<Integer> list = map.get(key);

			if (list == null) {
				list = new ArrayList<>();
				map.put(key, list);
			}
			list.add(i);
		}
		System.out.println("map:: " + map);
	}
	// }

}
