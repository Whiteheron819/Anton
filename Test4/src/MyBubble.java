import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyBubble {
    public static void main(String[] args) {

        int a, b, c;

        Random rand = new Random();
        System.out.println(" Укажите размер массива: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int [size];


        for (int i = 0; i < size; i++) {
            int result = rand.nextInt(1500);
            nums[i] = result;
        }
        System.out.print(" Неотсортированный массив: " + Arrays.toString(nums));
        System.out.println();

        for(a = 1; a < size; a++)
            for(b = size - 1; b >=a; b--) {
                if(nums[b-1] > nums[b]) {

                    c = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = c;
                }
            }
        System.out.print(" Отсортированный массив: " + Arrays.toString(nums));
    }
}
