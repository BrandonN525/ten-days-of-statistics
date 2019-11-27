import java.io.*;
import java.util.*;

public class standardDeviation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        double squareDist = 0;
        int sum = 0;
        double mean = 0;
        double stdDev = 0;
        System.out.println("On the first line enter the number of ints in your array."
        		+ "On the second line enter your list of numbers.");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();
            sum += arr[i];
        }
        scan.close();
        mean = sum / num;
        for (int j = 0; j < num; j++) {
            squareDist += Math.pow((arr[j] - mean), 2);
        }
        stdDev = Math.sqrt(squareDist / num);
        //stdDev = Math.round(stdDev * 1);
        System.out.format("%.1f%n", stdDev);
    }
}