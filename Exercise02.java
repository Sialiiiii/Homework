// 題目：請輸入一個整數，判斷它是否同時為 2 和 3 的倍數。
import java.util.*;
public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入一個整數：");
        int num = sc.nextInt();
        if (num % 2 ==0 && num % 3 ==0){
            System.out.println(num + "是2也是3的倍數。");
        } else {
            System.out.println("不是2也不是3的倍數。");
        }
    sc.close();
    }
}
