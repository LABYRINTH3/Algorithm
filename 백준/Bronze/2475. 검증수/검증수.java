import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(sc.next());
            // list.add(num);
            sum += num*num;
        }
        System.out.println(sum%10);
    }
}
