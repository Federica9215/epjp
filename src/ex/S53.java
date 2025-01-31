package ex;

public class S53 {
    /**
     * Average speed
     * 
     * @param distance in meters
     * @param time     in seconds
     * @return speed in meters per second
     */
    public static double speed(double distance, double time) {
        // TODO
        return distance/time;
    }

    /**
     * Distance between (x0, y0) and (x1, y1)
     * 
     * @param x0 first point x
     * @param y0 first point y
     * @param x1 second point x
     * @param y1 second point y
     * @return distance
     */
    public static double distance(int x0, int y0, int x1, int y1) {
        // TODO
        return Math.sqrt((x1-x0)*(x1-x0)+(y1-y0)*(y1-y0));
    }

    /**
     * Engine capacity
     * 
     * @param bore
     * @param stroke
     * @param nr     number of cylinders
     * @return the engine capacity
     */
    public static double engineCapacity(double bore, double stroke, int nr) {
        // TODO
        return (Math.pow(bore/2, 2)* (Math.PI)*stroke * nr)/1000;
    }

    // somma delle cifre in un numero
    /**
     * Add up all the digits in an integer
     * 
     * @param value
     * @return sum of digits
     */
    int result=0;
    public static int digitSum(int value) {
    	value= Math.abs(value);
    	int result=0;
    	while (value != 0 ) {
    		result=result+value%10; 
    		value /=10; 
    		
    	}
    	
        // TODO
        return result;
    }
}
