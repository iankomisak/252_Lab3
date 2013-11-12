/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Ian
 */
public class ObjectQuickSortDemo {
    public static void main(String[] args)
  {
      
   String[] values = {"Zeb", "Deb", "Will",
      "Karen", "Aaron", "Chris", "Barb", "Kenny"};
   System.out.println(" Original order: ");
   for(String name: values)
     System.out.println(name + " ");
   
   ObjectQuickSorter.partition(values, 0, 7);
   
  System.out.println("\nSorted order: ");
  for(String name : values)
    System.out.print(name + " ");
  System.out.println();
  
  
  
  
  
  }
}
