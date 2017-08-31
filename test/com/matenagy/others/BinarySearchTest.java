package com.matenagy.others;

import java.util.Arrays;
import java.util.List;


import org.junit.Test;

public class BinarySearchTest {
	
	static List<Integer> arr = Arrays.asList(11,22,33,44,55,66,77,88);
	static List<Double> arrD = Arrays.asList(11.0,22.0,33.0,44.0,55.0,66.0,77.0,88.0);	
	static List<Character> arrC = Arrays.asList('1','2','3','4','5','6','7','8');
	static List<String> arrS = Arrays.asList("11.0","22.0","33.0","44.0","55.0","66.0","77.0","88.0");
	
	@Test
	public void testCompareInt() {
		for(int x : arr){
			int resultDefault = Arrays.binarySearch(arr.toArray(), x);
			int resultOwn = BinarySearch.binarySearchOwn(arr, x);
			assert(resultDefault == resultOwn);
		}
	}
	
	@Test
	public void testCompareDouble() {
		for(double x : arrD){
			int resultDefault = Arrays.binarySearch(arrD.toArray(), x);
			int resultOwn = BinarySearch.binarySearchOwn(arrD, x);
			assert(resultDefault == resultOwn);
		}
	}
	
	@Test
	public void testCompareString() {
		for(String x : arrS){
			int resultDefault = Arrays.binarySearch(arrS.toArray(), x);
			int resultOwn = BinarySearch.binarySearchOwn(arrS, x);
			assert(resultDefault == resultOwn);
		}
	}
	
	@Test
	public void testCompareChar() {
		for(char x : arrC){
			int resultDefault = Arrays.binarySearch(arrC.toArray(), x);
			int resultOwn = BinarySearch.binarySearchOwn(arrC, x);
			assert(resultDefault == resultOwn);
		}
	}
	@Test
	public void testNotAnElement(){
			int resultInt = BinarySearch.binarySearchOwn(arr, 21);
			int resultDouble = BinarySearch.binarySearchOwn(arrD, 57.0);
			int resultChar = BinarySearch.binarySearchOwn(arrC, 't');
			int resultString = BinarySearch.binarySearchOwn(arrS, "foo");
			assert(resultInt == -1 && resultDouble == -1 && resultChar == -1 && resultString == -1);
	}

}
