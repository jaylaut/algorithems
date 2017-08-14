package com.liujie.sort;

import com.liujie.util.SortUtil;

/** 
* @ClassName: SelectSort 
* @Description: 选择排序: 1、找到数组中最小的元素。2、把最小的元素和数组第一个索引的元素交换。
* 					   3、在剩下的数组中，找到最小的元素(此时不包括第一个元素)，与数组第二个位置的元素交换。4、依次类推
* @author liujie
* @date 2017年7月20日 下午4:16:34 
*  
*/
public final class SelectSort {
	
	public static void selectSort(Comparable[] a){
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				//如果a[i] 大于  a[i+1],那么交换位置
				if(SortUtil.less(a[j], a[i])){
					SortUtil.exch(a, i, j);
				}
			}
		}
	}

}
