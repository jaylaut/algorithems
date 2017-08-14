package com.liujie.test;

import com.liujie.sort.InsertSort;
import com.liujie.sort.SelectSort;
import com.liujie.sort.ShellSort;
import com.liujie.util.SortUtil;

public class Test {

	public static void main(String[] args) {
		String [] a = new String[]{"7","5","1","9","2","6","3","8","0","4"};
		//测试选择排序
		//testSelectSort(a);
		//测试插入排序
		//testInsertSort(a);
		//测试希尔排序
		testShellSort(a);
	}
	
	public static boolean testCompareTo(int a,int b){
		return SortUtil.less(a, b);
	}
	
	public static boolean testIsSorted(Comparable[] a){
		return SortUtil.isSorted(a);
	}
	
	public static void testSelectSort(Comparable[] a){
		SelectSort.selectSort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
	}
	
	public static void testInsertSort(Comparable [] a){
		InsertSort.insertSort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
	}
	
	//希尔排序
	public static void testShellSort(Comparable [] a){
		ShellSort.shellSort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
	}

}