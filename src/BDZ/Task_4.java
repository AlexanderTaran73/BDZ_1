package BDZ;

import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = in.nextInt();
        array[1] = in.nextInt();
        array[2] = in.nextInt();
        array[3] = in.nextInt();
        array[4] = in.nextInt();
        int k = in.nextInt();
        Arrays.sort(array);
        while (k!=0){
            if (k>array[0]) array[0]=k;
            k = in.nextInt();
            Arrays.sort(array);
        };
        System.out.println(array[0]+" "+array[1]+" "+array[2]+" "+array[3]+" "+array[4]);
    }
}
