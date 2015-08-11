/**
 * Shell Sort for sorting an array of integers.
 * @param array the array to be sorted
*@author modified by Brandon Tarney: Original Source: http://rosettacode.org/wiki/Sorting_algorithms/Shell_sort#Java
*@see http://rosettacode.org/wiki/Sorting_algorithms/Shell_sort#Java
 */

class ShellSortIterative {
	public static void shellSort(int[] a, int[] increments) 
        {

            int index = 0;
            while (increments[index] < a.length )
            {
                index++;
            }
            index--;//move to an index smaller than array length
            int increment = increments[index-1]; // move to the index 2 smaller than the array size
            while (increment > 0) 
            {
                for (int i = increment; i < a.length; i++) 
                {
                    int j = i;
                    int temp = a[i];
                    while (j >= increment && a[j - increment] > temp) {
                            a[j] = a[j - increment];
                            j = j - increment;
                    }
                    a[j] = temp;
                }
                increment = increments[--index];

                    
            }
        }
}
