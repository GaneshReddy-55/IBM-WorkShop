package com.ibm.arrays;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	int[] nums;
    	nums= new int[5];
    	for(int i=0;i<nums.length;i++) {
    		nums[i]=sc.nextInt();
    	}
    	for(int value : nums) {
    		System.out.println(value);
    	}
    	
    }
}
