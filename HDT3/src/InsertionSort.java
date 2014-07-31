
//http://www.journaldev.com/585/insertion-sort-in-java-algorithm-and-code-with-example
    
import java.util.Arrays;
 
public class InsertionSort {
 
    public static void main(String[] args) {

    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int valueToSort = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > valueToSort) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = valueToSort;
        }
                 System.out.println ("El Arreglo ordenado por Insertion Sort es: ");
         for(int k: arr)
		{
			System.out.println(k);
		}
    }
 
   
}