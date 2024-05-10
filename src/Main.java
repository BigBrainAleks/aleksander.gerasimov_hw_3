import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = new double[15];
        numbers[0] = 12.5;
        numbers[1] = 7.3;
        numbers[2] = 5.5;
        numbers[3] = 14.7;
        numbers[4] = -11.0;
        numbers[5] = -22.3;
        numbers[6] = 16.5;
        numbers[7] = -3.3;
        numbers[8] = 11.2;
        numbers[9] = -21.1;
        numbers[10] = 19.9;
        numbers[11] = 12.2;
        numbers[12] = -2.5;
        numbers[13] = 1.1;
        numbers[14] = -3.0;

        int firstNegativeIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }

        if (firstNegativeIndex != -1) {
            double sum = 0;
            int count = 0;
            for (int i = firstNegativeIndex + 1; i < numbers.length; i++) {
                if (numbers[i] > 0) {
                    sum += numbers[i];
                    count++;
                }
            }
            double average = sum / count;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
        }
    }
}
