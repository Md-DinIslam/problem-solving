import java.util.*;

// Jahidul Islam
// Problem of Codechef

public class sumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int sum = 0;

            while(n > 0){
                sum += n % 10;
                n /= 10;
            }

            System.out.println(sum);
        }
        sc.close();
    }
}