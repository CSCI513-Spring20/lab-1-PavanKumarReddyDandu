import java.lang.*;
public class SelectionSort implements SortStrategy {
		@Override
		public void sort(long[] ar) {
			long starttime = System.currentTimeMillis();
			 for (int i = 0; i < ar.length-1; i++)
			   {
			      int min = i;
			      for (int j = i+1; j < ar.length; j++)
			            if (ar[j] < ar[min]) min = j;
			       long temp = ar[i];
			      ar[i] = ar[min];
			      ar[min] = temp;
			   }
			 long totaltime = System.currentTimeMillis() - starttime;
		      System.out.println("Time taken by  Selection sort is :" +totaltime +"millisecs");
		}


}
