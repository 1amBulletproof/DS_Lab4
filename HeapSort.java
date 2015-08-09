/**
*Heap Sort Algorithm
*
*@author farhankhwaja - github: https://github.com/farhankhwaja/HeapSort/blob/master/HeapSort.java
*@see http://www.code2learn.com/2011/09/heapsort-array-based-implementation-in.html
*/

import java.io.*;


public class HeapSort 
{
    private static int[] a;
    private static int n;
    private static int left;
    private static int right;
    private static int largest;

    // Build-Heap Function
    public static void buildheap(int []a){
    	n=a.length-1;
    	for(int i=n/2;i>=0;i--){
//    		System.out.println(i);
    		maxheap(a,i);
    	}
    }
    
    // Max-Heap Function
    public static void maxheap(int[] a, int i){
    	left=2*i;
    	right=2*i+1;
//    	System.out.println(i + " " + left + " " + right);
    	if(left <= n && a[left] > a[i]){
    		largest=left;
    	}
    	else{
    		largest=i;
    	}
    	
    	if(right <= n && a[right] > a[largest]){
    		largest=right;
    	}
    	if(largest!=i){
    		exchange(i,largest);
    		maxheap(a, largest);
    	}
    }
    
    // Exchange Function
    public static void exchange(int i, int j){
    	int t=a[i];
    	a[i]=a[j];
    	a[j]=t; 
    	}
    
    // Sort Function
    public static void sort(int []a0){
    	a=a0;
    	buildheap(a);
    	
    	for(int i=n;i>0;i--){
    		exchange(0, i);
    		n=n-1;
    		maxheap(a, 0);
    	}
    }
    
    public static void main(String[] args) {
		int []a1={3,5,1,2,4};
    	sort(a1);
    	for(int i=0;i<a1.length;i++){
    		System.out.print(a1[i] + " ");
			}
		
		System.out.println();
		
		int []a2={3,5,1,2,4, 13, 7, 55};
    	ShellSortIterative.shell(a2);
    	for(int i=0;i<a2.length;i++){
    		System.out.print(a2[i] + " ");
			}
	}
} 