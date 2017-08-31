package com.matenagy.others;

import java.util.List;

public class BinarySearch {

	public static <T> int  binarySearchOwn( List<T> in , T target ){
		//somehow we should check if the input is sorted or not 
		//because it only works for sorted List of Type int,double,String,char (at least those were tested)
		return binarySearchRecursion(in ,target , 0 , in.size()-1 );
	}
	
	private static <T> int binarySearchRecursion( List<T> in , T target, int start, int end){
		int index = (start + end) /2 ;
		try{
			if(in.get(index).equals(target)) return index;
			else if( in.get(index).toString().compareToIgnoreCase(target.toString()) < 0 && start < end ) {
				return binarySearchRecursion(in,target,index+1,end );
			}
			else if( in.get(index).toString().compareToIgnoreCase(target.toString()) > 0  && start < end) {
				return binarySearchRecursion(in,target,start,index-1);
			}
			else return -1;
		}catch(Exception e ){
			System.out.println("The type of Object cannot be converted comparable easily :( ");
			return -1;
		}
	}
}
