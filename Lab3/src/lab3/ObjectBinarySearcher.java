/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Ian
 */
public class ObjectBinarySearcher {
    public static int search(Object[] array, Object value)
{
    int first;
    int last;
    int mid;
    int position;
    boolean found;

    first = 0;
    last = array.length - 1;
    position = -1;
    found = false;


    while (!found && first <= last)
    {
    mid = (first + last) / 2;
    if (((Comparable)array[mid]).compareTo(value) == 0)
        {
    found = true;
    position = mid;
        }
    else if (((Comparable)array[mid]).compareTo(value) > 0)
    last = mid - 1;
    else
    first = mid + 1;
    }

    return position;
    }
}
