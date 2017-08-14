package com.liujie.util;

/** 
* @ClassName: SortUtil 
* @Description: 排序算法工具类
* @author liujie
* @date 2017年7月20日 下午3:18:27 
*  
*/
public final class SortUtil {
	
	/** 
	* @Title: less 
	* @Description: 如果v小于w,返回true,否则返回true
	* @param @param v
	* @param @param w
	* @param @return    
	* @return boolean   
	* @throws 
	* @author
	*/
	public static boolean less(Comparable v,Comparable w){
		return v.compareTo(w)<0;
	}
	
	/** 
	* @Title: exch 
	* @Description: 交换数组索引的值 
	* @param @param a
	* @param @param i
	* @param @param j    
	* @return void   
	* @throws 
	* @author
	*/
	public static void exch(Comparable[] a,int i,int j){
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	/** 
	* @Title: isSorted 
	* @Description: 验证数组相邻的对象是否升序，如果不是返回false，否则返回true
	* @param @param a
	* @param @return    
	* @return boolean   
	* @throws 
	* @author
	*/
	public static boolean isSorted(Comparable[] a){
		for(int i=1;i<a.length;i++){
			if(less(a[i],a[i-1])){
				return false;
			}
		}
		return true;
	}

}
