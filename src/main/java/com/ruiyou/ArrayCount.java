package com.ruiyou;
/**
 * 用面向对象的方法求出数组中重复 value 的个数
 * @author Gzq
 *
 */
public class ArrayCount {
	
	public static void main(String[] args) {
		
		int[] arr = {1,4,1,4,2,5,4,5,8,7,8,77,88,5,4,9,6,2,4,1,5};
		int[] brr = new int[123];
		for(int i = 0 ; i<arr.length; i ++) {
			// 以数组的下标位子代表重复的数量
			/**
			 *  arr[i]是几就代表是 brr[ arr[i] ] 的那个下标，++在后就是对 arr[i] 出现的次数进行累加
			 *  比如： arr[i]是2那么 brr[ arr[i] ]的下标就是2值是1，++在后 当再次出现该下标时，
			 *  			当前下标的值加1也就是 brr[ arr[i] ]的下标就是2值是2
			 */
			brr[ arr[i] ]++; 	
		}
		for(int i = 0 ; i<brr.length; i ++) {
			if(brr[i]!=0) {
				System.out.println("字符：" + i + "出现" + brr[i] +"次");
			}
		}
	}
}
