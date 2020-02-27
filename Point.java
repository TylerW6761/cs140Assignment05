package assignment05;

public class Point
{
	private double x;
	private double y;

	public Point(double xVal, double yVal)
	{
		if (xVal < 0 || yVal < 0) throw new IllegalArgumentException("Point values must be non-negative");	
		x = xVal;
		y = yVal;
	}

	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}

	@Override
	public String toString()
	{
		return "(" + x + ", " + y + ")";
	}

	

}
