package ex;

public class S56 {
	
	
    /**
     * Reverse a string
     * 
     * @param s
     * @return the input reversed
     */
    public static String reverse(String s) {
    	int i=0; 
    	StringBuilder reverse= new StringBuilder(); 
    	for (i = s.length()-1; i>=0;i--) {
    		reverse.append(s.charAt(i)); 
    	}
        // TODO
		return reverse.toString();
        
		 
		
		
    }

    private static String length(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String s(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
     * Check if the parameter is a palindrome
     * 
     * @param s
     * @return true if the parameter is a palindrome
     */
    public static boolean isPalindrome(String s) {
        // TODO
        return false;
    }

    /**
     * Remove vowels from the parameter
     * 
     * @param s
     * @return a string, same of input but without vowels
     */
    public static String removeVowels(String s) {
        String[] array= {"a","e", "i", "o", "u"}; 
        if ()      {
        	
        }
       
        
        return "";
    }

    /**
     * Convert from binary to decimal
     * 
     * @param s a string that contains the binary representation of an integer
     * @return the converted integer
     */
    public static int bin2dec(String s) {
        // TODO
        return 0;
    }

    /**
     * Reverse an array of integers
     * 
     * @param data
     * @return a new array holding the same elements of input, in reversed order
     */
    public static int[] reverse(int[] data) {
        int[] result = new int[0];

        // TODO

        return result;
    }

    /**
     * Calculate the average
     * 
     * @param data
     * @return the average
     */
    public static double average(int[] data) {
        // TODO
        return 0;
    }
    
    /**
     * Find the largest value
     * 
     * @param data
     * @return the largest value
     */
    public static int max(int[] data) {
        // TODO
        return 0;
    }
}
