/**
 * @author Diego Juarez		13280
 * @author Daniel Mejia		13271
 * @author Esteban Barrera	13413
 * 
 * Code referencd from:
 * Duane E. Bailey. 2007. Java Structures. Data Structures in Java for Principled Programer 7th Edition. Williams College. Pages 119-148
 * http://www.journaldev.com/585/insertion-sort-in-java-algorithm-and-code-with-example
 */
public class Quicksort 
{
    public static void swap(int data[], int i, int j)
// pre: 0 <= i,j < data.length
// post: data[i] and data[j] are exchanged
    {
        int temp;
        temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
    private static int partition(int data[], int left, int right)
    {
       // pre: left <= right 
       // post: data[left] placed in the correct (returned) location
       
       while(true)
       {
           // move right "pointer" toward left
           while (left < right && data[left] < data[right]) right--;
           if (left < right) swap(data,left++,right);
           else return left;
           // move left pointer toward right
           while (left < right && data[left] < data[right]) left++;
           if (left < right) swap(data,left,right--);
           else return right;
           
       }
    }
    
    public static void quickSort(int data[], int n)
    // post: the values in data[0..n-1] are in ascending order
    {
        quickSortRecursive(data,0,n-1);
    }
    private static void quickSortRecursive(int data[],int left,int right)
    // pre: left <= right
    // post: data[left..right] in ascending order
    {
        int pivot; // the final location of the leftmost value
        if (left >= right) return;
        pivot = partition(data,left,right); /* 1 - place pivot */
        quickSortRecursive(data,left,pivot-1); /* 2 - sort small */
        quickSortRecursive(data,pivot+1,right);/* 3 - sort large */
        /* done! */
    }   
    
}
