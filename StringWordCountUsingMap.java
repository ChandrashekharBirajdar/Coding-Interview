package com.selfPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringWordCountUsingMap {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String inputData = scanner.nextLine();
		scanner.close();
		
		Map<String, Integer> wordsMap = new HashMap<String,Integer>();
		
		String[] inputArray = inputData.split(" ");
		
		int count ; 
		
		for(int i = 0 ; i < inputArray.length ; i++) {
			
			if(wordsMap.containsKey(inputArray[i])){
				count = wordsMap.get(inputArray[i]) ;
				wordsMap.put(inputArray[i], ++count);
			}else {
				wordsMap.put(inputArray[i],	1);
			}
			
		}
		
		for(String key : wordsMap.keySet())
			System.out.println(" "+key+" has count of "+wordsMap.get(key));
	}
}
