
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int best;
            int least;
            if (num1 > num2) {
                best = num1;
                least = num2;
            }
            else {
                best = num2;
                least = num1;
            }

            for (int i = least; i > 0; i--) {
                if ( best%i == 0 && least%i == 0 ) {
                    System.out.println(i);
                    break;
                }
            }
            for (int i = best; ; i++) {
                if ( i%best == 0 && i%least==0 ) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
