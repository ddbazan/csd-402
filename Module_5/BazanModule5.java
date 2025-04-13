

/**
 *
 * Destiny Bazan
 * Module 5.1
 */

public class BazanModule5 {
    
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = new int[2]; 
        double largest = Double.NEGATIVE_INFINITY; 
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    location[0] = i; 
                    location[1] = j; 
                }
            }
        }
        return location; 
    }

    public static int[] locateLargest(int[][] arrayParam) {
        return locateLargest(convertToDouble(arrayParam));
    }

    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = new int[2]; 
        double smallest = Double.POSITIVE_INFINITY; 
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i; 
                    location[1] = j; 
                }
            }
        }
        return location; 
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        return locateSmallest(convertToDouble(arrayParam));
    }

    private static double[][] convertToDouble(int[][] arrayParam) {
        double[][] result = new double[arrayParam.length][];
        for (int i = 0; i < arrayParam.length; i++) {
            result[i] = new double[arrayParam[i].length];
            for (int j = 0; j < arrayParam[i].length; j++) {
                result[i][j] = (double) arrayParam[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        double[][] doubleArray = {
            {1.5, 2.5, 3.5},
            {4.5, 0.5, 6.5},
            {7.5, 8.5, 9.5}
        };

        int[] largestLocation = locateLargest(doubleArray);
        System.out.println("Largest element is located at: (" + largestLocation[0] + ", " + largestLocation[1] + ")");
        
        int[] smallestLocation = locateSmallest(doubleArray);
        System.out.println("Smallest element is located at: (" + smallestLocation[0] + ", " + smallestLocation[1] + ")");
    }
}