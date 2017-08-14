package com.liujie.basic;

public class ArrayUtil {

	/** 
	* @Title: findMaxElement 
	* @Description: 找出数组中最大的元素 
	* @param @param a
	* @param @return    
	* @return Comparable   
	* @throws 
	* @author
	*/
	public static double findMaxElement(double [] a){
		double max = a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				max = a[i];
			}
		}
		return max;
	}
	
	/** 
	* @Title: average 
	* @Description: 计算平均值
	* @param @param a
	* @param @return    
	* @return double   
	* @throws 
	* @author
	*/
	public static double average(double [] a){
		double sum = 0;
		double average = 0.0;
		for(int i=0;i<a.length;i++){
			sum += a[i];
		}
		average = sum/a.length;
		return average;
	}
	
	/** 
	* @Title: copyArray 
	* @Description: 复制数组 
	* @param @param a
	* @param @return    
	* @return double[]   
	* @throws 
	* @author
	*/
	public static double[] copyArray(double[] a){
		double [] b = new double[a.length];
		for(int i=0;i<a.length;i++){
			b[i] = a[i];
		}
		return b;
	}
	
	/** 
	* @Title: changeOrder 
	* @Description: 颠倒数组顺序 
	* @param @param a    
	* @return void   
	* @throws 
	* @author
	*/
	public static double[] changeOrder(double [] a){
		for(int i=0;i<a.length/2;i++){
			double temp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = temp;
		}
		return a;
	}
}
