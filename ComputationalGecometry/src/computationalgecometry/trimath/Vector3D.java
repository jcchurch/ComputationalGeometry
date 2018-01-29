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
public class Vector3D {

    public final double X;
    public final double Y;
    public final double Z;

    public Vector3D(double x, double y, double z) {
        this.X = x;
        this.Y = y;
        this.Z = z;
    }

    public double magnitude() {
        return Math.sqrt(X * X + Y * Y + Z * Z);
    }

    public Vector3D unit() {
        double mag = this.magnitude();
        return new Vector3D(X / mag, Y / mag, Z / mag);
    }

    public Vector3D negate() {
        return new Vector3D(-X, -Y, -Z);
    }

    public Vector3D add(Vector3D vector) {
        checkForNullVector(vector);
        return new Vector3D(X+vector.X, Y+vector.Y, Z+vector.Z);
    }
    
    public double dot(Vector3D vector) {
        checkForNullVector(vector);
        return X*vector.X + Y*vector.Y + Z*vector.Z;
    }

    private void checkForNullVector(Vector3D vector) throws NullPointerException {
        if (vector == null) {
            throw new NullPointerException("vector is null");
        }
    }
}
