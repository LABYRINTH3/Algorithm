
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 15 30 45 60 75 ...
        // 3 6 9 12    18 21 24 27    33 36
        // 5 10    20 25    35 40   50 55   
        // 1 2   4      7 8      11
        Scanner sc = new Scanner(System.in);
        String[] s = new String[3];
        for (int i = 0; i < 3; i++) {
            s[i] = sc.nextLine();
        }
        String integerRegex = "^[+-]?\\d+$";
        for (int i = 0; i < 3; i++) {
            if (s[i].matches(integerRegex)) {
                int index = 3-i+Integer.parseInt(s[i]); 
                boolean div3 = (index%3 == 0);
                boolean div5 = (index%5 == 0);
                if (div3 && div5) {
                    System.out.println("FizzBuzz");
                    System.exit(0);
                }
                else if (div3 && !div5) {
                    System.out.println("Fizz");
                    System.exit(0);
                }
                else if (!div3 && div5) {
                    System.out.println("Buzz");
                    System.exit(0);
                }
                else {
                    System.out.println(index);
                    System.exit(0);
                }
            }
        }
    }
}
