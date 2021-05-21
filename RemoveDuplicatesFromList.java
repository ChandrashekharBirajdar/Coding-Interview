package com.selfPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<Integer> arrayList = new ArrayList<>();
		
		System.out.println("Enter Values !!");
		for(int i = 0 ; i < 10 ; i++)
			arrayList.add(scanner.nextInt());
		scanner.close();
		//Collections.sort(arrayList);
		for(int i = 0 ; i <= arrayList.size()-1 ; i++) {
			while( arrayList.subList(i+1, arrayList.size()).contains(arrayList.get(i)) )
				arrayList.remove(i);
		}
		System.out.println(arrayList.toString());
	}

}
