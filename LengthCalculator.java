package assignment05;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Arrays;
import java.util.ArrayList;

public class LengthCalculator
{
	public static void removeNulls(List<String> list)
	{
		Iterator iter = list.iterator();	
	
		if (list == null) throw new IllegalArgumentException("list must not be null");

		while (iter.hasNext())
		{
			if (iter.next() == null)
			{
				iter.remove();
			}
		}
	}

	public static List<Integer> stringLengths(List<String> list)
	{
		List<Integer> retVal = new ArrayList<Integer>();
		int charCounter = 0;

		if (list == null) throw new IllegalArgumentException("list cannot be null");
		if (list.size() == 0) throw new IllegalArgumentException("length of list is initially zero");

		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i) == null)
			{
				list.remove(i);
			}
		}
	
		if (list.size() == 0) throw new IllegalArgumentException("Removing nulls made list size 0");
		else
		{
			for (int i = 0; i < list.size(); i++)
			{
				for (char c : list.get(i).toCharArray())
				{
					charCounter++;
				}
			
				retVal.add(charCounter);
				charCounter = 0;
			}
		}

		return retVal;
	}
}
