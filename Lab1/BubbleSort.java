import java.lang.*;
public class BubbleSort implements SortStrategy{
		@Override
	public void sort(long[] ar) {
			long starttime = System.currentTimeMillis();
		 for (int i = (ar.length - 1); i >= 0; i--)
		   {
		      for (int j = 1; j < i ; j++)
		      {
		         if (ar[j-1] > ar[j])
		         {
		              long temp = ar[j-1];
		              ar[j-1] = ar[j];
		              ar[j] = temp;
		         } 
		       } 
		    }
		 long totaltime = System.currentTimeMillis() - starttime;
	      System.out.println("Time taken by Bubble sort is :" +totaltime+ " "+"millisecs");
	}

}


