import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyBubble {
    public static void main(String[] args) {

        Random rand = new Random();
        System.out.println(" Укажите размер массива: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int [size];


        for (int i = 0; i < size; i++) {
            int result = rand.nextInt(1500) + 1;
            nums[i] = result;
        }
        System.out.print(" Неосортированный массив: " + Arrays.toString(nums));
    }
}
