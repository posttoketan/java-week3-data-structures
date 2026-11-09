public class Main {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        System.out.println("Array Elements:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
