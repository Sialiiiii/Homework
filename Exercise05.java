// 題目：輸入一個整數 n，判斷它是否為質數。
import java.util.*;
public class Exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入一個整數：");
        int n = sc.nextInt();
        
        boolean isPrime = true;

        if (n <= 1){
            isPrime = false;
        } else {
            for (int i = 2; i < n; i++){
                if (n % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime){
            System.out.println(n+" 是質數");
        }else{
            System.out.println(n+" 不是質數");
        }
       
        sc.close();
    }
}
