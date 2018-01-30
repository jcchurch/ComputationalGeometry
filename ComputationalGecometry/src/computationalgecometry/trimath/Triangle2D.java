/*
James Church
CSCI 2070
Jan 29, 2018

PROJECT DESCRIPTION HERE
 */
package computationalgecometry.trimath;

/**
 *
 * @author jcchurch
 */
public class Triangle2D {
    public final Vector2D A;
    public final Vector2D B;
    public final Vector2D C;
    
    public Triangle2D(Vector2D a, Vector2D b, Vector2D c) {
        checkForNullVector(a);
        checkForNullVector(b);
        checkForNullVector(c);
        
        A = a;
        B = b;
        C = c;
    }

    private void checkForNullVector(Vector2D a) throws NullPointerException {
        if (a == null) {
            throw new NullPointerException("vector is null");
        }
    }
}