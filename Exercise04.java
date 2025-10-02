// 題目：輸入一個整數 n，印出 n 的乘法表（1 到 9）。
import java.util.*;
public class Exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入整數：");
        int n = sc.nextInt();
        int ans = 0;
        for ( int i = 1; i <= 9; i++) {
            ans = n * i;
            System.out.println(n + "*" + i + "=" + ans);
        }

        sc.close();
    }
}
