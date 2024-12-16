import java.util.Arrays;

public class MeanCalculator {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};

        double mean = Arrays.stream(numbers)
                .average()
                .orElse(Double.NaN); // Handle empty array case

        System.out.println("Mean: " + mean);
    }
}
