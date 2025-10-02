// 題目：輸入一個整數 n，計算從 1 加到 n 的總和。
import java.util.*;
public class Exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入一個整數：");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++){
            sum = sum + i;
        }
        System.out.println("1 加到 "+ num + " 等於 " + sum);
        
        sc.close();
    }
}
