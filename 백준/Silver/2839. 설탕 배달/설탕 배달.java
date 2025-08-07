
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int divFive = n/5;
        int remaider = n - 5*divFive;
        while (remaider%3 != 0 && divFive >= 0) {
            divFive--;
            remaider += 5;
        } 
        if (divFive < 0) {
            System.out.println("-1");
        }
        else
            System.out.println(divFive + remaider/3);
    }
}

// 3   5 6   8 9 10 11 12 13 14 15 ...
// 3 6 9 12 