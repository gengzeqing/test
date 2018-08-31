package com.ruiyou;
/**
 * 冒泡排序
 * @author Gzq
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {1,9,8,2,6,4,0,12,16,22,11,21,3,5,8};
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					int num = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = num;
				}
			}	
		}
		for (int i = 0; i < arr.length; i++) {
			int j = arr[i];
			System.out.println(j);
		}
	}
}
