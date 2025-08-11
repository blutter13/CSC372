package csc372;
import java.lang.Math;

public class Sphere extends Shape {
double radius;
/**
 * Sphere constructor
 * @param r
 */
public Sphere(double r) {
	this.radius = r;
}
/**
 * Calculate Surface Area
 */
public double surface_area() {
	return 4 * Math.PI * Math.pow(radius, 2);
}
/**
 * Calculate volume
 */
public double volume() {
	return (4.0/3.0)* Math.PI * Math.pow(radius, 3);
}
/**
 * Print vol and surface area to string
 */
public String toString() {
	double vol = this.volume();
	double surface = this.surface_area();
	return "Volume of this Sphere: " + vol + " Surface Area: " + surface;
}

}
