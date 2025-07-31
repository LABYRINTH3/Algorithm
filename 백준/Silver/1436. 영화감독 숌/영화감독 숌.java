
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long iter = 666;
        int check = 0;
        while (check < N) { 
            if ((Long.toString(iter)).contains("666")) {
                check++;
            }
            iter++;
        }
        System.out.println(iter-1);
    }
}
