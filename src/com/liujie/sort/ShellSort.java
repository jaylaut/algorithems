package com.liujie.sort;

import com.liujie.util.SortUtil;

/** 
* @ClassName: ShellSort 
* @Description: 希尔排序：先把待排序的序列，按照增量分成{n/2,(n/2)/2....1}个序列，然后对子序列进行插入排序，然后再对排序后的子序列在分组，依次执行 
* @author liujie
* @date 2017年8月4日 上午10:24:16 
*  
*/
public final class ShellSort {
	
	public static void shellSort(Comparable[] a){
		int gap = a.length/2;
		while(gap >= 1){
			//把距离为gap的整理为一个组
			for(int i = gap;i<a.length;i++){
				int j = 0;
				for(j = i - gap;j>=0&&SortUtil.less(a[i], a[j]);j = j-gap){
					SortUtil.exch(a, i, j);
				}
			}
			gap = gap / 2; // 减小增量
		}
	}
	

}
