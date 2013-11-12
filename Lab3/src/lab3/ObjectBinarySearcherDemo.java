/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Ian
 */
public class ObjectBinarySearcherDemo {
    public static void main(String args[])
    {
       String[] s = new String[8];
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
    System.out.println("Deb was found at position: " + x.search(s,"Deb"));
    
   
    
}
    
}
