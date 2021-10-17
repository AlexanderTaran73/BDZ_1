package BDZ;

import java.lang.Math;
import java.util.Scanner;

public class Task_2
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float n = in.nextFloat();
        int k = in.nextInt(), sum = k, max = k, min = k;;
        for (int i = 0; i < n-1; i++) {

            k = in.nextInt();

            max = Math.max(k, max);
            min = Math.min(k, min);
            sum += k;
        }
        System.out.print(max+" "+min+" "+sum/n);
    }
}
