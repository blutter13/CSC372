package csc372;
import java.lang.Math;

public class Cone extends Shape {
	double radius;
	double height;
	/**
	 * Cone constructor
	 * @param r
	 * @param h
	 */
	public Cone(double r, double h) {
		this.radius = r;
		this.height = h;
	}
	/**
	 * Calculate Surface Area
	 */
	public double surface_area() {
		double slant = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
		return (Math.PI * radius) * (Math.PI * slant);
	}
/**
 * Calculate volume
 */
	public double volume() {
		return Math.PI * Math.pow(radius, 2) * (height/3.0);
	}
/**
 * Print vol and surface area to string
 */
	public String toString() {
		double vol = this.volume();
		double surface = this.surface_area();
		return "Volume of this Cone: " + vol + " Surface Area: " + surface;
	}
}
