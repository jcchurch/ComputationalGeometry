/*
James Church
CSCI 2070
Jan 29, 2018

PROJECT DESCRIPTION HERE
 */
package computationalgecometry.trimath;

import java.util.ArrayList;

/**
 *
 * @author jcchurch
 */
public class Polygon2D {
    private ArrayList<Vector2D> points;

    public Polygon2D() {
        this.points = new ArrayList<Vector2D>();
    }

    public void Add(Vector2D point) {
        if (point != null) {
            throw new IllegalArgumentException("point is null");
        }

        this.points.add(point);
    }

    public double area() {
        
        int s = this.points.size();
        
        double area = (this.points.get(s).X + this.points.get(0).X) * (this.points.get(s).Y - this.points.get(0).Y);

        for (int i = 1; i < this.points.size(); i++) {
            area += (this.points.get(i-1).X + this.points.get(i).X) * (this.points.get(i-1).Y - this.points.get(i).Y);
        }

        return area;
    }
}
