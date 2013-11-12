/*
 * Code By: Nolan Earl
 */
package lab3;
public class ObjectBinarySearchGenericDemo {

    public static void main(String[] args) {
       /* String[] s = new String[8];
        s[0]="Aaron";
        s[1]= "Barb";
        s[2]= "Chris";
        s[3]= "Deb";
        s[4]= "Karen";
        s[5]= "Kenny";
        s[6]= "Will";
        s[7]= "Zeb";
        
    ObjectBinarySearcher x = new ObjectBinarySearcher();
    System.out.println("Aaron was found at position: " + x.search(s,"Aaron"));
    System.out.println("Chris was found at position: " + x.search(s,"Chris"));
    */
        Comparable[] s = new Comparable[8];
        s[0]=1;
        s[1]= 5;
        s[2]= 6;
        s[3]= 66;
        s[4]= 67;
        s[5]= 79;
        s[6]= 666;
        s[7]= 69;
        
    ObjectBinarySearcherGeneric x = new ObjectBinarySearcherGeneric();
    System.out.println("Aaron was found at position: " + x.search(s, 5));
    System.out.println("Chris was found at position: " + x.search(s,666));
    System.out.println("Deb was found at position: " + x.search(s,66));
    }
}
