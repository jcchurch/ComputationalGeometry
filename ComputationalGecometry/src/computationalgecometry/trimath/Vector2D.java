/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computationalgecometry.trimath;

/**
 *
 * @author jcchurch
 */
public class Vector2D {

    public final double X;
    public final double Y;

    public Vector2D(double x, double y) {
        this.X = x;
        this.Y = y;
    }

    public double magnitude() {
        return Math.sqrt(X * X + Y * Y);
    }

    public Vector2D unit() {
        double mag = this.magnitude();
        return new Vector2D(X / mag, Y / mag);
    }

    public Vector2D negate() {
        return new Vector2D(-X, -Y);
    }

    public Vector2D add(Vector2D vector) {
        checkForNullVector(vector);
        return new Vector2D(X+vector.X, Y+vector.Y);
    }
    
    public double dot(Vector2D vector) {
        checkForNullVector(vector);
        return X*vector.X + Y*vector.Y;
    }

    private void checkForNullVector(Vector2D vector) throws NullPointerException {
        if (vector == null) {
            throw new NullPointerException("vector is null");
        }
    }
}
