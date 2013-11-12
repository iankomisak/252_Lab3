/*
 * Code By: Nolan earl
 */
package lab3;
public class ObjectQuickSorterGenericDemo {

    public static void main(String[] args) {
  
  Comparable[] values = new Comparable[5];
  values[0] = "Zeb";
  values[1] = "Deb";
  values[2] = "Nolan";
  values[3] = "Lauren";
  values[4] = "Lucas";
  
  System.out.print("The array reads: ");
  for(int i = 0; i < values.length; i++)
      System.out.print(values[i] + ", ");
  
  ObjectQuickSorterGeneric.partition(values, 0, 4);
  ObjectQuickSorterGeneric obqs = new ObjectQuickSorterGeneric();
  
  System.out.println();
  System.out.print("The sorted array reads: ");
  System.out.print(obqs.partition(values, 0, 4));
 
    }
}
