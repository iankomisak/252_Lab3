/*
 * Code By: Nolan Earl
 */
package lab3;

/**
 *
 * @author Ian
 */
public class ObjectBinarySearcherGeneric<T extends Comparable<T>> {
    public  T search(T[] array, T value)
{
    T position= array[0];
    for(int i = 1; i < array.length; i++)
        if(array[i].compareTo(value) == 0)
            position = value;  
    return position;
    }
}
