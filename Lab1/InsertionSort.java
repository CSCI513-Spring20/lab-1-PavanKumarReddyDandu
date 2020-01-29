import java.lang.*;
public class InsertionSort implements SortStrategy {
	public void sort(long[] ar) {
		long starttime = System.currentTimeMillis();
		 for (int i=1; i < ar.length; i++)
		   {
		      long index = ar[i]; int j = i;
		      while (j > 0 && ar[j-1] > index)
		      {
		           ar[j] = ar[j-1];
		           j--;
		      }
		      ar[j] = index;
		   }
		 long totaltime = System.currentTimeMillis() - starttime;
	      System.out.println("Time taken by Insertion sort is :" +totaltime+" "+"millisecs");
	}


}
