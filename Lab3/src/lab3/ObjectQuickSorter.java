/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Ian
 */
public class ObjectQuickSorter {
    
  public static void doQuickSort(Comparable[] array,int start, int end)
   {
      int Point;
      if (start < end)
      {
        Point = partition(array, start, end);
          
        doQuickSort(array, start, Point - 1);
          
        doQuickSort(array, Point + 1, end);
      }
  }
  public static void objquicksort(Comparable array[])
  {
      doQuickSort(array, 0, array.length-1);
  }
  
   public static int partition(Comparable[] array,int start, int end)
           {
      Comparable value;  
      int endLeft;
      int mid;          
      mid = (start + end) / 2;
      swap(array, start, mid);
      value = array[start];
      endLeft = start;
        for(int scan = start + 1; scan <= end -1; scan++)
        {
           if (array[scan].compareTo(value)<0)
         {
            endLeft++;
            swap(array, endLeft, scan);
         }
        }
      swap(array, start, endLeft);
     
      return endLeft;
           }

      public static void swap(Comparable[] array, int a, int b)
      {
      Comparable temp;
      temp = array[a];
      array[a] = array[b];
      array[b] = temp;
      }

    
    
    
    
    
    
    
    
    
}
