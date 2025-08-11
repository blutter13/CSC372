package csc372;

public class ShapeArray {
	public static void main (String[] args) {
		Sphere testSphere = new Sphere(5);
		Cylinder testCylinder = new Cylinder(4, 2);
		Cone testCone = new Cone(4, 4);
		
		Shape[] ShapeArray = {testSphere, testCylinder, testCone};
		
		for(int i = 0; i < ShapeArray.length; i++) {
			System.out.println(ShapeArray[i].toString());
		}
	}
}
