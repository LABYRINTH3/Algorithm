import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int iteration = 1;
        int start = 2;
        int end = 7;
        if (num==1) {
            System.out.println("1");
            System.exit(0);
        }
        while (!(num >= start && num <= end)) {
            start = start + 6 * iteration;
            end = end + 6 * (iteration + 1);
            iteration++;
        }
        System.out.println(iteration+1);
    }
}
