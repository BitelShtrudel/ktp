import java.lang.Math;

public class Point3d {

	private double xCoord;
	private double yCoord;
	private double zCoord;

	public Point3d (double x, double y, double z) {
		xCoord = x;
		yCoord = y;
		zCoord = z;
	}

	public Point3d() {
		this(0.0,0.0,0.0);
	}

	public double getX () {
		return xCoord;
	}

	public double getY () {
		return yCoord;
	}

	public double getZ () {
		return zCoord;
	}

	public void setX (double val) {
		xCoord = val;
	}

	public void setY (double val) {
		yCoord = val;
	}

	public void setZ (double val) {
		zCoord = val;
	}

	public static boolean isEqual(Point3d p1, Point3d p2) {
		return (p1.getX() == p2.getX()) 
			&& (p1.getY() == p2.getY()) 
			&& (p1.getZ() == p2.getZ());
	}

	public static double distanceTo (Point3d p1, Point3d p2) {
		Double dist = Math.sqrt(Math.pow(p2.getX() - p1.getX(),2)
				 + Math.pow(p2.getY() - p1.getY(),2)
				 + Math.pow(p2.getZ() - p1.getZ(),2));
		return dist;
	}
}