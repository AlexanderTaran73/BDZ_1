package BDZ;


import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        String ans = "";
        Scanner in = new Scanner(System.in);

        int Int, n = in.nextInt();

        for (int i = 0; i < n; i++){
            Int = in.nextInt();
            String Str = Integer.toString(Int);
            ans += Str.charAt(0);

        }
        System.out.println(ans);
    }
}
