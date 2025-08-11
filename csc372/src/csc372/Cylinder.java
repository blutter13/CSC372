package csc372;
import java.lang.Math;

public class Cylinder extends Shape {
	double radius;
	double height;
/**
 * Cylinder constructor
 * @param r
 * @param h
 */
	public Cylinder(double r, double h) {
		this.radius = r;
		this.height = h;
	}
	/**
	 * Calculate Surface Area
	 */
	public double surface_area() {
		return 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
	}
	/**
	 * Calculate volume
	 */
	public double volume() {
		return Math.PI * Math.pow(radius, 2) * height;
	}
	/**
	 * Print vol and surface area to string
	 */
	public String toString() {
		double vol = this.volume();
		double surface = this.surface_area();
		return "Volume of this Cylinder: " + vol + " Surface Area: " + surface;
	}
}
