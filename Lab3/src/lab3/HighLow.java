/* 
 * Code By: Nolan Earl
 */
package lab3;

public class HighLow<T extends Comparable<T>> {
    private T[] array;
    
    public HighLow(T[] values)
    {
           
        T high = values[0];
        T low = values[0];
        
        System.out.print("The array reads: ");
        for(int i = 0; i < values.length; i++)
            System.out.print(values[i] + ", ");
       System.out.println();
       for(int i = 0; i < values.length; i++)
           if(values[i].compareTo(high) > 0)
               high = values[i];
       System.out.println("The highest value is: " + high);
       for(int i = 0; i <values.length; i++)
           if(values[i].compareTo(low) < 0)
               low = values[i];
       System.out.println("The lowest values is: " + low);
    }
    
    public T getHighest()
    {
        T highest = array[0];
        for(int i = 0; i < array.length; i++)
            if(array[i].compareTo(highest) > 0)
                highest = array[i];
        return highest;
    }
    
    public T getLowest()
    {
        T lowest = array[0];
         for(int i = 1; i < array.length; i++)
            if(array[i].compareTo(lowest) < 0)
                lowest = array[i];
         //System.out.println("The lowest value is: " + lowest);
         return lowest;
    }
    
    
    public String toString()
    {
        return ("The lowest value is: " + getLowest() +"\n" + "The highest value is: " + getHighest());
    }
}
