/**
 * @author Diego Juarez		13280
 * @author Daniel Mejia		13271
 * @author Esteban Barrera	13413
 * Code referencd from:
 * Duane E. Bailey. 2007. Java Structures. Data Structures in Java for Principled Programer 7th Edition. Williams College. Pages 119-148
 * http://www.journaldev.com/585/insertion-sort-in-java-algorithm-and-code-with-example
 */
public class BubbleSort {
    
    
    public void bubble(int [] A){
         int i, j, aux;
         for(i=0;i<A.length-1;i++)
              for(j=0;j<A.length-i-1;j++)
                   if(A[j+1]<A[j]){
                      aux=A[j+1];
                      A[j+1]=A[j];
                      A[j]=aux;
                   }
         System.out.println ("El Arreglo ordenado por Bubble Sort es: ");
         for(int k: A)
		{
			System.out.println(k);
		}
         //System.out.println (A[0]);
}


    
}
