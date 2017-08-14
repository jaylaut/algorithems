package com.liujie.sort;

import com.liujie.util.SortUtil;

/** 
* @ClassName: InsertSort 
* @Description: 插入排序：适用于数组中部分有序的情况下
* @author liujie
* @date 2017年7月21日 下午1:59:09 
*  
*/
public final class InsertSort {
	
	public static void insertSort(Comparable [] a){
		for(int i=1;i<a.length;i++){
			for(int j=i;j>0&&SortUtil.less(a[j], a[j-1]);j--){
				SortUtil.exch(a, j, j-1);
			}
		}
	}

}
