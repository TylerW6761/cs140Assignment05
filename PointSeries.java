package assignment05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PointSeries
{
	private List<Point> points = new ArrayList<>();

	public void addPoint(Point point)
	{
		points.add(point);
	}

	public Point findCenter()
	{
		double x_bar = 0;
		double y_bar = 0;
		double counter = 0;
	
		if (points == null || points.size() == 0) return new Point(0, 0);

		for (int i = 0; i < points.size(); i++)
		{
			if (points.get(i) != null)
			{
				x_bar += points.get(i).getX();
				y_bar += points.get(i).getY();
				counter++;
			}
		}

		if (counter == 0) return new Point(0, 0);

		x_bar /= counter;
		y_bar /= counter;

		Point center = new Point(x_bar, y_bar);

		return center;
	}

	public void translate(int horz, int vert)
	{
		for (int i = 0; i < points.size(); i++)
		{
			Point temp = new Point(points.get(i).getX() + horz, points.get(i).getY() + vert);
			points.set(i, temp);
		}
	}

	@Override
	public String toString()
	{
		return ("" + points);
	}
}
