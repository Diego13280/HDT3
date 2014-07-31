/**
 * @author Diego Juarez		13280
 * @author Daniel Mejia		13271
 * @author Esteban Barrera	13413
 * 
 * Code referencd from:
 * Duane E. Bailey. 2007. Java Structures. Data Structures in Java for Principled Programer 7th Edition. Williams College. Pages 119-148
 * http://www.journaldev.com/585/insertion-sort-in-java-algorithm-and-code-with-example
 */ 
public class Mergesort 
{
    private static void merge(int data[], int temp[], int low, int middle, int high)
    // pre: data[middle..high] are ascending
    // temp[low..middle-1] are ascending
    // post: data[low..high] contains all values in ascending order
    {
        int ri = low; // result index
        int ti = low; // temp index
        int di = middle; // destination index
        // while two lists are not empty merge smaller value
        while (ti < middle && di <= high)
        {
            if (data[di] < temp[ti]) 
            {
                data[ri++] = data[di++]; // smaller is in high data
            } 
            else
            {
                data[ri++] = temp[ti++]; // smaller is in temp
            }
        }
        while (ti < middle)
        {
            data[ri++] = temp[ti++];
        }
// ...or some values left (in correct place) in data array
    }
// possibly some values left in temp array
    
    private static void mergeSortRecursive(int data[],
    int temp[],
    int low, int high)
// pre: 0 <= low <= high < data.length
// post: values in data[low..high] are in ascending order
    {
        int n = high-low+1;
        int middle = low + n/2;
        int i;
        if (n < 2) return;
        // move lower half of data into temporary storage
        for (i = low; i < middle; i++)
        {
            temp[i] = data[i];
        }
        // sort lower half of array
        mergeSortRecursive(temp,data,low,middle-1);
        // sort upper half of array
        mergeSortRecursive(data,temp,middle,high);
        // merge halves together
        merge(data,temp,low,middle,high);
    }
    
    public static void mergeSort(int data[], int n)
    // pre: 0 <= n <= data.length
    // post: values in data[0..n-1] are in ascending order
    {
        mergeSortRecursive(data,new int[n],0,n-1);
    }
}
