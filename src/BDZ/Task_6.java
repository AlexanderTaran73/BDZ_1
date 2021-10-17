package BDZ;

import java.util.Scanner;

public class Task_6
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Int, n = in.nextInt(), ans = 0;

        for (int i = 0; i < n; i++){
            Int = in.nextInt();
            if (Int%100 == 11 && Int > ans) ans = Int;
        }
        System.out.println(ans);
    }
}
