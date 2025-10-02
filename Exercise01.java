// 題目：請輸入一個整數，判斷它是奇數還是偶數。
import java.util.*;
public class Exercise01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入一個整數：");
        int num = sc.nextInt();
        if (num % 2 ==0){
            System.out.println(num + "是偶數");
        } else {
            System.out.println(num + "是奇數");
        }
    sc.close(); 
    }
}