public class m4 {

    public static short average(short[] array) {
        int total = 0;
        for (short num : array) {
            total += num;
        }
        return (short) (total / array.length);
    }

    public static int average(int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total / array.length;
    }

    public static long average(long[] array) {
        long total = 0;
        for (long num : array) {
            total += num;
        }
        return total / array.length;
    }

    public static double average(double[] array) {
        double total = 0;
        for (double num : array) {
            total += num;
        }
        return total / array.length;
    }

    public static void main(String[] args) {
        short[] shortArray = {1, 2, 3, 4, 5};
        int[] intArray = {10, 20, 30};
        long[] longArray = {100L, 200L, 300L, 400L};
        double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};

        // Calculate averages
        short shortAvg = average(shortArray);
        int intAvg = average(intArray);
        long longAvg = average(longArray);
        double doubleAvg = average(doubleArray);

        // Display results
        System.out.println("Short Array: " + java.util.Arrays.toString(shortArray) + " | Average: " + shortAvg);
        System.out.println("Int Array: " + java.util.Arrays.toString(intArray) + " | Average: " + intAvg);
        System.out.println("Long Array: " + java.util.Arrays.toString(longArray) + " | Average: " + longAvg);
        System.out.println("Double Array: " + java.util.Arrays.toString(doubleArray) + " | Average: " + doubleAvg);
    }
}