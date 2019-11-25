package com.example.workflow;

import java.util.ArrayList;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) 
	{
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(70);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(20);
		marks.add(25);
		
		//for Each
		marks.stream().forEach(System.out::println);
		
		//ToArray==converting sream of obj into array
		Integer[] I = marks.stream().toArray(Integer[]::new );
		Stream.of(I).forEach(System.out::println);
		
		//#Find the even marks and collect it into collections
		List<Integer> l1 = marks.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l1.toString());
		//List<Integer> l2 = marks.stream().takeWhile(i->i%2==0).collect(Collectors.toList());
		//System.out.println(l2.toString()); == [70]
		
		//give every students 5 marks bonus
		List<Integer> l3 = marks.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(l3);
		
		//count the total no of fail students
		long noOFailedStudents=marks.stream().filter(m->m<35).count();
		System.out.println(noOFailedStudents);
		
		//Natural sorting
		List<Integer> sortedListAcc = marks.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedListAcc);
		
		//using comparator
		List<Integer> sortedListDec = marks.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		//List<Integer> sortedListDec = marks.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(sortedListDec);
		
		//Min&Max
		Integer min = marks.stream().min((i1,i2)->i1.compareTo(i2)).get();
		Integer max = marks.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(min+" & "+max);
	}

}
