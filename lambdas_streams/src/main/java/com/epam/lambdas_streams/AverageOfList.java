package com.epam.lambdas_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AverageOfList {

	public static void main(String[] args) {
		List<Integer> Alist = new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++) {
			Alist.add(i);
		}
		
		Object ob = getAverage(Alist);
		Optional<Object> p =Optional.ofNullable(ob);
		p.ifPresent(System.out::println);

	}

	private static Double getAverage(List<Integer> Alist) {
		 Integer sum = 0;
		 
		 for(int i=0;i<Alist.size();i++) {
			 sum += i;
		 }
		 
		 return 1.0*sum/Alist.size();
	}

}
