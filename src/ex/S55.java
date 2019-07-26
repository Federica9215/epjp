package ex;

public class S55 {
	private static long fibonacci;



	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */

	public static long sum(int first, int last)

	{
		long sum = 0L;
		if (last < first) {
			return 0L;
		} else {

			for (int i = first; i <= last; i++)
				sum += i;

		}

		return sum;

		// TODO

	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {
		long evenSum = 0L;
		int i = 0;
		for (i = first; i <=last;) {
			if (i % 2 == 0) {
				return evenSum += i;

			} else {

				return evenSum;
			}

		}
		return evenSum;

	}

	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {
		long factorial = 0L;
		int i=0;
		if(value==0) {
			
			return factorial=1L; 
			
		}
		
		if(value<0) {
			
			return factorial=0L; 
			
		}
		
		if(value>0) {
			
			for (i=value; i==1; i--) {
				i*=(i-1)*(i-2); 
			}
			return factorial=i*(i-1)*(i-2);
		}
			
			return factorial;
		// TODO
		
	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, …)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {
		if (value==0) {
			return value; 
		}
		if (value <=1) {
			return value; 
		} else if (value > 1 && value < 20) {
			
			return fibonacci(value-1)+fibonacci(value-2);
		}
		return 0;
		
		
	}

	
	
	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		int[][] result = new int[0][0];

		// TODO

		return result;
	}
}
