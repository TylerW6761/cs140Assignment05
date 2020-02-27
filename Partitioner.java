package assignment05;

import java.util.Arrays;

public class Partitioner
{
	public static double[] moduloPartition(int[] arr, int mod)
	{
		if (arr == null || arr.length == 0) throw new IllegalArgumentException("Bad Input");
		if (mod <= 0) throw new IllegalArgumentException("Bad Input");
	
		int[] partitionCounter = new int[mod];
		double[] percentCounter = new double[mod];
		int remainder = 0;

		// remainders from 0 to mod-1

		for (int i = 0; i < arr.length; i++)
		{
			remainder = arr[i] % mod;
			partitionCounter[remainder] += 1;
		}
		for (int i = 0; i < partitionCounter.length; i++)
		{
			percentCounter[i] = ((double)partitionCounter[i]*100 / arr.length);
		}
		
		return percentCounter;
	}

}
