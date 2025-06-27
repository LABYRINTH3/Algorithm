
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iteration = sc.nextInt();
        int answer = 0;
        for (int i = 0; i < iteration; i++) {
            int num = sc.nextInt();
            if (num == 1) {
                answer++;
            }
            for (int j = 2; j < num/2+1; j++) {
                if (num % j == 0) {
                    answer++;
                    break;
                }
            }
        }
        System.out.println(iteration-answer);
        sc.close();
    }
}
